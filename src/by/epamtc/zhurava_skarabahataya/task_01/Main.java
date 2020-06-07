//��������� �������� ��������� �� �������:

package by.epamtc.zhurava_skarabahataya.task_01;

public class Main {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		a = 4;
		b = 9;
		c = 93;

		System.out.printf("Результат: %.3f.", countFormula(a, b, c));
	}

	private static double countFormula(double a, double b, double c) {
		double numerator;
		double fraction;

		numerator = b + Math.sqrt(b * b + 4 * a * c);
		fraction = numerator / (2 * a);

		return fraction + Math.pow(a, 3) * c + Math.pow(b, -2);
	}

}
