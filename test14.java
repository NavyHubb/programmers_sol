package prac;
//title - 나누어 떨어지는 숫자 배열
import java.util.Arrays;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 9, 7, 10};
		int[] arr1 = solution(arr, 5);
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}
	
	public static int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) cnt++;
        }
        
        if(cnt == 0) {
        	int[] answer = {-1};
        	return answer;
        } 
        
        int[] answer = new int[cnt];
        
       for(int i = 0, j = 0; i < arr.length; i++) {
    	   if(arr[i] % divisor == 0) answer[j++] = arr[i];
       }
       
       Arrays.sort(answer);
       return answer;
	}
        
}
