import org.lessons.java.ciclabile.IteratoreNumeri;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] numeri = { 20, 30, 50, 70, 100, 130 };
        IteratoreNumeri iteratore = new IteratoreNumeri(numeri);

        while (iteratore.hasAncoraElementi()) {
            System.out.println(iteratore.getElementoSuccessivo());
        }

        System.out.println("-----Bonus-----");
        IteratoreNumeri iteratoreBonus = new IteratoreNumeri();
        iteratoreBonus.addElemento(160);
        iteratoreBonus.addElemento(200);

        while (iteratoreBonus.hasAncoraElementi()) {
            System.out.println(iteratoreBonus.getElementoSuccessivo());
        }
    }
}
