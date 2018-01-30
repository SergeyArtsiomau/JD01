package by.htp.les02.ex01;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		double a, b, c;
		@SuppressWarnings("unused")
		double s;
		double x;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.print("Введите a: ");
		a = in.nextDouble();

		System.out.print("Введите b: ");
		b = in.nextDouble();

		if (a > b) {
			System.out.print("Введите c: ");
			c = in.nextDouble();
			x = b + c;
			System.out.println("Сумма= " + x);
		} else {
			if (a == b) {
				System.out.println("Конец");
			} else {
				System.out.print("Введите c: ");
				c = in.nextDouble();
				System.out.println("Новый год " + (a + b + c));
			}
		}
	}

}
