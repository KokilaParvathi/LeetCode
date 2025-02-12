class Solution {
    public boolean canAliceWin(int[] nums) {
     int Alicesum = 0,Bobsum = 0;

     for(int num:nums){
        if(num<=9) Alicesum+=num;
        else Bobsum+=num;
     }

     return Alicesum!= Bobsum;    
    }
}