package com.blueyonder.day9;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the numbers row-wise: ");
        sc.nextLine();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[] ans = getAns(n, m, mat);
        System.out.println("x: " + ans[0]);
        System.out.println("y: " + ans[1]);
        sc.close();
    }

    private static int[] getAns(int n, int m, int[][] mat) {
        int[] cord = new int[2];
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tempAns = mat[i][j] + (i > 0 ? mat[i - 1][j] : 0) + (i < n - 1 ? mat[i + 1][j] : 0) +
                        (j > 0 ? mat[i][j - 1] : 0) + (j < m - 1 ? mat[i][j + 1] : 0) + ((i > 0 && j > 0) ? mat[i - 1][j - 1] : 0)
                        + ((i > 0 && j < m - 1) ? mat[i - 1][j + 1] : 0) + ((i < n - 1 && j > 0) ? mat[i + 1][j - 1] : 0) +
                        ((i < n - 1 && j < m - 1) ? mat[i + 1][j + 1] : 0);
                if(tempAns>ans){
                    ans = tempAns;
                    cord[0] = i;
                    cord[1] = j;
                }
            }
        }
        return cord;
    }
}
