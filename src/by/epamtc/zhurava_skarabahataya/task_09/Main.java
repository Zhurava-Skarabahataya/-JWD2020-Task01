//Вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).

package by.epamtc.zhurava_skarabahataya.task_09;

public class Main {

	public static void main(String[] args) {
		System.out.println(countProgression());
	}

	private static long countProgression() {
		long result;
		result = 1;
		
		for (int i = 2; i <= 10; i++) {
			result *= sumTo(i);
		}
		return result;
	}

	private static int sumTo(int count) {
		int sum;
		sum = 0;
		
		for (int i = 1; i <= count; i++) {
			sum += i;
		}
		return sum;
	}

}
