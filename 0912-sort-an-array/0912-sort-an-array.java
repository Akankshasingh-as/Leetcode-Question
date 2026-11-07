class Solution {
    public int[] sortArray(int[] nums) {
         mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    void merge(int[] arr, int l, int mid, int r) {
        int left[] = new int[mid - l + 1];
        int right[] = new int[r - mid];

        for (int i = 0; i < left.length; i++)
            left[i] = arr[l + i];

        for (int j = 0; j < right.length; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < left.length)
            arr[k++] = left[i++];
         while(j<right.length)
            arr[k++]= right[j++];
}   }        
        
       
