package pkge1;

public class Test {

        public int public_variable = 10;
        private int private_variable = 20;
        protected int protected_variable = 30;
        int default_variable = 50;

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.public_variable);
        System.out.println(t.private_variable);
        System.out.println(t.protected_variable);
        System.out.println(t.default_variable);
    }

}
