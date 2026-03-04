public class Produto {
    public int idProduto;
    public String nome;
    public int quantidade;
    public double preco;

    public boolean darBaixa(int qtde){
        if(qtde>quantidade){
            System.out.println("QUANTIDADE EH MAIOR");
            return false;
        } else if (qtde<=quantidade) {
            double valorVenda=qtde*preco;
            System.out.println("Valor venda: "+valorVenda);
            quantidade-=qtde;
            return true;
        }
        return true;
    }

    public boolean darEntrada (int qtde){
        if(qtde<=0){
            return false;
        }
        quantidade+=qtde;
        return true;
    }


    public void imprimir(){
        System.out.println("idProduto = " + idProduto);
        System.out.println("nome = " + nome);
        System.out.println("quantidade = " + quantidade);
        System.out.println("preco = " + preco);
        System.out.println("---------------------------");

    }


}


