package prac;
//title - 하샤드 수
public class test28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 12;
		
		System.out.println(solution(t));
	}
	
	public static boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		int num = x;
        
         while (num != 0) {
    	     sum += num % 10;
    	     num /= 10;
         }
       
         if (x % sum == 0) {
    	     answer = true;
         } else {
    	     answer = false;
         }
         
         return answer;
    }

}