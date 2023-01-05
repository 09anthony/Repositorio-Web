/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ANTHONY
 */
public class autor {
    private String cod_autor;
    private String nom_autor;
    private String libro;

    public autor() {
    }

    public autor(String cod_autor, String nom_autor, String libro) {
        this.cod_autor = cod_autor;
        this.nom_autor = nom_autor;
        this.libro = libro;
    }

    public String getCod_autor() {
        return cod_autor;
    }

    public void setCod_autor(String cod_autor) {
        this.cod_autor = cod_autor;
    }

    public String getNom_autor() {
        return nom_autor;
    }

    public void setNom_autor(String nom_autor) {
        this.nom_autor = nom_autor;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }
    
    
    
}
