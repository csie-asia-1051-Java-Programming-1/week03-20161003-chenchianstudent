package hw;
import java.util.Scanner;

public class hw02_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���ϥΪ̿�J�h�ӼơA�έp���ơB�t�Ƥιs�U���h�֭ӡC
	Scanner scn=new Scanner(System.in);
	
	while(true){
	System.out.print("�п�J�Ʀr");
	int a=scn.nextInt();
	int x=0;
	int y=0;
	int z=0;
	if(a>=1){x++;}else{if(a==0){y++;}else{if(a<=1){z++;}}}
	System.out.print("����Ʀ�"+x+"�� ");System.out.print("�s��"+y+"�� ");System.out.print("�t���"+z+"��  ");
	System.out.print("   �O�_�n�~��(y/n):");
	char b=scn.next().charAt(0);
	if(b=='n' ||b=='N'){System.out.print("���¨ϥ�");break;}
	
	
	
		
	}
	}

}
