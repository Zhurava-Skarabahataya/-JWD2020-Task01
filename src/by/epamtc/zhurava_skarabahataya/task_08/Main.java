//��������� �������� ������� �� ������� [a,b] c ����� h:

package by.epamtc.zhurava_skarabahataya.task_08;

public class Main {
	
	public static void main(String[] args) {
		double c; 
		double a; 
		double b;
		double h;
		
		c= 15;
		a = 1;
		b = 110;
		h = 2;
		
		countFunc(c, a, b, h);
	}

	private static void countFunc(double c, double a, double b, double h) {
		
		for (double x = a; x <= b; x += h) {
			
			double y;
			
			if (x == 15) {
				y = (x + c) * 2;
			} else {
				y = (x - c) + 6;
			}
			
			System.out.printf("y=%.3f ��� x=%.3f%n", y, x);

		}
	}

}
