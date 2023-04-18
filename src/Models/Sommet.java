/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.List;

/**
 *
 * @author USER
 */
public class Sommet {
    
    private int id;
    
    private boolean visited;
    
    private List<Arete> voisins;
    
    
    public Sommet(int id)
    {
      this.id = id;
      this.visited = false;
    }

    public int getId() {
        return id;
    }
    
    

    public boolean isVisited() {
        return visited;
    }

    public List<Arete> getVoisins() {
        return voisins;
    }
    
    public void addVoisin(Arete arete){
        this.voisins.add(arete);
    }
    
    
    
    
}
