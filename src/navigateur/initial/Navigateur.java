package navigateur.initial;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class Navigateur implements ActivateObserver, ChangeObserver, CloseObserver, OpenObserver, DeleteObserver {

    private static Navigateur instance;

    public static Navigateur getInstance() {
        if (instance == null) {
            instance = new Navigateur();
        }

        return instance;
    }

    private Dossier dossierActif;
    private final List<Dossier> dossiersOuverts;

    /**
     * Empêche l'instanciation du singleton.
     */
    private Navigateur() {
        dossiersOuverts = new ArrayList<>();
    }

    @Override
    public void updateActivate(Dossier e) {
        dossierActif = e;
    }

    @Override
    public void updateClose(Element e) {
        if (e instanceof Dossier && dossiersOuverts.contains((Dossier) e)) {
            dossiersOuverts.remove((Dossier) e);
        }
    }

    @Override
    public void updateOpen(Element e) {
        if (e instanceof Dossier && !dossiersOuverts.contains((Dossier) e)) {
            dossiersOuverts.add((Dossier) e);
            System.out.println("Ouverture du dossier " + e.getName() + " situé à " + e.getPath());
        }
    }

    @Override
    public void updateDelete(Element e) {
        if (e instanceof Dossier && dossiersOuverts.contains((Dossier) e)) {
            dossiersOuverts.remove((Dossier) e);
        }
    }

    @Override
    public void updateChange(Element e) {

    }

    public List<Dossier> getDossiersOuverts() {
        return dossiersOuverts;
    }

    public Dossier getDossierActif() {
        return dossierActif;
    }

}
