package pkge1;

public class Sample {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.public_variable);
        //System.out.println(t.private_variable);
        System.out.println(t.protected_variable);
        System.out.println(t.default_variable);
    }
}
