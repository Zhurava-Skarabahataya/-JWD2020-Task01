/*Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, 
 * и заменить их абсолютными значениями, 
 * если это не так. 
*/

package by.epamtc.zhurava_skarabahataya.task_03;

public class Main {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		a= 3.0;
		b = -2.1;
		c = -1;

		proceed(a, b, c);
	}

	private static void proceed(double a, double b, double c) {
		if (a > b && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		
		System.out.println(a + " " + b + " " + c);
	}
	
}
