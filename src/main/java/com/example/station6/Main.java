package com.example.station6;

public class Main {
    public static void main(String[] args) {
        // ここから
        int[] users = {23,36,31,48,58};
        double all = 0;
        for (double sum : users) {
            all += sum;
        }
        System.out.println(all/5);
        // ここまで
    }
}
