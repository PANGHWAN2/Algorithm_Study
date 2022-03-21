package Level1;
//https://chrisjune-13837.medium.com/%EC%A0%95%EA%B7%9C%EC%8B%9D-%ED%8A%9C%ED%86%A0%EB%A6%AC%EC%96%BC-%EC%98%88%EC%A0%9C%EB%A5%BC-%ED%86%B5%ED%95%9C-cheatsheet-%EB%B2%88%EC%97%AD-61c3099cdca8
public class NewIDRecommendation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String new_id = "...!@BaT#*..y.abcdefghijklm";
//		String new_id = "z-+.^.";
//		String new_id = "=.=";
//		String new_id = "123_.def";
		String new_id = "abcdefghijklmn.p";
		NewIDRecommendation nr = new NewIDRecommendation();
		System.out.println(nr.solution1(new_id));
	}

	public String solution1(String new_id) {
		String newid = new_id.toLowerCase();
		newid = newid.replaceAll("[^a-z0-9-_.]", "");
		newid = newid.replaceAll("[.]{2,}", ".");
		newid = newid.replaceAll("^[.]|[.]$", "");

		if (newid.equals("")) {
			newid += "a";
		}
		if (newid.length() >= 16) {
			newid = newid.substring(0, 15);										//String.substring(start,end)
			newid = newid.replaceAll("^[.]|[.]$", "");
		}
		if (newid.length() <= 2) {
			while (newid.length() < 3) {
				newid += newid.charAt(newid.length() - 1);
			}
		}
		return newid;
	}
	
	 public String solution2(String new_id) {

	        String s = new KAKAOID(new_id)
	                .replaceToLowerCase()
	                .filter()
	                .toSingleDot()
	                .noStartEndDot()
	                .noBlank()
	                .noGreaterThan16()
	                .noLessThan2()
	                .getResult();
	        return s;
	    }

	    private static class KAKAOID {
	        private String s;

	        KAKAOID(String s) {
	            this.s = s;
	        }

	        private KAKAOID replaceToLowerCase() {
	            s = s.toLowerCase();
	            return this;
	        }

	        private KAKAOID filter() {
	            s = s.replaceAll("[^a-z0-9._-]", "");
	            return this;
	        }

	        private KAKAOID toSingleDot() {
	            s = s.replaceAll("[.]{2,}", ".");
	            return this;
	        }

	        private KAKAOID noStartEndDot() {
	            s = s.replaceAll("^[.]|[.]$", "");
	            return this;
	        }

	        private KAKAOID noBlank() {
	            s = s.isEmpty() ? "a" : s;
	            return this;
	        }

	        private KAKAOID noGreaterThan16() {
	            if (s.length() >= 16) {
	                s = s.substring(0, 15);
	            }
	            s = s.replaceAll("[.]$", "");
	            return this;
	        }

	        private KAKAOID noLessThan2() {
	            StringBuilder sBuilder = new StringBuilder(s);
	            while (sBuilder.length() <= 2) {
	                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
	            }
	            s = sBuilder.toString();
	            return this;
	        }

	        private String getResult() {
	            return s;
	        }
	    }
}
