/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public abstract class ElementDecorateur extends Element{

    private Element decorated;
    
    public ElementDecorateur(Element e) {
        super(e.name,e.creation,e.lastModified, e.path);
        this.decorated = e;
    }

    @Override
    public int taille() {
        return decorated.taille();
    }

    
    
}
