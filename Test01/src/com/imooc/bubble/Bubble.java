package com.imooc.bubble;

public class Bubble {
/*
 * 冒泡排序:
 * 步骤:1.对整个数组序列分为有序区和无序区
 * 2.对无序区比较,将使关键码小的记录往前移动
 * 3.重复上述操作,直至排序完成
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,25,20,14,23,36,59,28,90,};
		int i,temp;
		System.out.println("数据组排序前:");
		for ( i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//依次对每两个数组元素进行比较,并交换位置
		for (i = 0; i < a.length-1; i++) {
			if (a[i]>a[i+1]) {
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
						
			}
		}
		System.out.println("排序后的数组为:");
		for ( i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
