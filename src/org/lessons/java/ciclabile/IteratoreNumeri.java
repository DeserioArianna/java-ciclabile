package org.lessons.java.ciclabile;

public class IteratoreNumeri {
    private int[] arrayNumeri;
    private int indiceCorrente;

    public IteratoreNumeri(int[] numeri) {
        this.arrayNumeri = numeri;
    }

    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            return arrayNumeri[indiceCorrente++];
        } else {
            return -1;
        }
    }

    public boolean hasAncoraElementi() {
        return indiceCorrente < arrayNumeri.length;
    }

}
