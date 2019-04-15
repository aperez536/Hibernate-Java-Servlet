package test;
import datos.Prestamo;
import negocio.PrestamoABM;
import dao.HibernateUtil;
public class EliminarPrestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PrestamoABM abm = PrestamoABM.getIntanciaPrestamoABM();
	
	try {
		Prestamo p = abm.traerPrestamo(4);
		abm.eliminarPrestamo(p);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}finally {
		HibernateUtil.getSessionFactory().close();
	}
	}
}
