package prac;
//title - 문자열 내 p와 y의 개수
public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "pPoooyY";
		
		System.out.println(solution(a));
		
	}
	
	static boolean solution(String s) {
        int cnt = 0; 
        char ch = ' ';
        
        for(int i = 0; i < s.length(); i++) {
        	//charAt - 문자열에서 한 글자만 골라 char으로 변환
        	ch = s.charAt(i);
        	if(ch == 'p' || ch == 'P') {
        		cnt++;
        	} else if(ch == 'y' || ch == 'Y') {
        		cnt--;
        	}
        }
        
        if(cnt != 0)
        	return false;
        return true;
    }

}
