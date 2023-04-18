/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author USER
 */
public class Arete {
    
    private Sommet source;
    
    private Sommet destination;
    
    private int poids;

    public Arete(Sommet source, Sommet destination,int poids) {
        this.source = source;
        this.destination = destination;
        this.poids = poids;
    }
    
    
    public Arete(Sommet source,Sommet destination){
        this(source,destination,0);
    }

    public Sommet getDestination() {
        return destination;
    }

    public Sommet getSource() 
    {
        return source;
    }

    public int getPoids() {
        return poids;
    }
    

    public void setDestination(Sommet destination) {
        this.destination = destination;
    }

    public void setSource(Sommet source) {
        this.source = source;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }
    
    
    
    
    
    
    
    
}
