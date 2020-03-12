public class Barbaro {

    String name;
    double life;
    double attack;
    double defense;

    public Barbaro(String nome, double vida, double ataque, double defesa){
        name = nome;
        life = vida;
        attack = ataque;
        defense = defesa;

    }

    public static void main(String[] args) {

        Barbaro barbarian = new Barbaro ("Xena", 1000, 125, 10);

        System.out.println("Nome = " + barbarian.name);
        System.out.println("Vida = " + barbarian.life);
        System.out.println("Ataque = " + barbarian.attack);
        System.out.println("Defesa = " + barbarian.defense);
    }


}
