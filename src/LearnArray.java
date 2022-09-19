public class LearnArray {
    public static void main(String[]args){
        int [] [] myArray = new int [2][3];
        myArray [0][0]=1;
        myArray [0][1]=2;
        myArray [0][2]=3;
        myArray [1][0]=4;
        myArray [1][1]=5;
        myArray [1][2]=6;
       //System.out.println(myArray[1][2]);
        for (int[] ints : myArray) {
            for (int j = 0; j < myArray[0].length; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}
