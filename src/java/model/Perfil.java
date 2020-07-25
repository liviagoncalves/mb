package model;
public class Perfil {
    private int idperfil;
    private String nome;

    public Perfil() {
    }

    public Perfil(int idperfil, String nome) {
        this.idperfil = idperfil;
        this.nome = nome;
    }

    public int getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(int idperfil) {
        this.idperfil = idperfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Perfil{" + "nome=" + nome + '}';
    }
}
