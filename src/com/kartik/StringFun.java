package com.kartik;
public class StringFun {
    public static String[] fun(String str) {
        int len = str.length();
        int space = 0;
        for(int i=0;i<len;i++) {
            String ch = String.valueOf(str.charAt(i));
            if(ch.equals(" ")) {
                space++;
            }
        }
        String[] arr = new String[space+1];
        String sub;
        int j = 0;
        int ctr = 0;
        int last = 0;
        for(int i=0;i<len;i++) {
            char ch = str.charAt(i);
            if(ctr==space) {
                sub = str.substring(last);
                arr[j] = sub;
                break;
            }
            if(ch==' ') {
                sub = str.substring(last,i);
                arr[j] = sub;
                j++;
                last  = i+1;
                ctr++;
            }
        }
        return arr;

    }
}