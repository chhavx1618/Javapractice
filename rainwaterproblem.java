// trapping rainwater problem

import java.util.Arrays;

class rainwater{
    public static void main(String args[]){

        int arr[] = {3,1,2,4,0,1,3,2};

        int n = arr.length;

        // define two auxillary arrays left and right of the same length

        int left[] = new int[n];
        int right[] = new int[n];

        // the left array will show the greatest number to the left of the current index, if the greatest number is itself, then it will show the number at the same inedx or at itself. same for right, but on the right.


        for (int i=1; i<n; i++){
            left[0] = arr[0];
            left[i] = Math.max(left[i-1], arr[i]); 
        }

        for (int i=n-2; i>=0; i--){
            right[n-1] = arr[n-1];
            right[i] = Math.max(right[i+1], arr[i]);
        }
        
        // the answer, or the total rainwater trapped, will be the sum of all the spaces in betweeen.

        int answer=0;

        // easy to figure out formula

        for(int i=0; i<n; i++){
        answer+=Math.min(left[i], right[i]) - arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(answer);
        
    }
}

// the end
