package negocio;
import java.util.GregorianCalendar;
import  java.util.List;
import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	ClienteDao dao=new ClienteDao();
	
	public Cliente traerCliente(long idCliente) throws Exception {
		Cliente c= dao.traerCliente(idCliente);
		if(c==null) throw new Exception("ERROR no existe el cliente con id: "+ idCliente);
		return c;
	}
	
	public Cliente traerCliente(int dni) throws Exception {
		Cliente c=dao.traerCliente(dni);
		//if(c==null) throw new Exception("ERROR no existe el cliente con dni: "+ dni);
		return c;
	}
	
	public int agregar(String apellido,String nombre, int dni,GregorianCalendar fechaDeNacimiento) throws Exception{

		Cliente c = dao.traerCliente(dni);
		if ( c != null) {
			throw new Exception("Ya existe el cliente");
			
		}
		Cliente b = new Cliente();
		b.setApellido(apellido);
		b.setNombre(nombre);
		b.setDni(dni);
		b.setFechaDeNacimiento(fechaDeNacimiento);
		return dao.agregar(b);
	}
	
	public void modificar(Cliente c) throws Exception{
		
		if(dao.traerCliente(c.getDni()) != null) throw new Exception(" ya existe este dni ");
		Cliente a = dao.traerCliente(c.getDni());
		
		if(a.equals(c)) throw new Exception("El id o el dni ya existe");
		dao.actualizar(c);
	}
	
	public void eliminar(long idCliente)throws Exception {
		Cliente c=dao.traerCliente(idCliente);
		if(c == null) throw new Exception ("no existe el cliente a eliminar");
		dao.eliminar(c);
	}
	
	public List<Cliente>traerCliente(){return dao.traerCliente();
	}
}
