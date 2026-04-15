package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleados = new ArrayList <Empleado>(5);
		listaEmpleados.add(new Empleado("47102910", "Kiara", "Laureano", LocalDate.of(2006, 1, 10), "Femenino", "Calle 1254", "+54 11 40725861", "laureanokiara@gmail.com", "Programador"));
		listaEmpleados.add(new Empleado("26532312", "Carlos", "Rodriguez", LocalDate.of(2000, 4, 27), "Masculino", "Calle 6573", "+54 11 8563848", "rodriguezcarlos@gmail.com", "Diseñador"));
		listaEmpleados.add(new Empleado("58248274", "Maria", "Benitez", LocalDate.of(2002, 2, 15), "Femenino", "Calle 9263", "+54 11 85294235", "mariabenitez@gmail.com", "Analista"));
		listaEmpleados.add(new Empleado("28441920", "Lucía", "Fernández", LocalDate.of(1995, 11, 12), "Femenino", "Calle 1234", "+54 11 45678910", "fernandezlucia@gmail.com", "Programador"));
		listaEmpleados.add(new Empleado("35998211", "Andrés", "García", LocalDate.of(1992, 06, 05), "Masculino", "Calle 882", "+54 11 33221144", "garciaandres@hotmail.com", "Analista"));
		
		Iterator<Empleado> iteratorEmp = listaEmpleados.iterator();
		while (iteratorEmp.hasNext())
		{
			Empleado e = (Empleado) iteratorEmp.next();
			System.out.println(e.toString());
		}
	}

}
