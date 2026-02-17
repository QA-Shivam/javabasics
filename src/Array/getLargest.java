package Array;

public class getLargest {
    public static int getLargest(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int max=arr[left];
        while (left<right){
            if(arr[left]>max){
                max=arr[left];
            }
            if (arr[right]>max){
                max=arr[right];
            }
            left++;
            right--;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 35};
        System.out.println(getLargest(arr));
    }
}
