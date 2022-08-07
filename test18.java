package prac;
//title - 서울에서 김서방 찾기
import java.util.Arrays;

public class test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = {"Jane", "Kim"};
		
		System.out.println(solution(test));
	}
	
	public static String solution(String[] seoul) {
		int index = Arrays.asList(seoul).indexOf("Kim");
        
        return "김서방은 " + index + "에 있다";
    }

}
