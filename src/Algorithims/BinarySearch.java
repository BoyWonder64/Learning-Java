package Algorithims;

public class BinarySearch {

    public static void main(String[] args) {
        //If we want to return the position of a target but in O(Log N)
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 3;

        int result =  binarySearch(arr, target);
        System.out.println("The index of the target is: " + result );
    }


    public static int binarySearch(int arr[], int target){
        int low = 0; //point to bottom of array
        int high = arr.length -1; //point to last item in array

        while(low <= high){
        /*
        As we divide each side, we move closer to the target
        */
            int middle = low + (high - low) / 2;

            if(target == arr[middle]){
                return arr[middle]; //
            }
            if(target > arr[middle]){
                low = middle + 1;
            }
            if(target < arr[middle]){
                high = middle - 1;
            }
        }

        return -1;
    }


}
