
public class NewFileError{
    public static void main(String[]args) throws InterruptedException{
        System.out.println("Start");
       try {
           int[] a = new int[5];
           a[5] = 100;
       }
        catch (Throwable t){
           System.out.println("Error occured");
        }
        System.out.println("END");
    }
}