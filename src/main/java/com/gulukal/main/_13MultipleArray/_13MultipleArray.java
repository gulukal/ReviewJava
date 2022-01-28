package com.gulukal.main._13MultipleArray;

public class _13MultipleArray {

    public static void main(String[] args) {

        // multi array
        // 2 = satir 3= sutun

        short[][] matrix = new short[2][3];

        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 2;

        matrix[1][0] = 3;
        matrix[1][1] = 4;
        matrix[1][2] = 5;

        for (int i = 0; i < matrix.length; i++) { // birinci dongu satirdir.

            for (int j = 0; j < matrix[i].length; j++) { // ikinci dongu sutundur.

                System.out.print(matrix[i][j] + "");

            }
            System.out.println();
        }

    }
}
