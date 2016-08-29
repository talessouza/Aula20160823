package doctum.principal;

// para usar a classe Carro que esta em outro pacote é necessário fazer sua
// importação
import doctum.veiculos.Carro;
// ou conforme abaixo, importando todo o pacote, incluindo 
//  a nova classe Onibus que crie e incluí neste exemplo.
import doctum.veiculos.*;

public class Principal {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Onibus onibus = new Onibus(); 

        onibus.nome = "Mercedes";
        onibus.potencia = 20;
        onibus.velocidade = 0;
        onibus.poltronas = 44; // poltronas, somente a classe onibus tem
        
        carro1.nome = "Chevette";
        carro1.potencia = 10;
        carro1.velocidade = 0;
        
        carro2.nome = "Chevette";
        carro2.potencia = 10;
        carro2.velocidade = 0;

        for(int i=0; i<4; i++) {
            carro2.acelerar();
        }
        
        carro1.acelerar();        
        carro1.acelerar();
        carro1.acelerar();
        
        System.out.println("Veloc. do: " + carro1.nome + " é " + carro1.velocidade);
        System.out.println("Veloc. do: " + carro2.nome + " é " + carro2.velocidade);
        System.out.println("Veloc. do onibus: " + onibus.nome + ", com " + onibus.poltronas + " poltronas é:" + onibus.velocidade);
        
        onibus.acelerar();
        
        carro1.frear();
        
        carro2.frear();
        carro2.frear();
        carro2.frear();
        carro2.frear();
        carro2.frear();
        carro2.frear();
        carro2.frear();
        
        System.out.println("Veloc. do: " + carro1.nome + " é " + carro1.velocidade);
        System.out.println("Veloc. do: " + carro2.nome + " é " + carro2.velocidade);
        System.out.println("Veloc. do onibus: " + onibus.nome + ", com " + onibus.poltronas + " poltronas é:" + onibus.velocidade);
    }

}
