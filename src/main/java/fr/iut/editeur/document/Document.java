package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int start, int end, String grandRemplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + grandRemplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        remplacer(start,end,texte.substring(start,end).toUpperCase());
    }

    public void minuscules(int start, int end){ remplacer(start,end,texte.substring(start,end).toLowerCase());}

    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }

    public void inserer(int indice, String grandReplacement){
        String leftPart = texte.substring(0,indice+1);
        String rightPart = texte.substring(indice+1);
        texte = leftPart + grandReplacement + rightPart;
    }
    public void clear() {texte="";}
}
