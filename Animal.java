/* Imports */

public class Animal {
    /* Atributos */
    private String nome;
    private int idade;
    private String cor;
    private Especie especie;

    /* Métodos */
    public void envelhecer() {

        // this.idade++;
        this.idade = this.idade + 1;

    }

    public void recolorir(String novaCor, String cor) {
        this.cor = novaCor;

        this.envelhecer();
    }

    public void renomear(String novoNome) {
        this.nome = novoNome;

        this.idade = 1;
    }

    public String get_nome() {
        return this.nome;
    }

    public Animal(String nome, String cor, Especie especie) {
        this.nome = nome;
        this.cor = cor;
        this.idade = 1;
        this.especie = especie;
    }
}