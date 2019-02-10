/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author My
 */
@Entity
@Table(name = "UNTITLED")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Untitled.findAll", query = "SELECT u FROM Untitled u"),
    @NamedQuery(name = "Untitled.findById", query = "SELECT u FROM Untitled u WHERE u.id = :id"),
    @NamedQuery(name = "Untitled.findByFirstName", query = "SELECT u FROM Untitled u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "Untitled.findBySecName", query = "SELECT u FROM Untitled u WHERE u.secName = :secName"),
    @NamedQuery(name = "Untitled.findByFatherName", query = "SELECT u FROM Untitled u WHERE u.fatherName = :fatherName"),
    @NamedQuery(name = "Untitled.findByMotherName", query = "SELECT u FROM Untitled u WHERE u.motherName = :motherName"),
    @NamedQuery(name = "Untitled.findByAddress", query = "SELECT u FROM Untitled u WHERE u.address = :address"),
    @NamedQuery(name = "Untitled.findByEmail", query = "SELECT u FROM Untitled u WHERE u.email = :email"),
    @NamedQuery(name = "Untitled.findByPassWord", query = "SELECT u FROM Untitled u WHERE u.passWord = :passWord"),
    @NamedQuery(name = "Untitled.findByPhone", query = "SELECT u FROM Untitled u WHERE u.phone = :phone")})
public class Untitled implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "SEC_NAME")
    private String secName;
    @Basic(optional = false)
    @Column(name = "FATHER_NAME")
    private String fatherName;
    @Basic(optional = false)
    @Column(name = "MOTHER_NAME")
    private String motherName;
    @Basic(optional = false)
    @Column(name = "ADDRESS")
    private String address;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "PASS_WORD")
    private String passWord;
    @Basic(optional = false)
    @Column(name = "PHONE")
    private int phone;

    public Untitled() {
    }

    public Untitled(Integer id) {
        this.id = id;
    }

    public Untitled(Integer id, String firstName, String secName, String fatherName, String motherName, String address, String email, String passWord, int phone) {
        this.id = id;
        this.firstName = firstName;
        this.secName = secName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = address;
        this.email = email;
        this.passWord = passWord;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
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
        if (!(object instanceof Untitled)) {
            return false;
        }
        Untitled other = (Untitled) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "university.Untitled[ id=" + id + " ]";
    }
    
}
