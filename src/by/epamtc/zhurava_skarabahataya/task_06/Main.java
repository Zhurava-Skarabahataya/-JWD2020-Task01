/*
 * Сумма первых n членов арифметической прогрессии вычисляется по формуле 
 * Sn = ( a1 + an )* n / 2. Даны a1 и d (шаг арифметической прогрессии).
 *  Найдите n, при котором значение Sn выходит за диапазон типов int и long 
 *  (экспериментальным путем).
*/

package by.epamtc.zhurava_skarabahataya.task_06;

public class Main {

	public static void main(String[] args) {
		int a1;
		int d;

		a1 = 1000;
		d = -309040;

		findOutOfInt(a1, d);
		findOutOfLong(a1, d);
	}

	private static void findOutOfLong(int a1, int d) {

		boolean isInLongRange;
		long n;
		long previousSum;

		isInLongRange = true;
		n = 1;
		previousSum = a1;

		while (isInLongRange) {
			long an;
			long sum;

			an = a1 + (n - 1) * d;
			sum = (a1 + an) * n / 2;

			if ((d > 0 && previousSum > sum) || (d < 0 && previousSum < 0 && sum > 0)) {
				System.out.printf("Sn is out of long range with n=%d%n", n);
				break;
			}

			n++;
			previousSum = sum;
		}

	}

	private static void findOutOfInt(int a1, int d) {

		boolean isInIntRange;
		int n;
		int previousSum = a1;

		isInIntRange = true;
		n = 1;

		while (isInIntRange) {
			int an;
			int sum;

			an = a1 + (n - 1) * d;
			sum = (a1 + an) * n / 2;

			if ((d > 0 && previousSum > sum) || (d < 0 && previousSum < 0 && sum > 0)) {
				System.out.printf("Sn is out of int range with n=%d%n", n);
				break;
			}

			previousSum = sum;
			n++;
		}

	}

}
