package logica;

import java.util.ArrayList;
import java.util.Objects;

public class Cliente {
    private String nomeCompleto;
        private int cpf;
        private String email;
        private String genero;
        private int telefone;
        private String dataDeNascimento;
        private int fkIdRoupa;
        private ArrayList<Cliente> listaDeClientes;

        public Cliente(String nomeCompleto, int cpf, String email, String genero, int telefone, String dataDeNascimento, int fkIdRoupa) {
            this.nomeCompleto= nomeCompleto;
            this.cpf= cpf;
            this.email= email;
            this.genero= genero;
            this.telefone= telefone;
            this.dataDeNascimento= dataDeNascimento;
            this.fkIdRoupa = fkIdRoupa;
            listaDeClientes= new ArrayList<Cliente>();
        }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto= nomeCompleto;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public int getFkIdRoupa() {
        return fkIdRoupa;
    }
    
    public void setFkIdRoupa (int fkIdRoupa) {
        this.fkIdRoupa = fkIdRoupa;
    }

    public ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public void adicionarCliente(Cliente cliente){
        if (!Objects.equals(cliente, null)) {
            listaDeClientes.add(cliente);
        }
    }
    public Cliente pesquisarCliente(int cpf){
            for (int i = 0; i <= listaDeClientes.size() - 1; i++){
                Cliente cliente = listaDeClientes.get(i);
                if (cliente.getCpf() == cpf){
                    return cliente;
                }
            }
            return null;
    }

    public void removerCliente(int cpf){
            Cliente cliente = pesquisarCliente(cpf);
        if (!Objects.equals(cliente,null)) {
            listaDeClientes.remove(cliente);
        }
    }
    public void alterarDadosDoCliente(int cpf, String nomeCompleto, String email, String genero, int telefone, String dataDeNascimento, int fkIdRoupa){
            Cliente cliente= pesquisarCliente(cpf);
        if (!Objects.equals(cliente,null)) {
            cliente.setCpf(cpf);
            cliente.setNomeCompleto(nomeCompleto);
            cliente.setEmail(email);
            cliente.setGenero(genero);
            cliente.setTelefone(telefone);
            cliente.setDataDeNascimento(dataDeNascimento);
            cliente.setFkIdRoupa(fkIdRoupa);
        }

    }

    @Override
        public String toString() {
            return "Cliente {" +
                    "Nome completo: " + nomeCompleto +
                    " | CPF: " + cpf +
                    " | E-mail:  " + email +
                    "\n | Gênero: " + genero +
                    " | Telefone: " + telefone +
                    " | Data de nascimento: " + dataDeNascimento +
                    " | Roupa comprada: " + fkIdRoupa +
                    "}";
        }
}
