//Вычислить значение функции:

package by.epamtc.zhurava_skarabahataya.task_04;

public class Main {

	public static void main(String[] args) {
		double x;

		x = 91;

		System.out.println(countFunction(x));
	}

	private static double countFunction(double x) {
		double result;
		
		if (x <= 13) {
			result = -Math.pow(x, 3) + 9;
		} else {
			result = -3 / (x + 1);
		}
		
		return result;
	}

}
