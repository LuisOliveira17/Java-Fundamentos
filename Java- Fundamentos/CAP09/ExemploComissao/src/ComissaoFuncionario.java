abstract class ComissaoFuncionario extends Object {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double vendasBrutas;
    private double taxaComissao;


    public ComissaoFuncionario(String nome,String sobrenome, String cpf, double vendasBrutas, double taxaComissao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        if(vendasBrutas>=0){
            this.vendasBrutas = vendasBrutas;
        }else throw new IllegalArgumentException("Vendas brutas deve ser positivo");

    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        if(taxaComissao>=0 &&taxaComissao<=1.0){
            this.taxaComissao = taxaComissao;
        } else throw new IllegalArgumentException("A taxa de comissao deve ser >0.0 e <1.0");

    }

    public double ganhos(){
        return getTaxaComissao()*getVendasBrutas();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Nome: "+getNome()+getSobrenome()+"\n");
        str.append("CPF: "+getCpf()+"\n");
        str.append("Vendas brutas: "+getVendasBrutas()+"\n");
        str.append("Taxa de comissao: "+getTaxaComissao()+"\n");
        return str.toString();
    }
}


