public class LAB3 {
    public static void main(String[] args) {
        try{
            int[] list = new int[10];
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println("Statement 3");
        }
        catch (Exception e){
        }
        finally {
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }
}
