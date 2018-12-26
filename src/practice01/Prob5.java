package practice01;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		
		for(int i=1;i<100;i++) {
			if(i%10==3||i%10==6||i%10==9) {
				System.out.print(i+"\t짝");
				if(i/10==3||i/10==6||i/10==9) {
					System.out.print("짝");
				}
				System.out.println();
			}
		}
	}
}
