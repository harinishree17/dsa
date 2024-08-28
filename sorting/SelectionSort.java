package sorting;

class SelectionSort
{
	int select(int arr[], int j)
	{
		int min = j;
        for(int i = j+1; i<arr.length; i++){
            if(arr[i]<arr[min]){
                min = i;
            }
        }
        return min;
	}
	
	void selectionSort(int arr[], int n)
	{
		for(int i = 0; i<n; i++){
			int min = select(arr,i);
			
			if(i!=min){
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
}
