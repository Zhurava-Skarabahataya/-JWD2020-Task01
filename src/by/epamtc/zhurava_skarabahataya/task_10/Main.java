/*
//Напишите программу, которая для введенной последовательности целых ненулевых чисел
 *  (признак окончания ввода - ввод 0, количество чисел не меньше 2) определяет:

является ли последовательность возрастающей;
есть ли в ней хотя бы одна пара одинаковых соседних чисел;
является ли последовательность знакочередующейся (3, -2, 4, -5, 0 - да; 5, -4, -7, 8, 0 - нет);
 Для ввода значений с клавиатуры можно воспользваться классом Scanner.
*Примечание: массив или коллекцию для решения этой задачи использовать нельзя.
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
			System.out.println("Последовательность возрастающая");
		} else {
			System.out.println("Последовательность невозрастающая");
		}

		if (hasNeighborsEqual) {
			System.out.println("Есть два одинаковыз соседа");
		} else {
			System.out.println("Нет одинаковых соседей");
		}

		if (isSignsRotate) {
			System.out.println("Знакочередующая");
		} else {
			System.out.println("Незнакочередующая");
		}
	}

}
