package SRP_PrincipiodaresponsabilidadeUnica.projetocarrinho;

import java.io.Serializable;
import java.util.List;

public class CarrinhoCompras implements Serializable {
    private List<Itens> itens;
    private String status;
    private double valorTotal;

    public CarrinhoCompras(List<Itens> itens, String status, double valorTotal) {
        this.itens = itens;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    public CarrinhoCompras() {
    }

    public void adicionarItem(String item,double valor){
        itens.add(new Itens(item,valor));
        this.valorTotal+=valor;
    }

    public List<Itens> exibirItens(){
        return this.itens;
    }
    public double exibirValorTotal(){
        return this.valorTotal;
    }
    public String exibirStatus(){
        return this.status;
    }
    public void confimarStatus(){
        this.status="confirmado";
        this.enviaremaildeConfirmacao();
    }

    public void enviaremaildeConfirmacao(){
        System.out.println("seu pedido foi  ocnfirmado");
    }

}
