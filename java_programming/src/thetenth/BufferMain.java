package thetenth;

import java.nio.*;

public class BufferMain {
    public static void main(String[] args) {
        // 버퍼 생성 (용량: 1024)
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        // 초기 상태 확인
        System.out.println("초기 상태:");
        printBufferState(buffer);

        // 상대적 쓰기 (현재 position에서 쓰기)
        buffer.put((byte) 10); // 값 10 저장
        buffer.put((byte) 20); // 값 20 저장
        buffer.put((byte) 30); // 값 30 저장
        System.out.println("쓰기 후 상태:");
        printBufferState(buffer); // 쓰기 후 position 증가

        // 플립 (flip) - 쓰기에서 읽기 준비로 전환
        buffer.flip();
        System.out.println("flip() 후 상태:");
        printBufferState(buffer);

        // 상대적 읽기 (현재 position에서 읽음)
        System.out.println("읽기 시작...");
        while (buffer.hasRemaining()) { // position < limit 까지 읽기
            System.out.println("읽은 값: " + buffer.get());
        }
        System.out.println("읽기 후 상태:");
        printBufferState(buffer); // 읽기 후 position 증가

        // 재읽기를 위해 rewind() 호출 (position을 0으로 초기화)
        buffer.rewind();
        System.out.println("rewind() 후 상태:");
        printBufferState(buffer);

        // 절대적 읽기 (특정 index의 데이터 읽기)
        System.out.println("index 1의 값: " + buffer.get(1)); // index 1의 값 읽기
        System.out.println("절대적 읽기는 position에 영향을 주지 않음:");
        printBufferState(buffer);

        // clear() 호출 - 버퍼를 초기 상태로 설정
        buffer.clear();
        System.out.println("clear() 후 상태:");
        printBufferState(buffer); // position과 limit 초기화

        // ByteBuffer.wrap()를 이용해 배열로부터 버퍼 생성
        byte[] byteArray = {50, 60, 70};
        ByteBuffer wrappedBuffer = ByteBuffer.wrap(byteArray);
        System.out.println("wrap()을 이용한 버퍼 생성:");
        printBufferState(wrappedBuffer);
        System.out.println("wrap된 버퍼 데이터 읽기:");
        while (wrappedBuffer.hasRemaining()) {
            System.out.println("읽은 값: " + wrappedBuffer.get());
        }
    }

    // 현재 버퍼의 상태를 출력하는 유틸리티 메서드
    private static void printBufferState(Buffer buffer) {
        System.out.println("position = " + buffer.position() +
                ", limit = " + buffer.limit() +
                ", capacity = " + buffer.capacity());
    }
}