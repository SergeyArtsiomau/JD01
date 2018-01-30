/**
 * 
 */
package by.htp.les02.ex01;

import java.util.Scanner;

/**
 * @author sergeiartsiomau
 *
 */
public class Homework10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = 0, Fx;

		System.out.print("Введите x: ");
		if (sc.hasNextDouble())
			;
		x = sc.nextDouble();

		if (x <= -3)
			Fx = 9;

		else {
			Fx = 1 / (Math.pow(x, 2) + 1);
		}
		System.out.println("F(x)=" + Fx);

	}


	}

