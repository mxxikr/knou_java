package thetenth;
import java.nio.file.*;

public class FilesMain2 {
    public static void main(String args[]) throws Exception {
        Path path = Paths.get("C:\\Users\\user\\Documents");
        DirectoryStream<Path> ds = Files.newDirectoryStream(path); // 디렉터리 스트림 생성
        for (Path p : ds) { // 디렉터리 스트림을 통해 파일 목록을 가져옴
            if (Files.isDirectory(p)) {
                System.out.println("[디렉터리] " + p.getFileName());
            } else {
                System.out.print("[파일] " + p.getFileName());
                System.out.println(" (" + Files.size(p) + ")");
            }
        }
    }
}