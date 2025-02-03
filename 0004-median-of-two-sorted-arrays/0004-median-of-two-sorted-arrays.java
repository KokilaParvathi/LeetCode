class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length,n2 = arr2.length,i = 0, j = 0, k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        double median=0;

        while (i < n1) {
            arr3[k++] = arr1[i++];
        }
        while (j < n2) {
            arr3[k++] = arr2[j++];
        }
        Arrays.sort(arr3);

        if(arr3.length%2==0)
            median =(double)(arr3[arr3.length/2]+arr3[(arr3.length/2)-1])/2;
        else
         median = arr3[arr3.length/2];
         
    return median;
    }
}