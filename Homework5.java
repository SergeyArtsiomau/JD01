/**
 * 
 */
package by.htp.les02.ex01;

/**
 * @author sergeiartsiomau
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @param args
 */
public class Homework5 {

	public static void main(String[] args) throws NumberFormatException, IOException { // пробрасывание ошибок
		int amountFigures; //обозначение переменной
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Написать количество чисел в консоле");
		amountFigures = Integer.parseInt(reader.readLine());
		int mass[];
		mass = new int[amountFigures];
		for (int i = 0; i < amountFigures; i++) {
			mass[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < mass.length; i++) {

			System.out.print(mass[i] + " ");
		}
		System.out.println();
		int x = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 == 0) {
				x++;
			}
		}
		System.out.println("Количество чётных чисел - " + x);

		int y = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 3 == 0) {
				y += mass[i];
			}
		}
		System.out.println("Сумма кратных 3 - " + y);
		int z = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] < 3) {
				z++;
			}
		}
		System.out.println("Количество чисел, модуль которых < 3 - " + z);
	}
}
