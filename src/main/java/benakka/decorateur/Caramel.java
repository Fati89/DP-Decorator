package benakka.decorateur;

import benakka.composants.Boisson;

public class Caramel extends Decorateur{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au caramel";
    }

    @Override
    public double cout() {
        return boisson.cout()+0.7;
    }
}
