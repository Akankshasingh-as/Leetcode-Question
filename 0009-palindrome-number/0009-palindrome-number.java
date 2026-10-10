import java.util.*;
public class Solution {
    public boolean isPalindrome(int x) {
        Scanner sc = new Scanner(System.in);
        int y = x;
        int temp = y;
        int rev = 0;
        while(y>0){
           int rem = y%10;
             rev = rev *10+rem;
            y = y /10;
        }
        if (temp == rev){
            return true;
        }else{
            return false;
        }
        
    }
}