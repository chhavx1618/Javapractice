import java.util.*;

class union{
    public static void main(String[] args) {
        
        int arr[]={4,7,3,8,5,2,8,3};
        int arr2[]={5,4,78,9,5,6};

        HashSet <Integer> hash = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            if (hash.contains(arr[i])){
                continue;
            } else {
                hash.add(arr[i]);
            }
        }

        for(int i=0; i<arr2.length; i++){
            if (hash.contains(arr2[i])){
                continue;
            } else {
                hash.add(arr2[i]);
            }
        }

        System.out.println(hash);
        System.out.println(hash.size());
    }
}
