public class Produto {
    private String idProduto;
    private String nomeProduto;
    private int quantidadeProduto;
    private double precoProduto;

    public void imprimir(){
        System.out.println("idProduto = " + idProduto);
        System.out.println("nomeProduto = " + nomeProduto);
        System.out.println("quantidadeProduto = " + quantidadeProduto);
        System.out.println("precoProduto = " + precoProduto);
        System.out.println("");

    }

    public void setIdProduto(String id){
        this.idProduto=id;
    }

    public void setNomeProduto(String nome){
        this.nomeProduto=nome;
    }

    public void setQuantidadeProduto(int quantidade){
        this.quantidadeProduto=quantidade;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getIdProduto(){
        return idProduto;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public int getQuantidadeProduto(){
        return quantidadeProduto;
    }

    public double getPrecoProduto(){
        return precoProduto;
    }



}
