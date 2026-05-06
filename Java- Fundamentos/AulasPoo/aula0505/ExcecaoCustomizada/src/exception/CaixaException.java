package exception;

//1.Excecao do valor de deposito
//2.Excecao da insuficiencia de saldo para saqui
public class CaixaException extends Exception {
    private String errNumber;

    public CaixaException(String errNumber){
        this.errNumber = errNumber;
    }

    @Override
    public String getMessage() {
        String msg = "";
        if(errNumber.equals("RF01EX01")){
            msg="Valor Inválido para depósito";
        }else if(errNumber.equals("RF01EX02")){
            msg="Saldo insuficiente para o saque";
        }else{
            msg = "Aconteceu um erro. Contate o Adm";
        }

        return msg;
    }
}
