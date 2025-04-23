package mysql;

import logica.Cliente;

import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class ClienteBD {
     public static int inserirCliente(Cliente cliente) {
        try {
            String sql = "INSERT INTO cliente (nome_completo, CPF, email, genero,telefone,data_de_nascimento, fk_id_roupa) VALUES (?, ?, ?, ?, ?, ?, ?)";
            int linhasAfetadas;
            try (PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql)) {
                preparedStatement.setString(1, cliente.getNomeCompleto());
                preparedStatement.setInt(2, cliente.getCpf());
                preparedStatement.setString(3, cliente.getEmail());
                preparedStatement.setString(4, cliente.getGenero());
                preparedStatement.setInt(5,cliente.getTelefone());
                preparedStatement.setString(6,cliente.getDataDeNascimento());
                preparedStatement.setInt(7, cliente.getFkIdRoupa());
                linhasAfetadas = preparedStatement.executeUpdate();
            }
            ConexaoMySql.getConexao().close();
            return  linhasAfetadas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int removerCliente(int cpf) {
        try {
            String sql = "DELETE FROM cliente WHERE CPF = ?";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setInt(1, cpf);
            int linhasAfetadas = preparedStatement.executeUpdate();
            preparedStatement.close();
            ConexaoMySql.getConexao().close();
            return  linhasAfetadas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int alterarDadosCliente(Cliente cliente) {
        try {
            String sql = "UPDATE cliente SET nome_completo = ?,  email = ?,  genero = ? , telefone = ?,  data_de_nascimento = ?, fk_id_roupa = ? WHERE CPF = ?";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNomeCompleto());
            preparedStatement.setString(2,cliente.getEmail());
            preparedStatement.setString(3,cliente.getGenero());
            preparedStatement.setInt(4,cliente.getTelefone());
            preparedStatement.setString(5,cliente.getDataDeNascimento());
            preparedStatement.setInt(6, cliente.getFkIdRoupa());
            preparedStatement.setInt(7, cliente.getCpf());
            int linhasAfetadas = preparedStatement.executeUpdate();
            preparedStatement.close();
            ConexaoMySql.getConexao().close();

            return linhasAfetadas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static Cliente selecionarCliente(int cpf) {
        try {
            String sql = "SELECT * FROM cliente WHERE CPF = ?;";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setInt(1, cpf);
            ResultSet resultSet = preparedStatement.executeQuery();
            Cliente cliente = null;
            if (resultSet.next()) {
                cliente = criarClienteDoBanco(resultSet);
            }
            resultSet.close();
            ConexaoMySql.getConexao().close();
            return cliente;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static List<Cliente> selecionarTodosOsClientes() {
        try {
            String sql = "SELECT * FROM cliente";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            List<Cliente> listaDeClientes = new ArrayList<Cliente>();
            
            while (resultSet.next()) {
                Cliente cliente = criarClienteDoBanco(resultSet);
                listaDeClientes.add(cliente);
            }
            resultSet.close();
            preparedStatement.close();
            ConexaoMySql.getConexao().close();
            return listaDeClientes;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Cliente criarClienteDoBanco(ResultSet resultSet) {
        try {
            String nomeCompleto = resultSet.getString("nome_completo");
            int cpf = resultSet.getInt("cpf");
            String email = resultSet.getString("email");
            String genero = resultSet.getString("genero");
            int telefone= resultSet.getInt("telefone");
            String dataDeNascimento = resultSet.getString("data_de_nascimento");
            int fkIdRoupa = resultSet.getInt("fk_id_roupa");
            Cliente cliente = new Cliente(nomeCompleto,cpf,email,genero,telefone,dataDeNascimento, fkIdRoupa);
            return cliente;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
