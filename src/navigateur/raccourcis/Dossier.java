package navigateur.raccourcis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import navigateur.initial.DeleteObserver;
import navigateur.initial.Element;
import navigateur.initial.ElementVisitor;

/**
 * Dossier.
 *
 * L'héritage avec ElementRaccourciable nous force à redéfinir la classe, car
 * elle n'est plus compatible avec Dossier original.
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class Dossier extends ElementRaccourciable implements DeleteObserver {

    private final List<Element> elements;

    public Dossier(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
        elements = new ArrayList<>();
    }

    @Override
    public void updateDelete(Element e) {
        elements.remove(e);
    }

    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);

        for (Element element : elements) {
            element.accept(visitor);
        }
    }

}
