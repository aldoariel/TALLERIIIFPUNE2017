public class AreaCirculo15 {
	public static void main (String[] args) {
		float pi = 3.14f;
		float radio = 12f;
		boolean muestraFormula = true;
		
		if (muestraFormula) {
			System.out.println("Formula utilizada es -> " + pi +" * " + radio + " * "+radio);
		}
		
		int area = (int) (pi*radio*radio);
		System.out.println("El area con numero decimal es : "+pi*radio*radio);
		System.out.println("El area con resultado entero es : "+area);
	}
}