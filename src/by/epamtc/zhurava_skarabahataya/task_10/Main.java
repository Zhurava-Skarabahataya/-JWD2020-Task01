/*
//�������� ���������, ������� ��� ��������� ������������������ ����� ��������� ����� 
//(������� ��������� ����� - ���� 0, ���������� ����� �� ������ 2) ����������:
//�������� �� ������������������ ������������;
//���� �� � ��� ���� �� ���� ���� ���������� �������� �����;
//�������� �� ������������������ ����������������� 
//(3, -2, 4, -5, 0 - ��; 5, -4, -7, 8, 0 - ���); 
//��� ����� �������� � ���������� ����� �������������� ������� Scanner.
// *����������: ������ ��� ��������� ��� ������� ���� ������ ������������ ������.
*/

package by.epamtc.zhurava_skarabahataya.task_10;

import java.util.Scanner;

public class Main {

	static boolean isIncreasing;
	static boolean hasNeighborsEqual;
	static boolean isSignsRotate;

	public static void main(String[] args) {
		isIncreasing = true;
		hasNeighborsEqual = false;
		isSignsRotate = true;

		enterSequence();
		printResults();
	}

	private static void enterSequence() {
		int previousNumber;
		int nextNumber;

		Scanner scanner;
		scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			previousNumber = scanner.nextInt();
		} else {
			previousNumber = 0;
		}
		if (scanner.hasNextInt()) {
			nextNumber = scanner.nextInt();
		} else {
			nextNumber = 0;
		}

		while (nextNumber != 0) {
			if (nextNumber < previousNumber) {
				isIncreasing = false;
			} else if (nextNumber == previousNumber) {
				hasNeighborsEqual = true;
			}

			if (nextNumber > 0 && previousNumber > 0 || nextNumber < 0 && previousNumber < 0) {
				isSignsRotate = false;
			}
			previousNumber = nextNumber;
			nextNumber = scanner.nextInt();
		}
	}

	private static void printResults() {
		if (isIncreasing) {
			System.out.println("������������������ ������������");
		} else {
			System.out.println("������������������ ��������������");
		}

		if (hasNeighborsEqual) {
			System.out.println("���� ���� �� ���� ���� ���������� �������� �����");
		} else {
			System.out.println("��� ��� ���������� �������� �����");
		}

		if (isSignsRotate) {
			System.out.println("����������������� ������������������");
		} else {
			System.out.println("������������������� ������������������");
		}
	}

}
