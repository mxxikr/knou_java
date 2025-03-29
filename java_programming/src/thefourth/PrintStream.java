package thefourth;

/**
 * 메소드 오버로딩
 */
class PrintStream {
    public void println() {
        System.out.println();
    }

    public void println(String x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(); // 인자 없음
        System.out.println("문자열"); // 인자는 String
        System.out.println(241); // 인자는 int
        System.out.println(34.5); // 인자는 double

        MyClass mc = new MyClass();
        mc.add(10, 10.5); // add 메서드 호출
    }
}


