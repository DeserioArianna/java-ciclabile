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

    // Bonus
    public IteratoreNumeri() {
        this.arrayNumeri = new int[0];
    }

    public void addElemento(int numeroDaAggiungere) {
        int[] nuovoArray = new int[this.arrayNumeri.length +1];

        for (int i = 0; i < arrayNumeri.length; i++) {
            nuovoArray[i] = arrayNumeri[i];
        }

        nuovoArray[arrayNumeri.length] = numeroDaAggiungere;
        arrayNumeri = nuovoArray;
    }
}
