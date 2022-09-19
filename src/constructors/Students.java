package constructors;

public class Students {
    String studentName;
    int rollNum;
    public Students(){

        System.out.println("calling constructors");
    }

    public static void main(String[] args) {
        Students st = new Students();
        System.out.println(st.studentName);
        System.out.println(st.rollNum);
        new Students();

    }
}