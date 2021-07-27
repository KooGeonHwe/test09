package day03_operator;

import java.util.Scanner;

public class Ex09_if {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num >10 )
			System.out.println("종속 문장 실행");
	}
}
