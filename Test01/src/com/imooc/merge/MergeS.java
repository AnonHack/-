package com.imooc.merge;


public class MergeS {
	//����鲢����
	//��Ҫ�鲢�������ֳ���������,����������鲢Ϊһ��������
	private static void merge(int r[],int a[],int s,int m,int t){
		//��������
		int i=s,j=m+1,k=s;
		//
		while(i<=m&&j<=t){
			if(r[i]<=r[j]){
				a[k++]=r[i++];       //ȡr[i]��r[j]�н�С�߷���[k]
			}
			else{
				a[k++]=r[j++];
			}
		}
		 //����һ�������д����꣬�������β����
		if(i<=m){
			while(i<=m){             
				a[k++]=r[i++];
			}
		}
		else{
			while(j<=t){              //���ڶ��������д����꣬�������β����
				a[k++]=r[j++];
			}
		}
	}
	
	//����鲢�м䷽��
	private static void mergePass(int r[],int r1[],int n,int h){
		int i=0;
		//���鲢��¼��������������Ϊh��������
		while(i<=n-2*h){  
			//���ù鲢�����鲢
			merge(r,r1,i,i+h-1,i+2*h-1);
			i+=2*h;
		}
		//���鲢��������һ������С��h
		if(i<n-h){
			merge(r,r1,i,i+h-1,n);    
		}
		else{
			//���鲢������ֻʣһ��������
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
		System.out.println("ԭʼ�����ǣ�");
		for(int i=0;i<r.length;i++){
			System.out.print("  "+r[i]);
		}
		mergeS(r,r1,r.length);
		//mergePass(r,r1,r.length-1,1);
		System.out.println("\n"+"�������ǣ�");
		for(int i=0;i<r.length;i++){
			System.out.print("  "+r[i]);
		}
	}

}