package hw;
import java.util.Scanner;
public class hw01_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��J�@�ӥ���ƭ�(���t 0)�A�Ǧ^�ӼƭȬO�X���(# ofdigits)�C
Scanner scn=new Scanner(System.in);
long v1=scn.nextLong();
long sum = 1;
while(v1>0){sum=sum+v1%10;v1=v1/10;}
	}

}
