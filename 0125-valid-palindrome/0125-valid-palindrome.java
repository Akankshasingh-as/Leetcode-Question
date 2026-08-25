class Solution {
    public boolean isPalindrome(String s) {
        char []ar = s.toCharArray();
        int i=0;
        int j= ar.length - 1;
        boolean b = true;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(ar[i])){
                i++;

            }
            while(i<j && !Character.isLetterOrDigit(ar[j])){
                j--;
            }
            if(i>=j){
                break;
            }
            if(Character.toLowerCase(ar[i]) != Character.toLowerCase(ar[j])){
                b = false;
                break;
            }
            i++;
            j--;
        }
        return b;
    }
}