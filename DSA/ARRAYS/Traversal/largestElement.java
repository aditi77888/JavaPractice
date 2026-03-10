public class largestElement {

    public static void main(String args[]){
    int[] arr = {2,56,78,32,9,70,23,78};
    
    int largeste = largestElement(arr);
    System.out.println(largeste);

    int secL = secLargest(arr);
    System.out.println(secL);

    
}
    //MAX/LARGEST ELEMENT
    //BRUTEFORCE - sort array and n-1 th element is largest
    //optimal solution
    static int largestElement(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
    //secondlargest element 
    //BRUTEFORCE - sort , and start from n-2 element and check if n-2 and largest are equal , if not its second larget
    //-- OPTIMAL SOLUTION : O(n)
    static int secLargest(int[] arr){
        int largest = arr[0];
        int seclargest = -1;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]>largest){
                seclargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>seclargest){
                seclargest = arr[i];
            }
        }
        return seclargest;
    }
}
