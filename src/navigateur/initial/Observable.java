package navigateur.initial;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public interface Observable {

    /**
     *
     * @param e
     */
    public abstract void attachDelete(DeleteObserver e);

    /**
     *
     * @param e
     */
    public abstract void attachOpen(OpenObserver e);

    /**
     *
     * @param e
     */
    public abstract void attachClose(CloseObserver e);

    /**
     *
     * @param e
     */
    public abstract void attachChange(ChangeObserver e);

    /**
     *
     * @param e
     */
    public abstract void detachDelete(DeleteObserver e);

    /**
     *
     * @param e
     */
    public abstract void detachOpen(OpenObserver e);

    /**
     *
     * @param e
     */
    public abstract void detachClose(CloseObserver e);

    /**
     *
     * @param e
     */
    public abstract void detachChange(ChangeObserver e);

    /**
     *
     */
    public abstract void notifyDelete();

    /**
     *
     */
    public abstract void notifyOpen();

    /**
     *
     */
    public abstract void notifyClose();

    /**
     *
     */
    public abstract void notifyChange();

}
