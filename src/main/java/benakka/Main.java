package benakka;

import benakka.composants.Boisson;
import benakka.composants.Espresso;
import benakka.composants.Sumatra;
import benakka.decorateur.Caramel;
import benakka.decorateur.Chocolat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Boisson boisson;
        boisson=new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------");
        boisson = new Chocolat(new Chocolat(boisson));
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------");
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
