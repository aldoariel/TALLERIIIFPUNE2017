import java.util.Scanner;

public class AlcanceVariables21 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad;
		System.out.print("Ingrese su edad ");
		edad = entrada.nextInt();
		String nombre;
		boolean puedeConducir = edad >= 18;

		if (!puedeConducir) {
			System.out.println("Usted es menor de edad. Ingrese el nombre de su padre");
			nombre = entrada.next();
		}

		if (puedeConducir) {
			System.out.println("Ingrese su nombre : ");
			nombre = entrada.next();
			System.out.println("Puede continuar conduciendo ");
		}

	}
}