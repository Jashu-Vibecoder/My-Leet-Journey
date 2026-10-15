class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int rm=(arr.length)/20;
        int n=arr.length;
        int j=n-1;
        for(int i=0;i<rm;i++){
            arr[i]=0;
            arr[j]=0;
            j--;
        }
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

        }



    return (sum/(double)(n-(2*rm)));  
    }
}