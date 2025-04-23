
package mysql;

import logica.Roupa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoupaBD {
     public static int inserirRoupa(Roupa roupa) {
        try {
            String sql = "INSERT INTO roupa (codigo_referencia, preco_revenda, preco_compra, tamanho, tipo, marca, categoria_etaria,cor,genero_da_roupa, material, quantidade_estoque) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setInt(1, roupa.getCodigoReferencia());
            preparedStatement.setDouble(2, roupa.getPrecoDeVenda());
            preparedStatement.setDouble(3, roupa.getPrecoDeCusto());
            preparedStatement.setString(4, roupa.getTamanho());
            preparedStatement.setString(5, roupa.getTipo());
            preparedStatement.setString(6,roupa.getMarca());
            preparedStatement.setString(7,roupa.getCategoriaEtaria());
            preparedStatement.setString(8,roupa.getCor());
            preparedStatement.setString(9,roupa.getGeneroDaRoupa());
            preparedStatement.setString(10,roupa.getMaterial());
            preparedStatement.setInt(11,roupa.getQuantidadeDeEstoque());
            int linhasAfetadas = preparedStatement.executeUpdate();
            preparedStatement.close();
            ConexaoMySql.getConexao().close();
            return  linhasAfetadas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int removerRoupa(int codigoReferencia) {
        try {
            String sql = "DELETE FROM roupa WHERE codigo_referencia = ?";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setInt(1, codigoReferencia);
            int linhasAfetadas = preparedStatement.executeUpdate();
            preparedStatement.close();
            ConexaoMySql.getConexao().close();
            return  linhasAfetadas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int alterarDadosDaRoupa(Roupa roupa) {
        try {
            String sql = "UPDATE roupa SET preco_revenda = ?, preco_compra = ?, tamanho = ?, tipo = ?,  marca = ?,categoria_etaria = ?, cor = ?,  genero_da_roupa = ?,  material = ?, quantidade_estoque = ? WHERE codigo_referencia = ?;";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setDouble(1, roupa.getPrecoDeVenda());
            preparedStatement.setDouble(2,roupa.getPrecoDeCusto());
            preparedStatement.setString(3,roupa.getTamanho());
            preparedStatement.setString(4,roupa.getTipo());
            preparedStatement.setString(5,roupa.getMarca());
            preparedStatement.setString(6,roupa.getCategoriaEtaria());
            preparedStatement.setString(7,roupa.getCor());
            preparedStatement.setString(8,roupa.getGeneroDaRoupa());
            preparedStatement.setString(9,roupa.getMaterial());
            preparedStatement.setInt(10, roupa.getQuantidadeDeEstoque());
            preparedStatement.setInt(11, roupa.getCodigoReferencia());
            
            int linhasAfetadas = preparedStatement.executeUpdate(); 
            preparedStatement.close();
            ConexaoMySql.getConexao().close();
            return linhasAfetadas;
         }catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
       
    }
    public static Roupa selecionarRoupa(int codigoReferencia) {
        try {
            String sql = "SELECT * FROM roupa WHERE codigo_referencia = ?";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setInt(1, codigoReferencia);
            ResultSet resultSet = preparedStatement.executeQuery();
            Roupa roupa = null;
            if (resultSet.next()) {
                roupa = criarRoupaDoBanco(resultSet);
            }
            resultSet.close();
            ConexaoMySql.getConexao().close();
            return roupa;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static int pegarIdRoupa(int codigoReferencia) {
        try {
            String sql = "SELECT id_roupa FROM roupa WHERE codigo_referencia = ?";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setInt(1, codigoReferencia);
            ResultSet resultSet = preparedStatement.executeQuery();
            int idRoupa = 0;
            if (resultSet.next()) {
                idRoupa = resultSet.getInt("id_roupa");
            }
            resultSet.close();
            ConexaoMySql.getConexao().close();
            return idRoupa;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int pegarRefRoupa(int id_roupa) {
        try {
            String sql = "SELECT codigo_referencia FROM roupa WHERE id_roupa = ?";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            preparedStatement.setInt(1, id_roupa);
            ResultSet resultSet = preparedStatement.executeQuery();
            int codigoRef = 0;
            if (resultSet.next()) {
                codigoRef = resultSet.getInt("codigo_referencia");
            }
            resultSet.close();
            ConexaoMySql.getConexao().close();
            return codigoRef;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
            
    public static List<Roupa> selecionarTodasAsRoupas() {
        try {
            String sql = "SELECT * FROM roupa";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(); 
            
            List<Roupa> listaDeRoupas = new ArrayList<Roupa>();
            
            while (resultSet.next()) {
               Roupa roupa = criarRoupaDoBanco(resultSet);
               listaDeRoupas.add(roupa);

            }
            resultSet.close();
            preparedStatement.close();
            ConexaoMySql.getConexao().close();
            return listaDeRoupas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Roupa criarRoupaDoBanco(ResultSet resultSet) {
        try {
            int idRoupa = resultSet.getInt("id_roupa");
            int codigoReferencia = resultSet.getInt("codigo_referencia");
            double precoRevenda= resultSet.getDouble("preco_revenda");
            double precoDaCompra = resultSet.getDouble("preco_compra");
            String tamanho = resultSet.getString("tamanho");
            String tipo= resultSet.getString("tipo");
            String marca= resultSet.getString("marca");
            String categoriaEtaria= resultSet.getString("categoria_etaria");
            String cor= resultSet.getString("cor");
            String generoDaRoupa= resultSet.getString("genero_da_roupa");
            String material= resultSet.getString("material");
            int quantidadeDeEstoque= resultSet.getInt("quantidade_estoque");
            Roupa roupa = new Roupa(codigoReferencia,precoRevenda,precoDaCompra,tamanho,tipo,marca,categoriaEtaria,cor,generoDaRoupa,material,quantidadeDeEstoque);
            return roupa;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static ResultSet carregarCBTipo() throws SQLException {
        try {
            String sql = "SELECT tipo FROM roupa ORDER BY tipo ASC;";
            PreparedStatement preparedStatement = ConexaoMySql.getConexao().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(); 
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}