package prac;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
        
    int count = 9;					// 입력받을 숫자의 개수 
        int[] num;	

        num = new int[count];	

        Scanner ip = new Scanner(System.in);
        for (int i = 0 ; i < count ; i++) {
          num[i] = ip.nextInt();		
        }

        System.out.println(solution(num));

        ip.close();

	}
	
	public static int solution(int[] numbers) {
        
        int answer = 45;
        
        for(int number : numbers) {
            answer -= number;
        }
        return answer;
    }
}


