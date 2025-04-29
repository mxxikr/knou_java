package thetenth;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelReadMain {
    public static void main(String args[]) throws IOException {
        Path path = Paths.get("C:\\Users\\user\\Documents\\file.txt");

        FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ); // 파일 읽기 모드로 열기
        ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024); // 1MB 크기의 버퍼 생성
        Charset charset = Charset.defaultCharset(); // 기본 문자셋
        StringBuffer sb = new StringBuffer(); // StringBuffer를 사용하여 문자열을 저장
        int byteCount; // 읽은 바이트 수

        while ((byteCount = fileChannel.read(buffer)) >= 0) {
            buffer.flip(); // 버퍼의 읽기 모드로 전환
            sb.append(charset.decode(buffer)); // 바이트 버퍼를 문자열로 변환하여 StringBuffer에 추가
            buffer.clear(); // 버퍼를 초기화
        }

        System.out.println(sb);

        fileChannel.close();
    }
}
