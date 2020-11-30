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
@Table(name = "evekle", catalog = "eee", schema = "")
@NamedQueries({
    @NamedQuery(name = "Evekle.findAll", query = "SELECT e FROM Evekle e")
    , @NamedQuery(name = "Evekle.findByEvId", query = "SELECT e FROM Evekle e WHERE e.evId = :evId")
    , @NamedQuery(name = "Evekle.findByBaslik", query = "SELECT e FROM Evekle e WHERE e.baslik = :baslik")
    , @NamedQuery(name = "Evekle.findByAciklama", query = "SELECT e FROM Evekle e WHERE e.aciklama = :aciklama")
    , @NamedQuery(name = "Evekle.findByFiyat", query = "SELECT e FROM Evekle e WHERE e.fiyat = :fiyat")
    , @NamedQuery(name = "Evekle.findByMetrekare", query = "SELECT e FROM Evekle e WHERE e.metrekare = :metrekare")
    , @NamedQuery(name = "Evekle.findByOdaSayisi", query = "SELECT e FROM Evekle e WHERE e.odaSayisi = :odaSayisi")
    , @NamedQuery(name = "Evekle.findByBulunduguKat", query = "SELECT e FROM Evekle e WHERE e.bulunduguKat = :bulunduguKat")
    , @NamedQuery(name = "Evekle.findByBinaYasi", query = "SELECT e FROM Evekle e WHERE e.binaYasi = :binaYasi")
    , @NamedQuery(name = "Evekle.findByKatSayisi", query = "SELECT e FROM Evekle e WHERE e.katSayisi = :katSayisi")
    , @NamedQuery(name = "Evekle.findByIsitma", query = "SELECT e FROM Evekle e WHERE e.isitma = :isitma")
    , @NamedQuery(name = "Evekle.findByBalkon", query = "SELECT e FROM Evekle e WHERE e.balkon = :balkon")
    , @NamedQuery(name = "Evekle.findByEsyaDurumu", query = "SELECT e FROM Evekle e WHERE e.esyaDurumu = :esyaDurumu")
    , @NamedQuery(name = "Evekle.findByKullanimDurumu", query = "SELECT e FROM Evekle e WHERE e.kullanimDurumu = :kullanimDurumu")
    , @NamedQuery(name = "Evekle.findByAidat", query = "SELECT e FROM Evekle e WHERE e.aidat = :aidat")
    , @NamedQuery(name = "Evekle.findByIl", query = "SELECT e FROM Evekle e WHERE e.il = :il")
    , @NamedQuery(name = "Evekle.findByIlce", query = "SELECT e FROM Evekle e WHERE e.ilce = :ilce")
    , @NamedQuery(name = "Evekle.findByMahalle", query = "SELECT e FROM Evekle e WHERE e.mahalle = :mahalle")
    , @NamedQuery(name = "Evekle.findByAcikadres", query = "SELECT e FROM Evekle e WHERE e.acikadres = :acikadres")
    , @NamedQuery(name = "Evekle.findByAdi", query = "SELECT e FROM Evekle e WHERE e.adi = :adi")
    , @NamedQuery(name = "Evekle.findByCeptelefonu", query = "SELECT e FROM Evekle e WHERE e.ceptelefonu = :ceptelefonu")
    , @NamedQuery(name = "Evekle.findByDisOzellikler", query = "SELECT e FROM Evekle e WHERE e.disOzellikler = :disOzellikler")
    , @NamedQuery(name = "Evekle.findByUlasim", query = "SELECT e FROM Evekle e WHERE e.ulasim = :ulasim")
    , @NamedQuery(name = "Evekle.findByCephe", query = "SELECT e FROM Evekle e WHERE e.cephe = :cephe")
    , @NamedQuery(name = "Evekle.findByIcOzellikler", query = "SELECT e FROM Evekle e WHERE e.icOzellikler = :icOzellikler")})
public class Evekle implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "evId")
    private Integer evId;
    @Basic(optional = false)
    @Column(name = "baslik")
    private String baslik;
    @Basic(optional = false)
    @Column(name = "aciklama")
    private String aciklama;
    @Basic(optional = false)
    @Column(name = "fiyat")
    private String fiyat;
    @Basic(optional = false)
    @Column(name = "metrekare")
    private String metrekare;
    @Basic(optional = false)
    @Column(name = "odaSayisi")
    private String odaSayisi;
    @Basic(optional = false)
    @Column(name = "bulunduguKat")
    private String bulunduguKat;
    @Basic(optional = false)
    @Column(name = "binaYasi")
    private String binaYasi;
    @Basic(optional = false)
    @Column(name = "katSayisi")
    private String katSayisi;
    @Basic(optional = false)
    @Column(name = "isitma")
    private String isitma;
    @Basic(optional = false)
    @Column(name = "balkon")
    private String balkon;
    @Basic(optional = false)
    @Column(name = "esyaDurumu")
    private String esyaDurumu;
    @Basic(optional = false)
    @Column(name = "kullanimDurumu")
    private String kullanimDurumu;
    @Basic(optional = false)
    @Column(name = "aidat")
    private String aidat;
    @Basic(optional = false)
    @Column(name = "il")
    private String il;
    @Basic(optional = false)
    @Column(name = "ilce")
    private String ilce;
    @Basic(optional = false)
    @Column(name = "mahalle")
    private String mahalle;
    @Basic(optional = false)
    @Column(name = "acikadres")
    private String acikadres;
    @Basic(optional = false)
    @Column(name = "adi")
    private String adi;
    @Basic(optional = false)
    @Column(name = "ceptelefonu")
    private String ceptelefonu;
    @Basic(optional = false)
    @Column(name = "disOzellikler")
    private String disOzellikler;
    @Basic(optional = false)
    @Column(name = "ulasim")
    private String ulasim;
    @Basic(optional = false)
    @Column(name = "cephe")
    private String cephe;
    @Basic(optional = false)
    @Column(name = "icOzellikler")
    private String icOzellikler;
    @Lob
    @Column(name = "evResim")
    private byte[] evResim;
      public  ImageIcon getImage(){
        
        return new ImageIcon(new ImageIcon(evResim).getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
    }

    public Evekle() {
    }

    public Evekle(Integer evId) {
        this.evId = evId;
    }

    public Evekle(Integer evId, String baslik, String aciklama, String fiyat, String metrekare, String odaSayisi, String bulunduguKat, String binaYasi, String katSayisi, String isitma, String balkon, String esyaDurumu, String kullanimDurumu, String aidat, String il, String ilce, String mahalle, String acikadres, String adi, String ceptelefonu, String disOzellikler, String ulasim, String cephe, String icOzellikler) {
        this.evId = evId;
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.fiyat = fiyat;
        this.metrekare = metrekare;
        this.odaSayisi = odaSayisi;
        this.bulunduguKat = bulunduguKat;
        this.binaYasi = binaYasi;
        this.katSayisi = katSayisi;
        this.isitma = isitma;
        this.balkon = balkon;
        this.esyaDurumu = esyaDurumu;
        this.kullanimDurumu = kullanimDurumu;
        this.aidat = aidat;
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.acikadres = acikadres;
        this.adi = adi;
        this.ceptelefonu = ceptelefonu;
        this.disOzellikler = disOzellikler;
        this.ulasim = ulasim;
        this.cephe = cephe;
        this.icOzellikler = icOzellikler;
    }

    public Integer getEvId() {
        return evId;
    }

    public void setEvId(Integer evId) {
        Integer oldEvId = this.evId;
        this.evId = evId;
        changeSupport.firePropertyChange("evId", oldEvId, evId);
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        String oldBaslik = this.baslik;
        this.baslik = baslik;
        changeSupport.firePropertyChange("baslik", oldBaslik, baslik);
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        String oldAciklama = this.aciklama;
        this.aciklama = aciklama;
        changeSupport.firePropertyChange("aciklama", oldAciklama, aciklama);
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        String oldFiyat = this.fiyat;
        this.fiyat = fiyat;
        changeSupport.firePropertyChange("fiyat", oldFiyat, fiyat);
    }

    public String getMetrekare() {
        return metrekare;
    }

    public void setMetrekare(String metrekare) {
        String oldMetrekare = this.metrekare;
        this.metrekare = metrekare;
        changeSupport.firePropertyChange("metrekare", oldMetrekare, metrekare);
    }

    public String getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(String odaSayisi) {
        String oldOdaSayisi = this.odaSayisi;
        this.odaSayisi = odaSayisi;
        changeSupport.firePropertyChange("odaSayisi", oldOdaSayisi, odaSayisi);
    }

    public String getBulunduguKat() {
        return bulunduguKat;
    }

    public void setBulunduguKat(String bulunduguKat) {
        String oldBulunduguKat = this.bulunduguKat;
        this.bulunduguKat = bulunduguKat;
        changeSupport.firePropertyChange("bulunduguKat", oldBulunduguKat, bulunduguKat);
    }

    public String getBinaYasi() {
        return binaYasi;
    }

    public void setBinaYasi(String binaYasi) {
        String oldBinaYasi = this.binaYasi;
        this.binaYasi = binaYasi;
        changeSupport.firePropertyChange("binaYasi", oldBinaYasi, binaYasi);
    }

    public String getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(String katSayisi) {
        String oldKatSayisi = this.katSayisi;
        this.katSayisi = katSayisi;
        changeSupport.firePropertyChange("katSayisi", oldKatSayisi, katSayisi);
    }

    public String getIsitma() {
        return isitma;
    }

    public void setIsitma(String isitma) {
        String oldIsitma = this.isitma;
        this.isitma = isitma;
        changeSupport.firePropertyChange("isitma", oldIsitma, isitma);
    }

    public String getBalkon() {
        return balkon;
    }

    public void setBalkon(String balkon) {
        String oldBalkon = this.balkon;
        this.balkon = balkon;
        changeSupport.firePropertyChange("balkon", oldBalkon, balkon);
    }

    public String getEsyaDurumu() {
        return esyaDurumu;
    }

    public void setEsyaDurumu(String esyaDurumu) {
        String oldEsyaDurumu = this.esyaDurumu;
        this.esyaDurumu = esyaDurumu;
        changeSupport.firePropertyChange("esyaDurumu", oldEsyaDurumu, esyaDurumu);
    }

    public String getKullanimDurumu() {
        return kullanimDurumu;
    }

    public void setKullanimDurumu(String kullanimDurumu) {
        String oldKullanimDurumu = this.kullanimDurumu;
        this.kullanimDurumu = kullanimDurumu;
        changeSupport.firePropertyChange("kullanimDurumu", oldKullanimDurumu, kullanimDurumu);
    }

    public String getAidat() {
        return aidat;
    }

    public void setAidat(String aidat) {
        String oldAidat = this.aidat;
        this.aidat = aidat;
        changeSupport.firePropertyChange("aidat", oldAidat, aidat);
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        String oldIl = this.il;
        this.il = il;
        changeSupport.firePropertyChange("il", oldIl, il);
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        String oldIlce = this.ilce;
        this.ilce = ilce;
        changeSupport.firePropertyChange("ilce", oldIlce, ilce);
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        String oldMahalle = this.mahalle;
        this.mahalle = mahalle;
        changeSupport.firePropertyChange("mahalle", oldMahalle, mahalle);
    }

    public String getAcikadres() {
        return acikadres;
    }

    public void setAcikadres(String acikadres) {
        String oldAcikadres = this.acikadres;
        this.acikadres = acikadres;
        changeSupport.firePropertyChange("acikadres", oldAcikadres, acikadres);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        String oldAdi = this.adi;
        this.adi = adi;
        changeSupport.firePropertyChange("adi", oldAdi, adi);
    }

    public String getCeptelefonu() {
        return ceptelefonu;
    }

    public void setCeptelefonu(String ceptelefonu) {
        String oldCeptelefonu = this.ceptelefonu;
        this.ceptelefonu = ceptelefonu;
        changeSupport.firePropertyChange("ceptelefonu", oldCeptelefonu, ceptelefonu);
    }

    public String getDisOzellikler() {
        return disOzellikler;
    }

    public void setDisOzellikler(String disOzellikler) {
        String oldDisOzellikler = this.disOzellikler;
        this.disOzellikler = disOzellikler;
        changeSupport.firePropertyChange("disOzellikler", oldDisOzellikler, disOzellikler);
    }

    public String getUlasim() {
        return ulasim;
    }

    public void setUlasim(String ulasim) {
        String oldUlasim = this.ulasim;
        this.ulasim = ulasim;
        changeSupport.firePropertyChange("ulasim", oldUlasim, ulasim);
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        String oldCephe = this.cephe;
        this.cephe = cephe;
        changeSupport.firePropertyChange("cephe", oldCephe, cephe);
    }

    public String getIcOzellikler() {
        return icOzellikler;
    }

    public void setIcOzellikler(String icOzellikler) {
        String oldIcOzellikler = this.icOzellikler;
        this.icOzellikler = icOzellikler;
        changeSupport.firePropertyChange("icOzellikler", oldIcOzellikler, icOzellikler);
    }

    public byte[] getEvResim() {
        return evResim;
    }

    public void setEvResim(byte[] evResim) {
        byte[] oldEvResim = this.evResim;
        this.evResim = evResim;
        changeSupport.firePropertyChange("evResim", oldEvResim, evResim);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evId != null ? evId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evekle)) {
            return false;
        }
        Evekle other = (Evekle) object;
        if ((this.evId == null && other.evId != null) || (this.evId != null && !this.evId.equals(other.evId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eee_Main.Evekle[ evId=" + evId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
