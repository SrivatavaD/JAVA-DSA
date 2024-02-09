//Quick Sort algorithm

public class sortingalgothree {
    /*Here the last elememnt is taken as pivot
     * place the pivot at its exact position and
     * smaller elements to the right of the pivot and greater elememnts
     * to the right of the pivot.
     */

     int partition (int arr[], int first, int last){
        int pivot = arr[last]; //pivot element.
        int i = (first-1);

        for(int j = first; j<=last-1; j++){
            //If current element is smaller than the pivot
            if(arr[j]<pivot) 
            {
                i++; //Increment index of smaller elements

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last] = temp;
        return (i+1);
     }

     //A function to implement quick sort.

     void sortQuick(int arr[], int first, int last) //arr[] = array to be sorted, first = first index, last = last index

    {
        if(first<last){
            int p = partition(arr, first, last); //p is partioning index.
            sortQuick(arr, first, p-1);
            sortQuick(arr, p+1, last);
        }
    }

    //function to display an elements of the array

    void display(int arr[] , int n)
    {
        int i ;
        for(i=0; i<n; i++)
        System.out.print(arr[i]+ " ");
    }
    public static void main(String[] args) {
        int arr[] = {20,12,35,16,18,30};
        int n = arr.length;
        System.out.println("\nBefore sorting array elements are :-");
        sortingalgothree obj1 = new sortingalgothree();
        obj1.display(arr,n);
        obj1.sortQuick(arr, 0, n-1);
        System.out.println("\nAfter sorting array elements arr :-");
        obj1.display(arr,n);
        System.out.println();
    }
}
