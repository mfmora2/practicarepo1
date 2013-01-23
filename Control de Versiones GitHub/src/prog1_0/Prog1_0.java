package prog1_0;
import java.util.Scanner;
import java.lang.Math;

public class Prog1_0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double volumen;
		Scanner leerradio = new Scanner(System.in);
		int radio;
		System.out.println("Introduce el radio de la esfera");
		radio=leerradio.nextInt();
		volumen = (4 * (Math.PI) * (Math.pow(radio,3))/3);

	}

}
