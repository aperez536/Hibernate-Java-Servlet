package test;

import dao.ClienteDao;
import dao.ContactoDao;
import dao.HibernateUtil;
import datos.Cliente;
import datos.Contacto;

import negocio.ContactoABM;
public class TestAgregarContacto {
	public static void main(String[] args) throws Exception {
		ClienteDao dao = new ClienteDao();
		ContactoDao dao2 = new ContactoDao();
		long idCliente = 6;
		Cliente c = dao.traerCliente(idCliente);
		System.out.println(c);
		//Contacto con = new Contacto("juanmafia@unla.edu.ar", "1234123411", "11-4444-1111", c);
		ContactoABM con = new ContactoABM();
		try {
			con.agregar("probando@unla.edu.ar", "1234123411", "11-4444-1111", c);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			 HibernateUtil.getSessionFactory().close();

		}
	}
}
