/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author USER
 */
public class Sommet {
    
    private int id;
    
    private boolean visited;
    
    
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
    
    
}
