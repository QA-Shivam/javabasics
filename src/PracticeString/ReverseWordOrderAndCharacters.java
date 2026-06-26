package PracticeString;

public class ReverseWordOrderAndCharacters {
    public static String reverseWordOrderAndCharacters(String str){
        String words[]=str.split("\\s");
        int l=0;
        int r=words.length-1;
            while (l<r){
                String s=words[l];
                words[l]=words[r];
                words[r]=s;
                l++;
                r--;
            }
            for (int i =0;i<words.length;i++){
                char ch[]=words[i].toCharArray();
                 l=0;
                 r=ch.length-1;
                while (l<r){
                    char tmp=ch[l];
                    ch[l]=ch[r];
                    ch[r]=tmp;
                    l++;
                    r--;
                }
                words[i]=new String(ch);
            }
            return  String.join(" ",words);
    }
    public static void main(String[] args) {
        String str ="The Sky";
        System.out.println(reverseWordOrderAndCharacters(str));
    }
}
