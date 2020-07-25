package model;
public class TipoPagamento {
    private int idtipo_pagamento;
    private String nome;

    public TipoPagamento() {
    }

    public TipoPagamento(int idtipo_pagamento, String nome) {
        this.idtipo_pagamento = idtipo_pagamento;
        this.nome = nome;
    }

    public int getIdtipo_pagamento() {
        return idtipo_pagamento;
    }

    public void setIdtipo_pagamento(int idtipo_pagamento) {
        this.idtipo_pagamento = idtipo_pagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "TipoPagamento{" + "nome=" + nome + '}';
    }
    
}
