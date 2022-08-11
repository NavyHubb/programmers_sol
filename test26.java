package prac;
//title - 제일 작은 수 제거하기
public class test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {4,3,2,1};
		
		for (int i = 0; i < test.length - 1; i++)
			System.out.println(solution(test)[i]);
	}
	
	public static int[] solution(int[] arr) {
		if(arr.length <= 1) {
			int[] answer = {-1};
        	return answer;
		}
        	
        int[] answer = new int[arr.length-1];  //최솟값을 제거한 배열의 길로 셋팅
        
        int min = arr[0]; //최솟값 임시지정 아래 for문을 통해 진짜 min값 탐색 및 재지정
        
        for (int i = 0; i < arr.length; i++) {
        	min = Math.min(min, arr[i]);
        }
        
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] == min) {  //배열의 값이 진짜 min값이라면  
        		continue;  //이 줄 아래의 코드를 생략하고 for문의 다음 iteration으로 넘어가. 즉, 배열에 그 값을 넣지마오.
        	}
        	answer[idx++] = arr[i];
        }
        
        return answer;
    }
}
