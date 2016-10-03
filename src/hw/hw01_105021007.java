package hw;
import java.util.Scanner;
public class hw01_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
		;
Scanner scn=new Scanner(System.in);
System.out.print("請輸入一整數(不含0)");
long a = scn.nextLong();     
String ss = Long.toString(a);
char[] ch = ss.toCharArray();
int j=ch.length;
System.out.println(a + "是一個"+ j +"位数。");


	}


	}

	
	

	
	



	


