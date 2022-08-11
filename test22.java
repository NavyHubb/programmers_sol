package prac;
//title - 자릿수 더하기
public class test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 123;
		
		System.out.println(solution(t));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        while(n != 0) {
        	answer += n % 10; //10으로 나눈 나머지
        	n /= 10;
        }
        return answer;
    }
}
