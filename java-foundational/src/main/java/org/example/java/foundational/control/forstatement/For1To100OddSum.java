package org.example.java.foundational.control.forstatement;

/**
 * 计算1-100的奇数和
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/28 17:17
 * @since JDK17
 */
public class For1To100OddSum {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.printf("1To100的奇数和是:%d\n", sum);
	}
}
