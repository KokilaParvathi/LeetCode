class Solution {
    public boolean checkPerfectNumber(int num) {
     int divisorsum=0;
     for(int itr=1;itr<=num/2;itr++){
        divisorsum += (num%itr==0)?itr:0;
     }
     return num==divisorsum?true:false;  
    }
}