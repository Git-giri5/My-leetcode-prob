//code 1
class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        int m=0;
        for(int i=1;i<=gain.length;i++){
            arr[i]=gain[i-1]+arr[i-1];
            m=Math.max(m,arr[i]);
            
        }
        return m;
    }
}
/*class Solution {
    public int largestAltitude(int[] gain) {
        int altitude=0,m=0;
        for(int g:gain){
            altitude+=g;
            m=Math.max(m,altitude);
            
        }
        return m;
    }
}

 */