class Solution {
    public boolean isPalindrome(int x) {
          int y=x;
       int rev=0;
       while(x>0){
           rev*=10;
           rev+=x%10;
            x/=10;
       }
        if(y==rev) return true;
        return false;
        
    }
}