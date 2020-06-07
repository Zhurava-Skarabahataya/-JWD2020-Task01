/*
//Ќапишите программу, котора€ дл€ введенной последовательности целых ненулевых чисел 
//(признак окончани€ ввода - ввод 0, количество чисел не меньше 2) определ€ет:
//€вл€етс€ ли последовательность возрастающей;
//есть ли в ней хот€ бы одна пара одинаковых соседних чисел;
//€вл€етс€ ли последовательность знакочередующейс€ 
//(3, -2, 4, -5, 0 - да; 5, -4, -7, 8, 0 - нет); 
//ƒл€ ввода значений с клавиатуры можно воспользватьс€ классом Scanner.
// *ѕримечание: массив или коллекцию дл€ решени€ этой задачи использовать нельз€.
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
			System.out.println("ѕоследовательность возрастающа€");
		} else {
			System.out.println("ѕоследовательность невозрастающа€");
		}

		if (hasNeighborsEqual) {
			System.out.println("≈сть хот€ бы одна пара одинаковых соседних чисел");
		} else {
			System.out.println("Ќет пар одинаковых соседних чисел");
		}

		if (isSignsRotate) {
			System.out.println("«накочередующа€с€ последовательность");
		} else {
			System.out.println("Ќезнакочередующа€с€ последовательность");
		}
	}

}
