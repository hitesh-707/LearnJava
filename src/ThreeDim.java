/*public class ThreeDim {
    public static void main(String[]args){
        int [][][] a = new int[2][3][4];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                     a[i][j][k] = (int)(Math.random()*1000);
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
*/
public class ThreeDim{
    public static void main(String[]args){
        int [][][] array = new int [2][3][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                for (int k = 0; k <array[i][j].length ; k++) {
                    array[i][j][k] =  (int)(Math.random()*100);
                     System.out.print(array[i][j][k]+" ");

                }
            System.out.println();
            }
            System.out.println();
        }
    }
}