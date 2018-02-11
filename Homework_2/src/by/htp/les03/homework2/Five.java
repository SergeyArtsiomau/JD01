/**
 * 
 */
package by.htp.les03.homework2;

/**
 * @author sergeiartsiomau
 *
 */
public class Five {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Five.ss();
	}

	public static void ss() {
		int mas[] = { 2, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] tmp = new int[mas.length];
		int count = 0;
		for (int n : mas)
			if (n % 2 == 0)
				tmp[count++] = n;
		if (count != 0) {
			System.out.println("-----------------------------");
			System.out.println("Количество четных чисел - " + count);
			System.out.println("-----------------------------");
			for (int i = 0; i < tmp.length; i++) {
				if (tmp[i] != 0) {
					System.out.println(tmp[i]);
				}
			}
		} else
			System.out.println("Четных чисел нет");

	}
}
