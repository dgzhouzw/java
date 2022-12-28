package org.example.java.foundational.control.whilestatement;

import java.util.Scanner;

/**
 * while语句的应用
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/28 18:08
 * @since JDK17
 */
public class WhileStatementPositiveNegative {

	public static void main(String[] args) {

		// 需求：读取用户从键盘输入的正整数和负整数的个数，输入0时程序退出

		// 1.创建Scanner对象
		Scanner input = new Scanner(System.in);

		// 标志位
		boolean flag = true;
		// 正数
		int positiveCount = 0;
		// 负数
		int negativeCount = 0;

		while (flag) {
			System.out.println("请输入一个整数");
			int number = input.nextInt();
			if (number == 0) {
				flag = false;
			}
			if (number > 0) {
				positiveCount ++;
			} else if (number < 0){
				negativeCount ++;
			}
		}

		System.out.println("正整数个数:" + positiveCount);
		System.out.println("负整数个数:" + negativeCount);
	}
}
