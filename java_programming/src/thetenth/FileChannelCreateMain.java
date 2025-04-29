package thetenth;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelCreateMain {
    public static void main(String args[]) throws IOException {
        String[] data = { "안녕하세요, 여러분",
                "Java 프로그래밍 언어의 세계로 오신 것을 환영합니다.",
                "JDK를 설치하는 방법에서부터 ",
                "Java 프로그램을 compile하고 실행시키는 ",
                "모든 방법에 대해 공부해봅시다."
        };

        Path path = Paths.get("C:\\Users\\user\\Documents\\file.txt");

        Files.createDirectories(path.getParent()); // 디렉토리 생성

        // 파일 생성
        FileChannel fileChannel = FileChannel.open(path,
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE);

        Charset charset = Charset.defaultCharset(); // 기본 문자셋
        ByteBuffer buffer; // 바이트 버퍼

        int byteCount = 0;

        for (int i = 0; i < data.length; i++) {
            buffer = charset.encode(data[i]); // 문자열을 바이트로 변환
            byteCount = fileChannel.write(buffer); // 바이트 버퍼를 파일에 기록
        }

        System.out.println(byteCount);
        fileChannel.close();
    }
}
