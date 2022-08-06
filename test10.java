package prac;
//title - 행렬의 덧셈
public class test10 {
	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		arr1 = solution(arr1, arr2);
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");  //공백을 포함시킨 것은 같은 차원 내에서 요소들끼리 붙여져 출력되는 것을 막기 위함일 
			}
			System.out.println();
		}
		

	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = arr1;							

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];	
			}
		}

		return answer;
	}

}
