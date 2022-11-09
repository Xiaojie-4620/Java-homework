package com.xiaojie.exercise9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class WhatDay {
    public static void main(String[] args) throws IOException, ParseException {
        // TODO Auto-generated method stub
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请键入日期（如：2008-8-8）：");
        String str = br.readLine();
        Date date = dateFormatter.parse(str);
        dateFormatter.applyPattern("E");
        System.out.println("你输入的日期是：" + dateFormatter.format(date));
        br.close();
    }
}
