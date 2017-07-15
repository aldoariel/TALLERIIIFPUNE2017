import java.util.Scanner;

public class EntradaDatos17 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cálculo Indice de Masa Corporal");
		
		System.out.print("Digite su nombre : ");
		String nombre = entrada.nextLine();

		System.out.print("Digite su peso : ");
		Double peso = entrada.nextDouble();
		
		System.out.print("Digite su altura : ");
		Double altura = entrada.nextDouble();

		Double imc = peso / (altura * altura);
		
		System.out.println("El IMC de "+ nombre + " es "+ imc);
	}
}