package Level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CantFinish {
	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		CantFinish cf = new CantFinish();
		System.out.println(cf.solution2(participant, completion));
	}

	public String solution1(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i = 0;
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				break;
			}

//			if (participant[i].equals(completion[i])) {
//				continue;
//			} else {
//				return participant[i];
//			}
		}
		return participant[i];
	}

	//Hash Map
	public String solution2(String[] participant, String[] completion) {
		String answer = "";

		Map<String, Integer> hm = new HashMap<>();

		for (String p : participant) {
			hm.put(p, hm.getOrDefault(p, 0) + 1);
		}

		for (String c : completion) {
			hm.put(c, hm.get(c) - 1);
		}

		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
				break;
			}
		}
		return answer;
	}
}