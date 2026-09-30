package Exercice_1_Arbres;


import java.util.ArrayList;
import java.util.List;public class Arbre {

    private String val;
    private List<Arbre> enfants;

    public Arbre(String val) {
        this.val = val;
        this.enfants = new ArrayList<>();
    }

    public String getValeur() {
        return this.val;
    }

    public void setValeur(String val){
        this.val = val;
    }


    public void setEnfant(Arbre enfant) {
        enfants.add(enfant);
    }

    public List<Arbre> getEnfants() {
        return enfants;
    }


    // Classe test
    public static void main(String[] args) {

        System.out.println("Hello World");

        Arbre html = new Arbre("html");

        Arbre head = new Arbre("head");
        Arbre body = new Arbre("body");

        html.setEnfant(head);
        html.setEnfant(body);

        System.out.println(html.getValeur());
        System.out.println(html.getEnfants().get(0).getValeur());
        System.out.println(html.getEnfants().get(1).getValeur());


        html.setValeur("HTML");
        System.out.println(html.getValeur());
    }
}
    // -------------------------------------------Questions------------------------------------------------------------

    /*
    1) Une structure d'arbre peut etre utile dans un systeme hierarchique, ça peut etre dans la gestion de fichiers ou plus
     simplement les arbres en UML, une expression arithmétique (on peut faire un arbre en postfix). Des Document Object Model


    3) Au niveau des différents parcours, on a le parcours prefixe, infixe, postfixe et en largeur.


    4) Pour un parcours qui commence par la racine, il faut un parcours préfixé
     */