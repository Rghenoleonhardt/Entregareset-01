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

        Guerreiro warrior = new Guerreiro ("Rambo", 1000, 120, 2);

        System.out.println("Nome = " + warrior.name);
        System.out.println("Vida = " + warrior.life);
        System.out.println("Ataque = " + warrior.attack);
        System.out.println("Defesa = " + warrior.defense);
    }

}
