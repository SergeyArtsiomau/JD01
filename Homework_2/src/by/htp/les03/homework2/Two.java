/**
 * 
 */
package by.htp.les03.homework2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author sergeiartsiomau
 *
 */
public class Two {
	public static int[] mas = new int[10];
	public static int k = 0;

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int[] mas = masNumber();
		
		@SuppressWarnings("unused")
		int k = vvediteK();
		
		@SuppressWarnings("unused")
		int sum = summaoverK();
	}

	public static int[] masNumber() {
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
		return mas;
		
	}

	public static int vvediteK() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите k: ");
		k = in.nextInt();
		return k;
	}

	public static int summaoverK() {
		int summa = 0;

		for (int i = 0; i < mas.length; i++) {
			
			if (mas[i] % k == 0) {
				summa = summa + mas[i];
			}
		}

		System.out.println("Сумма элементов кратных k : " + summa);
		
		return summa;
	}
}
