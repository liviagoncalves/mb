package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Perfil;

public class PerfilDAO {
    private Connection conexao;
    public PerfilDAO(){
        try{
            conexao = Conexao.criarConexao();
        }catch(Exception e){
            System.out.println("Erro PerfilDAO");
            System.out.println(e);
        }
    }
    public ArrayList<Perfil> getLista(){
        ArrayList<Perfil> resultado = new ArrayList<>();
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery("select * from perfil");
            while (rs.next()) {                
                Perfil p = new Perfil();
                p.setIdperfil(rs.getInt("idperfil"));
                p.setNome(rs.getString("nome"));
                resultado.add(p);
            }
        } catch (Exception e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return resultado;
    }
    
    public Perfil getPerfilPorIdperfil(int idperfil){
        Perfil p = new Perfil();
        try {
            String sql = "SELECT * FROM perfil WHERE idperfil=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idperfil);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p.setIdperfil(idperfil);
                p.setNome(rs.getString("nome"));
            }
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return p;
    }
    
    public boolean gravar(Perfil p){
        try {
            String sql;
            if (p.getIdperfil() == 0) {
                sql = "INSERT INTO perfil (nome) VALUES (?)";
            } else {
                sql = "UPDATE perfil SET nome=? WHERE idperfil=?";
            }
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, p.getNome());
            if (p.getIdperfil() > 0) {
                ps.setInt(2, p.getIdperfil());
            }
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return false;
        }
    }
    public boolean excluir (int idperfil){
        try {
            String sql = "DELETE FROM perfil WHERE idperfil = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idperfil);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return false;
        }
    }
}
