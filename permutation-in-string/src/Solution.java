class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i =0;
        int j = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int k = 0; k<s1.length(); k++) {
            map.put(s1.charAt(k), map.getOrDefault(s1.charAt(k), 0) +1);
        }

        while (j < s2.length()) {
            char c = s2.charAt(j);
            System.out.println(c);
            if (map.get(c) == null) {
                while (i < j) {
                    char c2 = s2.charAt(i);
                    map.put(c2, map.get(c2) +1);
                    i++;
                }
                j++;
                i = j;

            }
            else {
                map.put(c, map.get(c) -1);
                while (i < j && map.get(c) < 0) {
                    char c2 = s2.charAt(i);
                    map.put(c2, map.get(c2) +1);
                    i++;
                }
                j++;

            }
            if (j - i == s1.length()) {
                return true;
            }
        }
        if (j - i == s1.length()) {
            return true;
        }
        return false;
    }
}
