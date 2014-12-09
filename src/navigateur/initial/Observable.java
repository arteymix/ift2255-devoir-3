package navigateur.initial;

import navigateur.initial.ChangeObserver;

/**
 *
 * @author owner
 */
public interface Observable {

    public abstract void attachDelete(DeleteObserver e);

    public abstract void attachOpen(OpenObserver e);

    public abstract void attachClose(CloseObserver e);

    public abstract void attachChange(ChangeObserver e);

    public abstract void detachDelete(DeleteObserver e);

    public abstract void detachOpen(OpenObserver e);

    public abstract void detachClose(CloseObserver e);

    public abstract void detachChange(ChangeObserver e);

    public abstract void notifyDelete();

    public abstract void notifyOpen();

    public abstract void notifyClose();

    public abstract void notifyChange();

}
