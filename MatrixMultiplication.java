public class MatrixMultiplication {
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
        System.out.println("The solution matrix is: ");
        for (int e=0; e<3; e++) {
            for (int f=0; f<3; f++) {
                matrix3[e][f] = 0;
                for (int g=0; g<3; g++) {
                    matrix3[e][f] +=matrix1[e][g] * matrix2[g][f];
                }
                System.out.print(matrix3[e][f] + "\t");
            } 
            System.out.print("\n");
        } 
    } 
} 