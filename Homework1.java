package by.htp.home.ex01;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double S;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Введите a: ");
		a = in.nextDouble();
		System.out.print("Введите b: ");
		b = in.nextDouble();
		c = Math.sqrt(a * 2 + b * 2);
		S = 0.5 * a * b;

		System.out.println("Гипотенуза=" + c);
		System.out.println("Площадь треугольника по двум катетам=" + S);

	}

}
