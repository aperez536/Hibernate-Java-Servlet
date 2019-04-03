package funciones;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funciones {

	public static boolean esBisiesto(int anio) {
		boolean resultado = false;
		if (anio % 4 == 0 && ((anio % 100 != 0) || (anio % 400 == 0))) {
			resultado = true;
		}
		return resultado;
	}

	public static int traerAnio(GregorianCalendar f) {
		return f.get(Calendar.YEAR);
	}

	public static int traerMes(GregorianCalendar f) {
		return (f.get(Calendar.MONTH)) + 1;
	}

	public static int traerDia(GregorianCalendar f) {
		return f.get(Calendar.DAY_OF_MONTH);
	}

	public static int traerHora(GregorianCalendar f) {
		return f.get(Calendar.HOUR_OF_DAY);
	}

	public static int traerMinutos(GregorianCalendar f) {
		return f.get(Calendar.MINUTE);
	}

	public static int traerSegundos(GregorianCalendar f) {
		return f.get(Calendar.SECOND);
	}

	// ----------------------------------------------------------------------

	public static boolean esFechaValida(int anio, int mes, int dia) {
		boolean resultado = true;

		if (mes < 1 || mes > 12) {
			resultado = false;
		}

		if (anio < 1) {
			resultado = false;
		}

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			if (dia < 1 || dia > 31) {
				resultado = false;
			}
			break;
		}

		case 2: {
			if (esBisiesto(anio) == true) {
				if (dia < 1 || dia > 29) {
					resultado = false;
				}
			} else {
				if (dia < 1 || dia > 28) {
					resultado = false;
				}
			}
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			if (dia < 1 || dia > 30) {
				resultado = false;
			}
			break;
		}	
		default:
			resultado = false;
			break;
		}

		return resultado;
	}

	public static GregorianCalendar traerFecha(int anio, int mes, int dia, int hora, int min, int seg) {
		GregorianCalendar fecha = new GregorianCalendar();

		if (esFechaValida(anio, mes, dia)) {
			fecha.set(anio, mes - 1, dia, hora, min, seg);
		} else {
			fecha = null;
		}
		return fecha;
	}

	public static GregorianCalendar traerFecha(int anio, int mes, int dia) {
		GregorianCalendar fecha = new GregorianCalendar();

		if (esFechaValida(anio, mes, dia)) {
			fecha.set(anio, mes - 1, dia);
		} else {
			fecha = null;
		}
		return fecha;
	}

	public static GregorianCalendar traerFecha(String fecha) {
		// 20/03/2018
		return traerFecha(Integer.parseInt(fecha.substring(6, 10)), Integer.parseInt(fecha.substring(3, 5)),
				Integer.parseInt(fecha.substring(0, 2)));
	}

	public static String traerFechaCorta(GregorianCalendar f) {
		String fechaCorta;
		int mes;
		if (traerDia(f) < 10) {
			fechaCorta = "0" + traerDia(f) + "/";
		} else {
			fechaCorta = traerDia(f) + "/";
		}
		mes = traerMes(f);

		if (traerMes(f) < 10) {
			fechaCorta = fechaCorta + "0" + mes + "/";
		} else {
			fechaCorta = fechaCorta + mes + "/";
		}

		return fechaCorta + traerAnio(f);

	}

	public static String traerFechaCortaHora(GregorianCalendar fecha) {
		String traerFechaCortaHora = traerFechaCorta(fecha) + " " + traerHora(fecha) + ":" + traerMinutos(fecha) + ":"
				+ traerSegundos(fecha);
		return traerFechaCortaHora;

	}

	public static GregorianCalendar traerFechaProximo(GregorianCalendar fecha, int cantDias) {
		GregorianCalendar fechaProximo = new GregorianCalendar(Funciones.traerAnio(fecha),
				Funciones.traerMes(fecha) - 1, Funciones.traerDia(fecha));
		fechaProximo.add(Calendar.DATE, cantDias);

		return fechaProximo;
	}

	public static boolean esDiaHabil(GregorianCalendar fecha) {
		boolean resultado = true;
		if (fecha.get(Calendar.DAY_OF_WEEK) == 1 || fecha.get(Calendar.DAY_OF_WEEK) == 7) {
			// domingo //sabado
			resultado = false;
		}
		return resultado;
	}

	public static String traerDiaDeLaSemana(GregorianCalendar fecha) {
		return fecha.get(Calendar.DAY_OF_WEEK) + " es DIA DE LA SEMANA";
	}

	public static String traerMesEnLetras(GregorianCalendar fecha) {
		int mes = traerMes(fecha);
		String month = "";
		switch (mes) {
		case 1: {
			month = "Enero";
			break;
		}
		case 2: {
			month = "Febrero";
			break;
		}
		case 3: {
			month = "Marzo";
			break;
		}
		case 4: {
			month = "Abril";
			break;
		}
		case 5: {
			month = "Mayo";
			break;
		}
		case 6: {
			month = "Junio";
			break;
		}
		case 7: {
			month = "Julio";
			break;
		}
		case 8: {
			month = "Agosto";
			break;
		}
		case 9: {
			month = "Septiembre";
			break;
		}
		case 10: {
			month = "Octubre";
			break;
		}
		case 11: {
			month = "Noviembre";
			break;
		}
		case 12: {
			month = "Diciembre";
			break;
		}
		}
		return month;
	}

	public static boolean CompararFechasIguales(GregorianCalendar fecha, GregorianCalendar fecha2) {
		boolean Comparar = false;

		if (traerAnio(fecha) == traerAnio(fecha2) && traerMes(fecha) == traerMes(fecha2)
				&& traerDia(fecha) == traerDia(fecha2)) {

			Comparar = true;

		}

		return Comparar;
	}

	public static boolean CompararFechasHoraIguales(GregorianCalendar fecha, GregorianCalendar fecha2) {
		boolean Comparar = false;

		if (traerAnio(fecha) == traerAnio(fecha2) && traerMes(fecha) == traerMes(fecha2)
				&& traerDia(fecha) == traerDia(fecha2) && traerHora(fecha) == traerHora(fecha2)
				&& traerMinutos(fecha) == traerMinutos(fecha2) && traerSegundos(fecha) == traerSegundos(fecha2)) {
			Comparar = true;
		}

		return Comparar;
	}

}
