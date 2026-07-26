package PracticeString;

import java.util.Stack;

public class DecodeString {

    public static String decodeString(String str) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder result = new StringBuilder();

        //Stores the current number.
        int currentNumber = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber = (currentNumber * 10) + (c - '0');
                continue;
            }
            if (c == '[') {
                numberStack.push(currentNumber);
                currentNumber = 0;
                stringStack.push(String.valueOf(c));
                continue;
            }
            if (c != ']') {
                stringStack.push(String.valueOf(c));
                continue;
            }
            StringBuilder temp = new StringBuilder();
            while (!stringStack.peek().equals("[")) {
                temp.insert(0, stringStack.pop());
            }
            // remove [ bracket
            stringStack.pop();

            StringBuilder replacement = new StringBuilder();
            int count = numberStack.pop();
            for (int i = 0; i < count; i++) {
                replacement.append(temp);
            }
            stringStack.push(replacement.toString());
        }

        while (!stringStack.empty()) {
            result.insert(0, stringStack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "3[ab]2[bc]";
        System.out.println(decodeString(s));
    }
}
