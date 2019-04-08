package negocio;

import dao.ContactoDao;
import datos.Cliente;
import datos.Contacto;

public class ContactoABM {
	
	ContactoDao dao = new ContactoDao();
	public Contacto traer(long idContacto) {
		Contacto c = dao.traer(idContacto);
		return c;
		}
	public int agregar(String email, String movil, String fijo, Cliente cliente) throws Exception {
		if(traer(cliente.getIdCliente())!=null) throw new Exception("ERROR Ya existe el contacto");
		Contacto c = new Contacto(email, movil, fijo, cliente);
		return dao.agregar(c);
		}

	public void modificar(Contacto c) {
		dao.actualizar(c);	
	}
	public void eliminar(long idContacto) throws Exception {
		Contacto c = dao.traer(idContacto);
		if(traer(idContacto) == null) throw new Exception("no existe el contacto");
		dao.eliminar(c);
		}
}