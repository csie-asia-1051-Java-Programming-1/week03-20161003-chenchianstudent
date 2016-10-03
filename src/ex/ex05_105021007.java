package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021007 陳麒安
 */

public class ex05_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long n1=scn.nextLong();
		float n2=n1%2;
		if(n2==1){System.out.print("奇數");}else{System.out.print("偶數");}

	}

}
