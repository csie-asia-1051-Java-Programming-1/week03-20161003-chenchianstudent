package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021007 陳麒安
 */

public class ex06_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入x");
int x=scn.nextInt();
double x1= Math.pow(x,2);
double y1=3*x1;
double x2=Math.pow(x, 3);
double y2=x2+3*x-3;
double y3=2*x+3;
if(x<-1){System.out.print(y1);}else{
if(x<=1 && x>=-1){System.out.print(y2);}
else{if(x>1){System.out.print(y3);}}
}
}
	}


