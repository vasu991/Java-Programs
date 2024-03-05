package com.kartik;

public class Rearrange {
    String wd;
    String newwd;
    int vow = 0;
    int con = 0;
    public Rearrange(String wd){
        this.wd=wd;
    }
    public boolean isVowel(char ch) {
        if ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') || (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
            return true;
        }
        else {
        return false;
        }
    }
    public void freq(){
        for(int i =0;i<wd.length();i++){
            if(isVowel(wd.charAt(i))){
                vow++;
            }
            else{
                con++;
            }
        }
        System.out.println("vowel frequency: " + vow);
        System.out.println("consonant frequency: " + con);
    }
    public void rearrange(){
        String first = "", last = "";
        for (int i = 0; i<wd.length(); i++) {
            if (isVowel(wd.charAt(i))) {
                first = first + wd.charAt(i);
            } else {
                last = last + wd.charAt(i);
            }
        }
        newwd = first + last;
        System.out.println("rearranged word: " + newwd);

    }

    public static void main(String[] args) {
        Rearrange word = new Rearrange("kartik");
        word.freq();
        word.rearrange();
    }

}
