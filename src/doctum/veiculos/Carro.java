package doctum.veiculos;

public class Carro {
    public String nome;
    public int potencia;
    public int velocidade;
    
    public void acelerar(){
        this.velocidade += this.potencia;
    }
    
    
    public void frear() {
        velocidade = velocidade / 2; // /=2;
    }
}
