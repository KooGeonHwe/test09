package day03_operator;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		int num1, num2;
		System.out.print("�� �Է� :");
		num1 = q.nextInt();
		String s = (num1%2 ==0)?"= ¦��":"= Ȧ��";
		System.out.println(num1+"="+s);
		s = (num1%3 ==0)?"= 3�� ���":"= 3�� ����� �ƴϴ�";
		System.out.println(num1+"="+s);
		
		System.out.print("�� �� �Է� :");
		num1 = q.nextInt();
		num2 = q.nextInt();
		s = (num1>num2)?"num1�� num2���� ũ��":
						"num2�� num1���� ũ��";
		System.out.println("num1 : "+num1+", num2 : "+num2);
		System.out.println(s);
	}
}
