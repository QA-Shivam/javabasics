package shivam;

public class solution10 {
    public static void main(String[] args) {
        String str= "Hello World";
        int len=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                break;
            }
            len++;
        }
        System.out.println(len);
    }
}
