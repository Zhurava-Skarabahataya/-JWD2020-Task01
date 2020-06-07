/*
 * Сумма первых n членов арифметической прогрессии вычисляется по формуле Sn = ( a1 + an )* n / 2. 
 * Даны a1 и d (шаг арифметической прогрессии). 
 * Найдите n, при котором значение Sn выходит за диапазон типов int и long (экспериментальным путем).
*/

package by.epamtc.zhurava_skarabahataya.task_06;

public class Main {

	public static void main(String[] args) {
		double a1;
		double d;

		a1 = 1000;
		d = 340;

		findN(a1, d);
	}

	private static void findN(double a1, double d) {
		boolean isInIntRange;
		boolean isInLongRange;
		long n;

		isInIntRange = true;
		isInLongRange = true;
		n = 1;

		while (isInLongRange) {
			double an;
			double sn;

			an = a1 + (n - 1) * d;
			sn = (a1 + an) * n / 2;

			if (isInIntRange && (sn > Integer.MAX_VALUE || sn < Integer.MIN_VALUE)) {
				System.out.printf("Sn выходит за пределы int при n=%d%n", n);
				isInIntRange = false;
			}
			if (sn > Long.MAX_VALUE || sn < Long.MIN_VALUE) {
				isInLongRange = false;
				System.out.printf("Sn выходит за пределы long при n=%d%n", n);
			}

			n++;
		}

	}


}
