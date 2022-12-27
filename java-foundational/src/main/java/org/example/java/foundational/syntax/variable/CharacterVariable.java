package org.example.java.foundational.syntax.variable;

/**
 * 字符型变量的定义和使用
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 00:28
 * @since JDK17
 */
public class CharacterVariable {
	public static void main(String[] args) {
		char ch = 'a';
		System.out.println(ch);
		// 小写字符a 对应的Unicode编码值就是97
		// 大写字符A 对应的Unicode编码值就是65
		// 字符0 对应的Unicode编码值就是48
		ch = 97;
		System.out.println(ch);

		char zero = '\u0030';
		System.out.println(zero);

		char chinese = '周';
		System.out.println(chinese);

		// 转义字符
		// 换行
		char newLine = '\n';
		System.out.println("Hello" + newLine + "World");

		// 路径转义
		char path = '\\';
		System.out.println(path);

		char tab = '\t';
		System.out.println("Hello" + tab + "World");
	}
}
