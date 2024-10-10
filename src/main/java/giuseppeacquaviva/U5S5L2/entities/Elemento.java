package giuseppeacquaviva.U5S5L2.entities;

import lombok.Getter;

@Getter
public abstract class Elemento {
    protected int calorie;
    protected double prezzo;

    public Elemento(double prezzo, int calorie) {
        this.prezzo = prezzo;
        this.calorie = calorie;
    }
}
