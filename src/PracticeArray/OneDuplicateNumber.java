package PracticeArray;

public class OneDuplicateNumber {

    public static int dup(int arr[]) {
        int slow=0;
        int fast=0;
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while (slow!=fast);

        slow=0;
        while (slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int arr[]={4,1,1,3,2};
        System.out.println(dup(arr));

    }
}
