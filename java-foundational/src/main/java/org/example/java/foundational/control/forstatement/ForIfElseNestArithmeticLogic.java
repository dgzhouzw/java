package org.example.java.foundational.control.forstatement;

/**
 * @author zzw dgzzw1@163.com
 * @version 2022/12/28 17:37
 * @since JDK17
 * 需求1：打印出四位数字中 个位+百位=十位+千位，其个位为偶数，千位为奇数的数字，并且打印出符合条件的个数
 * 需求2：符合条件的数字，每行显示5个，用空格隔开
 */
public class ForIfElseNestArithmeticLogic {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 1000; i < 10000; i++) {
			// 计算个、十、百、仟 位
			int unit = i / 1 % 10;
			int ten = i / 10 % 10;
			int hundred = i / 100 % 10;
			int thousand = i / 1000 % 10;

			if ((unit + hundred) == (ten + thousand) &&
			unit % 2 == 0 && thousand % 2 != 0) {
				count ++;
				System.out.print(i + " ");
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("满足条件的个数是:" + count + "个");
	}
}
