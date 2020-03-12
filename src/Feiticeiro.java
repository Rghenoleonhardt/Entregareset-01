public class Feiticeiro {

    String name;
    double life;
    double attack;
    double defense;
    double mana;

    public Feiticeiro(String nome, double vida, double ataque, double defesa, double power){
        name = nome;
        life = vida;
        attack = ataque;
        defense = defesa;
        mana = power;

    }

    public static void main(String[] args) {

        Feiticeiro sorcerer = new Feiticeiro ("Mestre Mu", 1000, 140, 45, 100);

        System.out.println("Nome = " + sorcerer.name);
        System.out.println("Vida = " + sorcerer.life);
        System.out.println("Ataque = " + sorcerer.attack);
        System.out.println("Defesa = " + sorcerer.defense);
        System.out.println("Mana = " + sorcerer.mana);
    }
}
