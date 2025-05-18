package thefourteenth;

import java.sql.*;

public class MariaDBConnectMain {
    public static void main(String[] args) {
        // MariaDB 데이터베이스 연결 정보 설정
        String url = "jdbc:mariadb://localhost:3306/world"; // DB URL
        String user = "root";                              // DB 계정 사용자 이름
        String pass = "root";                           // DB 계정 비밀번호

        // try-with-resources를 사용하여 데이터베이스 연결, 쿼리 실행, 결과 처리
        try (Connection conn = DriverManager.getConnection(url, user, pass); // DB 연결 생성
            Statement stmt = conn.createStatement(); // 쿼리를 실행할 객체 생성
            ResultSet rs = stmt.executeQuery("SELECT * FROM city limit 0, 50")) { // 쿼리 실행
            ResultSet rs2 = null;
            if (stmt.execute("SELECT * FROM city limit 0, 100")) {
                rs2 = stmt.getResultSet();
                System.out.println("rs2 metadata count : " + rs2.getMetaData().getColumnCount()); // rs2의 메타데이터에서 컬럼 수 출력
                System.out.println("rs2 metadata column name : "
                    + rs2.getMetaData().getColumnName(1) + ", "
                    + rs2.getMetaData().getColumnName(2) + ", "
                    + rs2.getMetaData().getColumnName(3) + ", "
                    + rs2.getMetaData().getColumnName(4) + ", "
                    + rs2.getMetaData().getColumnName(5)); // rs2의 메타데이터에서 컬럼 이름 출력
            }
            // 결과 출력 시, 헤더(컬럼 제목) 형식 지정 및 출력
            System.out.println(String.format("%-10s", "ID") +
                    String.format("%-35s", "Name") +
                    String.format("%-15s", "CountryCode") +
                    String.format("%-20s", "District") +
                    String.format("%-11s", "Population"));

            // ResultSet으로 조회된 결과를 반복하여 한 행씩 출력
            while (rs.next()) {
                // 각 컬럼 값을 읽어서 정렬된 형식으로 출력
                System.out.print(String.format("%-10d", rs.getInt("ID")));            // ID 컬럼
                System.out.print(String.format("%-35s", rs.getString("Name")));      // Name 컬럼
                System.out.print(String.format("%-15s", rs.getString("CountryCode")));// CountryCode 컬럼
                System.out.print(String.format("%-20s", rs.getString("District")));  // District 컬럼
                System.out.println(String.format("%-11d", rs.getInt("Population"))); // Population 컬럼
            }
        } catch (SQLException e) {
            // SQLException 발생 시 런타임 예외로 변환
            throw new RuntimeException(e);
        }
    }
}