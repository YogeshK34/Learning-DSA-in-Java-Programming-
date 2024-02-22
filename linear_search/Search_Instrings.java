package com.linear_search;

public class Search_Instrings {
    public static void main(String[] args) {
        String name = "Walter";
        char target = 'r';
//        System.out.println();
        System.out.println(search_string(name,target));
    }
    static boolean search_string(String name, char target){
        if(name.isEmpty()){
            return false;
        }

        for (int index = 0; index < name.length(); index++) {
            if(target == name.charAt(index)){
                return true;
            }
//            return false;
        }
        return false;
    }
}
