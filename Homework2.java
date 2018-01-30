package by.htp.les02.ex01;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		double a, b, c;
		double rez;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Введите a: ");
		a = in.nextDouble();
		System.out.print("Введите b: ");
		b = in.nextDouble();
		System.out.print("Введите c: ");
		c = in.nextDouble();
		rez = (Math.pow(a, 2) - Math.pow(b - c, 2) + Math.log(Math.pow(b, 2) + 1));
		System.out.println("Решение:" + rez);
	}

}
