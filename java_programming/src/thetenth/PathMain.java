package thetenth;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.Iterator;

public class PathMain {
    public static void main(String[] args) {
        // Path 객체 생성
        Path path = Paths.get("C:/Users/user/Documents/pathTest.txt");

        // compareTo
        Path anotherPath = Paths.get("C:/Users/user/Documents/pathTest2.txt");
        int comparisonResult = path.compareTo(anotherPath);
        System.out.println("compareTo 결과: " + (comparisonResult == 0 ? "같음" : "다름"));

        // getFileName()
        System.out.println("파일 이름: " + path.getFileName());

        // getFileSystem()
        System.out.println("FileSystem 객체: " + path.getFileSystem());

        // getName(int index)
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println("경로의 원소 [" + i + "]: " + path.getName(i));
        }

        // getNameCount()
        System.out.println("경로의 원소 개수: " + path.getNameCount());

        // getParent()
        System.out.println("부모 경로: " + path.getParent());

        // getRoot()
        System.out.println("루트 디렉터리: " + path.getRoot());

        // iterator()
        System.out.println("Iterator로 경로 탐색:");
        Iterator<Path> iterator = path.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // toFile()
        File file = path.toFile();
        System.out.println("File 객체로 변환: " + file.getAbsolutePath());

        // toString()
        System.out.println("Path를 문자열로 변환: " + path.toString());
    }

}
