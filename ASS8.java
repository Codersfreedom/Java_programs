import java.io.*;

class Matrix {
    int row, col;
    float array[][];

    Matrix(int r, int c, float arr[][]) {
        row = r;
        col = c;
        array = arr;
    }

    void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print("\t" + array[i][j]);
            System.out.println();
        }
    }

    void multiply(Matrix m) {
        if (col != m.row) {
            System.out.println("\n\nMatrix multiplication is not possible.\n\n");
            System.exit(0);
        }
        float a[][] = new float[row][m.col];
        System.out.println("\n\nThe resultant matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < m.col; j++) {
                for (int k = 0; k < col; k++)
                    a[i][j] += array[i][k] * m.array[k][j];
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }
    }
}

class ASS8 {
    static int r, c;
    static float a[][];

    public static void main(String s[]) throws IOException {
        input();
        System.out.println("\n\nEnter the order of the first matrix:");
        Matrix m1 = new Matrix(r, c, a);
        System.out.println("\n\nThe first matrix is:");
        m1.display();
        System.out.println("\n\nEnter the order of the second matrix:");
        input();
        Matrix m2 = new Matrix(r, c, a);
        System.out.println("\n\nThe second matrix is:");
        m2.display();
        m1.multiply(m2);
        System.out.println("\n\n");
    }

    static void input() throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        r = Integer.parseInt(dis.readLine());
        c = Integer.parseInt(dis.readLine());
        a = new float[r][c];
        System.out.println("\n\nEnter the elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = Float.parseFloat(dis.readLine());
    }
}
