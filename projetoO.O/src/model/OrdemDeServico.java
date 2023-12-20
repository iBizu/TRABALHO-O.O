package model;

public class OrdemDeServico {

    private String tempo_realizacao;
    private String manutencao;
    private String pecas_substituidas;
    private String servicos;
    private String data;
    private Mecanico mecanico;
    private long codigo;
    private double preco;
    private Cliente cliente;

    public OrdemDeServico(String tempo_realizacao, String manutecao, String pecas_substituidas, String servicos,
            String data, Mecanico mecanico, long codigo, double preco, Cliente cliente) {
        this.tempo_realizacao = tempo_realizacao;
        this.manutencao = manutecao;
        this.pecas_substituidas = pecas_substituidas;
        this.servicos = servicos;
        this.data = data;
        this.mecanico = mecanico;
        this.codigo = codigo;
        this.preco = preco;
        this.cliente = cliente;

    }

    public OrdemDeServico() {

    }

    public Cliente getCliente() {
        return cliente;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public String getManutencao() {
        return manutencao;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public String getPecas_substituidas() {
        return pecas_substituidas;
    }

    public double getPreco() {
        return preco;
    }

    public String getServicos() {
        return servicos;
    }

    public String getTempo_realizacao() {
        return tempo_realizacao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setManutencao(String manutencao) {
        this.manutencao = manutencao;
    }

    public void setNomeMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public void setPecas_substituidas(String pecas_substituidas) {
        this.pecas_substituidas = pecas_substituidas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setServicos(String servicos) {
        this.servicos = servicos;
    }

    public void setTempo_realizacao(String tempo_realizacao) {
        this.tempo_realizacao = tempo_realizacao;
    }

    @Override
    public String toString() {

        return "Tempo de Realização:" + tempo_realizacao + "\nNome manutenção:" + manutencao + "\nPeças substituidas: "
                + pecas_substituidas + "\nServiços: " + servicos + "\nData:" + data
                + "\nMecanico: " + mecanico.toString() + "\nCodigo: " + codigo + "\nPreço: " + preco + "\nCliente: "
                + cliente.toString();

    }

}
