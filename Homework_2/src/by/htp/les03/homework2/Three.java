/**
 * 
 */
package by.htp.les03.homework2;

/**
 * @author sergeiartsiomau
 *
 */

public class Three {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] mas = { 2, 6, 4, 0, 0, 0, 3, 0, 9, 1, 0 };

		System.out.println("Массив чисел: ");
		System.out.println("----------------------");

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

		nullmasNumber(mas);
	}

	public static void nullmasNumber(int[] a) {

		int nullIndex = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				nullIndex = nullIndex + 1;

		}

		System.out.println(" ");
		System.out.println("----------------------");
		System.out.println("Количество нулей - " + nullIndex);

		int[] masIndex = new int[nullIndex];

		int nullInd = 0;

		for (int y = 0; y < a.length; y++) {

			if (a[y] == 0) {
				masIndex[nullInd] = y;
				nullInd = nullInd + 1;
			}

		}
		System.out.println(" ");
		System.out.println("Массив нулей:");
		System.out.println("-----------");
		for (int j = 0; j < masIndex.length; j++) {
			System.out.print(masIndex[j] + " ");

		}
		System.out.println(" ");
		System.out.println("-----------");
	}

}
