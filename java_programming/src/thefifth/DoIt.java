package thefifth;

interface DoIt {
    void doSomething(); // 추상 메소드

    int doSomethingElse(String s); // 추상 메소드
    // 아래를 새로 추가한다면?
    default boolean didItWork(int i, String s) {
        return true;
    }
}