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

    @Override
    public String toString() {
        return "Arbre {" +
                "\n     valeur = " + val +
                ",\n        enfants = " + enfants +
                "}";
    }


    public String toStringPrefixe() {
        StringBuilder resultat = new StringBuilder();

        resultat.append(this.val).append(" ");

        for (Arbre enfant : enfants) {
            resultat.append(enfant.toStringPrefixe());
        }

        return resultat.toString();
    }

    public void parcoursPrefixe() {
        System.out.println(this.val);

        for (Arbre enfant : enfants) {
            enfant.parcoursPrefixe();
        }
    }



    // Classe test
    public static void main(String[] args) {

        System.out.println("Hello World");

        Arbre html = new Arbre("html");

        Arbre head = new Arbre("head");
        Arbre body = new Arbre("body");

        html.setEnfant(head);
        html.setEnfant(body);

        System.out.println("\n\n");
        System.out.println(html.getValeur());
        System.out.println(html.getEnfants().get(0).getValeur());
        System.out.println(html.getEnfants().get(1).getValeur());

        html.setValeur("HTML");
        System.out.println(html.getValeur());
        System.out.println(html);
        System.out.println("\n\n");

        Arbre h1 = new Arbre("h1");
        Arbre p = new Arbre("p");
        body.setEnfant(h1);
        body.setEnfant(p);
        Arbre title = new Arbre("title");
        head.setEnfant(title);


        //Parcours prefixe
        System.out.println("\n\n");

        html.parcoursPrefixe();
        System.out.println(html);

        System.out.println("\n\n");
        System.out.println(html.toStringPrefixe());

        System.out.println("\n\n");


    }
}
    // -------------------------------------------Questions------------------------------------------------------------

    /*
    1) Une structure d'arbre peut etre utile dans un systeme hierarchique, ça peut etre dans la gestion de fichiers ou plus
     simplement les arbres en UML, une expression arithmétique (on peut faire un arbre en postfix). Des Document Object Model


    3) Au niveau des différents parcours, on a le parcours prefixe, infixe, postfixe et en largeur.


    4) Pour un parcours qui commence par la racine, il faut un parcours préfixé.
     */