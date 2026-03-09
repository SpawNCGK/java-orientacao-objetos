
package main;

import classes.Pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.nome = "Augusto";
        p.idade = 30;

        p.apresentar();
    }
}
