public class handsUp {

    String divinePower;
    double intensity;
    double faithCost;

    public handsUp(String poderDivino, double intensidade, double custoDeFe){

        divinePower = poderDivino;
        intensity = intensidade;
        faithCost = custoDeFe;
    }

    public static void main(String[] args) {

        handsUp maos = new handsUp("Erguei as mãos", 4, 50);

        System.out.println("Poder Divino = " + maos.divinePower);
        System.out.println("Intensidade = " + maos.intensity);
        System.out.println("Custo de Fé = " + maos.faithCost);
    }
}
