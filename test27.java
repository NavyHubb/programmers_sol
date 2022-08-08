package prac;
//title - 콜라츠 추측
public class test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 6;
		
		System.out.println(solution(t));
	}
	
	public static int solution(int num) {
        int answer = 0;
        
       while(true) {
    	   if (num == 1) break;
    	   
    	   if(num % 2 == 0) {
    		   num /= 2;
    	   } else {
    		   num = (num * 3) + 1;
    	   }
    	   answer++;
    	   
    	   if (answer >= 500) return -1;
       }
       
       return answer;
       
    }

}
