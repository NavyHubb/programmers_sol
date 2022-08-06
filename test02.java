package prac;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int a = ip.nextInt();

		System.out.println(solution(a));
		
		ip.close();
	}

	public static String solution(int num) {
		String answer = "Odd";		
		if(num%2 == 0)
			answer = "Even";
		return answer;
	}

}
