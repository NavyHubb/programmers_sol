package prac;
//title - 음양 더하기
public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {4, 7, 12};
		boolean[] arr2 = {true, false, true};
		
		System.out.println(solution(arr1, arr2));
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
        for(int i = 0; i < signs.length; i++) {
        	//삼항연산자 형태 -> (조건식) ? (참일때) : (거짓일때)
            answer += signs[i] ? absolutes[i] : absolutes[i] * -1; 
        }
        return answer;
    }
}
