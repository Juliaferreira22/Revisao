import java.util.ArrayList;

public class AreaDeProtecao implements SerVivo {
    /* Atributos */
    private String nome;
    private int tamanho;
    private ArrayList<String> estado;
    private ArrayList<Animal> animais;

    /* Métodos */
    public void adicionar_estado(String nome) {
        estado.add(nome);
    }

    public void listar_estados() {
        for (int i = 0; i < estado.size(); i = i + 1) {
            System.out.println(
                    estado.get(i));
        }
    }

    public void aumentar(int area_adicional) {
        this.tamanho = this.tamanho + area_adicional;
    }

    public void reduzir(int area_reduzida) {
        this.tamanho = this.tamanho - area_reduzida;
    }

    public void mostra_area() {
        System.out.println(this.tamanho);
    }

    public void mostrar_animais() {
        for (int i = 0; i < animais.size(); i = i + 1) {

            Animal animal_1 = animais.get(i);

            System.out.println(animal_1.get_nome());

        }
    }

    public void envelhecer_animais() {
        for (int i = 0; i < animais.size(); i++) {

            Animal animal_1 = animais.get(i);

            animal_1.envelhecer();

        }
    }

    public AreaDeProtecao(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }
}
