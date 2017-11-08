package DataStructure.LinkedList;

/**
 * Created by Administrator on 11/8/2017.
 */

//Implementing Binary Search using Recursion

public class BinarySearchRecursive {

    int binarySearch(int arr[], int l, int r, int find) {
        if (r >= l) {
            int mid = (l + (r - 1))/2;
            if (arr[mid] == find)
                return mid;
            if (arr[mid] > find)
                return binarySearch(arr, l, mid-1, find);


            return binarySearch(arr, mid + 1, r, find);
        }

        return -1;

    }

    public static void main(String[] args) {
        BinarySearchRecursive binarySearch = new BinarySearchRecursive();
        int arr[] = {1, 2, 3, 4, 50, 60};
        int len = arr.length;
        int x = 4;
        int result = binarySearch.binarySearch(arr, 0, len - 1, x);
        if (result == -1)
            System.out.println("Number not in array");
        else
            System.out.println("Element found at index" + result);

    }
}
