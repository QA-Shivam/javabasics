package string;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t){
        //convert both string to lower case to ignore case mismatch

        s= s.toLowerCase();
        t=t.toLowerCase();

        //stripe of all white spaces
        s=s.replace(" ","");
        t=t.replace(" ","");

        //Initialize the bucket array
        int[] counts=new int[26];

        //fill the bucket
        for (int i=0;i<s.length();i++){
            counts[s.charAt(i)-'a']++;
        }

        //empty the bucket
        for (int i=0;i<t.length();i++){
            counts[t.charAt(i)-'a']--;
        }

        //check if all buckets are empty
        for (int count : counts){
            if (count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 ="single";
        String str2="mingle";
        System.out.println(isAnagram(str1,str2));

    }
}
