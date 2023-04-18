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
public class Graphe {
    
   int nombreSommets;
   
    List<Arete> aretes;
    
    List<Sommet> sommets;
    
    
    public Graphe(int nombreSommets, List<Arete> aretes,List<Sommet>sommets)
    {
        this.nombreSommets = nombreSommets;
        this.aretes = aretes;
        this.sommets = sommets;
    }
    public Graphe(int nombreSommets){
        this(nombreSommets, null,null);
        
    }

    public int getNombreSommets() {
        return nombreSommets;
    }

    public List<Arete> getAretes() {
        return aretes;
    }

    public List<Sommet> getSommets() {
        return sommets;
    }

    public void setAretes(List<Arete> aretes) {
        this.aretes = aretes;
    }

    public void setNombreSommets(int nombreSommets) {
        this.nombreSommets = nombreSommets;
    }

    public void setSommets(List<Sommet> sommets) {
        this.sommets = sommets;
    }
    
    public void addArete(Arete arete){
        this.aretes.add(arete);
    }
    
    
    public void addSommet(Sommet sommet){
        this.sommets.add(sommet);
    }
    
    
    
    
    
    
    
    
    
    
    
}
