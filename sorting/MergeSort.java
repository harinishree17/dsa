package sorting;

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         int left = l;
         int mid = m;
         int index = 0;
         int[] temp = new int[r-l+1];
         while(left<m && mid<r){
             if(arr[left]<=arr[mid]){
                 temp[index++]=arr[left++];
             }
             else{
                 temp[index++]=arr[mid++];
             }
        }
        while(left<m){
            temp[index++] = arr[left++];
        }
        while(mid<r){
            temp[index++] = arr[mid++];
        }
        for(int o = l; o<r; o++){
            arr[o] = temp[o-l];
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid+1,r+1);
        }
    }
}