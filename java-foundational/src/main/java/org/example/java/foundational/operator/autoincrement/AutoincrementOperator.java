package org.example.java.foundational.operator.autoincrement;

/**
 * 自增运算符
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 10:55
 * @since JDK17
 */
public class AutoincrementOperator {
	public static void main(String[] args) {

		int number = 10;
		// number自增1，也就是加1
		number++;
		System.out.println("number = " + number);

		int data = 10;
		++data;
		System.out.println("data = " + data);
	}
}
