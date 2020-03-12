public class Clerigo {

    String name;
    double life;
    double attack;
    double defense;
    double faith;

    public Clerigo(String nome, double vida, double ataque, double defesa, double fe){
        name = nome;
        life = vida;
        attack = ataque;
        defense = defesa;
        faith = fe;

    }

    public static void main(String[] args) {

        Clerigo priest = new Clerigo ("Padre Marcelo", 1000, 200, 50, 110);

        System.out.println("Nome = " + priest.name);
        System.out.println("Vida = " + priest.life);
        System.out.println("Ataque = " + priest.attack);
        System.out.println("Defesa = " + priest.defense);
        System.out.println("Fé = " + priest.faith);
    }
}
