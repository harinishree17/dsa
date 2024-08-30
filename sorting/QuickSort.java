package sorting;

class Solution
{
    static void quickSort(int arr[], int low, int high)
    {
        if(low<high){
            int i = partition(arr,low,high);
            quickSort(arr,low,i-1);
            quickSort(arr,i+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int i = low;
        int j = high-1;
        while(i<j){
            while(arr[i]<=arr[high] && i<high){
                i++;
            }
            while(arr[j]>=arr[high] && j>low){
                j--;
            }
            if(i<j){
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
        if(arr[i]>arr[high]){
            arr[i] = arr[i] + arr[high];
            arr[high] = arr[i] - arr[high];
            arr[i] = arr[i] - arr[high];
        }
        return i;
    } 
}