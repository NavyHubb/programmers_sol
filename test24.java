package prac;
//title - 정수 내림차순으로 배치하기
import java.util.*;

public class test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t = 118372;
		
		System.out.println(solution(t));
	}
	
	public static long solution(long n) {
		String[] nArr = String.valueOf(n).split("");  //문자열을 한 글자 단위로 분할하여 배열에 저장
		Arrays.sort(nArr, Collections.reverseOrder());  //내림차순으로 정렬
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < nArr.length; i++) sb.append(nArr[i]);
		
		return Long.parseLong(sb.toString());
    }
}
