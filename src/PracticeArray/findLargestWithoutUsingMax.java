package PracticeArray;

public class findLargestWithoutUsingMax {
    public static int largest(int arr[]){
      int left=0;
      int right= arr.length-1;
      int max=arr[left];
      while (left<right){
          if(arr[left]>max){
              max=arr[left];
          } else if (arr[right]>max) {
              max=arr[right];
          }
          left++;
          right--;
      }
      return max;
    }
    public static void main(String[] args) {
        int arr[]={3,5,33,56,12};
        System.out.println(largest(arr));
    }
}
