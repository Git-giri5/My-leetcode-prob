class Solution {
    public String reverseWords(String s) {
        String[] arr=new String(s).split(" ");
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i<j){
                String temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return String.join(" ", arr).trim().replaceAll("\\s+"," ");
    }
}