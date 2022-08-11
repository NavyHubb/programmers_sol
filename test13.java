package prac;
//title - 2016년
import java.time.LocalDate;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 24;
		
		System.out.println(solution(a, b));
	}
	
	public static String solution(int a, int b) {
        //LocaDate - java.time 패키지의 날짜를 나타내는 클래스
		return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
    }

}
