package shivam;

public class solution3 {
    public static String revStr(String str){
        String string[]=str.split("\\s");
        int left=0;
        int right=string.length-1;
        for (String s:string){
            while (left<right){
                s=string[left];
                string[left]=string[right];
                string[right]=s;
                left++;
                right--;
            }
        }
        for (int i=0;i<string.length;i++){
            char ch[]=string[i].toCharArray();
            left=0;
            right=ch.length-1;
            while (left<right){
                char c=ch[left];
                ch[left]=ch[right];
                ch[right]=c;
                left++;
                right--;
            }
            string[i]=new String(ch);
        }
        return String.join(" ",string);
    }
    public static void main(String[] args) {
        String str="SDET-2 Interview Round";
        System.out.println(revStr(str));
    }
}
