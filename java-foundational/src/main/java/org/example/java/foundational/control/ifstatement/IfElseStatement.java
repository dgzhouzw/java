package org.example.java.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * 双分支if/else语句
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/28 00:14
 * @since JDK17
 */
public class IfElseStatement {

	public static void main(String[] args) {

		// 判断用户从键盘输入的数字是奇数还是偶数

		Scanner input = new Scanner(System.in);

		System.out.println("请僌入一个非0的整数");

		// 接收用户从键盘输入的整数
		int number = input.nextInt();

		if (number % 2 == 0) {
			System.out.printf("你输入的%d是偶数\n", number);
		} else {
			System.out.printf("你输入的%d是奇数\n", number);
		}
	}
}
