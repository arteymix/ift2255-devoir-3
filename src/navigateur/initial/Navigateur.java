package navigateur.initial;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class Navigateur implements ActivateObserver, ChangeObserver, CloseObserver, OpenObserver, DeleteObserver {

    private static Navigateur instance;

    /**
     *
     * @return
     */
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

    /**
     *
     * @param e
     */
    @Override
    public void updateActivate(Dossier e) {
        dossierActif = e;
    }

    /**
     *
     * @param e
     */
    @Override
    public void updateClose(Element e) {
        if (e instanceof Dossier && dossiersOuverts.contains((Dossier) e)) {
            dossiersOuverts.remove((Dossier) e);
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void updateOpen(Element e) {
        if (e instanceof Dossier && !dossiersOuverts.contains((Dossier) e)) {
            dossiersOuverts.add((Dossier) e);
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void updateDelete(Element e) {
        if (e instanceof Dossier && dossiersOuverts.contains((Dossier) e)) {
            dossiersOuverts.remove((Dossier) e);
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void updateChange(Element e) {

    }

    /**
     *
     * @return
     */
    public List<Dossier> getDossiersOuverts() {
        return dossiersOuverts;
    }

    /**
     *
     * @return
     */
    public Dossier getDossierActif() {
        return dossierActif;
    }

}
