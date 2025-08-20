import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
     BigInteger n = new BigInteger(num1); 
     BigInteger n1 = new BigInteger(num2);  
     BigInteger sum = n.add(n1); 
     return sum.toString(); 
    }
}