package prac;
//title - 정수 제곱근 판별
public class test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t = 121;
		
		System.out.println(solution(t));
	}
	
	public static long solution(long n) {
		long answer = -1;
		double root = Math.sqrt(n);
		
		if(root % 1 == 0) 
			answer = (long)Math.pow(root + 1, 2);
		
		return answer;
    }

}