package org.example.java.foundational.operator.assignment;

/**
 * 整数溢出的内存原理
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 15:10
 * @since JDK17
 */
public class IntOverFlow {

	public static void main(String[] args) {

		byte value = (byte) 135;

		/*
			计算过程

			135 默认是int类型，int占据4个字节
			135 在内存中的二进制补码表示方式为 0000 0000 0000 0000 0000 0000 1000 0111
			将135强制转换成一个字节后135在内存中的二进制补码表示方式为 1000 0111
			将1000 0111 转换成原码
			根据补码求原码 补码减1得反码 1000 0110
			反码求原码 反码的符号位不变，其它数据位取反 1111 1001 -121
		 */
		// 打印输出变量的值 十进整数 默认是打印的原码表示方式
		System.out.println("value = " + value);
	}
}
