import java.io.IOException;

class throwsprog {
    void m() throws IOException {

        System.out.println("inside m");
        throw new IOException("device error");// checked exception
    }

    void n() throws IOException {
        System.out.println("inside n");
        m();
    }

    void p() {
        try {

            System.out.println("inside p");
            n();

            System.out.println("inside p late");
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        throwsprog obj = new throwsprog();
        obj.p();
        System.out.println("normal flow...");
    }
}
