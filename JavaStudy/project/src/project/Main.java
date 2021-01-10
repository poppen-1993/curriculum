package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	/* 定数 */
	/** ドライバーのクラス名 */
	private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
	/** ・JDMC接続先情報 */
	private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/lesson_db";
	/** ・ユーザー名 */
	private static final String USER = "postgres";
	/** ・パスワード */
	private static final String PASS = "1342727";

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName(POSTGRES_DRIVER);
			connection = DriverManager.getConnection(JDBC_CONNECTION,USER,PASS);
			statement = connection.createStatement();

			String SQL = "INSERT INTO tb_shohin(SHOHIN_ID, SHOHIN_NAME, TANKA) VALUES( ?, ?, ?) ";
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);

			for (int i = 23; i < 30; i++) {
			 preparedStatement.setInt(1, 0 + i);
			 preparedStatement.setString(2, "SHOHIN" + i);
			 preparedStatement.setInt(3, i + 00);
			 preparedStatement.executeUpdate();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}