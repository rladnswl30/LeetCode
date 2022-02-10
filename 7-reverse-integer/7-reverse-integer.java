class Solution {
    public int reverse(int x) {
        char[] ca = String.valueOf(x).toCharArray();
        Stack<Character> stack = new Stack<>();

        boolean minus = false;
        for (Character one : ca) {
            if (one == '-') {
                minus = true;
            } else {
                stack.push(one);
            }
        }

        char[] resCharArray = new char[stack.size()];
        for (int i = 0; i < resCharArray.length; i++) {
            resCharArray[i] = stack.pop();
        }

        try {
            String resString = String.valueOf(resCharArray);
            int resInt = Integer.parseInt(resString);
            if (minus) {
                return resInt * -1;
            }
            return resInt;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}