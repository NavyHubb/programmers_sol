package prac;
//title - 자연수 뒤집어 배열로 만들기
public class test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t = 12345;
		
		for(int i = 0; i < solution(t).length; i++) {
			System.out.println(solution(t)[i]);
		}
		
	}
	
	public static long[] solution(long n) {
		int len = (int)Math.log10(n)+1;  //자릿수 구하기
		long[] answer = new long[len];
		
		for(int i = 0; i < len; i++) {
			answer[i] = n % 10;
			n /= 10;
		}
		return answer;
    }

}
