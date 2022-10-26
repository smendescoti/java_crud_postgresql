package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// m�todo est�tico
	public static Connection createConnection() throws Exception {

		// Informar o DRIVER de conex�o do postgresql
		Class.forName("org.postgresql.Driver");

		// abrir e retornar a conex�o com o banco de dados
		return DriverManager.getConnection("jdbc:postgresql://localhost:5433/bd_aula04", "postgres", "coti");
	}
}
