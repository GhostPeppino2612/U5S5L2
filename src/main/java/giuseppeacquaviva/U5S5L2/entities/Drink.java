package giuseppeacquaviva.U5S5L2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Drink extends Elemento {

    private String nome;

    public Drink(String nome ,double prezzo, int calorie) {
        super(prezzo, calorie);
        this.nome = nome;
    }
}
