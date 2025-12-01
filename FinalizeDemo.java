public class FinalizeDemo {
    protected void finalize() {
        System.out.println("Object is destroyed");
    }

    public static void main(String[] args) {
        FinalizeDemo f = new FinalizeDemo();
        f = null;

        System.gc();   // request GC
    }
}
