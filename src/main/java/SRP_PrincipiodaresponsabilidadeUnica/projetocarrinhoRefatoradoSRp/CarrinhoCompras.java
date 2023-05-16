package SRP_PrincipiodaresponsabilidadeUnica.projetocarrinhoRefatoradoSRp;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {


    private List<Itens> intens;

    public CarrinhoCompras() {
        intens= new ArrayList<>();
    }

    public List<Itens> getIntens(){
        return this.intens;
    }
    public void adicionarItens(Itens itens){
        this.intens.add(itens);
    }
    public boolean validarCarro(){
        return intens.size()>0? true: false;
    }

}
