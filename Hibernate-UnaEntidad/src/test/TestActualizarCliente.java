package test;
import datos.Cliente;
import negocio.ClienteABM;
import org.hibernate.Session;
import dao.HibernateUtil;

import negocio.ClienteABM;
public class TestActualizarCliente {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ClienteABM abm = new ClienteABM();
		long id=2;
		// traer el obj a modificar
		Cliente c=abm.traerCliente(id);
		System. out .println( "Cliente a Modificar -->" +c);
		// modificar por set los atributos
		c.setDni(123456789);
	
		

		try {
			abm.modificar(c); //update del objeto
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			HibernateUtil.getSessionFactory().close();
		}
	
		}
	}

