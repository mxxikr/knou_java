package thefourteenth;
import java.sql.*;

public class ResultSetMetaDataMain {
    public static void main(String[] args) {
        // MariaDB 데이터베이스 연결 정보 설정
        String url = "jdbc:mariadb://localhost:3306/world"; // 데이터베이스 URL
        String user = "root";                              // 데이터베이스 사용자 이름
        String pass = "root";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM city limit 0, 50")) {
            ResultSetMetaData rsmd = rs.getMetaData(); // ResultSet 메타데이터 가져오기
            int colCount = rsmd.getColumnCount();

            // 컬럼 이름 출력
            for (int i = 1; i <= colCount; i++) {
                System.out.print(rsmd.getColumnName(i) + (i < colCount ? ", " : ""));
            }
            System.out.println();

            // 결과 출력
            while (rs.next()) {
                for (int i = 1; i <= colCount; i++) {
                    switch (rsmd.getColumnType(i)) {
                        case Types.INTEGER:
                            System.out.print(rs.getInt(i) + (i < colCount ? ", " : ""));
                            break;
                        case Types.VARCHAR: // VARCHAR 타입 처리
                        case Types.CHAR:    // CHAR 타입 처리
                            System.out.print(rs.getString(i) + (i < colCount ? ", " : ""));
                            break;
                        default: // 기본적으로 문자열로 처리
                            System.out.print(rs.getString(i) + (i < colCount ? ", " : ""));
                            break;
                    }
                }
                System.out.println();
            }
        } catch (SQLException e) {
            // SQL 오류 발생 시 예외 출력
            e.printStackTrace();
        }
    }
}
