package hw;
import java.util.Scanner;
public class hw03_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
Scanner scn= new Scanner(System.in);
int n=scn.nextInt();
int sum=1;
for(int i=1;i<=n;i++){sum*=i;}
System.out.print(sum);

	}

}
