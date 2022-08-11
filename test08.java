package prac;
//title - 평균 구하기
public class test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3, 4};
		System.out.println(solution(arr1));

	}
	
	public static double solution(int[] arr) {
		double answer = 0;
        
		for(int i : arr) {
			answer += i;
		}
        return answer / arr.length;
    }
	
}
