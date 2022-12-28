package org.example.java.foundational.control.forstatement;

/**
 * 打印出水仙花数
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/28 17:33
 * @since JDK17
 */
public class ForNarcissusNumber {

	public static void main(String[] args) {

		// 用于统计有多个数的变量
		int count = 0;

		for (int i = 100; i <= 1000; i++) {
			// 计出个、十、百位数
			int unit = i / 1 % 10;
			int ten = i / 10 % 10;
			int hundred = i / 100 % 10;

			int value = unit * unit * unit + ten * ten * ten + hundred * hundred * hundred;

			if (value == i) {
				count ++;
				System.out.print(value + " ");
			}
		}
		System.out.println();
		System.out.println("共有水仙花数:" + count + "个");
	}
}
