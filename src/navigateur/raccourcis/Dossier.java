package navigateur.raccourcis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import navigateur.initial.DeleteObserver;
import navigateur.initial.Element;
import navigateur.initial.ElementVisitor;
import navigateur.initial.Navigateur;

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
    private final List<ActivateObserver> activateObservers;

    /**
     *
     * @param path
     * @param creation
     * @param lastModified
     */
    public Dossier(String path, Date creation, Date lastModified) {
        super(path, path, creation, lastModified);
        elements = new ArrayList<>();
        activateObservers = new ArrayList<>();

        //this.attachActivate(Navigateur.getInstance());
        this.attachClose(Navigateur.getInstance());
        this.attachOpen(Navigateur.getInstance());
        this.attachDelete(Navigateur.getInstance());
    }

    /**
     *
     * @param e
     */
    @Override
    public void updateDelete(Element e) {
        elements.remove(e);
    }

    /**
     *
     * @param visitor
     */
    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);

        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    /**
     * Ajouter un élément dans le dossier.
     *
     * @param e
     * @return
     */
    public boolean add(Element e) {
        e.setPath(this.path);
        e.attachDelete(this);
        return elements.add(e);
    }

    /**
     *
     */
    public void activate() {
        notifyActivate();
    }

    /**
     *
     * @param observer
     */
    public final void attachActivate(ActivateObserver observer) {
        activateObservers.add(observer);
    }

    /**
     *
     * @param observer
     */
    public void detachActivate(ActivateObserver observer) {
        activateObservers.remove(observer);
    }

    /**
     *
     */
    public void notifyActivate() {
        for (ActivateObserver observer : activateObservers) {
            observer.updateActivate(this);
        }
    }

    /**
     *
     * @return
     */
    public List<Element> getElements() {
        return elements;
    }
}
