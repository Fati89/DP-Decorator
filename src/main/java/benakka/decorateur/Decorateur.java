package benakka.decorateur;

import benakka.composants.Boisson;

public abstract class Decorateur extends Boisson {

    protected Boisson boisson;

    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }
}
