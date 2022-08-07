package prac;
//title - 문자열 다루기 기본
public class test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a234";
		
		System.out.println(solution(a));
	}
	
	public static boolean solution(String s) {
		boolean answer = true;
		
		if(s.length() != 4 && s.length() != 6) 
			return false;
		
		for(int i = 0; i < s.length(); i++) {
			//ASCII 코드에 따라 char도 숫자에 대입되어 대소구분을 할 수 있다. 
			//0~9의 경우 ASCII 코드 상 알파벳보다 작은 수로 표현된다. 
			if(s.charAt(i) >= 'A')
				return false;
		}
		
		return answer;
    }

}
