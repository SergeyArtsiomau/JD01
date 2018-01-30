/**
 * 
 */
package by.htp.les02.ex01;

import java.util.Scanner;

/**
 * @author sergeiartsiomau
 *
 */
public class Homework4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a, b, c;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.print("Введите a: ");
		a = in.nextDouble();

		System.out.print("Введите b: ");
		b = in.nextDouble();

		if (a == b) {

			System.out.println("Скоро Новый Год");

		} else {
			System.out.print("Введите c: ");
			c = in.nextDouble();

			System.out.println(a + b + c);

			System.out.println(a * a + b * b);

			System.out.println("моя любимая футбольная команда");
		}
	}

}
