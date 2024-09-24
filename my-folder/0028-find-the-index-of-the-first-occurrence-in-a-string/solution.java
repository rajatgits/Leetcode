class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) {
            return -1;
        }

        StringBuilder sb = new StringBuilder(haystack);
        return sb.indexOf(needle);
    }
}
