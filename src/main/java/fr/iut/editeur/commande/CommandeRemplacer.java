package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;depart;fin;texte");
            return;
        }
        String texte = parameters[3];
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.remplacer(depart,fin,texte);
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("remplacer permet de remplacer une partie du texte entre les pointeur debut et fin. Format attendu : remplacer;depart;fin;texte");
    }

}
