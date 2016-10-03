package hw;
import java.util.Scanner;

public class hw05_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
		Scanner scn=new Scanner(System.in);
System.out.print("請數入一正整數");
int n=scn.nextInt();
int n1=n*(n+1);
int i=n1;
int sum=0;
while(i<=n){sum+=i;i+=n1;}
System.out.print(sum);



		}
		
	}


