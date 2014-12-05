package navigateur.initial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
