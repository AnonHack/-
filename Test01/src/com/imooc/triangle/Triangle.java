package com.imooc.triangle;

public class Triangle {
	/*
	 * 杨辉三角:数字表
	 * 基本特征是两侧数值为1;其他位置的数值使其正上方的数字+左上角数值之和;
	 * */
	public static void main(String[] args) {
		//定义两维数组表示杨辉三角的框架
		int triangle[][]=new int[8][];
		//遍历数组的第一层
		for(int i=0;i<triangle.length;i++){
			//初始化第二层数组的大小
			triangle[i]=new int[i+1];
			//遍历第二层数组
			for (int j = 0; j < triangle[i].length-1; j++) {
				//判断数字的位置如果为两侧都赋值1
				if (i==0||j==0||j==triangle[i].length-1) {
					triangle[i][j]=1;
				} else {
					//其他位置数组通过正上方数字和左上角的数字相加公式计算
					triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
					
				}
				//输出数组元素
				System.out.print(triangle[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
