package navigateur.initial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author guillaume
 */
public abstract class Element implements Observable {

    protected String name;
    protected Date creation;
    protected Date lastModified;
    protected String path;
    protected boolean opened;

    private final List<DeleteObserver> deleteObservers;
    private final List<OpenObserver> openObservers;
    private final List<CloseObserver> closeObservers;
    private final List<ChangeObserver> changeObservers;

    public Element(String name, Date creation, Date lastModified, String path) {
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

    public abstract int taille();

    public void ouvrir() {
        opened = true;
        notifyOpen();
    }

    public void fermer() {
        opened = false;
        notifyClose();
    }

    public void delete() {
        notifyDelete();
    }

    @Override
    public void attach(DeleteObserver e) {
        this.deleteObservers.add(e);
    }

    @Override
    public void attach(OpenObserver e) {
        this.openObservers.add(e);
    }

    @Override
    public void attach(CloseObserver e) {
        this.closeObservers.add(e);
    }

    @Override
    public void attach(ChangeObserver e) {
        this.changeObservers.add(e);
    }

    @Override
    public void detach(DeleteObserver e) {
        this.deleteObservers.remove(e);
    }

    @Override
    public void detach(OpenObserver e) {
        this.openObservers.remove(e);
    }

    @Override
    public void detach(CloseObserver e) {
        this.closeObservers.remove(e);
    }

    @Override
    public void detach(ChangeObserver e) {
        this.changeObservers.remove(e);
    }

    @Override
    public void notifyDelete() {
        for (DeleteObserver a : deleteObservers) {
            a.updateDelete(this);
        }
    }

    @Override
    public void notifyOpen() {
        for (OpenObserver a : openObservers) {
            a.updateOpen(this);
        }
    }

    @Override
    public void notifyClose() {
        for (CloseObserver a : closeObservers) {
            a.updateClose(this);
        }
    }

    @Override
    public void notifyChange() {
        for (ChangeObserver a : changeObservers) {
            a.updateChange(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyChange();
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
        notifyChange();
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
        notifyChange();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path + '\\' + this.name;
        notifyChange();
    }

    public boolean getOpened() {
        return opened;
    }

}
