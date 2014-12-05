
import java.util.Date;

/**
 *
 * @author guillaume
 */
public class Fichier extends Element {
    
    private int taille;

    public Fichier(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
    }

    @Override
    public int taille() {
        return taille;
    }
}
