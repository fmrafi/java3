/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author My
 */
@Entity
@Table(name = "UNTITLED2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Untitled2.findAll", query = "SELECT u FROM Untitled2 u"),
    @NamedQuery(name = "Untitled2.findBySemester", query = "SELECT u FROM Untitled2 u WHERE u.untitled2PK.semester = :semester"),
    @NamedQuery(name = "Untitled2.findByPhy", query = "SELECT u FROM Untitled2 u WHERE u.phy = :phy"),
    @NamedQuery(name = "Untitled2.findByAdminId", query = "SELECT u FROM Untitled2 u WHERE u.untitled2PK.adminId = :adminId"),
    @NamedQuery(name = "Untitled2.findByAdminPass", query = "SELECT u FROM Untitled2 u WHERE u.adminPass = :adminPass")})
public class Untitled2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Untitled2PK untitled2PK;
    @Basic(optional = false)
    @Column(name = "PHY")
    private String phy;
    @Basic(optional = false)
    @Column(name = "ADMIN_PASS")
    private Boolean adminPass;

    public Untitled2() {
    }

    public Untitled2(Untitled2PK untitled2PK) {
        this.untitled2PK = untitled2PK;
    }

    public Untitled2(Untitled2PK untitled2PK, String phy, Boolean adminPass) {
        this.untitled2PK = untitled2PK;
        this.phy = phy;
        this.adminPass = adminPass;
    }

    public Untitled2(String semester, int adminId) {
        this.untitled2PK = new Untitled2PK(semester, adminId);
    }

    public Untitled2PK getUntitled2PK() {
        return untitled2PK;
    }

    public void setUntitled2PK(Untitled2PK untitled2PK) {
        this.untitled2PK = untitled2PK;
    }

    public String getPhy() {
        return phy;
    }

    public void setPhy(String phy) {
        this.phy = phy;
    }

    public Boolean getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(Boolean adminPass) {
        this.adminPass = adminPass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (untitled2PK != null ? untitled2PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Untitled2)) {
            return false;
        }
        Untitled2 other = (Untitled2) object;
        if ((this.untitled2PK == null && other.untitled2PK != null) || (this.untitled2PK != null && !this.untitled2PK.equals(other.untitled2PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "university.Untitled2[ untitled2PK=" + untitled2PK + " ]";
    }
    
}
