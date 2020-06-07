//Вычислите число и месяц в невисокосном году по номеру дня.

package by.epamtc.zhurava_skarabahataya.task_02;

public class Main {

	public static void main(String[] args) {
		int dayNumber;
		dayNumber = 43;

		determineDate(dayNumber);
	}

	private static void determineDate(int dayNumber) {
		int monthNumber;
		int daysInCurrentMonth;

		monthNumber = 1;
		daysInCurrentMonth = getDaysInMonth(monthNumber);

		while (dayNumber > daysInCurrentMonth) {
			
			dayNumber -= daysInCurrentMonth;
			monthNumber++;
			daysInCurrentMonth = getDaysInMonth(monthNumber);

		}
		
		System.out.println(dayNumber + "." + monthNumber);
	}

	private static int getDaysInMonth(int month) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return -1;
		}

	}

}
