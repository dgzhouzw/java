package org.example.java.foundational.syntax.variable;

/**
 * Java7新特性之数值之间使用下划线
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 00:18
 * @since JDK17
 */
public class UnderScore {
	public static void main(String[] args) {
		Long longVal = 100_000_000_00000L;
		System.out.println(longVal);

		double dblVal = 3.141_59_26;
		System.out.println(dblVal);
	}
}
