class Pb3477 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int nf = fruits.length;
        int nb = baskets.length;
        int res = nf;
        for(int i=0;i<nf;i++){
            for(int j=0;j<nb;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=-1;
                    res--;
                    break;
                }
            }
        }
        return res;     
    }
}