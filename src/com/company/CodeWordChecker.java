package com.company;


public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String CodeWord;
    public CodeWordChecker(int min, int max, String CodeWord) {
        this.min = min;
        this.max = max;
        this.CodeWord = CodeWord;
    }
    public CodeWordChecker(String CodeWord) {
        this.min = 6;
        this.max = 20;
        this.CodeWord = CodeWord;
    }
    public boolean isValid(String str) {
        if (str.length() < min) {
            return false;
        }
        if (str.length() > max) {
            return false;
        }
        if (str.indexOf(this.CodeWord) != -1) {
            return false;
        }
        return true;
    }
}