package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer  extends CommandeDocument{

    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;debut;texte");
            return;
        }
        int indice = Integer.parseInt(parameters[1]);
        String texteAAdd = parameters[2];
        this.document.inserer(indice,texteAAdd);
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("inserer permet de inserer un texte aprés une partie du texte aprés le pointeur debut. Format attendu : inserer;debut;texte");
    }
}
