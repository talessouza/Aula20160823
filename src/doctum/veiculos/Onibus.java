package doctum.veiculos;

public class Onibus {
    public String nome;
    public int potencia;
    public int velocidade;
    public int poltronas;
    
    public void acelerar(){
        this.velocidade += this.potencia;
    }
    
    
    public void frear() {
        velocidade = velocidade / 2; // /=2;
    }
}
