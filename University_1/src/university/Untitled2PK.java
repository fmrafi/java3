/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author My
 */
@Embeddable
public class Untitled2PK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SEMESTER")
    private String semester;
    @Basic(optional = false)
    @Column(name = "ADMIN_ID")
    private int adminId;

    public Untitled2PK() {
    }

    public Untitled2PK(String semester, int adminId) {
        this.semester = semester;
        this.adminId = adminId;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (semester != null ? semester.hashCode() : 0);
        hash += (int) adminId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Untitled2PK)) {
            return false;
        }
        Untitled2PK other = (Untitled2PK) object;
        if ((this.semester == null && other.semester != null) || (this.semester != null && !this.semester.equals(other.semester))) {
            return false;
        }
        if (this.adminId != other.adminId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "university.Untitled2PK[ semester=" + semester + ", adminId=" + adminId + " ]";
    }
    
}
