package Level1;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Difference de = new Difference();
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(de.solution3(price, money, count));
	}

	
	public long solution1(int price, int money, int count) {
		long answer = -1;
		long c = 0;
		for (int i = 1; i <= count; i++) {
			c += i * price;
		}
		answer = -1 * (money - c);

		if (answer <= 0) {
			return 0;
		}
		return answer;
	}

	
	public long solution2(long price, long money, long count) {
		return Math.max(price * (count * (count + 1) / 2) - money, 0);
	}

	
	public long solution3(int price, int money, int count) {

		long answer = money;

		for (int cnt = 0; cnt < count; ++cnt) {
			answer -= (price * (cnt + 1));
		}

		
		return (answer > 0 ? 0 : -answer);
	}
}
