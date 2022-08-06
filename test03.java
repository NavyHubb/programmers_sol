package prac;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in); 
		String a = ip.next();
				
		System.out.println(solution(a));
		
		ip.close()
		
	}
	
    public static String solution(String s) {
    	
      //입력된 문자열의 길이가 홀수이든 짝수이든 통용가능
    	String answer = s.substring( (s.length() - 1) / 2, s.length()/2 + 1); //length()는 몫(정수)만 return
        return answer;
        
    }


}
