public enum Especie {
GATO("Gato", 10, "5", "ratos"), 
CACHORRO("Perola", 20, "10", "ração"),
TARTARUGA("Mar", 30, "5", "alga"),
ESQUILO("Max", 7, "15", "avela"); 

    /* Atributos */
    private String nome;
    private int tamanho_maximo;
    private String velocidade_maxima;
    private String dieta;

   

    

    /* Construtor */
   private Especie(String nome,
            int tamanho_maximo,
            String velocidade_maxima,
            String dieta) {

        

        this.nome = nome;
        this.tamanho_maximo = tamanho_maximo;
        this.velocidade_maxima = velocidade_maxima;
        this.dieta = dieta;

    }

    class Controller {
        public static void main(String[] args){
            Especie animal_1; // declar animal 

            animal_1 = Especie.ESQUILO; // qual animal quer ver 

            System.out.println(animal_1.get_nome());
        }
    }
}
