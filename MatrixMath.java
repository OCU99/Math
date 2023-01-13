public class MatrixMath {
    public static void main(String [] args) {
        int [][] matrix1 = new int[3][3];
        System.out.println("The first generated matrix is: ");
        for (int a=0; a<3; a++) {
            for (int b=0; b<3; b++) {
                matrix1[a][b] = (int)(Math.random()*10 + 1);
                System.out.print(matrix1[a][b] + "\t");
            } 
            System.out.print("\n");
        }
        int [][] matrix2 = new int[3][3];
        System.out.println("The second generated matrix is: ");
        for (int c=0; c<3; c++) {
            for (int d=0; d<3; d++) {
                matrix2[c][d] = (int)(Math.random()*10 + 1);
                System.out.print(matrix2[c][d] + "\t");
            }
            System.out.print("\n");
        }
        int [][] matrix3 = new int[3][3];
        System.out.println("The third generated matrix is: ");
        for (int e=0; e<3; e++) {
            for (int f=0; f<3; f++) {
                matrix3[e][f] = (int)(Math.random()*10 + 1);
                System.out.print(matrix3[e][f] + "\t");
            }
            System.out.print("\n");
        } 
        int [][] matrix4 = new int[3][3];
        System.out.println("The fourth matrix is: ");
        for (int g=0; g<3; g++) {
            for (int h=0; h<3; h++) {
                matrix4[g][h] = 0;
                for (int i=0; i<3; i++) {
                    matrix4[g][h] += matrix1[g][i] * matrix2[i][h];
                }
                System.out.print(matrix4[g][h] + "\t");
            }
            System.out.print("\n");
        }
        int [][] matrix5 = new int[3][3];
        System.out.println("The fifth matrix is: ");
        for (int g=0; g<3; g++) {
            for (int h=0; h<3; h++) {
                matrix5[g][h] = 0;
                for (int i=0; i<3; i++) {
                    matrix5[g][h] += matrix1[g][i] * matrix3[i][h];
                }
                System.out.print(matrix5[g][h] + "\t");
            }
            System.out.print("\n");
        }
        int [][] matrix6 = new int[3][3];
        System.out.println("The solution matrix is: ");
        for (int g=0; g<3; g++) {
            for (int h=0; h<3; h++) {
                matrix6[g][h] = 0;
                for (int i=0; i<3; i++) {
                    matrix6[g][h] = matrix4[g][h] + matrix5[g][h];
                }
                System.out.print(matrix6[g][h] + "\t");
            }
            System.out.print("\n");
        }
    } 
}