package SRP_PrincipiodaresponsabilidadeUnica.projetocarrinhoRefatoradoSRp;

import java.io.Serializable;

public class Itens implements Serializable {

    private String item;
    private double valor;

    public Itens() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Itens(String item, double valor) {
        this.item = item;
        this.valor = valor;
    }
}
