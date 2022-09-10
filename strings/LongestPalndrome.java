package strings;

public class LongestPalndrome {

	public static void main(String[] args) {

		String str = "ttrrtt";
		str = str.toLowerCase();
		int pos = 1;
		int i = 1;
		int range = 0;
		int pos_org = 0;
		while (pos + i < str.length() ) {
			if(pos-i<0 && pos < str.length()/2) {
				pos++;
				continue;
			}
			if ((str.charAt(i + pos) == str.charAt(pos - i))) {
				range = i;
				pos_org = pos;
				i++;
			} else {
				pos++;
				i = 1;
			}
		}
		
		System.out.println(str.substring(pos_org-range,pos_org + range+1));
		
		pos = 1;
		i = 1;
		
		while (pos + i -1 < str.length() ) {
			if(pos-i<0 && pos < str.length()/2) {
				pos++;
				continue;
			}
			if ((str.charAt(pos + i-1) == str.charAt(pos - i))) {
				range = i;
				pos_org = pos;
				i++;
			} else {
				pos++;
				i = 1;
			}
		}
		System.out.println(str.substring(pos_org-range,pos_org + range-1));

	}

}
