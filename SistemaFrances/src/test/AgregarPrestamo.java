package test;
import negocio.PrestamoABM;
import java.time.LocalDate;
import funciones.Funciones;
import negocio.ClienteABM;
import datos.Cliente;

import java.time.LocalDate;

import dao.HibernateUtil;
public class AgregarPrestamo {

	public static void main(String[] args) {
		long dni = 4;
		ClienteABM cabm = ClienteABM.getIntanciaClienteABM();
		PrestamoABM pabm = PrestamoABM.getIntanciaPrestamoABM();
		Cliente c = cabm.traer(dni);
		try {
		System.out.println(c);
		pabm.agregarPrestamo(LocalDate.now(),101,50,7, c);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			HibernateUtil.getSessionFactory().close();
		}

	}

}
