package com.imooc.bubble;

public class Bubble {
/*
 * ð������:
 * ����:1.�������������з�Ϊ��������������
 * 2.���������Ƚ�,��ʹ�ؼ���С�ļ�¼��ǰ�ƶ�
 * 3.�ظ���������,ֱ���������
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,25,20,14,23,36,59,28,90,};
		int i,temp;
		System.out.println("����������ǰ:");
		for ( i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//���ζ�ÿ��������Ԫ�ؽ��бȽ�,������λ��
		for (i = 0; i < a.length-1; i++) {
			if (a[i]>a[i+1]) {
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
						
			}
		}
		System.out.println("����������Ϊ:");
		for ( i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
