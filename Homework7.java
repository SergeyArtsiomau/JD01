/**
 * 
 */
package by.htp.les02.ex01;

import java.util.Scanner;

/**
 * @author sergeiartsiomau
 *
 */
public class Homework7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a, b, c, d;
		double sum;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.print("Введите a: ");
		a = in.nextDouble();

		System.out.print("Введите b: ");
		b = in.nextDouble();
		
		System.out.print("Введите c: ");
		c = in.nextDouble();
		
		System.out.print("Введите d: ");
		d = in.nextDouble();
		
		sum = (a/c)*(b/d) - (a*b -c)/(c*d);
		
		System.out.print("Сумма=" +sum);
	}

}
