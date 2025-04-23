package mysql;

import logica.Funcionario;
import java.sql.*;
import java.util.ArrayList;

public class FuncionarioBD {
    public static int inserirFuncionario(Funcionario funcionario) {
        try {
            String sql = "INSERT INTO funcionario (nome_completo, email, senha, funcao, CPF, endereco_de_cracha, salario, telefone) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setString(1, funcionario.getNomeCompleto());
            preparedStatement.setString(2, funcionario.getEmail());
            preparedStatement.setString(3, funcionario.getSenha());
            preparedStatement.setString(4, funcionario.getFuncao());
            preparedStatement.setInt(5,funcionario.getCpf());
            preparedStatement.setInt(6,funcionario.getEnderecoDeCracha());
            preparedStatement.setDouble(7,funcionario.getSalario());
            preparedStatement.setInt(8, funcionario.getTelefone());
            int linhasAfetadas = preparedStatement.executeUpdate();
            preparedStatement.close();
            ConexaoMySql.getConexao().close();
            return  linhasAfetadas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int removerFuncionario(int enderecoDeCracha) {
        try {
            String sql = "DELETE FROM funcionario WHERE endereco_de_cracha = ?";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setInt(1, enderecoDeCracha);
            int linhasAfetadas = preparedStatement.executeUpdate();
            preparedStatement.close();
            ConexaoMySql.getConexao().close();
            return  linhasAfetadas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int alterarDadosDoFuncionario (Funcionario funcionario) {
        try {
            String sql = "UPDATE funcionario SET nome_completo = ?, email = ?, senha = ?,funcao = ?, cpf = ?, salario = ?, telefone = ? WHERE endereco_de_cracha = ?;";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setString(1, funcionario.getNomeCompleto());
            preparedStatement.setString(2, funcionario.getEmail());
            preparedStatement.setString(3, funcionario.getSenha());
            preparedStatement.setString(4, funcionario.getFuncao());
            preparedStatement.setInt(5, funcionario.getCpf());
            preparedStatement.setDouble(6,funcionario.getSalario());
            preparedStatement.setInt(7,funcionario.getTelefone());
            preparedStatement.setInt(8, funcionario.getEnderecoDeCracha());
            
            int linhasAfetadas = preparedStatement.executeUpdate();
            preparedStatement.close();
            ConexaoMySql.getConexao().close();
            return linhasAfetadas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static Funcionario selecionarFuncionario(int enderecoDeCracha) {
        try {
            String sql = "SELECT * FROM funcionario WHERE endereco_de_cracha = ?;";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setInt(1, enderecoDeCracha);
            ResultSet resultSet = preparedStatement.executeQuery();
            Funcionario funcionario= null;
            if (resultSet.next()) {
                funcionario = criarFuncionarioDoBanco(resultSet);
            }
            resultSet.close();
            ConexaoMySql.getConexao().close();
            return funcionario;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static ArrayList<Funcionario> selecionarTodosOsFuncionarios() {
        try {
            String sql = "SELECT * FROM funcionario";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();
            while (resultSet.next()) {
                Funcionario funcionario = criarFuncionarioDoBanco(resultSet);
                listaDeFuncionarios.add(funcionario);
            }
            resultSet.close();
            preparedStatement.close();
            ConexaoMySql.getConexao().close();
            return listaDeFuncionarios;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static Funcionario criarFuncionarioDoBanco(ResultSet resultSet) {
        try {
            String nomeCompleto = resultSet.getString("nome_completo");
            String email = resultSet.getString("email");
            String senha = resultSet.getString("senha");
            String funcao = resultSet.getString("funcao");
            int cpf = resultSet.getInt("CPF");
            int enderecoDeCracha= resultSet.getInt("endereco_de_cracha");
            double salario = resultSet.getDouble("salario");
            int telefone = resultSet.getInt("telefone");
            Funcionario funcionario = new Funcionario(nomeCompleto,  email, senha, funcao, cpf, enderecoDeCracha, salario, telefone);
            return funcionario;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}