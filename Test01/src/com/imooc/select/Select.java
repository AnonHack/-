package com.imooc.select;

public class Select {
/*
 * 
 * ѡ������
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r[]={12,25,36,63,21,32,56,11};
		int i,j,index,temp;
		System.out.println("����ǰ");
		for ( i = 0; i < r.length; i++) {
			System.out.println(r[i]+"\t");
		}
		for ( i = 0; i < r.length-1; i++) {
			//�������Ԫ������
			index=i;
			for ( j = i+1; j < r.length; j++) {
				//�Ƚϴ�С
				if (r[j]<r[index]) {
					index=j;
				}
			}
			//������¼
			if (index!=i) {
				temp=r[i];
				r[i]=r[index];
				r[index]=temp;
			}
		}
		System.out.println("����õ�����:");
		for ( i = 0; i < r.length; i++) {
			System.out.println(r[i]);
			
		}
	}

}
