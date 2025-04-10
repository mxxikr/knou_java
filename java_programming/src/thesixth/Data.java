package thesixth;

//class Data {
//    private Object object; // java의 클래스 계층 구조에서 가장 상위 구조
//
//    public void set(Object object) {
//        this.object = object;  // 데이터 필드 세팅
//    }
//
//    public Object get( ) {
//        return object;
//    }
//}

// Data 클래스의 제너릭 버전
class Data<T> { // 타입 파라미터 호출
    private T t; // 데이터 필드의 자료형으로 타입 파라미터 사용

    public void set(T t) {
        this.t = t; // 인자의 자료형으로 타입 파라미터 사용
    }

    public T get( ) {
        return t; // 메소드 반환형으로 타입 파라미터 사용
    }
}