class Solution {
    public int maxArea(int[] h) {
        int s=0,l=h.length-1;
        int m=0;
        while(s<l){
            m=Math.max(m,Math.min(h[s],h[l])*(l-s));
            if(h[s]<h[l]){
                s++;
            }else{
                l--;
            }
        }
        return m;
    }
}