package com.company;
import java.util.*;


public class letter_key_phone {
    public static void LetterKey(String str, String sol, List<String> AL) {
        if (str.isEmpty()) {
//			System.out.println(sol);
            AL.add(sol);
            return;
        }

        String options = getComb(str.charAt(0));
        for (int i = 0; i < options.length(); i++) {
            LetterKey(str.substring(1), sol + options.charAt(i), AL);
        }

    }

    public static String getComb(char ch) {
        if (ch == '2') {
            return "abc";
        } else if (ch == '3') {

            return "def";
        } else if (ch == '4') {

            return "ghi";
        } else if (ch == '5') {

            return "jkl";
        } else if (ch == '6') {

            return "mno";
        } else if (ch == '7') {

            return "pqrs";
        } else if (ch == '8') {

            return "tuv";
        } else if (ch == '9') {

            return "wxyz";
        }
        return "";
    }


    public static void main(String[] args) {
        List<String> AL = new ArrayList<String>();
        LetterKey("23", "", AL);
        System.out.println(AL);


    }
}