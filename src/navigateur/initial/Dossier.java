package navigateur.initial;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guillaume
 */
public class Dossier extends Element implements DeleteObserver {
    
    private List<Element> elements; 

    public Dossier(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
        elements = new ArrayList<>();
    }

    @Override
    public int taille() {
        int t = 0;
        for(Element e : elements){
            t += e.taille();
        }
        return t;
    }

    @Override
    public void updateDelete(Element e) {
        elements.remove(e);
        notifyChange();
    }

    public boolean add(Element e) {
        e.setPath(this.path);
        return elements.add(e);
    }
    
    
    
}
