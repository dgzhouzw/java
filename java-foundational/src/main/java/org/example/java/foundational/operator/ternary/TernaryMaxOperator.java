package org.example.java.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 三元运算符求三个整数的最大值
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 13:33
 * @since JDK17
 */
public class TernaryMaxOperator {
	public static void main(String[] args) {

		// 创建Scanner对象
		Scanner input = new Scanner(System.in);

		System.out.println("请输入第一个整数");
		// 接收输入的第一个整数
		int left = input.nextInt();

		System.out.println("请输入第二个整数");
		// 接收输入的第二个整数
		int middle = input.nextInt();

		System.out.println("请输入第三个整数");
		// 接收输入的第三个整数
		int right = input.nextInt();

		System.out.printf("第一个整数:%d  第二个整数:%d  第三个整数:%d \n", left, middle, right);

		// 求三个整数中的最大数

		// 第一步 求两个数中的最大值
		int temp = left > middle ? left : middle;
		System.out.println("两个数中的最大值是" + temp);

		// 第二步 取两个中的最大值与第三个数比较
		int max = temp > right ? temp : right;
		System.out.println("三个数中的最大值是" + max);

		int max1 = left > right ? (left > middle ? left : middle) : right;
		System.out.println(max1);

	}
}
