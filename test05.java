package prac;
//title - 문자열을 정수로 바꾸기
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String a = ip.next(); //next()는 scanner에서 문자열을 공백을 기준으로 입력 및 리턴하는 method
				
		System.out.println(solution(a));
		
		ip.close();

	}
	
	public static int solution(String s) {
        
		int answer = Integer.parseInt(s); //문자열을 정수로 변환하는 method
	
        return answer;
    }
}
