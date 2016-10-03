package hw;
import java.util.Scanner;
public class hw01_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
Scanner scn=new Scanner(System.in);
long v1=scn.nextLong();
long sum = 1;
while(v1>0){sum=sum+v1%10;v1=v1/10;}
	}

}
