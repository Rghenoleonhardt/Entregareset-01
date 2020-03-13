public class Guerreiro {
    String name;
    double life;
    double attack;
    double defense;

    public Guerreiro(String nome, double vida, double ataque, double defesa){
        name = nome;
        life = vida;
        attack = ataque;
        defense = defesa;

    }

    public static void main(String[] args) {

        Guerreiro Rambo = new Guerreiro ("Rambo", 1000, 120, 5);


    }


}
