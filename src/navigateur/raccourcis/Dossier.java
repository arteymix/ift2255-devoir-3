package navigateur.raccourcis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import navigateur.initial.DeleteObserver;
import navigateur.initial.Element;

/**
 * Dossier.
 *
 * L'héritage avec ElementRaccourciable nous force à redéfinir la classe, car
 * elle n'est plus compatible avec Dossier original.
 *
 * @author guillaume
 */
public class Dossier extends ElementRaccourciable implements DeleteObserver {

    private final List<Element> elements;

    public Dossier(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
        elements = new ArrayList<>();
    }

    @Override
    public int taille() {
        int taille = 0;
        
        for (Element e : elements) {
            if (e instanceof ElementRaccourciable) {
                taille += e.taille();
            }
        }

        return taille;
    }

    @Override
    public void updateDelete(Element e) {
        elements.remove(e);
    }

}
