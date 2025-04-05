package thefifth;

import java.util.Iterator;

/**
 * 배열의 짝수 인덱스 요소들을 반복적으로 접근하기 위한 반복자 패턴 구현
 */
public class NestedClassTest {
    // 배열의 크기를 상수로 정의
    private final static int SIZE = 15;
    // 데이터를 저장할 배열 선언
    private int[] data = new int[SIZE];

    /**
     * 배열을 초기화하여 인덱스 값을 배열 요소에 저장
     */
    public NestedClassTest() {
        for (int i = 0; i < SIZE; i++)
            data[i] = i;
    }

    /**
     * 짝수 인덱스 요소들을 출력하는 메서드
     * 내부 클래스인 EvenIterator를 생성하여 짝수 인덱스의 요소들에 접근
     */
    public void printEven() {
        // 내부 클래스의 인스턴스 생성
        EvenIterator iterator = this.new EvenIterator();

        // 반복자를 사용하여 다음 요소가 있는 동안 반복
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }

    /**
     * 짝수 인덱스 요소에만 접근하기 위한 내부 클래스(Inner Class)
     * 외부 클래스의 private 멤버(data 배열)에 직접 접근 가능
     */
    private class EvenIterator implements Iterator<Integer> {
        // 다음 접근할 인덱스를 저장 (0부터 시작)
        private int nextIndex = 0;

        /**
         * 다음 요소가 있는지 확인하는 메서드
         * 접근할 수 있는 요소가 남아있으면 true, 그렇지 않으면 false 반환
         */
        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }

        /**
         * 다음 요소를 반환하고 내부 인덱스를 2 증가시키는 메서드
         * 2씩 증가시켜 짝수 인덱스만 접근
         */
        public Integer next() {
            // 현재 인덱스 위치의 데이터를 Integer 객체로 변환
            Integer ret = Integer.valueOf(data[nextIndex]);
            // 다음 짝수 인덱스를 가리키도록 2 증가
            nextIndex += 2;

            return ret;
        }
    }

    public static void main(String args[]) {
        // NestedClassTest 객체 생성
        NestedClassTest nc = new NestedClassTest();
        // 짝수 인덱스 요소들 출력 (0, 2, 4, 6, 8, 10, 12, 14의 값)
        nc.printEven();
    }
}