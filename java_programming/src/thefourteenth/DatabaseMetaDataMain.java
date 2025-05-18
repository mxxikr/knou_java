package thefourteenth;
import java.sql.*;

public class DatabaseMetaDataMain {
    public static void main(String[] args) {
        // MariaDB 데이터베이스 연결 정보 설정
        String url = "jdbc:mariadb://localhost:3306/world"; // 데이터베이스 URL
        String user = "root";                              // 데이터베이스 사용자 이름
        String pass = "root";                              // 데이터베이스 비밀번호

        // JDBC 드라이버 로드
        try {
            Class.forName("org.mariadb.jdbc.Driver"); // 드라이버 클래스 로드
        } catch (Exception ex) {
            System.out.println(ex); // 예외 발생 시 출력
        }

        // 데이터베이스 연결과 메타데이터 확인
        try (Connection conn = DriverManager.getConnection(url, user, pass)) { // DB 연결
            // 데이터베이스 메타데이터 추출 및 출력
            System.out.println(conn.getMetaData().getDriverName());    // JDBC 드라이버 이름
            System.out.println(conn.getMetaData().getDriverVersion()); // JDBC 드라이버 버전
            System.out.println(conn.getMetaData().getURL());           // 연결 중인 URL
            System.out.println(conn.getMetaData().getUserName());      // 연결된 사용자 이름
        } catch (Exception ex) {
            System.out.println(ex); // 연결 또는 메타데이터 작업 시 발생한 예외 출력
        }
    }
}
