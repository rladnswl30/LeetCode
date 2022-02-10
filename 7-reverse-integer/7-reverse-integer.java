class Solution {
    public int reverse(int x) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = String.valueOf(x).toCharArray();
        boolean minus = false;
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0 && charArray[i] == '-') {
                minus = true;
            } else {
                stack.push(charArray[i]);
            }
        }

        char[] resCharArray = new char[stack.size()];
        for (int i = 0; i < resCharArray.length; i++) {
            resCharArray[i] = stack.pop();
        }

        try {
            int res = Integer.parseInt(String.valueOf(resCharArray));
            return minus ? res * -1 : res;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}