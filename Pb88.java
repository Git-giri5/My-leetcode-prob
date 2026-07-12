import java.util.Arrays;

public class Pb88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[m+n];
        int j=0;
        for(int i=0;i<m;i++){
            if(nums1[i]!=0)
                arr[j++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            if(nums2[i]!=0)
                arr[j++]=nums2[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<n+m;i++){
                nums1[i]=arr[i];
        }
        
    }
}
/*
Or write like this
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
        nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}
*/ 
