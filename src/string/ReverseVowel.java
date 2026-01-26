package string;

class ReverseVowel {
    public static boolean isVowle(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public static String reverseVowels(String s) {
        char[] c= s.toCharArray();
        int left=0;
        int right= c.length-1;
        while(left<right){
            if(!isVowle(c[left])){
                left++;
            }
            else if(!isVowle(c[right])){
                right--;
            }
            else{
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }
}