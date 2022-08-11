package prac;
//title - x만큼 간격이 있는 n개의 숫자
public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 2;
		int m = 5;
		long[] arr = solution(y, m);
		
		for(int i = 0; i < m; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        		
        for(int i = 1; i < n; i++) {
        	answer[i] = answer[i-1] + x;
        }
        return answer;
    }

}


//long[] answer = new long[n];
//for(int i = 0; i < n; i++) {
//	answer[i] = (long) x * (i + 1);
//}
//return answer;