//BUBBLE SORT ALGO

import java.util.Arrays;

class bubblesort{
    public static void main(String[] args) {
        int arr[] = {4,6,2,8,1};

        for(int i=0; i<arr.length; i++){

            // from 0 to the last index of this array

            for(int j=0; j<arr.length-1; j++){

                //for each iteration of running thru that array, we loop from 0 to last index of the array
                //not till the last one, till the one that is still unsorted. THIS PART DIDNT WORK

                if (arr[j+1]<arr[j]){ //if this element is greater than the next element, we swap their positions
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
