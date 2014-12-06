package navigateur.gestionnaire;

import java.util.List;
import navigateur.initial.DeleteObserver;
import navigateur.initial.Element;
import navigateur.raccourcis.Raccourci;

/**
 *
 * @author owner
 */
public class GestionnaireRaccourcis implements DeleteObserver {

    private static GestionnaireRaccourcis instance;

    public static GestionnaireRaccourcis getInstance() {
        if (instance == null) {
            instance = new GestionnaireRaccourcis();
        }
        
        return instance;
    }

    private List<Raccourci> raccourcis;
    
    /**
     * Protège le constructeur du singleton.
     */
    private GestionnaireRaccourcis() {}

    /**
     * Si l'élément pointé par un raccourci est supprimé, on doit supprimé le 
     * raccourci.
     * 
     * @param e élément qui a été supprimé
     */
    @Override
    public void updateDelete(Element e) {
        for (Raccourci raccourci : raccourcis) {
            if (raccourci.getElement() ==  e) {
                raccourcis.remove(raccourci);
            }
        }
    }

}
