package prac;
//title - 두 정수 사이의 합
import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //새 객체생성 양식 -> 클래스_이름  객체_이름 = new 클래스_이름();
		int a = sc.nextInt(); //sc라는 객체에 'int형 입력 및 리턴'이라는 의미
		int b = sc.nextInt();

		System.out.println(solution(a, b));
		
		sc.close();
	}

	public static long solution(int a, int b) {
		
		long answer = 0;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		for(int i = min; i <= max; i++) {
			answer += i;
		}
		return answer;
		
	}
}