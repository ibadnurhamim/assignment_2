package oops;

public class ChildClass extends AbsClass implements InterfaceClass {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.saHello("Say Hello");
        childClass.sayHay("Say Hay");
    }

    @Override
    public void saHello(String word) {
        System.out.println(word);
    }

    @Override
    public void sayHay(String word) {
        System.out.println(word);
    }
}
