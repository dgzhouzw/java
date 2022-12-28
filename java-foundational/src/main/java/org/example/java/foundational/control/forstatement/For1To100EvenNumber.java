package org.example.java.foundational.control.forstatement;

/**
 * 打印1-100的偶数
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/28 17:09
 * @since JDK17
 */
public class For1To100EvenNumber {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			// 判断是不是偶数
			if (i % 2 == 0)	{
				System.out.print(i + " ");
			}
		}
	}
}
