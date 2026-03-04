public class Produto {
    public int idProduto;
    public String nome;
    public int quantidade;
    public double preco;

    public boolean darBaixa(int qtde){
        if(qtde>quantidade){
            System.out.println("Quantidade eh maior");
            return false;
        } else if (qtde<=quantidade) { //Tratar o parametro de nao poder ser 0 no input do main
            quantidade-=qtde;
            return true;
        }
        return true;
    }

    public void darEntrada (int qtde){
        if(qtde>0){
            quantidade+=qtde;
        }
    }

    public void imprimir(){
        System.out.println("idProduto = " + idProduto);
        System.out.println("nome = " + nome);
        System.out.println("quantidade = " + quantidade);
        System.out.println("preco = " + preco);

    }
}


