package string;

public class reversevowelsonly {

    public static  String revVowel(String str){
        char [] arr = str.toCharArray();
        String vowels="aeiouAEIOU";
        int left =0;
        int right=arr.length-1;
        while (left<right){
            if (vowels.indexOf(arr[left])==-1){
                left++;
            } else if (vowels.indexOf(arr[right])==-1) {
                right--;
            }
            else {
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        System.out.println(revVowel("Elephant"));
    }
}

