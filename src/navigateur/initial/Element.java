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
public abstract class Element implements Observable {

    /**
     *
     */
    protected String name;

    /**
     *
     */
    protected Date creation;

    /**
     *
     */
    protected Date lastModified;

    /**
     *
     */
    protected String path;

    /**
     *
     */
    protected boolean opened;

    private final List<DeleteObserver> deleteObservers;
    private final List<OpenObserver> openObservers;
    private final List<CloseObserver> closeObservers;
    private final List<ChangeObserver> changeObservers;

    /**
     *
     * @param path
     * @param name
     * @param creation
     * @param lastModified
     */
    public Element(String path, String name, Date creation, Date lastModified) {
        this.name = name;
        this.creation = creation;
        this.lastModified = lastModified;
        this.path = path;
        this.opened = false;

        this.changeObservers = new ArrayList<>();
        this.closeObservers = new ArrayList<>();
        this.openObservers = new ArrayList<>();
        this.deleteObservers = new ArrayList<>();
    }

    /**
     *
     * @param visitor
     */
    public abstract void accept(ElementVisitor visitor);

    /**
     *
     */
    public void ouvrir() {
        opened = true;
        notifyOpen();
    }

    /**
     *
     */
    public void fermer() {
        opened = false;
        notifyClose();
    }

    /**
     *
     */
    public void delete() {
        notifyDelete();
    }

    /**
     *
     * @param e
     */
    @Override
    public void attachDelete(DeleteObserver e) {
        this.deleteObservers.add(e);
    }

    /**
     *
     * @param e
     */
    @Override
    public void attachOpen(OpenObserver e) {
        this.openObservers.add(e);
    }

    /**
     *
     * @param e
     */
    @Override
    public void attachClose(CloseObserver e) {
        this.closeObservers.add(e);
    }

    /**
     *
     * @param e
     */
    @Override
    public void attachChange(ChangeObserver e) {
        this.changeObservers.add(e);
    }

    /**
     *
     * @param e
     */
    @Override
    public void detachDelete(DeleteObserver e) {
        this.deleteObservers.remove(e);
    }

    /**
     *
     * @param e
     */
    @Override
    public void detachOpen(OpenObserver e) {
        this.openObservers.remove(e);
    }

    /**
     *
     * @param e
     */
    @Override
    public void detachClose(CloseObserver e) {
        this.closeObservers.remove(e);
    }

    /**
     *
     * @param e
     */
    @Override
    public void detachChange(ChangeObserver e) {
        this.changeObservers.remove(e);
    }

    /**
     *
     */
    @Override
    public void notifyDelete() {
        for (DeleteObserver a : deleteObservers) {
            a.updateDelete(this);
        }
    }

    /**
     *
     */
    @Override
    public void notifyOpen() {
        for (OpenObserver a : openObservers) {
            a.updateOpen(this);
        }
    }

    /**
     *
     */
    @Override
    public void notifyClose() {
        for (CloseObserver a : closeObservers) {
            a.updateClose(this);
        }
    }

    /**
     *
     */
    @Override
    public void notifyChange() {
        for (ChangeObserver a : changeObservers) {
            a.updateChange(this);
        }
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
        notifyChange();
    }

    /**
     *
     * @return
     */
    public Date getCreation() {
        return creation;
    }

    /**
     *
     * @param creation
     */
    public void setCreation(Date creation) {
        this.creation = creation;
        notifyChange();
    }

    /**
     *
     * @return
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     *
     * @param lastModified
     */
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
        notifyChange();
    }

    /**
     *
     * @return
     */
    public String getPath() {
        return path;
    }

    /**
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
        notifyChange();
    }

    /**
     *
     * @return
     */
    public boolean getOpened() {
        return opened;
    }

    /**
     *
     * @return
     */
    public String getFullPath() {
        return this.path + (this.path.endsWith("/") ? "" : '/') + this.name;
    }

}
