package negocio;
import java.util.GregorianCalendar;
import  java.util.List;
import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	ClienteDao dao=new ClienteDao();
	
	public Cliente traerCliente(long idCliente) throws Exception {
		Cliente c= dao.traerCliente(idCliente);
		return c;
	}
	
	public Cliente traerCliente(int dni){
		Cliente c=dao.traerCliente(dni);
		return c;
	}
	
	public int agregar(String apellido,String nombre, int dni,GregorianCalendar fechaDeNacimiento) throws Exception{

		Cliente c = dao.traerCliente(dni);
		
		if ( c!= null) {
			throw new Exception("Ya existe el cliente");
		}
		
		Cliente b = new Cliente(apellido, nombre, dni, fechaDeNacimiento);
		return dao.agregar(b);
	}
	
	public void modificar(Cliente c) throws Exception{
		
		Cliente a = dao.traerCliente(c.getDni());
		
		if( a != null){
			throw new Exception("El id o el dni ya existe"); 
			//Si es diferente a NULL, significa que ya existe alguien con el dni igual
		}
		
		dao.actualizar(c);
		
	}
	
	public void eliminar(long idCliente) throws Exception {
		
		Cliente c=dao.traerCliente(idCliente);
		if( c == null) throw new Exception("El cliente no existe");
		//si devuelve NULL significa que no existe
		dao.eliminar(c);
	}
	
	public List<Cliente>traerCliente(){
		return dao.traerCliente();
	}
}
