/*
*���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). 
*�������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.
*/

package by.epamtc.zhurava_skarabahataya.task_07;

public class Main {

	public static void main(String[] args) {
		double r;

		r = 456.123;

		swapParts(r);
	}

	private static void swapParts(double r) {
		int wholePart = (int) r;
		int fractPart = (int) (r * 1000 % 1000);
		double result = (double) wholePart / 1000 + fractPart;

		System.out.printf("���������: %.3f", result);
	}

}
