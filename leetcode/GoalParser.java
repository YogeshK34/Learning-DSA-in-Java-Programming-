package com.leetcode;

public class GoalParser {
    public static void main(String[] args) {

    }
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char ch = command.charAt(i);
            if(ch == "G"){
                sb.append('G');
            } else if (ch == "(") {
                char next = command.charAt(i+1);
                if(next == ")"){
                    sb.append('o');
                    i++;
                } else if (next == "a") {
                    sb.append("al");
                    i += 3;
                }
            }
        }
        return sb.toString();
    }
}