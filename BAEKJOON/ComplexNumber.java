package BAEKJOON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComplexNumber {
	static int node[][]; // 아파트 단지 배열
	static int check[][]; // 각 아파트 단지 방문여부 배열
	static int cnt = 1;

	static ArrayList<Integer> array = new ArrayList<>(); // 각 단지의 수를 저장 할 어레이 리스트

	static void dfs(int x, int y) { // DFS 메소드 , 아파트 단지 배열에서 각 점을 인자로 전달

		check[x][y] = 1; // 전달 된 인자는 방문했으므로 1저장
							// cnt변수는 1로 초기화했기 때문에 별도의 증가는 필요없다.

		// 기준열의 오른쪽열을 확인해야 하므로 범위에서-1, 오른쪽열이 1이면서 방문하지 않은 곳이면
		if (y < node.length - 1 && node[x][y + 1] == 1 && check[x][y + 1] != 1) {

			cnt++; // cnt변수 증가
			dfs(x, y + 1); // 이후 오른쪽열로 이동

		}

		// 기준행의 아랫쪽행을 확인해야 하므로 범위에서-1, 아랫쪽행이 1이면서 방문하지 않은 곳이면
		if (x < node.length - 1 && node[x + 1][y] == 1 && check[x + 1][y] != 1) {

			cnt++; // cnt변수 증가
			dfs(x + 1, y); // 이후 아랫쪽으로 이동
		}

		// 기준열의 왼쪽열을 확인해야 하므로 0보다 커야하며, 왼쪽열이 1이면서 방문하지 않았다면
		if (y > 0 && node[x][y - 1] == 1 && check[x][y - 1] == 0) {

			cnt++; // cnt변수 증가
			dfs(x, y - 1); // 이후 왼쪽으로 이동

		}

		// 기준행의 윗쪽행을 확인해야 하므로 0보다 커야하며, 윗쪽행이 1이면서 방문하지 않았다면
		if (x > 0 && node[x - 1][y] == 1 && check[x - 1][y] == 0) {

			cnt++; // cnt변수 증가
			dfs(x - 1, y); // 윗쪽행으로 이동

		}

		// 기준행을 기준으로 방문하지 않은 곳이면서 1의 값을 가지는 곳을 상,하,좌,우로 살펴보는 과정이다.

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 지도의 크기 n
		node = new int[n][n]; // 지도 배열
		check = new int[n][n]; // 지도 방문배열
		for (int i = 0; i < node.length; i++) {
			String row = sc.next();
			for (int j = 0; j < node[i].length; j++) {
				node[i][j] = row.charAt(j) - '0';
			}
		}

		for (int i = 0; i < node.length; i++) {
			for (int j = 0; j < node[i].length; j++) {
				if (node[i][j] == 1 && check[i][j] == 0) { // 1의값이면서 방문하지 않은 곳의 정보만 전달
					cnt = 1; // cnt변수 초기화

					dfs(i, j);// 지도의 (0,0)부터 전달
					array.add(cnt); // 단지의 수를 어레이 리스트에 저장

				}
			}
		}

		System.out.println(array.size()); // 단지의 개수
		Collections.sort(array); // 각 단지의 아파트 수 정렬
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

	}
}

//DFS
public class ApartNumberingDfs {
    private static int dx[] = {0,0,1,-1};
    private static int dy[] = {1,-1,0,0};
    private static int[] aparts = new int[25*25];
    private static int n;
    private static int apartNum = 0; //아파트 단지 번호의 수
    private static boolean[][] visited = new boolean[25][25]; //방문여부
    private static int[][] map = new int[25][25]; //지도

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        map = new int[n][n];
        visited = new boolean[n][n];

        //전체 사각형 입력 받기
        for(int i=0; i<n; i++){
            String input = sc.next();
            for(int j=0; j<n; j++){
                map[i][j] = input.charAt(j)-'0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    apartNum++;
                    dfs(i,j);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(apartNum);

        for(int i=0; i<aparts.length; i++){
            if(aparts[i] == 0){
            }else{               
                System.out.println(aparts[i]);
            }
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        aparts[apartNum]++;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < n && ny < n){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }
}
//
////BFS
//public class ApartNumberingBfs {
//    private static int dx[] = {0,0,1,-1};
//    private static int dy[] = {1,-1,0,0};
//    private static int[] aparts = new int[25*25];
//    private static int n;
//    private static int apartNum = 0; //아파트 단지 번호의 수
//    private static boolean[][] visited = new boolean[25][25]; //방문여부
//    private static int[][] map = new int[25][25]; //지도
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//
//        map = new int[n][n];
//        visited = new boolean[n][n];
//
//        //전체 사각형 입력 받기
//        for(int i=0; i<n; i++){
//            String input = sc.next();
//            for(int j=0; j<n; j++){
//                map[i][j] = input.charAt(j)-'0';
//             }
//        }
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if(map[i][j] == 1 && !visited[i][j]){
//                    apartNum++;
//                    bfs(i,j);
//                }
//            }
//        }
//
//        Arrays.sort(aparts);
//        System.out.println(apartNum);
//
//        for(int i=0; i<aparts.length; i++){
//            if(aparts[i] == 0){
//            }else{
//                System.out.println(aparts[i]);
//            }
//        }
//
//}
//
//    private static void bfs(int x, int y) {
//        //2차원 LinkedList를 가진 큐 선언
//        Queue<int[]> que = new LinkedList<>();
//        que.add(new int[]{x,y});
//        visited[x][y] = true;
//        aparts[apartNum]++;
//
//        while(!que.isEmpty()){
//
//            //x, y 값을 받아오기 위한 방법
//            int curX = que.peek()[0];
//            int curY = que.peek()[1];
//            que.poll();
//
//            for(int i=0; i<4; i++){
//                int nx = curX + dx[i];
//                int ny = curY + dy[i];
//
//                if(nx >= 0 && ny >= 0 && nx < n && ny < n){
//                    if(map[nx][ny] == 1 && !visited[nx][ny]){
//                        que.add(new int[]{nx,ny});
//                        visited[nx][ny] = true;
//                        aparts[apartNum]++;
//                    }
//                }
//            }
//     