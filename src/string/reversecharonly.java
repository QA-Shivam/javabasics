package string;

public class reversecharonly {

    public static void main(String[] args) {
        String str="1abcv3";
        char [] arr= str.toCharArray();
        System.out.println(arr);
        int left=0;
        int right = arr.length-1;
        while (left<right){
            if (!Character.isLetter(arr[left])){
                left++;
            }
            else if (!Character.isLetter(arr[right])){
                right--;
            }
            else {
                char tmp = arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
                left++;
                right--;
            }
        }

        System.out.println(arr);
    }
}
