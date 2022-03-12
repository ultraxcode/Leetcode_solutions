//1281 Subtract the product and sum of digits of an Integer
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n!=0){
         int rem=n%10;
            prod=rem*prod;
            sum=rem+sum;
            
            n=n/10;
        }
        int answer = prod-sum;
        return answer;
        
        
    }
}