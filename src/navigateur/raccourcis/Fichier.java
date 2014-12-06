package navigateur.raccourcis;

import java.util.Date;

/**
 * Fichier.
 * 
 * @author guillaume
 */
public class Fichier extends ElementRaccourciable {

    private int taille;
    
    public Fichier(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
    }

    @Override
    public int taille() {
        return taille;
    }

}
