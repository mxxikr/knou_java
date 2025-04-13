package theseventh;

class MyExceptionTest {
    public void testFunc(int x) throws MyException {
        if (x > 10)
            throw new MyException(); // 예외 객체 생성 -> 예외 발생
    }
}