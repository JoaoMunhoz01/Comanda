public class Produto{

    private int id;
    private String nomeProduto;
    private double valor;
    private String tipo;

    public Produto(int id, String nomeProduto, double valor, String tipo, ){

        this.id = id;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.tipo = tipo;

    }

    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public double getValor(){
        return this.valor;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public int getId(){
        return this.id;
    }

    public void setNomeProduto(String nomeProduto){

        this.nomeProduto = nomeProduto;

    }
    public void setValor(double valor){

        this.valor = valor;

    }
    public void setTipo(String tipo){

        this.tipo = tipo;

    }


}