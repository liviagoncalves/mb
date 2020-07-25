package persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Produto;

public class ProdutoDAO {
    private Connection conexao;

    public ProdutoDAO() {
        try {
            conexao = Conexao.criarConexao();
        } catch (Exception e) {
            System.out.println("Erro ProdutoDAO");
            System.out.println(e);
        }
    }
    
    public ArrayList<Produto>getLista(){
        ArrayList<Produto> resultado = new ArrayList<>();
        FornecedorDAO fDAO = new FornecedorDAO();
        CategoriaDAO catDAO = new CategoriaDAO();
        CorDAO corDAO = new CorDAO();
        TamanhoDAO tDAO = new TamanhoDAO();
        MarcaDAO mDAO = new MarcaDAO();
        try {
            String sql = "SELECT * FROM produto";
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {                
                Produto p = new Produto();
                p.setIdproduto(rs.getInt("idproduto"));
                p.setNome(rs.getString("nome"));
                p.setVlr_compra(rs.getDouble("vlr_compra"));
                p.setVlr_venda(rs.getDouble("vlr_venda"));
                p.setEstoque(rs.getInt("estoque"));
                
                p.setFornecedor(fDAO.getFornecedorPorIdFornecedor(rs.getInt("idfornecedor")));
                p.setCategoria(catDAO.getCategoriaPorIdCategoria(rs.getInt("idcategoria")));
                p.setCor(corDAO.getCorPorIdCor(rs.getInt("idcor")));
                p.setTamanho(tDAO.getTamanhoPorIdTamanho(rs.getInt("idtamanho")));
                p.setMarca(mDAO.getMarcaPorIdMarca(rs.getInt("idmarca")));
                resultado.add(p);
            }
        } catch (Exception e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return resultado;
    }
}
