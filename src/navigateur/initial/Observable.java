package navigateur.initial;

/**
 *
 * @author owner
 */
public interface Observable {

    public abstract void attacher(ActivateObserver e);

    public abstract void attacher(DeleteObserver e);

    public abstract void attacher(OpenObserver e);

    public abstract void attacher(CloseObserver e);

    public abstract void attacher(ChangeObserver e);

    public abstract void notifyActivate();

    public abstract void notifyDelete();

    public abstract void notifyOpen();

    public abstract void notifyClose();

    public abstract void notifyChange();

}
