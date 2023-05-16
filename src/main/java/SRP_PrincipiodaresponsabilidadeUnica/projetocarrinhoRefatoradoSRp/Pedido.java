package SRP_PrincipiodaresponsabilidadeUnica.projetocarrinhoRefatoradoSRp;

public class Pedido {
    private String status;
    private CarrinhoCompras carrinhoCompras;
    private double valorPedido;
    public Pedido(){
        this.status="aberto";
        this.carrinhoCompras= new CarrinhoCompras();
        this.valorPedido=0;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean confirmar(){
        if(this.carrinhoCompras.validarCarro()){
            this.setStatus("confirmado");
            return true;
        }
        return false;
    }
}
