package shivam;

public class solution2 {

    public static String revStr(String str){
       String string[]=str.split("\\s");
       for (int i=0;i<string.length;i++){
           char ch[]=string[i].toCharArray();
           int left=0;
           int righ=ch.length-1;
           while (left<righ){
               char c= ch[left];
               ch[left]=ch[righ];
               ch[righ]=c;
               left++;
               righ--;
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
