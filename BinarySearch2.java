public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = {12,2,34,22,4,34,55,2,431,245};
        int target = 431;
        int ans = (binarySearch(arr, target));
        System.out.println(ans);

    }
    static int binarySearch(int arr[], int target ){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
            
        }
        return -1;

        }
    }


