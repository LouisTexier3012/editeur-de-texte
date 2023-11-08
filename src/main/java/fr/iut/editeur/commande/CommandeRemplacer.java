package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            return;
        }
        String texte = parameters[4];
        int depart = Integer.parseInt(parameters[2]);
        int fin = Integer.parseInt(parameters[3]);
        this.document.remplacer(depart,fin,texte);
        super.executer();
    }

}
