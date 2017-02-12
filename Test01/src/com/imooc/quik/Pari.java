package com.imooc.quik;
/*
 * 
 * 快速排序2拆分法
 */
public class Pari{
	//声明划分函数分成2段
	public int pari(int [] a,int first,int end){
		int i,j;
		i=first;j=end;
		//分两段
		while(i<j){
			//第一段排序
			while (i<j&&a[i]<=a[j]) {
				j--;
			}
			if (i<j) {
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			//第二段排序
			while (i<j&&a[i]<a[j]) {
				i++;
			}
			if (i<j) {
				
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		//返回排序索引
		return i;
	}
	//创建类实例
	static Pari p=new Pari();
	//利用递归划分
	public static void quick(int[] r,int first,int end){    
		if(first<end){
			//调用划分函数
			int pivot=p.pari(r, first, end); 
			//递归调用划分
			quick(r,first,pivot-1);
			quick(r,pivot+1,end);
		}
	}
	//主函数
	public static void main(String[] args) {
		int r[]={12,25,36,63,21,32,56,11};
		System.out.println("待排序的记录序列是：");
		for(int i=0;i<8;i++){
			System.out.print(r[i]+"  ");
		}
		//调用调用划分函数
		quick(r,0,7);
		System.out.println("\n"+"排序好的记录是：");
		for(int i=0;i<8;i++){
			System.out.print(r[i]+"  ");
		}

	}
}