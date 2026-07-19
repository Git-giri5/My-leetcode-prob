class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        if(s.length()==0) return true;
        for(int i=0;i<t.length();i++){
            if(j<s.length()&&s.charAt(j)==t.charAt(i)){
                j+=1;
                if(j==s.length()) return true;
            }
        }
        return false;
    }
}