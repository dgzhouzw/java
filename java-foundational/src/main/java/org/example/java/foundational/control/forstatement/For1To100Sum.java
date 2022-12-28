package org.example.java.foundational.control.forstatement;

/**
 * 计算1-100的整数和
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/28 17:13
 * @since JDK17
 */
public class For1To100Sum {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.printf("1-100的和:%d\n", sum);
	}
}
