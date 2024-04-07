package com.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/defanging-an-ip-address/description/
public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String str = "1.1.1.1";
    }
    static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}