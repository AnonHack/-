package com.imooc.triangle;

public class Triangle {
	/*
	 * �������:���ֱ�
	 * ����������������ֵΪ1;����λ�õ���ֵʹ�����Ϸ�������+���Ͻ���ֵ֮��;
	 * */
	public static void main(String[] args) {
		//������ά�����ʾ������ǵĿ��
		int triangle[][]=new int[8][];
		//��������ĵ�һ��
		for(int i=0;i<triangle.length;i++){
			//��ʼ���ڶ�������Ĵ�С
			triangle[i]=new int[i+1];
			//�����ڶ�������
			for (int j = 0; j < triangle[i].length-1; j++) {
				//�ж����ֵ�λ�����Ϊ���඼��ֵ1
				if (i==0||j==0||j==triangle[i].length-1) {
					triangle[i][j]=1;
				} else {
					//����λ������ͨ�����Ϸ����ֺ����Ͻǵ�������ӹ�ʽ����
					triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
					
				}
				//�������Ԫ��
				System.out.print(triangle[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
