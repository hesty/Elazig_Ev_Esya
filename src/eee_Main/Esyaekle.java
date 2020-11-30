/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eee_Main;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.swing.ImageIcon;

/**
 *
 * @author Cihat
 */
@Entity
@Table(name = "esyaekle", catalog = "eee", schema = "")
@NamedQueries({
    @NamedQuery(name = "Esyaekle.findAll", query = "SELECT e FROM Esyaekle e")
    , @NamedQuery(name = "Esyaekle.findByEsyaid", query = "SELECT e FROM Esyaekle e WHERE e.esyaid = :esyaid")
    , @NamedQuery(name = "Esyaekle.findByIlanEsya", query = "SELECT e FROM Esyaekle e WHERE e.ilanEsya = :ilanEsya")
    , @NamedQuery(name = "Esyaekle.findByFiyatEsya", query = "SELECT e FROM Esyaekle e WHERE e.fiyatEsya = :fiyatEsya")
    , @NamedQuery(name = "Esyaekle.findByAciklamaEsya", query = "SELECT e FROM Esyaekle e WHERE e.aciklamaEsya = :aciklamaEsya")
    , @NamedQuery(name = "Esyaekle.findByKategoriEsya", query = "SELECT e FROM Esyaekle e WHERE e.kategoriEsya = :kategoriEsya")
    , @NamedQuery(name = "Esyaekle.findByMarkaEsya", query = "SELECT e FROM Esyaekle e WHERE e.markaEsya = :markaEsya")
    , @NamedQuery(name = "Esyaekle.findByModelEsya", query = "SELECT e FROM Esyaekle e WHERE e.modelEsya = :modelEsya")
    , @NamedQuery(name = "Esyaekle.findByDurumEsya", query = "SELECT e FROM Esyaekle e WHERE e.durumEsya = :durumEsya")
    , @NamedQuery(name = "Esyaekle.findByGarantiEsya", query = "SELECT e FROM Esyaekle e WHERE e.garantiEsya = :garantiEsya")
    , @NamedQuery(name = "Esyaekle.findByTakasEsya", query = "SELECT e FROM Esyaekle e WHERE e.takasEsya = :takasEsya")
    , @NamedQuery(name = "Esyaekle.findByIlEsya", query = "SELECT e FROM Esyaekle e WHERE e.ilEsya = :ilEsya")
    , @NamedQuery(name = "Esyaekle.findByIlceEsya", query = "SELECT e FROM Esyaekle e WHERE e.ilceEsya = :ilceEsya")
    , @NamedQuery(name = "Esyaekle.findByMahalleEsya", query = "SELECT e FROM Esyaekle e WHERE e.mahalleEsya = :mahalleEsya")
    , @NamedQuery(name = "Esyaekle.findByAcikAdresEsya", query = "SELECT e FROM Esyaekle e WHERE e.acikAdresEsya = :acikAdresEsya")
    , @NamedQuery(name = "Esyaekle.findByTeknikOzelliklerEsya", query = "SELECT e FROM Esyaekle e WHERE e.teknikOzelliklerEsya = :teknikOzelliklerEsya")
    , @NamedQuery(name = "Esyaekle.findByIsimEsya", query = "SELECT e FROM Esyaekle e WHERE e.isimEsya = :isimEsya")
    , @NamedQuery(name = "Esyaekle.findByTelefonNoEsya", query = "SELECT e FROM Esyaekle e WHERE e.telefonNoEsya = :telefonNoEsya")})
public class Esyaekle implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "esyaid")
    private Integer esyaid;
    @Basic(optional = false)
    @Column(name = "ilanEsya")
    private String ilanEsya;
    @Basic(optional = false)
    @Column(name = "fiyatEsya")
    private String fiyatEsya;
    @Basic(optional = false)
    @Column(name = "aciklamaEsya")
    private String aciklamaEsya;
    @Basic(optional = false)
    @Column(name = "kategoriEsya")
    private String kategoriEsya;
    @Basic(optional = false)
    @Column(name = "markaEsya")
    private String markaEsya;
    @Basic(optional = false)
    @Column(name = "modelEsya")
    private String modelEsya;
    @Basic(optional = false)
    @Column(name = "durumEsya")
    private String durumEsya;
    @Basic(optional = false)
    @Column(name = "garantiEsya")
    private String garantiEsya;
    @Basic(optional = false)
    @Column(name = "takasEsya")
    private String takasEsya;
    @Basic(optional = false)
    @Column(name = "ilEsya")
    private String ilEsya;
    @Basic(optional = false)
    @Column(name = "ilceEsya")
    private String ilceEsya;
    @Basic(optional = false)
    @Column(name = "mahalleEsya")
    private String mahalleEsya;
    @Basic(optional = false)
    @Column(name = "acikAdresEsya")
    private String acikAdresEsya;
    @Basic(optional = false)
    @Column(name = "teknikOzelliklerEsya")
    private String teknikOzelliklerEsya;
    @Basic(optional = false)
    @Column(name = "isimEsya")
    private String isimEsya;
    @Basic(optional = false)
    @Column(name = "telefonNoEsya")
    private String telefonNoEsya;
    @Lob
    @Column(name = "resim")
    private byte[] resim;
    
     public  ImageIcon getImage(){
        
        return new ImageIcon(new ImageIcon(resim).getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
    }

    public Esyaekle() {
    }

    public Esyaekle(Integer esyaid) {
        this.esyaid = esyaid;
    }

    public Esyaekle(Integer esyaid, String ilanEsya, String fiyatEsya, String aciklamaEsya, String kategoriEsya, String markaEsya, String modelEsya, String durumEsya, String garantiEsya, String takasEsya, String ilEsya, String ilceEsya, String mahalleEsya, String acikAdresEsya, String teknikOzelliklerEsya, String isimEsya, String telefonNoEsya) {
        this.esyaid = esyaid;
        this.ilanEsya = ilanEsya;
        this.fiyatEsya = fiyatEsya;
        this.aciklamaEsya = aciklamaEsya;
        this.kategoriEsya = kategoriEsya;
        this.markaEsya = markaEsya;
        this.modelEsya = modelEsya;
        this.durumEsya = durumEsya;
        this.garantiEsya = garantiEsya;
        this.takasEsya = takasEsya;
        this.ilEsya = ilEsya;
        this.ilceEsya = ilceEsya;
        this.mahalleEsya = mahalleEsya;
        this.acikAdresEsya = acikAdresEsya;
        this.teknikOzelliklerEsya = teknikOzelliklerEsya;
        this.isimEsya = isimEsya;
        this.telefonNoEsya = telefonNoEsya;
    }

    public Integer getEsyaid() {
        return esyaid;
    }

    public void setEsyaid(Integer esyaid) {
        Integer oldEsyaid = this.esyaid;
        this.esyaid = esyaid;
        changeSupport.firePropertyChange("esyaid", oldEsyaid, esyaid);
    }

    public String getIlanEsya() {
        return ilanEsya;
    }

    public void setIlanEsya(String ilanEsya) {
        String oldIlanEsya = this.ilanEsya;
        this.ilanEsya = ilanEsya;
        changeSupport.firePropertyChange("ilanEsya", oldIlanEsya, ilanEsya);
    }

    public String getFiyatEsya() {
        return fiyatEsya;
    }

    public void setFiyatEsya(String fiyatEsya) {
        String oldFiyatEsya = this.fiyatEsya;
        this.fiyatEsya = fiyatEsya;
        changeSupport.firePropertyChange("fiyatEsya", oldFiyatEsya, fiyatEsya);
    }

    public String getAciklamaEsya() {
        return aciklamaEsya;
    }

    public void setAciklamaEsya(String aciklamaEsya) {
        String oldAciklamaEsya = this.aciklamaEsya;
        this.aciklamaEsya = aciklamaEsya;
        changeSupport.firePropertyChange("aciklamaEsya", oldAciklamaEsya, aciklamaEsya);
    }

    public String getKategoriEsya() {
        return kategoriEsya;
    }

    public void setKategoriEsya(String kategoriEsya) {
        String oldKategoriEsya = this.kategoriEsya;
        this.kategoriEsya = kategoriEsya;
        changeSupport.firePropertyChange("kategoriEsya", oldKategoriEsya, kategoriEsya);
    }

    public String getMarkaEsya() {
        return markaEsya;
    }

    public void setMarkaEsya(String markaEsya) {
        String oldMarkaEsya = this.markaEsya;
        this.markaEsya = markaEsya;
        changeSupport.firePropertyChange("markaEsya", oldMarkaEsya, markaEsya);
    }

    public String getModelEsya() {
        return modelEsya;
    }

    public void setModelEsya(String modelEsya) {
        String oldModelEsya = this.modelEsya;
        this.modelEsya = modelEsya;
        changeSupport.firePropertyChange("modelEsya", oldModelEsya, modelEsya);
    }

    public String getDurumEsya() {
        return durumEsya;
    }

    public void setDurumEsya(String durumEsya) {
        String oldDurumEsya = this.durumEsya;
        this.durumEsya = durumEsya;
        changeSupport.firePropertyChange("durumEsya", oldDurumEsya, durumEsya);
    }

    public String getGarantiEsya() {
        return garantiEsya;
    }

    public void setGarantiEsya(String garantiEsya) {
        String oldGarantiEsya = this.garantiEsya;
        this.garantiEsya = garantiEsya;
        changeSupport.firePropertyChange("garantiEsya", oldGarantiEsya, garantiEsya);
    }

    public String getTakasEsya() {
        return takasEsya;
    }

    public void setTakasEsya(String takasEsya) {
        String oldTakasEsya = this.takasEsya;
        this.takasEsya = takasEsya;
        changeSupport.firePropertyChange("takasEsya", oldTakasEsya, takasEsya);
    }

    public String getIlEsya() {
        return ilEsya;
    }

    public void setIlEsya(String ilEsya) {
        String oldIlEsya = this.ilEsya;
        this.ilEsya = ilEsya;
        changeSupport.firePropertyChange("ilEsya", oldIlEsya, ilEsya);
    }

    public String getIlceEsya() {
        return ilceEsya;
    }

    public void setIlceEsya(String ilceEsya) {
        String oldIlceEsya = this.ilceEsya;
        this.ilceEsya = ilceEsya;
        changeSupport.firePropertyChange("ilceEsya", oldIlceEsya, ilceEsya);
    }

    public String getMahalleEsya() {
        return mahalleEsya;
    }

    public void setMahalleEsya(String mahalleEsya) {
        String oldMahalleEsya = this.mahalleEsya;
        this.mahalleEsya = mahalleEsya;
        changeSupport.firePropertyChange("mahalleEsya", oldMahalleEsya, mahalleEsya);
    }

    public String getAcikAdresEsya() {
        return acikAdresEsya;
    }

    public void setAcikAdresEsya(String acikAdresEsya) {
        String oldAcikAdresEsya = this.acikAdresEsya;
        this.acikAdresEsya = acikAdresEsya;
        changeSupport.firePropertyChange("acikAdresEsya", oldAcikAdresEsya, acikAdresEsya);
    }

    public String getTeknikOzelliklerEsya() {
        return teknikOzelliklerEsya;
    }

    public void setTeknikOzelliklerEsya(String teknikOzelliklerEsya) {
        String oldTeknikOzelliklerEsya = this.teknikOzelliklerEsya;
        this.teknikOzelliklerEsya = teknikOzelliklerEsya;
        changeSupport.firePropertyChange("teknikOzelliklerEsya", oldTeknikOzelliklerEsya, teknikOzelliklerEsya);
    }

    public String getIsimEsya() {
        return isimEsya;
    }

    public void setIsimEsya(String isimEsya) {
        String oldIsimEsya = this.isimEsya;
        this.isimEsya = isimEsya;
        changeSupport.firePropertyChange("isimEsya", oldIsimEsya, isimEsya);
    }

    public String getTelefonNoEsya() {
        return telefonNoEsya;
    }

    public void setTelefonNoEsya(String telefonNoEsya) {
        String oldTelefonNoEsya = this.telefonNoEsya;
        this.telefonNoEsya = telefonNoEsya;
        changeSupport.firePropertyChange("telefonNoEsya", oldTelefonNoEsya, telefonNoEsya);
    }

    public byte[] getResim() {
        return resim;
    }

    public void setResim(byte[] resim) {
        byte[] oldResim = this.resim;
        this.resim = resim;
        changeSupport.firePropertyChange("resim", oldResim, resim);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (esyaid != null ? esyaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esyaekle)) {
            return false;
        }
        Esyaekle other = (Esyaekle) object;
        if ((this.esyaid == null && other.esyaid != null) || (this.esyaid != null && !this.esyaid.equals(other.esyaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eee_Main.Esyaekle[ esyaid=" + esyaid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
