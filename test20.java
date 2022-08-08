package prac;
//title - 완주하지 못한 선수
import java.util.Arrays;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] par = {"leo", "kiki", "eden"};
		String[] com = {"eden", "kiki"};
		
		System.out.println(solution(par, com));
	}
	
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i = 0;
		
		for(i = 0; i < completion.length; i++) {
			//'=='와 equals()의 차이
			//두 객체 a와 b가 있을 때, 같은 값을 가지고 있다고 하더라도 둘은 각자의 저장소를 갖고 있기 때문에(인스턴스의 주소가 다르기 때문에) 비교연산자 '=='로 비교하면 false이다.
			//그러나 equals()는 그저 두 객체의 내용이 같으면 '같다'고 판단한다.
			if(!participant[i].equals(completion[i])) {
				break;
			}
		}
		return participant[i];
	}

}
