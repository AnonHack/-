package com.imooc.quik;
/*
 * 
 * ��������2��ַ�
 */
public class Pari{
	//�������ֺ����ֳ�2��
	public int pari(int [] a,int first,int end){
		int i,j;
		i=first;j=end;
		//������
		while(i<j){
			//��һ������
			while (i<j&&a[i]<=a[j]) {
				j--;
			}
			if (i<j) {
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			//�ڶ�������
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
		//������������
		return i;
	}
	//������ʵ��
	static Pari p=new Pari();
	//���õݹ黮��
	public static void quick(int[] r,int first,int end){    
		if(first<end){
			//���û��ֺ���
			int pivot=p.pari(r, first, end); 
			//�ݹ���û���
			quick(r,first,pivot-1);
			quick(r,pivot+1,end);
		}
	}
	//������
	public static void main(String[] args) {
		int r[]={12,25,36,63,21,32,56,11};
		System.out.println("������ļ�¼�����ǣ�");
		for(int i=0;i<8;i++){
			System.out.print(r[i]+"  ");
		}
		//���õ��û��ֺ���
		quick(r,0,7);
		System.out.println("\n"+"����õļ�¼�ǣ�");
		for(int i=0;i<8;i++){
			System.out.print(r[i]+"  ");
		}

	}
}