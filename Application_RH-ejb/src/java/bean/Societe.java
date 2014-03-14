/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author sara
 */
@Entity
public class Societe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String sigle;
    private String logo;
    private String pays;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_creation;  
    private String siege;
    private String confirmation;
    private String email;
    private String nom_gerant;
    private String prenom_gerant;
    private String coordonnee_gerant;
    private String service;
    private String sous_service;
    private String ville;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public String getSiege() {
        return siege;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom_gerant() {
        return nom_gerant;
    }

    public void setNom_gerant(String nom_gerant) {
        this.nom_gerant = nom_gerant;
    }

    public String getPrenom_gerant() {
        return prenom_gerant;
    }

    public void setPrenom_gerant(String prenom_gerant) {
        this.prenom_gerant = prenom_gerant;
    }

    public String getCoordonnee_gerant() {
        return coordonnee_gerant;
    }

    public void setCoordonnee_gerant(String coordonnee_gerant) {
        this.coordonnee_gerant = coordonnee_gerant;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSous_service() {
        return sous_service;
    }

    public void setSous_service(String sous_service) {
        this.sous_service = sous_service;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
    

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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Societe)) {
            return false;
        }
        Societe other = (Societe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Societe[ id=" + id + " ]";
    }
    
}
