/*
 * ����� ������ n ������ �������������� ���������� ����������� �� ������� Sn = ( a1 + an )* n / 2. 
 * ���� a1 � d (��� �������������� ����������). 
 * ������� n, ��� ������� �������� Sn ������� �� �������� ����� int � long (����������������� �����).
*/

package by.epamtc.zhurava_skarabahataya.task_06;

public class Main {

	public static void main(String[] args) {
		long a1;
		long d;

		a1 = 1000;
		d = 340;

		findN(a1, d);
	}

	private static void findN(long a1, long d) {
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
				System.out.printf("Sn ������� �� ������� int ��� n=%d%n", n);
				isInIntRange = false;
			}
			if (sn > Long.MAX_VALUE || sn < Long.MIN_VALUE) {
				isInLongRange = false;
				System.out.printf("Sn ������� �� ������� long ��� n=%d%n", n);
			}

			n++;
		}

	}


}
