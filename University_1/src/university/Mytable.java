/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author My
 */
@Entity
@Table(name = "mytable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mytable.findAll", query = "SELECT m FROM Mytable m"),
    @NamedQuery(name = "Mytable.findById", query = "SELECT m FROM Mytable m WHERE m.id = :id"),
    @NamedQuery(name = "Mytable.findByName1", query = "SELECT m FROM Mytable m WHERE m.name1 = :name1"),
    @NamedQuery(name = "Mytable.findByName2", query = "SELECT m FROM Mytable m WHERE m.name2 = :name2"),
    @NamedQuery(name = "Mytable.findByFather", query = "SELECT m FROM Mytable m WHERE m.father = :father"),
    @NamedQuery(name = "Mytable.findByMother", query = "SELECT m FROM Mytable m WHERE m.mother = :mother"),
    @NamedQuery(name = "Mytable.findByBdate", query = "SELECT m FROM Mytable m WHERE m.bdate = :bdate"),
    @NamedQuery(name = "Mytable.findByEamil", query = "SELECT m FROM Mytable m WHERE m.eamil = :eamil"),
    @NamedQuery(name = "Mytable.findBySemester", query = "SELECT m FROM Mytable m WHERE m.semester = :semester"),
    @NamedQuery(name = "Mytable.findByPhon", query = "SELECT m FROM Mytable m WHERE m.phon = :phon"),
    @NamedQuery(name = "Mytable.findByPyh", query = "SELECT m FROM Mytable m WHERE m.pyh = :pyh"),
    @NamedQuery(name = "Mytable.findByAddr", query = "SELECT m FROM Mytable m WHERE m.addr = :addr"),
    @NamedQuery(name = "Mytable.findByAdminid", query = "SELECT m FROM Mytable m WHERE m.adminid = :adminid")})
public class Mytable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name1")
    private String name1;
    @Basic(optional = false)
    @Column(name = "name2")
    private String name2;
    @Basic(optional = false)
    @Column(name = "father")
    private String father;
    @Basic(optional = false)
    @Column(name = "mother")
    private String mother;
    @Basic(optional = false)
    @Column(name = "bdate")
    @Temporal(TemporalType.DATE)
    private Date bdate;
    @Basic(optional = false)
    @Column(name = "eamil")
    private String eamil;
    @Basic(optional = false)
    @Lob
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "semester")
    private String semester;
    @Basic(optional = false)
    @Column(name = "phon")
    private int phon;
    @Basic(optional = false)
    @Column(name = "pyh")
    private String pyh;
    @Basic(optional = false)
    @Column(name = "addr")
    private String addr;
    @Basic(optional = false)
    @Column(name = "adminid")
    public int adminid;
    @Basic(optional = false)
    @Lob
    @Column(name = "adminpass")
    public String adminpass;

    public Mytable() {
    }

    public Mytable(Integer id) {
        this.id = id;
    }

    public Mytable(Integer id, String name1, String name2, String father, String mother, Date bdate, String eamil, String password, String semester, int phon, String pyh, String addr, int adminid, String adminpass) {
        this.id = id;
        this.name1 = name1;
        this.name2 = name2;
        this.father = father;
        this.mother = mother;
        this.bdate = bdate;
        this.eamil = eamil;
        this.password = password;
        this.semester = semester;
        this.phon = phon;
        this.pyh = pyh;
        this.addr = addr;
        this.adminid = adminid;
        this.adminpass = adminpass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getPhon() {
        return phon;
    }

    public void setPhon(int phon) {
        this.phon = phon;
    }

    public String getPyh() {
        return pyh;
    }

    public void setPyh(String pyh) {
        this.pyh = pyh;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass;
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
        if (!(object instanceof Mytable)) {
            return false;
        }
        Mytable other = (Mytable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "university.Mytable[ id=" + id + " ]";
    }

    ResultSet getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getadminid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
