package interfacesExamples;

public class Child1 extends ParentClass1 implements Parent1,Parent2{

    public static void main(String[]args){
       Parent1 obj = new Child1();
        obj.show();
    }
}
