int commonFactors(int a, int b) {
   int common=0;
   int min=(a>b)?b:a;
   for(int i=1;i<=min;i++){
    if(a%i==0 && b%i==0){
        common++;
    }
   }
   return common;
}