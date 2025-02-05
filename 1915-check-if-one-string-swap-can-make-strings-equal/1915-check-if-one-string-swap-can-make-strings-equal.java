class Solution {
    public boolean areAlmostEqual(String s1, String s2) {

        char[] str1=s1.toCharArray();
        char[] str2=s2.toCharArray();

        if(str1.length!=str2.length) return false;
        int count=0,itr=0;
        int[] ind = new int[3];

        for(int index=0;index<str1.length;index++){
            if(str1[index] != str2[index]){
            count++;
            ind[itr++]=index;
            if(count>2) return false;
            }
        }

        char temp=str1[ind[0]];
        str1[ind[0]]=str1[ind[1]];
        str1[ind[1]]=temp;
        String s1after = new String(str1);

        return count==1 || !s2.equals(s1after)?false:true;
    }
}