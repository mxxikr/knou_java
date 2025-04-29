package thetenth;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.UserPrincipal;

public class FilesMain {
    public static void main(String[] args) {
        try {
            // Path 참조 생성 (작업할 파일 및 디렉터리 경로)
            Path filePath = Paths.get("example.txt");
            Path directoryPath = Paths.get("exampleDir");
            Path newFilePath = Paths.get("example_copy.txt");
            Path newDirectoryPath = Paths.get("newExampleDir");

            // 파일 쓰기 (write 메서드 사용)
            byte[] content = "Hello, World!".getBytes(); // 내용을 Byte 배열로 변환
            Files.write(filePath, content); // 파일에 바이트 쓰기
            System.out.println("파일 작성 완료: " + filePath);

            // 파일 읽기 (readAllBytes 메서드 사용)
            byte[] readContent = Files.readAllBytes(filePath); // 파일 내용을 바이트 배열로 읽음
            System.out.println("파일 읽기 완료: " + new String(readContent)); // 읽은 내용 출력

            // 디렉터리 생성 (createDirectory)
            Files.createDirectory(directoryPath); // 디렉터리 생성
            System.out.println("디렉터리 생성 완료: " + directoryPath);

            // 파일인지 확인 (isRegularFile)
            System.out.println(filePath + "는 파일인가요? " + Files.isRegularFile(filePath));

            // 디렉터리인지 확인 (isDirectory)
            System.out.println(directoryPath + "는 디렉터리인가요? " + Files.isDirectory(directoryPath));

            // 파일 복사 (copy)
            Files.copy(filePath, newFilePath, StandardCopyOption.REPLACE_EXISTING); // 파일 복사 (+ 덮어쓰기 옵션)
            System.out.println("파일 복사 완료: " + newFilePath);

            // 파일 이동 (move)
            Files.move(newFilePath, Paths.get("moved_example.txt"), StandardCopyOption.REPLACE_EXISTING); // 파일 이동
            System.out.println("파일 이동 완료: moved_example.txt");

            // 파일 크기 확인 (size)
            long fileSize = Files.size(filePath); // 파일 크기 확인
            System.out.println("파일 크기: " + fileSize + " bytes");

            // 파일 소유자 정보 확인 (getOwner)
            UserPrincipal owner = Files.getOwner(filePath); // 소유자 정보 조회
            System.out.println("파일 소유자: " + owner.getName());

            // 디렉터리 이동 (move)
            Files.move(directoryPath, newDirectoryPath, StandardCopyOption.REPLACE_EXISTING); // 디렉터리 이동
            System.out.println("디렉터리 이동 완료: " + newDirectoryPath);

            // 파일 삭제 (delete)
            Files.delete(filePath); // 원본 파일 삭제
            Files.delete(Paths.get("moved_example.txt")); // 이동된 파일 삭제
            System.out.println("파일 삭제 완료");

            // 디렉터리 삭제 (delete)
            Files.delete(newDirectoryPath); // 디렉터리 삭제
            System.out.println("디렉터리 삭제 완료");

        } catch (FileAlreadyExistsException e) {
            System.err.println("이미 존재하는 파일 또는 디렉터리입니다: " + e.getMessage());
        } catch (NoSuchFileException e) {
            System.err.println("파일 또는 디렉터리를 찾을 수 없습니다: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("입출력 오류가 발생했습니다: " + e.getMessage());
        }
    }
}