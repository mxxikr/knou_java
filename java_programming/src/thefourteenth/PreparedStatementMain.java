package thefourteenth;
import java.sql.*;

public class PreparedStatementMain {
    public static void main(String[] args) {
        // MariaDB 데이터베이스 연결 정보 설정
        String url = "jdbc:mariadb://localhost:3306/world"; // 데이터베이스 URL
        String user = "root";                              // 데이터베이스 사용자 이름
        String pass = "root";

        try {
            // 데이터베이스 연결 생성
            Connection conn = DriverManager.getConnection(url, user, pass);

            // city 테이블에서 조회할 쿼리문 작성
            String query = "SELECT * FROM city WHERE Name = ? AND Population > ?";

            // PreparedStatement를 사용해 동적으로 파라미터를 설정
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "Kabul");   // 첫 번째 조건: Name = 'Kabul
            ps.setInt(2, 1000);        // 두 번째 조건: Population > 1000

            // 쿼리 실행
            ResultSet rs = ps.executeQuery();

            // 결과 출력
            while (rs.next()) {
                int id = rs.getInt("ID");                     // ID 컬럼 값
                String name = rs.getString("Name");           // Name 컬럼 값
                String countryCode = rs.getString("CountryCode"); // CountryCode 컬럼 값
                String district = rs.getString("District");   // District 컬럼 값
                int population = rs.getInt("Population");     // Population 컬럼 값

                // 결과 출력
                System.out.printf("ID: %d, Name: %s, CountryCode: %s, District: %s, Population: %d\n",
                        id, name, countryCode, district, population);
            }
        } catch (SQLException e) {
            // SQL 오류 발생 시 예외 출력
            throw new RuntimeException(e);
        }
    }
}
