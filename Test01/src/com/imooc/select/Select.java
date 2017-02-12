package com.imooc.select;

public class Select {
/*
 * 
 * 选择排序
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r[]={12,25,36,63,21,32,56,11};
		int i,j,index,temp;
		System.out.println("排序前");
		for ( i = 0; i < r.length; i++) {
			System.out.println(r[i]+"\t");
		}
		for ( i = 0; i < r.length-1; i++) {
			//定义参照元素索引
			index=i;
			for ( j = i+1; j < r.length; j++) {
				//比较大小
				if (r[j]<r[index]) {
					index=j;
				}
			}
			//交换记录
			if (index!=i) {
				temp=r[i];
				r[i]=r[index];
				r[index]=temp;
			}
		}
		System.out.println("排序好的数组:");
		for ( i = 0; i < r.length; i++) {
			System.out.println(r[i]);
			
		}
	}

}
