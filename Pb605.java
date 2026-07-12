class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        if(n==0) return true;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean l=(i==0)||flowerbed[i-1]==0;
                boolean r=(i==flowerbed.length-1)||flowerbed[i+1]==0;
                if(l&&r){
                    flowerbed[i]=1;
                    c+=1;
                }
                
            }
        }
        if(c>=n){
            return true;
        }
        return false;
    }
}