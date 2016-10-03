package hw;
import java.util.Scanner;

public class hw02_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//讓使用者輸入多個數，統計正數、負數及零各有多少個。
	Scanner scn=new Scanner(System.in);
	
	while(true){
	System.out.print("請輸入數字");
	int a=scn.nextInt();
	int x=0;
	int y=0;
	int z=0;
	if(a>=1){x++;}else{if(a==0){y++;}else{if(a<=1){z++;}}}
	System.out.print("正整數有"+x+"個 ");System.out.print("零有"+y+"個 ");System.out.print("負整數"+z+"個  ");
	System.out.print("   是否要繼續(y/n):");
	char b=scn.next().charAt(0);
	if(b=='n' ||b=='N'){System.out.print("謝謝使用");break;}
	
	
	
		
	}
	}

}
