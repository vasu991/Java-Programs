package com.vasu.AlgoWorkspace.MiscellaneousProblems;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
    public static String addBinary(String a, String b) {
        int al = a.length();
        int bl = b.length();
        int ext = Math.abs(al - bl);
        boolean check = true;
        String small;
        String big;
        if(al > bl) {
            small = b;
            big = a;
        }
        else if(bl > al) {
            small = a;
            big = b;
        }
        else {
            small = a;
            big = b;
            check = false;
        }
        if(check) {
            for(int i = 1; i <= ext; i++) {
                small = "0" + small;
            }
        }
        String carry = "0";
        int nn = 0;
        String sum;
        for(int i = small.length() - 1; i >= 0; i--) {
            String sc = String.valueOf(small.charAt(i));
            String bc = String.valueOf(big.charAt(i));
            sum = String.valueOf(Integer.parseInt(sc) + Integer.parseInt(bc) + Integer.parseInt(carry));
            String curr;
            if(sum.equals("2")) {
                carry = "1";
                curr = "0";
            }
            else if(sum.equals("1")) {
                carry = "0";
                curr = "1";
            }
            else {
                carry = "0";
                curr = "0";
            }
            nn = Integer.parseInt(curr) + nn;

        }
        return String.valueOf(nn);
    }
}
