package com.imooc.sum;

import java.math.BigDecimal;

public class Sum {
/*
 * �׳����:
 * ����1!+2!+3!.....+20!������
 * ����1!+1/2!+1/3!.....+1/20!�ü���Ӧʹ�ô�С�����Ϳ��ƾ���
 * */
	public static void main(String[] args) {
		int a=20;
		int i=1;
		int j=1;
		int sum = 0;
		//����ڶ����������ʽ
		BigDecimal sum1=new BigDecimal(0.0);
		BigDecimal ff=new BigDecimal(1.0);
		//1
		while (i<=20) {
			//����׳���֮��
			sum=sum+j;
			i++;
			//����׳���
			j=j*i;
		}
		System.out.println(sum);
		//2
		while(i<=20){
			//����׳���֮��
			sum1=sum1.add(ff);
			i++;
			//����׳���
			ff=ff.multiply(new BigDecimal(1.0/i));
		}
		System.out.println(sum1);
	}
	
}
