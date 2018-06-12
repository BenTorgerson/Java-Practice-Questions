// https://leetcode.com/problems/jewels-and-stones/


class Solution {
	public static int numJewelsInStones(String J, String S) {
		int count = 0;
		int pos = 0;
		int sLength = S.length();
		int jLength = J.length();
		for (int x = 0; x < jLength ; x++) {
			char a_char = J.charAt(pos);
			for (int i = 0; i < sLength; i++) {
				if (a_char == S.charAt(i)) {
					count++;
				}
			}
			pos++;
		}
		return count;
	}
}
