package model;
public class Produto {
    private int idproduto;
    private String nome;
    private double vlr_compra;
    private double vlr_venda;
    private int estoque;
    private Fornecedor fornecedor;
    private Categoria categoria;
    private Cor cor;
    private Tamanho tamanho;
    private Marca marca;

    public Produto() {
    }

    public Produto(int idproduto, String nome, double vlr_compra, double vlr_venda, int estoque, Fornecedor fornecedor, Categoria categoria, Cor cor, Tamanho tamanho, Marca marca) {
        this.idproduto = idproduto;
        this.nome = nome;
        this.vlr_compra = vlr_compra;
        this.vlr_venda = vlr_venda;
        this.estoque = estoque;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
        this.cor = cor;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVlr_compra() {
        return vlr_compra;
    }

    public void setVlr_compra(double vlr_compra) {
        this.vlr_compra = vlr_compra;
    }

    public double getVlr_venda() {
        return vlr_venda;
    }

    public void setVlr_venda(double vlr_venda) {
        this.vlr_venda = vlr_venda;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
}
