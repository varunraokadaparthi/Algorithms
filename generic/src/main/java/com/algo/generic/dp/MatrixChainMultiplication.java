package com.algo.generic.dp;

class MatrixChainMultiplication {
  // Matrix Ai has dimension p[i-1] x p[i] for i = 1..n
  static char name = 'A';
  static int MatrixChainOrder(int p[], int n)
  {
        /* For simplicity of the program, one extra row and one
        extra column are allocated in m[][].  0th row and 0th
        column of m[][] are not used */
    int m[][] = new int[n][n];
    int[][] bracket = new int[n][n];

    int i, j, k, L, q;

        /* m[i, j] = Minimum number of scalar multiplications needed
        to compute the matrix A[i]A[i+1]...A[j] = A[i..j] where
        dimension of A[i] is p[i-1] x p[i] */

    // cost is zero when multiplying one matrix.
    for (i = 1; i < n; i++)
      m[i][i] = 0;

    // L is chain length.
    for (L = 2; L < n; L++) {
      for (i = 1; i < n - L + 1; i++) {
        j = i + L - 1;
        if (j == n)
          continue;
        m[i][j] = Integer.MAX_VALUE;
        for (k = i; k <= j - 1; k++) {
          // q = cost/scalar multiplications
          System.out.print("m[" + i + "][" + j + "] = " + "m[" + i + "][" + k + "] + m[" + (k + 1) + "][" + j + "] + p[" + (i-1) + "] * p[" + k + "] * p[" + j + "]");
          q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
          System.out.println(" = " + q);
          if (q < m[i][j]) {
            m[i][j] = q;
            bracket[i][j] = k;
          }
        }
      }
    }
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        System.out.print(m[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        System.out.print(bracket[i][j] + " ");
      }
      System.out.println();
    }
    printParenthesis(1, n - 1, n, bracket);
    return m[1][n - 1];
  }

  static void printParenthesis(int i, int j, int n,
                               int[][] bracket)
  {
    // If only one matrix left in current segment
    if (i == j) {
      System.out.print(name++);
      return;
    }
    System.out.print("(");

    // Recursively put brackets around subexpression
    // from i to bracket[i][j].
    // Note that "*((bracket+i*n)+j)" is similar to
    // bracket[i][j]
    printParenthesis(i, bracket[i][j], n, bracket);

    // Recursively put brackets around subexpression
    // from bracket[i][j] + 1 to j.
    printParenthesis(bracket[i][j] + 1, j, n, bracket);
    System.out.print(")");
  }

  // Driver program to test above function
  public static void main(String args[])
  {
    int arr[] = new int[] { 5, 10, 3, 12, 5, 50, 6 };
    int size = arr.length;

    System.out.println("Minimum number of multiplications is "
            + MatrixChainOrder(arr, size));
  }
}
