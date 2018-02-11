/**
 * 
 */
package by.htp.les03.homework2;

/**
 * @author sergeiartsiomau
 *
 */

public class Four {

	/**
	 * @param args
	 */

	@SuppressWarnings("unused")
	private static boolean a;

	public static void main(String[] args) {

		boolean flag = Four.sortedArray();
		if (flag == false) {
			System.out.println("Последовательность является возрастающей");
		} else
			System.out.println("Последовательность не является возрастающей");
	}

	public static boolean sortedArray() {
		int[] arr = { 1, 4, 7, 8, 16, 32, 54, 73 };
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				flag = true;
				break;
			}
		}

		return flag;
	}
}
