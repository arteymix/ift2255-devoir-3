package navigateur.initial;

import navigateur.initial.ChangeObserver;

/**
 *
 * @author owner
 */
public interface Observable {

    public abstract void attach(DeleteObserver e);

    public abstract void attach(OpenObserver e);

    public abstract void attach(CloseObserver e);

    public abstract void attach(ChangeObserver e);

    public abstract void detach(DeleteObserver e);

    public abstract void detach(OpenObserver e);

    public abstract void detach(CloseObserver e);

    public abstract void detach(ChangeObserver e);

    public abstract void notifyDelete();

    public abstract void notifyOpen();

    public abstract void notifyClose();

    public abstract void notifyChange();

}
