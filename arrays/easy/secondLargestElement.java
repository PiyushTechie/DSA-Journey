public class secondLargestElement {
    public int findSecondLargestElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? 1 : secondLargest;
    }
}
