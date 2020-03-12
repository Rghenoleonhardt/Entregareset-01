public class Druida {

    String name;
    double life;
    double attack;
    double defense;
    double faith;

    public Druida(String nome, double vida, double ataque, double defesa, double fe){
        name = nome;
        life = vida;
        attack = ataque;
        defense = defesa;
        faith = fe;

    }

    public static void main(String[] args) {

        Druida druid = new Druida ("Frota", 1000, 100, 20, 100);

        System.out.println("Nome = " + druid.name);
        System.out.println("Vida = " + druid.life);
        System.out.println("Ataque = " + druid.attack);
        System.out.println("Defesa = " + druid.defense);
        System.out.println("Fé = " + druid.faith);
    }
}
