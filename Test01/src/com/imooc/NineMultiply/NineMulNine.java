package com.imooc.NineMultiply;

public class NineMulNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ѭ������i(����)��1-9
		for (int i = 1; i <=9; i++) {
			//ѭ������j(������)��1-9
			for (int j = 1; j <= i; j++) {
				//����˷���ʽ������̨
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			//�������
			System.out.println();
		}
	}

}
