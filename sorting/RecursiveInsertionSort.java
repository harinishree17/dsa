package sorting;

class Solution
{
  static void insert(int arr[],int i)
  {
       while(i>0 && arr[i]<arr[i-1]){
           arr[i] = arr[i] + arr[i-1];
           arr[i-1] = arr[i] - arr[i-1];
           arr[i] = arr[i] - arr[i-1];
           i--;
       }
  }
  public void insertionSort(int arr[], int n)
  {
      if(n>1){
            insertionSort(arr,n-1);
            insert(arr,n-1);
      }
  }
}
