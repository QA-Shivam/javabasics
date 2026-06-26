package Array;
public class StrReverse {
    public static void main(String[] args) {
        String st="The Sky";
        String words[]=st.split(" ");
        int left=0;
        int right=words.length-1;
        for (int i=0;i<words.length;i++){
            while (left<right){
                String str=words[left];
                words[left]=words[right];
                words[right]=str;
                left++;
                right--;
            }
        }
        System.out.println(String.join(" ",words));
    }
}
