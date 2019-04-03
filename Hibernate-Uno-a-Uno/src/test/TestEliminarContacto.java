package test;


import dao.HibernateUtil;
import negocio.ContactoABM;
public class TestEliminarContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactoABM c = new ContactoABM();
		c.eliminar(7);
		HibernateUtil.getSessionFactory().close();

	}

}
