package com.company;

public class Main {

    public static void main(String[] args) {
        final int N = 7;
        int[][] table = new int[N][N]; //what does this do?
        for (int r = 0; r < N; r++) { //goes through rows
            for (int c = 0; c < N; c++) { //goes through columns
                int val = (r + 1) / (c + 1);
                table[r][c] = val;
                System.out.print(val + " ");
            }
            System.out.println("");
        }
    }
}
