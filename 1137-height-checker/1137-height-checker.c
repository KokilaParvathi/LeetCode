int heightChecker(int* heights, int heightsSize) {
    int c=0,expected[100];
     for(int i = 0; i < heightsSize; i++) {
        expected[i] = heights[i];
    }
    for(int i=0;i<heightsSize;i++){
        for(int j=i+1;j<heightsSize;j++){
            if(heights[i]>heights[j]){
                int temp=heights[i];
                heights[i]=heights[j];
                heights[j]=temp;
            }
        }
    }
    for(int i=0;i<heightsSize;i++){
        if(heights[i]!=expected[i])
        c++;
    }
    return c;
}