package thefourth;

/**
 * 필드 초기화 순서
 * 1. static 필드 선언문
 * 2. static 초기화 블록
 * 3. non-static 필드 선언문
 * 4. non-static 초기화 블록
 * 5. 생성자
 */
class InitTest {
    static int nStatic = 0;
    int nValue  = 1; // 초기값 선언하지 않을경우 0으로 자동 초기화

    { // 초기화 블록
        nValue  = 2; // 초기값 변경
    }

    static {
        nStatic = 1; // 클래스 변수 초기화 블록
    }

    public InitTest() { // 생성자에서 초기화
        nValue = 3; // 초기값 변경
    }
}