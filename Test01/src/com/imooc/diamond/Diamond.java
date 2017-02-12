package com.imooc.diamond;

public class Diamond {
/*
 * 输出菱形
 * 上半部分和下部分分别计算
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=20;
		printDiamond(size);
	}
	//定义打印菱形的方法
	public static void printDiamond(int size){
		//判断给定的数值对否可作为菱形大小
		if (size%2==0) {
			size++;
		}
		//输出上半部分
		for (int i = 0; i <size/2+1; i++) {
			//输出菱形外部的空白
			for (int j = size/2+1; j >i+1; j--) {
				System.out.print(" ");
			}
			//输出菱形主体
			for (int j = 0; j <2*i+1; j++) {
				//判断如果是菱形边部位置
				if (j==0||j==2*i) {
					//输出*
					System.out.print("*");
			                                                                                                                 	}
				else {
					//否则输出内部上半部空白
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		//输出下半部分
		for(int i=size/2+1;i<size;i++){
			//输出菱形外部的空白
			for (int j = 0; j < i-size/2; j++) {
				System.out.print(" ");
			}
			//输出菱形主体
			for (int j = 0; j < 2*(size-1); j++) {
				//判断如果是菱形边部位置
				if(j==0||j==2*(size-i-1)){
					//输出*
					System.out.print("*");
				}else{
					//否则输出内部下半部空白
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}

}
