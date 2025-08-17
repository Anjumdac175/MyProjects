package com.cdac.Paranthasis;

import java.util.Scanner;

public class ParanthesisMain {

    public static boolean isParanthesis(String str) {
        Paranthesis stack = new Paranthesis(str.length() * 2);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (!MatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean MatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paranthesis ..");
        String str = sc.nextLine();

        if (isParanthesis(str)) {
            System.out.println("Paranthesis Balanced");
        } else {
            System.out.println("Paranthesis Not Balanced..");
        }

        sc.close();
    }
}
