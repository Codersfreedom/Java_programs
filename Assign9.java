class A extends Thread {
    public void run() {
        System.out.println("Thread A started");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread form class A i=" + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Thread B started");
        for (int j = 0; j < 5; j++) {
            System.out.println("Thread from B j= " + j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        System.out.println("Thread C started");
        for (int k = 0; k < 5; k++) {
            System.out.println("Thread from C k=" + k);
        }
        System.out.println("Exit from C");
    }
}

class Assign9 {
    public static void main(String[] args) {
        A ta = new A();
        B tb = new B();
        C tc = new C();

        ta.start();

        tb.start();
        tc.start();
        System.out.println("Exit from main thread");
    }
}