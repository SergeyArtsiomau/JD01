/**
 * 
 */
package by.htp.les02.ex01;

import java.util.Scanner;

/**
 * @author sergeiartsiomau
 *
 */
public class Homework8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a, b, c, d;
		double sum;
		Scanner in = new Scanner(System.in);

		System.out.print("Введите a: ");
		a = in.nextDouble();

		System.out.print("Введите b: ");
		b = in.nextDouble();

		System.out.print("Введите c: ");
		c = in.nextDouble();

		if (a >= 0) {
			double s = a * a;
			System.out.println("Квадрат a =" + s);
		} else
			System.out.println(" a в четвёртой степени =" + Math.pow(a, 4));

		if (b >= 0) {
			double h = b * b;
			System.out.println("Квадрат b  =" + h);
		} else
			System.out.println(" b в четвёртой степени =" + Math.pow(b, 4));

		if (c >= 0) {
			double g = c * c;
			System.out.println("Квадрат с =" + g);
		} else
			System.out.println(" c в четвёртой степени =" + Math.pow(c, 4));

	}
}
