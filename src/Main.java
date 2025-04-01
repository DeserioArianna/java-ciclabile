import org.lessons.java.ciclabile.IteratoreNumeri;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] numeri = { 20, 30, 50, 70, 100, 130 };
        IteratoreNumeri iteratore = new IteratoreNumeri(numeri);
        System.out.println(iteratore.hasAncoraElementi());
        while (iteratore.hasAncoraElementi()) {
            System.out.println(iteratore.getElementoSuccessivo());
        }

    }
}
