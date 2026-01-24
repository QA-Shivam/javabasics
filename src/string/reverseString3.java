package string;

public class reverseString3 {
    public static String  revStr(String str){
        char [] arr= str.toCharArray();
       String rev="";
       for(int i= arr.length-1;i>=0;i--){
           rev=rev+arr[i];
       }
       return rev;
    }
    public static void main(String[] args) {
        System.out.println(revStr("DEAMON"));
    }
}
