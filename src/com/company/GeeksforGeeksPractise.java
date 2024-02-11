package com.company;
import java.util.*;

public class GeeksforGeeksPractise {
    static boolean checkTriplet(int[] arr, int n) {
        HashMap<Integer, Integer> umap = new HashMap<>();

// Populate the HashMap
        for (int i = 0; i < n; i++) {
            if (umap.containsKey(arr[i])) {
                umap.put(arr[i], umap.get(arr[i]) + 1);
            } else {
                umap.put(arr[i], 1);
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int p = (int) Math.sqrt(arr[i] * arr[i] + arr[j] * arr[j]);
                float q = (float) Math.sqrt(arr[i] * arr[i] + arr[j] * arr[j]);

                System.out.println("p: " + p + ", q: " + q);

                if (p == q && umap.containsKey(p) && umap.get(p) != 0) {
                    return true;
                }
            }
        }

// If we reach here, no triplet found
        return false;
    }
    public static void main(String[] args) {
        String s ="22 23 14 7 14 17 11 13 7 5 14 22 17 27 1 10 12 28 6 17 23 9 24";
        String[] splitted =s.split(" ");
        int[] arr =new int[splitted.length];
        for(int i=0;i<arr.length;i++){
            arr[i] =Integer.parseInt(splitted[i]);
        }
       // int arr[] = {22,23,14,7,14,17,11,13,7,5,14,22,17,27 1 10 12 28 6 17 23 9 24};
        boolean ans =checkTriplet(arr,23);
        System.out.println(ans);
    }
}
