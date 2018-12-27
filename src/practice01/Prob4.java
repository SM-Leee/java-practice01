package practice01;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		System.out.print("문자열을 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = new String();
		for(int i=0;i<a.length();i++) {
			b+=a.charAt(i);
			System.out.println(b);
		}
	}

}
