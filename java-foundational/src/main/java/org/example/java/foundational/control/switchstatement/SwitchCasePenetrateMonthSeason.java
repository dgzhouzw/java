package org.example.java.foundational.control.switchstatement;

import java.util.Scanner;

/**
 * 根据月份判断季节
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/28 16:46
 * @since JDK17
 */
public class SwitchCasePenetrateMonthSeason {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("请输入月份");

		int month = input.nextInt();

		switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println("冬天");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春天");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏天");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋天");
				break;
			default:
				System.out.println("你的输入有误");
				break;
		}
	}
}
