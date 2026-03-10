public class maxsum{
    public static void main(String[] args) {
        
    int[] arr = {5,4,-2,1,3,6};
    int k = 4;
    int res = maxsubarrraySum(arr, k);
    System.out.println(res);

    }

    static int maxsubarrraySum(int[] arr ,int k){
        int windowsum = 0;
        for(int i=0 ; i<k ; i++){
            windowsum += arr[i];
        }
        int maxsum = windowsum;
        for(int i=k ; i<arr.length ; i++){
            windowsum += arr[i]-arr[i-k];
            maxsum = Math.max(maxsum, windowsum);
        }
        return maxsum;
    }
    

    }

