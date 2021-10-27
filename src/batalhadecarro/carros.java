
package batalhadecarro;

/**
 *
 * @author diaasnnna
 */
public class carros {

//ATRIBUTOS EMCAPSULADOS
    private String modelo;
    private String tipo;
    private int velocidade;
    private int cilindradas;
    private double comprimento;
    private int peso = 1050;
   
    //CONSTRUTOR
    public carros(String modelo, String tipo, int peso) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.peso = peso;

        calculaAtributos();
        calculaBonus();
        imprimiCarros();
    }

    //MÉTODOS
    //Get
    public String getModelo() {
      return modelo;
    } 

    public int getVelocidade() {
        return velocidade;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public double getComprimento() {
        return comprimento;
    }
    
  //Set
   public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    

    private void calculaAtributos() {
        switch (tipo) {
            case "A":
                this.cilindradas = cilindradas - 3189;
                this.velocidade = 268;
                this.comprimento = 4.12;

                break;

            case "B":
                this.cilindradas = cilindradas - 8000;
                this.velocidade = 350;
                this.comprimento = 4.93;

                break;

            case "C":
                this.cilindradas = cilindradas + 1489;
                this.velocidade = 260;
                this.comprimento = 3.77;

                break;

            case "D":
                this.cilindradas = cilindradas + 1997;
                this.velocidade = 250;
                this.comprimento = 4.25;

                break;

        }
    }

    public void calculaBonus() {
        velocidade = velocidade + (peso / 2);
        cilindradas = cilindradas + (peso / 3);
        comprimento = comprimento + (peso / 4);
    }

    public void imprimiCarros() {
        System.out.println("Modelo: " + modelo + " | "
                + "Velocidade: " + velocidade + " | "
                + "Cilindradas: " + cilindradas + " | "
                + "Comprimento: " + comprimento + " | "
                + "Peso: " + peso + " | "
                + "Tipo: " + tipo + " |                                                                        "
        );

    }
    
}



