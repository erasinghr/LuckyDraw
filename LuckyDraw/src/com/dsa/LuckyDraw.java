package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LuckyDraw {
    public int luckyDraw(int[] tokens, int x) {
        Arrays.sort(tokens);
        return tokens[x-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tokens = new int[n];
        for (int i = 0; i < n; ++i)
            tokens[i] = scanner.nextInt();

        int x = scanner.nextInt();
        scanner.close();

        int result = new LuckyDraw().luckyDraw(tokens, x);
        System.out.println(result);
    }
}
