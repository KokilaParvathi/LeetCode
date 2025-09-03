class Solution {
    public boolean isMatch(String s, String p) {
        int i=0,j=0; //pointers for s and p
        int iidx=0,staridx=-1; // last pos of * in s and corresponding i in s
        while(i<s.length()){
            if(j<p.length() && (p.charAt(j)=='?' || p.charAt(j)==s.charAt(i))){
                i++;
                j++;
            }
            else if(j<p.length() && p.charAt(j)=='*'){
                staridx=j;     //record pos of *
                iidx=i;       //record i at this point
                j++;          //move p ahead to try matching next
            }
            else if(staridx!=-1){
                j=staridx+1;     //backtrack: try consume one more char with *
                iidx++;
                i=iidx;
            }
            else{
                return false;
            }
        } 
        while(j<p.length() && p.charAt(j)=='*') {
            j++;
        }

        return j==p.length();
    }
}