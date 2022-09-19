/*public class ForLoop {
    public static void main(String[]args){
        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);

        }
    }
}*/
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if( i>=5 && i<=8){
                continue;

            }
        System.out.println(i);
        }
        System.out.println("Out side of the looop");
    }
}
