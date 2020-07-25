package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.TipoPagamento;

public class TipoPagamentoDAO {
    private Connection conexao;

    public TipoPagamentoDAO() {
        try {
            conexao = Conexao.criarConexao();
        } catch (Exception e) {
            System.out.println("Erro TipoPagamentoDAO");
            System.out.println(e);
        }
    }
    public ArrayList<TipoPagamento> getLista(){
        ArrayList<TipoPagamento> resultado = new ArrayList<>();
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs   = stmt.executeQuery("select * from tipo_pagamento");
            while (rs.next()) {                
                TipoPagamento tp = new TipoPagamento();
                tp.setIdtipo_pagamento(rs.getInt("idtipo_pagamento"));
                tp.setNome(rs.getString("nome"));
                resultado.add(tp);
            }
        } catch (SQLException e) {
            System.out.println("Erro de SQL: "+ e.getMessage());
        }
        return resultado;
    }
    public TipoPagamento getTipoPagamentoPorIdtipo_pagamento(int idtipo_pagamento){
        TipoPagamento tp = new TipoPagamento();
        try {
            String sql           = "SELECT * FROM tipo_pagamento WHERE idtipo_pagamento=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idtipo_pagamento);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tp.setIdtipo_pagamento(idtipo_pagamento);
                tp.setNome(rs.getString("nome"));
            }
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return tp;
    }
    public boolean gravar(TipoPagamento tp){
        try {
            String sql;
            if (tp.getIdtipo_pagamento() == 0) {
                sql = "INSERT INTO tipo_pagamento (nome) VALUES(?)";
            } else {
                sql = "UPDATE tipo_pagamento SET nome=? WHERE idtipo_pagamento=?";
            }
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, tp.getNome());
            if (tp.getIdtipo_pagamento() > 0) {
                ps.setInt(2, tp.getIdtipo_pagamento());
            }
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return false;
        }
    }
    public boolean excluir (int idtipo_Pagamento){
        try {
            String sql           = "DELETE FROM tipo_pagamento WHERE idtipo_pagamento=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idtipo_Pagamento);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return false;
        }
    }
}
