import java.io.*;

class CompoundInterest {
    float principal, interest;
    int year;

    CompoundInterest(float x, float y, int z) {
        principal = x;
        interest = y;
        year = z;
    }

    void compute() {
        float a = 1 + interest / 100;
        float b = power(a, year);
        float c = principal * b;
        System.out.println("\n\nTotal amount is: " + c);
    }

    float power(float p, int q) {
        float r = 1;
        for (int i = 1; i <= q; i++)
            r *= p;
        return r;
    }
}

class ASS7 {
    public static void main(String s[]) throws IOException {
        float x, y;
        int z;
        DataInputStream ds = new DataInputStream(System.in);
        System.out.print("\nEnter Principal amount: ");
        x = Float.parseFloat(ds.readLine());
        System.out.print("\nEnter Interest rate: ");
        y = Float.parseFloat(ds.readLine());
        System.out.print("\nEnter No. of years: ");
        z = Integer.parseInt(ds.readLine());
        CompoundInterest ci = new CompoundInterest(x, y, z);
        ci.compute();
        System.out.println("\n\n");
    }
}

// Enter Principal amount: 1500

// Enter Interest rate: 5

// Enter No. of years: 10


// Total amount is: 2443.341