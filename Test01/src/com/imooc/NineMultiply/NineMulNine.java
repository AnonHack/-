package com.imooc.NineMultiply;

public class NineMulNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//循环变量i(乘数)从1-9
		for (int i = 1; i <=9; i++) {
			//循环变量j(被乘数)从1-9
			for (int j = 1; j <= i; j++) {
				//输出乘法公式到控制台
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			//输出换行
			System.out.println();
		}
	}

}
