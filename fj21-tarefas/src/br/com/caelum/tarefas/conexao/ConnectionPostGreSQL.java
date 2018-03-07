package br.com.caelum.tarefas.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionPostGreSQL {

	//Dados para a conexï¿½o com o banco
	private static final String USUARIO = "postgres";
	private static final String SENHA = "twl76789";
	private static final String STR_CONEXAO = "jdbc:postgresql://localhost:5432/fj21";
	
//	private static final Connection Conexao= getConexao();
	public static Connection getConexao() throws SQLException {

		Connection conn = null;

		try {
			
			//Class.forName("com.mysql.jdbc.Driver");
			DriverManager.deregisterDriver(new org.postgresql.Driver());
			conn = DriverManager.getConnection(STR_CONEXAO, USUARIO, SENHA);
			System.out.println("Conexão OK ");
			return conn;
		} catch (SQLException e) {
			throw new SQLException("Erro ao conectar "
					+ "com a base de dados" + e.getMessage());
		}
	}

	public static void fechaConexao(Connection conn) {

		try {
			if (conn != null) {
				conn.close();
				System.out.println("Fechada a conexão com o banco de dados");
			}

		} catch (Exception e) {
			System.out.println("Não foi possivel fechar a conexão com o banco de dados " + e.getMessage());
		}
	}

	public static void fechaConexao(Connection conn, PreparedStatement stmt) {

		try {
			if (conn != null) {
				fechaConexao(conn);
			}
			if (stmt != null) {
				stmt.close();
				System.out.println("PreparedStatement fechado com sucesso");
			}

		} catch (Exception e) {
			System.out.println("Não foi possivel fechar o statement " + e.getMessage());
		}
	}

	public static void fechaConexao(Connection conn, PreparedStatement stmt, ResultSet rs) {

		try {
			if (conn != null || stmt != null) {
				fechaConexao(conn, stmt);
			}
			if (rs != null) {
				rs.close();
				System.out.println("ResultSet fechado com sucesso");
			}


		} catch (Exception e) {
			System.out.println("Não foi possivel fechar o ResultSet " + e.getMessage());
		}
	}
	
	public static void main(String[] args) throws SQLException {
		new ConnectionPostGreSQL();
		ConnectionPostGreSQL.getConexao();
	}
}