package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String getTexteDocument() {
        return texteDocument;
    }

    public void setTexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }

    public void remplacer(int start, int end, String grandRemplacement) {
        String leftPart = texteDocument.substring(0, start);
        String rightPart = texteDocument.substring(end);
        texteDocument = leftPart + grandRemplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        remplacer(start,end, texteDocument.substring(start,end).toUpperCase());
    }

    public void minuscules(int start, int end){ remplacer(start,end, texteDocument.substring(start,end).toLowerCase());}

    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }

    public void inserer(int indice, String grandReplacement){
        String leftPart = texteDocument.substring(0,indice+1);
        String rightPart = texteDocument.substring(indice+1);
        texteDocument = leftPart + grandReplacement + rightPart;
    }
    public void clear() {
        texteDocument ="";}
}
