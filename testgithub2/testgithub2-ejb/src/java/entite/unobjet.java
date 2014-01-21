/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entite;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author moi
 */
@Entity
public class unobjet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        
        if (!(object instanceof unobjet)) {
            return false;
        }
        unobjet other = (unobjet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.unobjet[ id=" + id + " ]";
    }
    
    private String nomObjet;

    /**
     * Get the value of nomObjet
     *
     * @return the value of nomObjet
     */
    public String getNomObjet() {
        return nomObjet;
    }

    /**
     * Set the value of nomObjet
     *
     * @param nomObjet new value of nomObjet
     */
    public void setNomObjet(String nomObjet) {
        this.nomObjet = nomObjet;//test
        
    }

    private String typeObjet;

    /**
     * Get the value of typeObjet
     *
     * @return the value of typeObjet
     */
    public String getTypeObjet() {
        return typeObjet;
    }

    /**
     * Set the value of typeObjet
     *
     * @param typeObjet new value of typeObjet
     */
    public void setTypeObjet(String typeObjet) {
        this.typeObjet = typeObjet;
        //commentaire origine portable
        //à supprimer sur youplaboom
    }

}
