package com.company;

public class SortingTechniques {
    public static void conquer(int[] arr, int startIndex, int mid, int endIndex) {
        int merged[] = new int[endIndex - startIndex + 1];

        int index1 = startIndex;
        int index2 = mid + 1;
        int x = 0;
        while (index1 <= mid && index2 <= endIndex) {
            if (arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];
            } else {
                merged[x++] = arr[index2++];
            }
        }
        while (index1 <= mid) {
            merged[x++] = arr[index1++];
        }
        while (index2 <= endIndex) {
            merged[x++] = arr[index2++];
        }
        for (int i = 0, j = startIndex; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;
        divide(arr, startIndex, mid);
        divide(arr, mid + 1, endIndex);
        conquer(arr, startIndex, mid, endIndex);

    }

    public static void mergeSort() {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n - 1);
        System.out.println("output for merge sort");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();

    }
    private static void quickSort(int[] arr,int low,int high) {
        if(low<high){
            int pivotIndex =partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot =arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp =arr[i];
                arr[i] =arr[j];
                arr[j] =temp;
            }
        }
        i++;
        int temp =arr[i];
        arr[i] =pivot;
        arr[high] =temp;
        return i;//pivot index

    }

    public static void main(String[] args) {
        //merge sort
        mergeSort();
        //quickSort
        int[] arr ={6,3,9,5,2,8};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println("output for quick sort");
        for(int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }


}


