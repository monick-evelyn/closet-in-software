package logica;

import java.util.ArrayList;
import java.util.Objects;

public class Roupa {
    private int codigoReferencia;
    private double precoDeVenda;
    private double precoDeCusto;
    private String tamanho;
    private String tipo;
    private String marca;
    private String categoriaEtaria;
    private String cor;
    private String generoDaRoupa;
    private String material;
    private int quantidadeDeEstoque;
    private ArrayList<Roupa> listaDeRoupas;

    public Roupa( int codigoReferencia, double precoDeVenda, double precoDeCusto, 
            String tamanho, String tipo, String marca, String categoriaEtaria, 
            String cor, String generoDaRoupa, String material, int quantidadeDeEstoque) {
        this.codigoReferencia = codigoReferencia;
        this.precoDeVenda = precoDeVenda;
        this.precoDeCusto = precoDeCusto;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.marca = marca;
        this.categoriaEtaria = categoriaEtaria;
        this.cor = cor;
        this.generoDaRoupa = generoDaRoupa;
        this.material = material;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
        listaDeRoupas = new ArrayList<Roupa>();
    }

    public int getCodigoReferencia() {
        return codigoReferencia;
    }

    public void setCodigoReferencia(int codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public double getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(double precoDeCusto) {this.precoDeCusto = precoDeCusto;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoriaEtaria() {
        return categoriaEtaria;
    }

    public void setCategoriaEtaria(String categoriaEtaria) {
        this.categoriaEtaria = categoriaEtaria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getGeneroDaRoupa() {
        return generoDaRoupa;
    }

    public void setGeneroDaRoupa(String generoDaRoupa) {
        this.generoDaRoupa = generoDaRoupa;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantidadeDeEstoque() {
        return quantidadeDeEstoque;
    }

    public void setQuantidadeDeEstoque(int quantidadeDeEstoque) {
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    public ArrayList<Roupa> getListaDeRoupas() {
        return listaDeRoupas;
    }

    public void setListaDeRoupas(ArrayList<Roupa> listaDeRoupas) {
        this.listaDeRoupas = listaDeRoupas;
    }

    @Override
    public String toString() {
        return "Roupa {" +
                "REF: " + codigoReferencia +
                " | Preco de venda: R$ " + precoDeVenda +
                " | Preço de custo: R$ " + getPrecoDeCusto() +
                "\n | Tamanho: " + tamanho +
                " | Tipo: " + tipo +
                " | Marca: " + marca +
                " | Categoria etária: " + categoriaEtaria +
                " | Cor: " + cor +
                "\n | Gênero da roupa: " + generoDaRoupa +
                " | Material: " + material +
                " | Quantidade de estoque: " + quantidadeDeEstoque +
                "}";
    }

    public void adicionarRoupa(Roupa roupa) {
        if (!Objects.equals(roupa,null)) {
            listaDeRoupas.add(roupa);
        }
    }
    public Roupa pesquisarRoupa(int codigoReferencia) {
        for (int i = 0; i <= listaDeRoupas.size() - 1; i++) {
            Roupa roupa = listaDeRoupas.get(i);
            if (roupa.getCodigoReferencia() == codigoReferencia) {
                return roupa;
            }
        }
        return null;
    }
    public void removerRoupa(int codigoReferencia){
      Roupa roupa= pesquisarRoupa(codigoReferencia);
      if (!Objects.equals(roupa,null)){
          listaDeRoupas.remove(roupa);
      }
    }
    public void alterarDadosDaRoupa(int codigoReferencia, double precoRevenda, double precoDaCompra, 
            String tamanho, String tipo, String marca, String categoriaEtaria, String cor, 
            String generoDaRoupa,String material, int quantidadeDeEstoque ){
        Roupa roupa= pesquisarRoupa(codigoReferencia);
        if (!Objects.equals(roupa,null)) {
            roupa.setCodigoReferencia(codigoReferencia);
            roupa.setPrecoDeVenda(precoDeVenda);
            roupa.setPrecoDeCusto(precoDeCusto );
            roupa.setTamanho(tamanho);
            roupa.setTipo(tipo);
            roupa.setMarca(marca);
            roupa.setCategoriaEtaria(categoriaEtaria);
            roupa.setCor(cor);
            roupa.setGeneroDaRoupa(generoDaRoupa);
            roupa.setMaterial(material);
            roupa.setQuantidadeDeEstoque(quantidadeDeEstoque);
        }
    }
    public static double calcularTaxaLucro(double precoDeVenda, double precoDeCusto){
        double taxaDeLucro = precoDeVenda - precoDeCusto;
        return taxaDeLucro;
    }
    
}
