package PracticeString;

public class ReverseStringKeepSpaceIntact {
    //   Given a string, your task is to reverse the string keeping the spaces intact to their positions.


    public static void main(String[] args) {
    String str=" Ram @Ji";
    char c[]=str.toCharArray();
    int l=0;
    int r=c.length-1;
    while (l<r){
        if (!Character.isAlphabetic(c[l])){
            l++;
        } else if (!Character.isAlphabetic(c[r])) {
            r--;
        }else {
            char t = c[l];
            c[l]=c[r];
            c[r]=t;
            l++;
            r--;
        }
    }
        System.out.println(new String(c));
    }
}
