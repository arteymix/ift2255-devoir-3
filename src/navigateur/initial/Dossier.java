package navigateur.initial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class Dossier extends Element implements DeleteObserver {

    private final List<Element> elements;

    private final List<ActivateObserver> activateObservers;

    public Dossier(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
        elements = new ArrayList<>();
        activateObservers = new ArrayList<>();

        this.attachActivate(Navigateur.getInstance());
        this.attachClose(Navigateur.getInstance());
        this.attachOpen(Navigateur.getInstance());
        this.attachDelete(Navigateur.getInstance());
    }

    /**
     * Capture les suppression des éléments contenus.
     *
     * @param e
     */
    @Override
    public void updateDelete(Element e) {
        elements.remove(e);
        notifyChange();
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

    public void activate() {
        notifyActivate();
    }

    public final void attachActivate(ActivateObserver observer) {
        activateObservers.add(observer);
    }

    public void detachActivate(ActivateObserver observer) {
        activateObservers.remove(observer);
    }

    public void notifyActivate() {
        for (ActivateObserver observer : activateObservers) {
            observer.updateActivate(this);
        }
    }

    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);

        // propage le visiteur
        for (Element e : elements) {
            e.accept(visitor);
        }
    }

    public List<Element> getElements() {
        return elements;
    }

}
