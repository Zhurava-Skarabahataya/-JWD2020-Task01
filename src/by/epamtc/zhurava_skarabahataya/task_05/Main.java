/*
 * ���� ����������� �����. ����������:

    ����� � ������������ ���� �����;
    �����, ���������� ������������� ���� ����� � ��������;
    �������������� �����, ���������� ������������� ����� ������ � �������� ����� ����� (��������, �� ����� 137 ���������� �������� ����� 7137).
*/

package by.epamtc.zhurava_skarabahataya.task_05;

public class Main {
	public static void main(String[] args) {
		int number;
		
		number = 357;

		findSumAndProductOfDigits(number);
		swapHundredsAndTens(number);
		getFourDigitNumber(number);
	}

	private static void findSumAndProductOfDigits(int number) {
		int sumOfDigits;
		int productOfDigits;
		
		sumOfDigits = 0;
		productOfDigits = 1;
		
		while (number > 0) {
			int lastDigit;
			lastDigit = number % 10;
			
			sumOfDigits += lastDigit;
			productOfDigits *= lastDigit;
			
			number = number / 10;
		}
		
		System.out.printf("����� ����: %d%n", sumOfDigits);
		System.out.printf("������������ ����: %d%n", productOfDigits);
	}

	private static void swapHundredsAndTens(int number) {
		int ones;
		int tens;
		int hundreds; 
		int resultNumber;
		
		ones = number % 10;
		tens = number / 10 % 10;
		hundreds = number / 100;
		
		resultNumber = ones + hundreds * 10 + tens * 100;
		
		System.out.printf("������������ ����� � ��������: %d%n", resultNumber);
	}

	private static void getFourDigitNumber(int number) {
		int ones;
		
		ones = number % 10;
		number += ones * 1000;
		
		System.out.printf("������������ ������ � �������� �����: %d%n", number);
	}

}
