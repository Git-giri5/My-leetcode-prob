class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<j&&"aeiouAEIOU".indexOf(s.charAt(i))==-1){
                i++;
            }
            while(i<j&&"aeiouAEIOU".indexOf(s.charAt(j))==-1){
                j--;
            }
            char temp=s.charAt(i);
            sb.setCharAt(i,s.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}