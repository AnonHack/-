package com.imooc.merge;


public class MergeS {
	//定义归并方法
	//将要归并的数组差分成两个数组,将两个数组归并为一个新数组
	private static void merge(int r[],int a[],int s,int m,int t){
		//声明变量
		int i=s,j=m+1,k=s;
		//
		while(i<=m&&j<=t){
			if(r[i]<=r[j]){
				a[k++]=r[i++];       //取r[i]和r[j]中较小者放入[k]
			}
			else{
				a[k++]=r[j++];
			}
		}
		 //若第一个子序列处理完，则进行收尾处理
		if(i<=m){
			while(i<=m){             
				a[k++]=r[i++];
			}
		}
		else{
			while(j<=t){              //若第二个子序列处理完，则进行收尾处理
				a[k++]=r[j++];
			}
		}
	}
	
	//定义归并中间方法
	private static void mergePass(int r[],int r1[],int n,int h){
		int i=0;
		//待归并记录至少有两个长度为h的子序列
		while(i<=n-2*h){  
			//调用归并方法归并
			merge(r,r1,i,i+h-1,i+2*h-1);
			i+=2*h;
		}
		//待归并序列中有一个长度小于h
		if(i<n-h){
			merge(r,r1,i,i+h-1,n);    
		}
		else{
			//待归并序列中只剩一个子序列
			for(int k=i;k<=n;k++){    
				r1[k]=r[k];
			}
		}
	}
	public static void mergeS(int r[],int r1[],int n){
		int h=1;
		while(h<n){
			mergePass(r,r1,n-1,h);
			h=2*h;
			mergePass(r1,r,n-1,h);
			h=2*h;
		}
	}
	public static void main(String[] args) {
		int r[]={36,45,12,56};
		int r1[]=new int[4];
		System.out.println("原始数列是：");
		for(int i=0;i<r.length;i++){
			System.out.print("  "+r[i]);
		}
		mergeS(r,r1,r.length);
		//mergePass(r,r1,r.length-1,1);
		System.out.println("\n"+"新数列是：");
		for(int i=0;i<r.length;i++){
			System.out.print("  "+r[i]);
		}
	}

}