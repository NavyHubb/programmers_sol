package prac;
//title - 핸드폰 번호 가리기
public class test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "01012345678";
		System.out.println(solution(test));

	}
	
	public static String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();  //toCharArray() - 문자열을 그 문자열이 포함하고 있는 각각의 문자(char)들로 이루어진 array로 변환
        for(int i = 0; i < ch.length - 4; i++) {
        	ch[i] = '*';  //큰따옴표가 아닌 '작은 따옴표'임에 주의. 큰따옴표는 String, 작은따옴표는 char에 사용
        }
        String answer = new String(ch);
        return answer;
    }

}
