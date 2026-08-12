package bancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaDAO {
    private Connection connection;
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;

    public void Categoria() {
        this.connection = new Conexao().conectar();
    }

    // inserir um registro na tabela java_categoria
    public void inserir(Categoria categoria) {
        sql = "insert into java_categoria(categoria) values (?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, categoria.getCategoria());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
