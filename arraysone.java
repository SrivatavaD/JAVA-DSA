public class arraysone{
    public static void main(String[] args) {

        //Given an array if intergers {2,6,-5,-1,0,4,-9}, print only the positive values present in the array
        // int [] arr ={2,6,-5,-1,0,4,-9};
        // for(int val :arr){
        //     if(val>=0){
        //         System.out.println(val);
        //     }
        // }

        //convert the list of strings {"ab","bc","cd","ef","fg","gh"}into an array of strings
        //and print all strings stored on odd indices of the array

        // String [] arr = {"ab","bc","cd","de","ef","fg","gh"};
        // for(int i = 0; i<arr.length;i++){
        //     if(i%2!=0){
        //         System.out.println(arr[i]);
        //     }
        // }

        //Ques no 3 is same as question no 1
        
        //calculate the minimum element in the array{2,-3,5,8,1,0,-4}using standard library method for calculating the minimum 
        //element

        // int [] arr = {1,1,3,4,2,3,5,7,0};
        // for(int i = 1; i<arr.length-1;i++){
        //     if(arr[i-1]<arr[i] && arr[i] > arr[i+1]){
        //         System.out.println(arr[i]);
        //         break;
        //     }
        // }

        //find the first peak element in the array {1,1,3,4,2,3,5,7,0}
        //peak element is the element is which is greater than its immediate left neighbour and its
        //immediate right neighbour.leftmost and rightmost cannot be the the peak element

        int[] arr = {1,1,3,4,2,3,5,7,0};
        for(int i = 1; i<arr.length-1;i++){
            if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
                System.err.println(arr[i]);
                break;
            }

        }

    }
}
