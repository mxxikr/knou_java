package theseventh;

public class MyExceptionMain {
    public static void main(String[] args) {
        MyExceptionTest met = new MyExceptionTest();
        int a = 20;
        try {
            met.testFunc(a);
        } catch (MyException e) {
            System.out.println("MyException이 발생했습니다.");
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다.");
        } finally {
            System.out.println("finally 블록입니다.");
        }
    }
}
