public class Invertebrado extends Animal{

    private int numero_de_patas; 

    public Invertebrado(int numero_de_patas){

    }

    public void recolorir(String novaCor){
        this.cor = novaCor; 

    }

    public Invertebrado(String nome, String cor, Especie especie, int numero_de_patas){
        this.nome = nome; 
        this.cor = cor; 
        this.especie = especie; 
        this.numero_de_patas = numero_de_patas; 
    }
    
}
