package thefifth;

public class OuterClassMain {
    public static void main(String args[]) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();

        ic.methodInnerClass(2);
    }
}
