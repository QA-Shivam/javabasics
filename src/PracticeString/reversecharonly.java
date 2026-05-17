package PracticeString;

public class reversecharonly {
    public static void main(String[] args) {
        String str="1abcv3";
        char ch[]=str.toCharArray();
        int l=0;
        int r=ch.length-1;
        while (l<r){
            if(!Character.isAlphabetic(ch[l])){
                l++;
            } else if (!Character.isAlphabetic(ch[r])) {
                r--;
            }else {
                char t= ch[l];
                ch[l]=ch[r];
                ch[r]=t;
                l++;
                r--;
            }
        }
        System.out.println(new String(ch));
    }
}
