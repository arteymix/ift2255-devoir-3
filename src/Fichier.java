/**
 *
 * @author guillaume
 */
public class Fichier extends Element {
    
    private int taille;
    
    private String contenu;
    
    public String lire()
    {
        return contenu;
    }
    
    public void ecrire(String contenu)
    {
        this.contenu = contenu;
    }
    
    public int getTaille()
    {
        return taille;
    }
}
