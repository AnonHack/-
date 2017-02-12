package com.imooc.sum;

import java.math.BigDecimal;

public class Sum {
/*
 * 阶乘求和:
 * 计算1!+2!+3!.....+20!或者是
 * 计算1!+1/2!+1/3!.....+1/20!该计算应使用大小数类型控制精度
 * */
	public static void main(String[] args) {
		int a=20;
		int i=1;
		int j=1;
		int sum = 0;
		//计算第二个素数表达式
		BigDecimal sum1=new BigDecimal(0.0);
		BigDecimal ff=new BigDecimal(1.0);
		//1
		while (i<=20) {
			//计算阶乘项之和
			sum=sum+j;
			i++;
			//计算阶乘项
			j=j*i;
		}
		System.out.println(sum);
		//2
		while(i<=20){
			//计算阶乘项之和
			sum1=sum1.add(ff);
			i++;
			//计算阶乘项
			ff=ff.multiply(new BigDecimal(1.0/i));
		}
		System.out.println(sum1);
	}
	
}
