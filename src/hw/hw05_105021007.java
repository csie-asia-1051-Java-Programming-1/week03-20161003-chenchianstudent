package hw;
import java.util.Scanner;

public class hw05_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���ϥΪ̿�J�@�����n�A�p��1*(1+1) + 2*(2+1) + 3*(3+1) + �K + n*(n+1)�ÿ�X���G�C
		Scanner scn=new Scanner(System.in);
System.out.print("�мƤJ�@�����");
int n=scn.nextInt();
int n1=n*(n+1);
int i=n1;
int sum=0;
while(i<=n){sum+=i;i+=n1;}
System.out.print(sum);



		}
		
	}


