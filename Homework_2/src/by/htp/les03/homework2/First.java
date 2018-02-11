/**
 * 
 */
package by.htp.les03.homework2;

import java.util.Random;

/**
 * @author sergeiartsiomau
 *
 */
public class First {

	public static void main(String[] args) {
		int[] mas = new int[10];

		System.out.println();
		System.out.println("Массив случайных чисел");

		Random random = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = random.nextInt(100);
		}

		System.out.println("-----------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("");
		System.out.println("-----------------------------");

		int min = mas[0];
		int max = mas[0];
		int indexMinElement = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];

			}
			if (mas[i] < min) {
				min = mas[i];
				indexMinElement = i;
			}
		}

		for (int i = 0; i < mas.length - 1; i++) {
			int min1 = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[j] < mas[min1]) {
					min1 = j;
				}
			}
			int tmp = mas[i];
			mas[i] = mas[min1];
			mas[min1] = tmp;
		}

		System.out.println(" ");
		System.out.println("Минимальный элемент");
		System.out.println(min);

		System.out.println("Индекс минимального элемента");
		System.out.println(indexMinElement);

		System.out.println("Максимальный элемент");
		System.out.println(max);

		System.out.println("Сортировка массива методом прямого выбора:");
		System.out.println("-----------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("");
		System.out.println("-----------------------------");
	}
}