package string;

import java.util.ArrayList;
import java.util.List;

class EncodeDecodeString {
//    Design an algorithm to encode a list of strings to a string.
//    The encoded string is then sent over the network and is decoded back to the original list of strings.


    public static String encode(List<String> strs) {
        StringBuilder encodeStr= new StringBuilder();
        for (String s: strs){
            encodeStr.append(s.length()).append("*").append(s);
        }
        return encodeStr.toString();
    }

    public static List<String> decode(String str) {
        List<String> decodeString= new ArrayList<>();
        int i=0;
        while (i<str.length()){
            int sepIdx=str.indexOf("*",i);
            int strLen= Integer.parseInt(str.substring(i,sepIdx));
            // Move the pointer to the first character
            i=sepIdx+1;
            String decode=str.substring(i,i+strLen);
            decodeString.add(decode);
            i=i+strLen;
        }
        return decodeString;
    }

    public static void main(String[] args) {
        List<String> strs = List.of("Hello", "World");
        System.out.println(decode(encode(strs)));

    }
}
