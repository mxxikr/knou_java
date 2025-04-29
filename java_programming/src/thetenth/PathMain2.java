package thetenth;
import java.util.*;
import java.nio.file.*;

public class PathMain2 {
    public static void main(String args[]) {
        try {
            Path path = Paths.get("C:\\windows\\system32\\drivers\\etc\\hosts");

            System.out.println("파일 이름 : " + path.getFileName());
            System.out.println("상위 폴더 : " + path.getParent().getFileName());
            System.out.println("경로 길이 : " + path.getNameCount());

            System.out.print("현재 경로 : ");
            for (int i = 0; i < path.getNameCount(); i++)
                System.out.print(path.getName(i) + "\\");

            Iterator<Path> it = path.iterator(); // Iterator를 사용하여 경로를 순회
            System.out.print("\n현재 경로 : ");
            while (it.hasNext())
                System.out.print(it.next().getFileName() + "\\");
            System.out.println();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}