package prac;
//title - 부족한 금액 계산하기
public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pr = 3;
		int mn = 20;
		int cnt = 4;
		
		System.out.println(solution(pr, mn, cnt));
	}
	
	public static long solution(int price, int money, int count) {
		long answer = 0;
		long total = 0;
        //for문 대신 등차수열 공식을 이용하는 방법도 있지만, 그러면 문제에서의 price와 count의 최댓값인 2500을 각각 대입했을 떄 int의 저장범위를 넘어 long형으로 선언해주어야 하는 부분이 필요하다
        for(int i = 1; i <= count; i++){  
            total += price * i;
        }
        answer = total - money;
        if(answer <= 0) return 0;

        return answer;
        
    }
       
        
}
