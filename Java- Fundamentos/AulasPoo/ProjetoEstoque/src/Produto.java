public class Produto {
    public int idProduto;
    public String nome;
    public int quantidade;
    public double preco;

    public void darBaixa(int qtde){
        if(qtde>quantidade){
            System.out.println("Quantidade eh maior");
        } else if (qtde<=0&&qtde>0) { //Tratar o parametro de nao poder ser 0 no input do main
            quantidade-=qtde;
        }
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


