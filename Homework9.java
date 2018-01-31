/**
 * 
 */
package by.htp.les02.ex01;

/**
 * @author sergeiartsiomau
 *
 */
import java.util.Scanner;

public class Homework9 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double h = 0;
		double x = 0;
		double y;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Введите a:");
		a = in.nextDouble();
		System.out.println("Введите b:");
		b = in.nextDouble();
		System.out.println("Введите h:");
		h = in.nextDouble();
		for (double i = a; i <= b; i += h) {
			x = i;
			y = 2 * Math.tan(x / 2) + 1;
			System.out.println("x = " + x + " " + "\t" + "F(x)= " + y);
		}
	}

}
