package prac;
//title - 이상한 문자 만들기
public class test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "try hello world  ";

		System.out.println(solution(test));
	}

	public static String solution(String s) {
		String answer = "";					 
		s = s.toLowerCase();				
		//주어진 문자열을 공백을 기준으로 분할한다. 
		//이때 두번째 인자는 문자열을 몇개로 분할할지를 나타내는데, '-1'의 경우 문자열의 마지막에 공백이 포함되어 있을 경우 이 공백도 함께 저장해주는 역할을 한다.
		String[] words = s.split(" ", -1);	
		
		for (String word : words) {			
			for (int i = 0; i < word.length(); i++) {	
				if(i%2 != 0)
					answer += (word.charAt(i));		
				else									
					answer += (""+word.charAt(i)).toUpperCase();	
			}
			answer += " ";
		}
				
		;
		return answer.substring(0, answer.length() - 1); //반복문의 마지막에서 불필요하게 공백을 추가해준 것을 제거
	}

}