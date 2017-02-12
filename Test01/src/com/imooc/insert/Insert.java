package com.imooc.insert;

public class Insert {
/*
 * 
 * 插入排序
 */
	public static void main(String[] args) {
		int r[]={12,25,36,63,21,32,56,11};
		int i,j,temp,k;
		System.out.println("插入前:");
		for (i = 0; i < r.length; i++) {
			System.out.print(r[i]+" ");
		}
		
		for (i = 0; i < r.length; i++) {
			temp=r[i];
			for (j = i-1;j>=0&&temp<r[j] ; j--) {
				r[j+1]=r[j];
			}
			r[j+1]=temp;
		}
		System.out.println("排序后:");
		for ( i = 0; i < r.length; i++) {
			System.out.print(r[i]+" ");
		}
	}
}
