package shivam;

public class solution1 {
    public static String reverseStr(String str){
        char ch[]=str.toCharArray();
        int left=0;
        int right=ch.length-1;
        for (int i=0;i<ch.length;i++){
            while (left<right){
                if (!Character.isAlphabetic(ch[left])){
                    left++;
                } else if (!Character.isAlphabetic(ch[right])) {
                    right--;
                }else {
                    char c= ch[left];
                    ch[left]=ch[right];
                    ch[right]=c;
                    left++;
                    right--;
                }
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str="Ram@ ji";
        System.out.println(reverseStr(str));
    }
}
