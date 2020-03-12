public class Mago {
    String name;
    double life;
    double attack;
    double defense;
    double mana;

    public Mago(String nome, double vida, double ataque, double defesa, double power){
        name = nome;
        life = vida;
        attack = ataque;
        defense = defesa;
        mana = power;

    }

    public static void main(String[] args) {

      Mago wizard = new Mago ("Jafar", 1000, 150, 40, 100);

        System.out.println("Nome = " + wizard.name);
        System.out.println("Vida = " + wizard.life);
        System.out.println("Ataque = " + wizard.attack);
        System.out.println("Defesa = " + wizard.defense);
        System.out.println("Mana = " + wizard.mana);
    }

}
