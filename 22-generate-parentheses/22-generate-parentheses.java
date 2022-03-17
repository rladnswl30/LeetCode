class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(n, 0, 0, "", res);
        return res;
    }

    public static void dfs(int n, int open, int close, String s, List<String> res) {
//        System.out.println(s);

        if (s.length() == n * 2) {
            res.add(s);
            return;
        }

        if (open < n) {
            dfs(n, open + 1, close, s + "(", res);
        }
        if (close < open) {
            dfs(n, open, close + 1, s + ")", res);
        }
    }
}