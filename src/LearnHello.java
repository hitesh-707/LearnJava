public class LearnHello {
    public static void main(String[]args){
        int num = (int)(Math.random()*10);
        if(num%2==0){
            System.out.println(num+" "+"This is not prime number");
        }
        else {
            System.out.println(num+" "+"This is  prime number");

        }
    }
}