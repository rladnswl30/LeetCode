class Solution {
    public int myAtoi(String s) {
        String a = s.trim();
        char[] charArray = a.toCharArray();
        StringBuilder sb = new StringBuilder();

        boolean minus = false;
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0) {
                if (charArray[i] == '-') {
                    minus = true;
                    continue;
                } else if (charArray[i] == '+') {
                    continue;
                }
            }

            if (charArray[i] > 0) {
                if (String.valueOf(charArray[i]).matches("[0-9]+")) {
                    sb.append(charArray[i]);
                } else {
                    break;
                }
            }
        }
        if (sb.length() == 0) {
            return 0;
        }

        try {
            int res = Integer.parseInt(sb.toString());
            return minus ? res * -1 : res;
        } catch (NumberFormatException e) {
            return minus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}