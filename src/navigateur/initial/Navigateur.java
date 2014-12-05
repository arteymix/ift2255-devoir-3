package navigateur.initial;


import java.util.List;

/**
 *
 * @author guillaume
 */
public class Navigateur implements ActivateObserver, ChangeObserver, CloseObserver, OpenObserver, DeleteObserver {

    private static Navigateur instance;

    public static Navigateur getInstance() {
        if (instance == null) {
            instance = new Navigateur();
        }
        
        return instance;
    }

    public Dossier actif;
    public List<Dossier> dossiersOuvert;

    /**
     * Empêche l'instanciation du singleton.
     */
    private Navigateur() {

    }

    @Override
    public void updateActivate(Element e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateClose(Element e) {
        if (e instanceof Dossier) {
            if (dossiersOuvert.contains(e)) {
                dossiersOuvert.remove(e);
            }
        }
    }

    @Override
    public void updateOpen(Element e) {
        if (e instanceof Dossier) {
            if (!dossiersOuvert.contains(e)) {
                dossiersOuvert.add((Dossier) e);
                System.out.println("Ouverture du dossier " + e.getName() + " situé à " + e.getPath());
                //Mettre ici les methodes pour afficher le dosssier
            }
            actif = (Dossier) e;
        } else if (e instanceof Fichier) {
            //Mettre ici le traitement qui trouve le programme par defaut associé à l'extension du fichier.
        }
    }

    @Override
    public void updateDelete(Element e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateChange(Element e) {
        if (dossiersOuvert.contains(e)) {
            //Actualiser la vue du dossier.
        }
    }

}
