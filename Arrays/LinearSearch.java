package Arrays;

public class LinearSearch {
    public static int linearSearch(int[] array, int target){
        if(array == null || array.length == 0){
            return -1; // Nothing to search
        }

        for(int i =0; i < array.length; i++){
            if(array[i] == target){
                return i; // Found
            }
        }

        return -1; // Target not found
    }

    public static void  main( String[] args){
        int[] number = {10,15,20,25,30,35};
        int target = 20;
        int index = linearSearch(number,target);
        if(index != -1){
            System.out.println("Element found at index : " + index);
        }else{
            System.out.println("Element not found at index : " + index);
        }
    }
}
