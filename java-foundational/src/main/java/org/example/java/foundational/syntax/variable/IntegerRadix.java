package org.example.java.foundational.syntax.variable;

/**
 * 整数的四种进制表示方式
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 00:21
 * @since JDK17
 */
public class IntegerRadix {
	public static void main(String[] args) {
		// 定义四个进制的整数
		int bin = 0b1001;
		int oct = 017;
		int dec = 100;
		int hex = 0X64;

		System.out.println(bin);
		System.out.println(oct);
		System.out.println(dec);
		System.out.println(hex);
	}
}
