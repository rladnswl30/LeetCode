class Solution {
    private Map<String, Boolean> tmp = new HashMap<>();
    
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }

        if (tmp.containsKey(s) && tmp.get(s) == false) {
            return false;
        }

        for (String w : wordDict) {
            if (s.indexOf(w) == 0 && wordBreak(s.substring(w.length()), wordDict)) {
                return true;
            }
        }

        tmp.put(s, false);

        return false;
    }
}