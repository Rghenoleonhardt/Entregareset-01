public class theThing {

    String divinePower;
    double intensity;
    double faithCost;

    public theThing(String poderDivino, double intensidade, double custoDeFe){

        divinePower = poderDivino;
        intensity = intensidade;
        faithCost = custoDeFe;
    }

    public static void main(String[] args) {

        theThing coisa = new theThing("O Negócio", 2, 24);

        System.out.println("Poder Divino = " + coisa.divinePower);
        System.out.println("Intensidade = " + coisa.intensity);
        System.out.println("Custo de Fé = " + coisa.faithCost);
    }
}
