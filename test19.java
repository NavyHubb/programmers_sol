package prac;
//title - 수박수박수박수박수박수?
public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 3;
		
		System.out.println(solution(test));
	}
	
	public static String solution(int n) {
    //String이 아닌 StringBuilder를 쓰는 이유
    //String은 immutable한 객체이기에 String끼리의 연산을 하면 기존 객체는 그대로 존재하면서 새로운 객체가 생성된다. 때문에 메모리 관리 측면에서 비효율적이다
	  //StringBuilder는 위와 같은 String의 특성을 보완하여 연산 시 새로운 객체를 생성하는 것이 아니라 기존의 데이터를 변형시기 때문에 속도도 빠르고 상대적으로 부하도 적다.
		StringBuilder answer = new StringBuilder();
		for(int i = 1; i <= n; i++)
			answer.append(i % 2 != 0 ? "수" : "박");
		
		return answer.toString();
    }
}
