package org.example.java.foundational.operator.autoincrement;

/**
 * 自增运算符前置++和后置++复合使用的区别
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 10:58
 * @since JDK17
 */
public class AutoincrementExpressionOperator {

	public static void main(String[] args) {

		int number = 10;
		// right = 10
		// 后置++ 先参与运算，再自增1
		// number的值赋值给right后自增1
		int right = number++;
		System.out.println("right = " + right);
		System.out.println("number = " + number);

		int data = 10;
		// 前置++ 先自增1，再参与运算
		// data先自增1，再赋值给left
		int left = ++data;
		System.out.println("data = " + data);
		System.out.println("left = " + left);
	}
}
