class Solution {
    public boolean isPalindrome(String s) {

        if(s == null || s.isEmpty()) {
            return true;
        }
        
        String ra = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        for(int i=0; i<ra.length()/2; i++){
            int st = i;
            int ed = ra.length() - 1 - i;

            if(ra.charAt(st) != ra.charAt(ed)){
                return false;
            }
        }
        return true;
    }
}
