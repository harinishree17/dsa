package sorting;
class Solution
{
	public static void bubbleSort(int arr[], int n)
    {
        boolean flag = false;
        for(int i = 1; i<n; i++){
            if(arr[i]<arr[i-1]){
                arr[i] = arr[i] + arr[i-1];
                arr[i-1] = arr[i] - arr[i-1];
                arr[i] = arr[i] - arr[i-1];
                flag = true;
            }
        }
        if(flag){
            bubbleSort(arr,n);
        }
    }
}