public class largestElement {
    public int findLargestElement(int[] arr){
        int largest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }
}
