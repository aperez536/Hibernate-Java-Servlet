package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.Cliente;
import datos.Cuota;
import datos.Prestamo;
public class CuotaDao {
	private static CuotaDao dao;
	//
	protected CuotaDao() {
		this.inicializar();
	}
	
	public static CuotaDao getIntanciaCuotaDao() {
		if(dao==null) {
			dao=new CuotaDao();
		}
		return dao;
	}
	
	private void inicializar() {}
	
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}
	public int agregar(CuotaDao objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}

	public void actualizar(CuotaDao objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

	public void eliminar(CuotaDao objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}
	
	public CuotaDao traer(long nroCuota) throws HibernateException {
		CuotaDao obj = null;
		try {
			iniciaOperacion();
			String hQL = "from Cuota c inner join fetch c.prestamo p where p.nroCuota=" + nroCuota;
			obj = (CuotaDao) session.createQuery(hQL).uniqueResult();
		} finally {
			session.close();
		}
		return obj;
	}

	@SuppressWarnings("unchecked")
	public List<Cuota> traer(Prestamo p) throws HibernateException {
		List<Cuota> lista = null;
		try {
			iniciaOperacion();
			String hQL = "from Cuota c inner join fetch c.prestamo p where p.idPrestamo=" +p.getIdPrestamo() ;
			lista = session.createQuery(hQL).list();
		} finally {
			session.close();
		}
		return lista;
	}
	
}
