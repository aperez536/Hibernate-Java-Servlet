package test;
import java.util.*;
import datos.Cliente;
import negocio.ClienteABM;
import dao.HibernateUtil;
public class TestCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteABM c = new ClienteABM();
		List<Cliente> lstCliente = new ArrayList<Cliente>();
		lstCliente = c.traerCliente();
		for(int i = 0; i< lstCliente.size();i++) {
			System.out.println(lstCliente.get(i));	
			}
		HibernateUtil.getSessionFactory().close();

	}

}
