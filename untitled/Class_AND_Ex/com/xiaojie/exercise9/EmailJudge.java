package com.xiaojie.exercise9;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailJudge {
    public static boolean isValidEmail(String email) {
        if ((email != null) && (!email.isEmpty())) {
            return Pattern.matches("^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$", email);
        }
        return false;
    }
    public  static String getNum(String str) {
        String dest = "";
        if (str != null) {
            dest = str.replaceAll("[^0-9]","");

        }
        return dest;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String email = in.nextLine();
        in.close();
        if(isValidEmail(email))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

        System.out.println("Output the Num in Email: ");
        System.out.println(getNum(email));
    }
}

