package com.imooc.diamond;

public class Diamond {
/*
 * �������
 * �ϰ벿�ֺ��²��ֱַ����
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=20;
		printDiamond(size);
	}
	//�����ӡ���εķ���
	public static void printDiamond(int size){
		//�жϸ�������ֵ�Է����Ϊ���δ�С
		if (size%2==0) {
			size++;
		}
		//����ϰ벿��
		for (int i = 0; i <size/2+1; i++) {
			//��������ⲿ�Ŀհ�
			for (int j = size/2+1; j >i+1; j--) {
				System.out.print(" ");
			}
			//�����������
			for (int j = 0; j <2*i+1; j++) {
				//�ж���������α߲�λ��
				if (j==0||j==2*i) {
					//���*
					System.out.print("*");
			                                                                                                                 	}
				else {
					//��������ڲ��ϰ벿�հ�
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		//����°벿��
		for(int i=size/2+1;i<size;i++){
			//��������ⲿ�Ŀհ�
			for (int j = 0; j < i-size/2; j++) {
				System.out.print(" ");
			}
			//�����������
			for (int j = 0; j < 2*(size-1); j++) {
				//�ж���������α߲�λ��
				if(j==0||j==2*(size-i-1)){
					//���*
					System.out.print("*");
				}else{
					//��������ڲ��°벿�հ�
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}

}
