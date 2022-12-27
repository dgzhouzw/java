package org.example.java.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 数字反转
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 11:15
 * @since JDK17
 */
public class NumberInversion {

	public static void main(String[] args) {
		// 创建Scanner对象
		Scanner input = new Scanner(System.in);

		// 接收键盘输入的整数保存到number变量中
		System.out.println("请输入一个四位整数");
		int number = input.nextInt();

		System.out.println("你从键盘输入的数据是" + number);

		// 第一步 获取四位整数的 个位、十位、百位、千位
		int unit = number / 1 % 10;
		int ten = number / 10 % 10;
		int hundred = number / 100 % 10;
		int thousand = number / 1000 % 10;

		System.out.printf("输入数字的 个位：%d 十位: %d 百位: %d 千位: %d\n", unit,
				ten, hundred, thousand);

		// 第二步 个位*1000+十位*100+百位*10+千位
		int result = unit * 1000 + ten * 100 + hundred * 10 + thousand;
		System.out.printf("%d反转之后的结果是%d\n", number, result);
	}
}
