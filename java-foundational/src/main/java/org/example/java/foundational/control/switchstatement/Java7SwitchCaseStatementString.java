package org.example.java.foundational.control.switchstatement;

import java.util.Scanner;

/**
 * JDK7新特性之witch/case使用String
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/28 16:36
 * @since JDK17
 */
public class Java7SwitchCaseStatementString {

	public static void main(String[] args) {

		// 需求：根据不同的性别生成不同的招呼用语

		String greeting = "你好,";

		Scanner input = new Scanner(System.in);

		System.out.println("请输入你的性别 男/女");

		// 接收用户在键盘输入的性别保存到gender变量中
		String gender = input.next();

		switch (gender) {
			case "男":
				greeting += "先生";
				break;
			case "女":
				greeting += "女仕";
				break;
			default:
				greeting += "顾客";
				break;
		}

		System.out.println("生成的招呼用语:" + greeting);
	}
}
