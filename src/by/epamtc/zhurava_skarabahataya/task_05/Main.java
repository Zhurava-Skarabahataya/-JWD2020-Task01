/*
 *Дано трехзначное число. Определите:

сумму и произведение цифр числа;
число, полученное перестановкой цифр сотен и десятков;
четырехзначное число, полученное приписыванием цифры единиц в качестве цифры тысяч 
(например, из числа 137 необходимо получить число 7137).
Примечание: для решения этой нельзя использовать перевод числа в строку и обратно. 

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

		System.out.printf("Сумма цифр: %d%n", sumOfDigits);
		System.out.printf("Произведение цифр: %d%n", productOfDigits);
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

		System.out.printf("Поменять местами сотни и десятки: %d%n", resultNumber);
	}

	private static void getFourDigitNumber(int number) {
		int ones;

		ones = number % 10;
		number += ones * 1000;

		System.out.printf("Подставить число единиц в качестве тысяч: %d%n", number);
	}

}
