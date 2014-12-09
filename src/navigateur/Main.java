package navigateur;

import java.util.Date;
import navigateur.initial.Client;
import navigateur.initial.Dossier;
import navigateur.initial.Fichier;

/**
 * L'implémentation est testé avec JUnit.
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("L'implémentation complète est testée sous JUnit!");

        Client client = new Client();

        Dossier dossier = new Dossier("/", new Date(), new Date(), "test");

        dossier.add(new Fichier("test1", new Date(), new Date(), ""));
        dossier.add(new Fichier("test2", new Date(), new Date(), ""));
        dossier.add(new Fichier("test3", new Date(), new Date(), ""));
        dossier.add(new Fichier("test4", new Date(), new Date(), ""));
        dossier.add(new Fichier("test5", new Date(), new Date(), ""));

        Dossier sousDossier = new Dossier("test6", new Date(), new Date(), "");

        sousDossier.add(new Fichier("test1", new Date(), new Date(), ""));
        sousDossier.add(new Fichier("test2", new Date(), new Date(), ""));
        sousDossier.add(new Fichier("test3", new Date(), new Date(), ""));
        sousDossier.add(new Fichier("test4", new Date(), new Date(), ""));
        sousDossier.add(new Fichier("test5", new Date(), new Date(), ""));

        dossier.add(sousDossier);

        dossier.activate();

        System.out.println("Taille du dossier actif " + client.getTailleDossierActif());
    }
}
