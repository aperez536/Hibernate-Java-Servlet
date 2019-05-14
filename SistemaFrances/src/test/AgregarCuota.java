package test;

import negocio.*;
import datos.*;
import java.time.LocalDate;

import dao.HibernateUtil;

public class AgregarCuota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrestamoABM abmp = PrestamoABM.getIntanciaPrestamoABM();
		CuotaABM abmc = CuotaABM.getInstancia();
		ClienteABM abmcl = ClienteABM.getIntanciaClienteABM();
		Cliente cl3 = abmcl.traer((long)1);
		try {
			System.out.println(abmp.traerPrestamo((long)3));
			//Cuota c1 = new Cuota(LocalDate.now(),0.0,0.0,0.0,0.0,0.0,false,LocalDate.now(),0.0,abmp.traerPrestamo((long)3));
			//System.out.println(c1);
			//int idCuota = abmc.agregarCuota(c1);
			
			Cuota c2 = new Cuota(LocalDate.of(2019, 06, 10),0.0,0.0,0.0,0.0,0.0,false,LocalDate.of(2019, 05, 20),0.0,abmp.traerPrestamo((long)4));
			Cuota c3 = new Cuota(LocalDate.of(2019, 07, 10),0.0,0.0,0.0,0.0,0.0,false,LocalDate.of(2019, 06, 20),0.0,abmp.traerPrestamo((long)4));
			
			abmp.agregarPrestamo(LocalDate.of(2019, 04, 10),101,50,7,cl3);
			abmc.agregarCuota(c2);
			abmc.agregarCuota(c3);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			HibernateUtil.getSessionFactory().close();
		}

	}

}
