package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {

    public void testAjouter() {
        Document document = new Document();
        document.setTexteDocument("Hello");
        assertEquals("Hello", document.getTexteDocument());
    }

    public void testRemplacer() {
        Document document = new Document();
        document.setTexteDocument("Hello, world!");
        document.remplacer(7, 12, "Universe");
        assertEquals("Hello, Universe!", document.getTexteDocument());
    }

    public void testMajuscules() {
        Document document = new Document();
        document.setTexteDocument("hello");
        document.majuscules(0, 4);
        assertEquals("HELLo", document.getTexteDocument());
    }

    public void testMinuscules() {
        Document document = new Document();
        document.setTexteDocument("HELLO");
        document.minuscules(0, 4);
        assertEquals("hellO", document.getTexteDocument());
    }

    public void testEffacer() {
        Document document = new Document();
        document.setTexteDocument("Hello, world!");
        document.effacer(5, 12);
        assertEquals("Hello!", document.getTexteDocument());
    }

    public void testInserer() {
        Document document = new Document();
        document.setTexteDocument("Hello!");
        document.inserer(4, " world");
        assertEquals("Hello world!", document.getTexteDocument());
    }

    public void testClear() {
        Document document = new Document();
        document.setTexteDocument("Hello");
        document.clear();
        assertEquals("", document.getTexteDocument());
    }
}

