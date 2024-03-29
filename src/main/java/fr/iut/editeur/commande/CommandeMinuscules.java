package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscules extends CommandeDocument {

    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }
    //comande majuscule haha
    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : minuscules;depart;fin");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.minuscules(debut,fin);
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("minucules permet de mettre en minuscules une partie du texte entre les pointeur debut et fin. Format attendu : minuscules;depart;fin");
    }

}
