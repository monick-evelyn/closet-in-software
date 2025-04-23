package logica;

import java.util.ArrayList;
import java.util.Objects;

public class Funcionario {
     private String nomeCompleto;
    private String email;
    private String senha;
    private String funcao;
    private int cpf;
    private int enderecoDeCracha;
    private double salario;
    private int telefone;
    private ArrayList<Funcionario> listaDeFuncionarios;

    public Funcionario(String nomeCompleto, String email, String senha, String funcao, int cpf, int enderecoDeCracha, double salario,int telefone) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.funcao = funcao;
        this.cpf = cpf;
        this.enderecoDeCracha = enderecoDeCracha;
        this.salario = salario;
        this.telefone = telefone;
        listaDeFuncionarios = new ArrayList<Funcionario>();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getEnderecoDeCracha() {
        return enderecoDeCracha;
    }

    public void setEnderecoDeCracha(int enderecoDeCracha) {
        this.enderecoDeCracha = enderecoDeCracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(ArrayList<Funcionario> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    @Override
    public String toString() {
        return "Funcionário {" +
                "Nome completo: " + nomeCompleto  +
                " | E-mail: " + email  +
                " | Senha: " + senha +
                " | Função: " + funcao  +
                "\n | CPF: " + cpf +
                " | Endereço de crachá: " + enderecoDeCracha +
                " | Salário: R$ " + salario +
                " | Telefone: " + telefone +
                "}";
    }

    public void adicionarFuncionario(Funcionario funcionario){
        if (!Objects.equals(funcionario,null)) {
            listaDeFuncionarios.add(funcionario);
        }
    }
    public Funcionario pesquisarFuncionario(int enderecoDeCracha){
        for (int i = 0; i <= listaDeFuncionarios.size()-1; i++){
            Funcionario funcionario = listaDeFuncionarios.get(i);
            if (funcionario.getEnderecoDeCracha() == enderecoDeCracha){
                return funcionario;
            }
        }
        return null;
    }
    public void removerFuncionario(int enderecoDeCracha){
        Funcionario funcionario = pesquisarFuncionario(enderecoDeCracha);
        if (!Objects.equals(funcionario,null)){
            listaDeFuncionarios.remove(funcionario);
        }
    }
    public void alterarDadosDoFuncionario(int enderecoDeCracha){
        Funcionario funcionario = pesquisarFuncionario(enderecoDeCracha);
        if (!Objects.equals(funcionario,null)) {
            funcionario.setNomeCompleto(nomeCompleto);
            funcionario.setEmail(email);
            funcionario.setSenha(senha);
            funcionario.setFuncao(funcao);
            funcionario.setCpf(cpf);
            funcionario.setEnderecoDeCracha(enderecoDeCracha);
            funcionario.setSalario(salario);
            funcionario.setTelefone(telefone);

        }

    }
}