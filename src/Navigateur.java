import java.util.List;

/**
 *
 * @author guillaume
 */
public class Navigateur implements ActivateObserver, ChangeObserver, CloseObserver, OpenObserver, DeleteObserver {
    
    public Dossier actif;
    public List<Dossier> dossiersOuvert;
    private Navigateur instance;
    
    private Navigateur(){
        this.instance = new Navigateur();
    }
    
    public Navigateur getInstance(){
        return instance;
    }

    @Override
    public void updateActivate(Element e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateClose(Element e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateOpen(Element e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateDelete(Element e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateChange(Element e) {
        if(dossiersOuvert.contains(e)){
            //Actualiser la vue du dossier.
        }
    }



}
