class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String res = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder b = new StringBuilder();
            for (int j = 0; j < res.length(); j++) {
                int count = 1;
                while (j + 1 < res.length() && res.charAt(j) == res.charAt(j + 1)) {
                    count++;
                    j++;
                }
                b.append(count).append(res.charAt(j));
            }
            res = b.toString();

        }
        return res;
    }
}