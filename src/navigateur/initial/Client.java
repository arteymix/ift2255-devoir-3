package navigateur.initial;

/**
 *
 * @author guillaume
 */
public class Client {

    public int getTailleDossierActif() {
        return Navigateur.getInstance().getDossierActif().taille();
    }
    
}
