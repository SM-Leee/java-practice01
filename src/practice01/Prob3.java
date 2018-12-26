package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = a-2; i > 0; i-=2) {
			a += i;               
		}

		System.out.println("결과값 : "+a);
	}
}
