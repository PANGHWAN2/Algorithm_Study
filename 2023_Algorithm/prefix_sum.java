//Python
// array = [1, 8, 7, 4, 3, 5, 6]
// n = len(array)
// prefix_sum = [0] * n

// for i in range(n):
//     for j in range(i+1):
//         prefix_sum[i] += array[j]

//Java 시간복잡도 O(N^2) 
public class Main {

	public static void main(String[] args){
		int[] array = {1, 8, 7, 4, 3, 5, 6};
		int n = array.length;
		int[] prefix_sum = new int[n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				prefix_sum[i] += array[j];
			}
		}
		
	}
			
}

//누적합 적용 후 시간복잡도 O(N)
//Python
// array = [1, 8, 7, 4, 3, 5, 6]
// n = len(array)
// prefix_sum = [0] * (n + 1)

// for i in range(n):
//     prefix_sum[i + 1] = prefix_sum[i] + array[i]

//Java
public class Main {

	public static void main(String[] args){
		int[] array = {1, 8, 7, 4, 3, 5, 6};
		int n = array.length;
		int[] prefix_sum = new int[n + 1];
		
		for(int i = 0; i < n; i++) {
			prefix_sum[i + 1] = prefix_sum[i] + array[i];
		}
		
	}
			
}

//구간합
//Python
// array = [1, 8, 7, 4, 3, 5, 6]
// n = len(array)
// prefix_sum = [0] * (n + 1)
// x, y = 1, 5

// for i in range(n):
//     prefix_sum[i + 1] = prefix_sum[i] + array[i]
        
// part_sum = prefix_sum[y] - prefix_sum[x - 1]

//Java
public class Main {

	public static void main(String[] args){
		int[] array = {1, 8, 7, 4, 3, 5, 6};
		int n = array.length;
		int[] prefix_sum = new int[n + 1];
		int x = 1;
		int y = 5;
		
		for(int i = 0; i < n; i++) {
			prefix_sum[i + 1] = prefix_sum[i] + array[i];
		}
		
		int part_sum = prefix_sum[y] - prefix_sum[x - 1];
	}
			
}