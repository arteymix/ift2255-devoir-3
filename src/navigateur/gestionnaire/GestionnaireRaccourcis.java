package navigateur.gestionnaire;

import java.util.ArrayList;
import java.util.List;
import navigateur.initial.DeleteObserver;
import navigateur.initial.Element;
import navigateur.raccourcis.Raccourci;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class GestionnaireRaccourcis implements DeleteObserver {

    private static GestionnaireRaccourcis instance;

    public static GestionnaireRaccourcis getInstance() {
        if (instance == null) {
            instance = new GestionnaireRaccourcis();
        }

        return instance;
    }

    private final List<Raccourci> raccourcis;

    /**
     * Protège le constructeur du singleton.
     */
    private GestionnaireRaccourcis() {
        raccourcis = new ArrayList<>();
    }

    /**
     * Si l'élément pointé par un raccourci est supprimé, on doit supprimé le
     * raccourci.
     *
     * @param e élément qui a été supprimé
     */
    @Override
    public void updateDelete(Element e) {
        raccourcis.removeIf((Raccourci r) -> r.getElement() == e);
    }

    public List<Raccourci> getRaccourcis() {
        return raccourcis;
    }

}
