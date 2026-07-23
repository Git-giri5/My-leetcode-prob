class Solution {
    public int maxVowels(String s, int k) {
        int c=0,m=0;
        for(int i=0;i<k;i++){
            if("aeiou".indexOf(s.charAt(i))!=-1){
                c+=1;
            }
        }
        m=c;
        for(int i=k;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                c+=1;
            }
            if("aeiou".indexOf(s.charAt(i-k))!=-1){
               c--;
            }
            
            m=Math.max(c,m);
        }
        return m;
    }
}