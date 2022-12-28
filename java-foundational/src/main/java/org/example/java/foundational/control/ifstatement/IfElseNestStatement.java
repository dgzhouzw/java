package org.example.java.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * 嵌套if/else语句
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/28 00:45
 * @since JDK17
 */
public class IfElseNestStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("请输入你的分数");

		// 接收用户从键盘输入的分数
		int score = input.nextInt();

		if (score > 100 || score < 0) {
			System.out.println("你输入的成绩有误");
		} else {
			if (score >= 90) {
				System.out.println("优秀");
			} else if (score >= 80) {
				System.out.println("良好");
			} else if (score >= 70) {
				System.out.println("中等");
			} else if (score >= 60) {
				System.out.println("及格");
			} else {
				System.out.println("不及格");
			}
		}
	}
}
