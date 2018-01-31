/**
 * 
 */
package by.htp.les02.ex01;

/**
 * @author sergeiartsiomau
 *
 */
public class Homework6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = (int) (Math.random() * 100);// создаем интовую переменную х и инициализируем ее случайным интовым числом
		double mass[] = new double[x]; // создаЄм массив чисел double- mass с количествои чисел в массиве равным х
		for (int i = 0; i < mass.length; i++) { // цикл for для массива
			mass[i] = Math.random() * 100;// исползую цикл for инициализируем каждый элемент массива случайным числом
											// double
		}
		for (int i = 0; i < mass.length; i++) {// цикл for для массива
			mass[i] = (int) mass[i];// сползую цикл for перевдим числа double в int
		}
		int z = 0; // сумма переменна€ дл€ четных чисел
		int y = 0; // сумма переменных дл€ >15
		for (int i = 0; i < mass.length; i++) {// цикл for для массива
			if (mass[i] % 2 == 0) { // если элемент массива четный
				z++; // увеличиваем на единицу переменную
			}
			if (mass[i] > 15) {// если элемент массива > 15
				y++; // увеличиваем на единицу переменную
			}
		}
		System.out.println("количество чисел в массиве - " + x);
		for (int i = 0; i < mass.length; i++) { // цикл for для массива
			System.out.println(mass[i]);// просматриваем все элементы массива
		}
		System.out.println("количество четных - " + z);
		System.out.println("количество чисел >15 - " + y);

	}
	
}
