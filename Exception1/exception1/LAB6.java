public class LAB6 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            StackTraceElement[] st = e.getStackTrace();
            for (int i = 0; i < st.length; i++) {
                System.out.println(st[i].getClassName());
                System.out.println(st[i].getMethodName());
                System.out.println(st[i].getFileName());
                System.out.println(st[i].getLineNumber());
            }
        }
    }
}
