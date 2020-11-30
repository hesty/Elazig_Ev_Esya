package eee_Main;

import com.sun.mail.iap.ByteArray;
import eee_Login.kayitOlFrame;
import eee_Login.mysqL;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

public class anasayfaFrame extends javax.swing.JFrame {
    
    int xS;
    int yS;
    int pX, pY;
    int poX, poY;

    public anasayfaFrame() {

        initComponents();
        setLocationRelativeTo(null);
        setIcon();
        TableColumn tb = jTable1.getColumn("Resim");
        
        
        ComponentResizer cr = new ComponentResizer();
        cr.setMinimumSize(new Dimension(800, 801));
        cr.setMaximumSize(new Dimension(1980, 982));
        cr.registerComponent(this);
        cr.setSnapSize(new Dimension(10, 10));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("eee?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        esyaekleQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Esyaekle e");
        esyaekleList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : esyaekleQuery.getResultList();
        esyaekleQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Esyaekle e");
        esyaekleList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : esyaekleQuery1.getResultList();
        esyaekleQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Esyaekle e");
        esyaekleList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : esyaekleQuery2.getResultList();
        esyaekleQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Esyaekle e");
        esyaekleList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : esyaekleQuery3.getResultList();
        esyaekleQuery4 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Esyaekle e");
        esyaekleList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : esyaekleQuery4.getResultList();
        evekleQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Evekle e");
        evekleList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : evekleQuery.getResultList();
        ustPanel = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelFullSize = new javax.swing.JLabel();
        jLabelMinimized = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        solPanel = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        evPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        esyaPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        evEklePanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        esyaEklePanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bagisYapPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        hesabimPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        yardimPanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ortaPanel = new javax.swing.JPanel();
        esyaEkle = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        ilanesya = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        fiyatesya = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        aciklamaEsya = new javax.swing.JTextArea();
        jLabel61 = new javax.swing.JLabel();
        kategoriEsya = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        ilEsya = new javax.swing.JComboBox<>();
        ilceEsya = new javax.swing.JComboBox<>();
        mahalleEsya = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        acikAdresEsya = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        isimEsya = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        telefonNoEsya = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        resimLabel1 = new javax.swing.JLabel();
        fotografSec1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        markaEsya = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        modelEsya = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        durumEsya = new javax.swing.JComboBox<>();
        jLabel73 = new javax.swing.JLabel();
        garantiEsya = new javax.swing.JComboBox<>();
        takasEsya = new javax.swing.JComboBox<>();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        teknikOzelliklerEsya = new javax.swing.JTextArea();
        jLabel75 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        ev = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        evEkle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        metrekare = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        odaSayisi = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        bulunduguKat = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        binaYasi = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        katSayisi = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        isitma = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        balkon = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        esyaDurumu = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        kullanimDurumu = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        aidat = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        ilan = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        aciklama = new javax.swing.JTextArea();
        jLabel58 = new javax.swing.JLabel();
        fiyat = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        il = new javax.swing.JComboBox<>();
        ilce = new javax.swing.JComboBox<>();
        mahalle = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        acikAdres = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        isim = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        telefonNo = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        resimLabel = new javax.swing.JLabel();
        fotografSec = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        d1 = new javax.swing.JCheckBox();
        d4 = new javax.swing.JCheckBox();
        d7 = new javax.swing.JCheckBox();
        d10 = new javax.swing.JCheckBox();
        d13 = new javax.swing.JCheckBox();
        d16 = new javax.swing.JCheckBox();
        d19 = new javax.swing.JCheckBox();
        d20 = new javax.swing.JCheckBox();
        d17 = new javax.swing.JCheckBox();
        d14 = new javax.swing.JCheckBox();
        d11 = new javax.swing.JCheckBox();
        d5 = new javax.swing.JCheckBox();
        d8 = new javax.swing.JCheckBox();
        d2 = new javax.swing.JCheckBox();
        d3 = new javax.swing.JCheckBox();
        d6 = new javax.swing.JCheckBox();
        d9 = new javax.swing.JCheckBox();
        d12 = new javax.swing.JCheckBox();
        d15 = new javax.swing.JCheckBox();
        d18 = new javax.swing.JCheckBox();
        d21 = new javax.swing.JCheckBox();
        d0 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        u1 = new javax.swing.JCheckBox();
        u2 = new javax.swing.JCheckBox();
        u3 = new javax.swing.JCheckBox();
        u4 = new javax.swing.JCheckBox();
        u5 = new javax.swing.JCheckBox();
        u6 = new javax.swing.JCheckBox();
        u7 = new javax.swing.JCheckBox();
        u0 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c0 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        i6 = new javax.swing.JCheckBox();
        i1 = new javax.swing.JCheckBox();
        i11 = new javax.swing.JCheckBox();
        i21 = new javax.swing.JCheckBox();
        i16 = new javax.swing.JCheckBox();
        i26 = new javax.swing.JCheckBox();
        i31 = new javax.swing.JCheckBox();
        i2 = new javax.swing.JCheckBox();
        i7 = new javax.swing.JCheckBox();
        i12 = new javax.swing.JCheckBox();
        i17 = new javax.swing.JCheckBox();
        i32 = new javax.swing.JCheckBox();
        i22 = new javax.swing.JCheckBox();
        i27 = new javax.swing.JCheckBox();
        i3 = new javax.swing.JCheckBox();
        i8 = new javax.swing.JCheckBox();
        i13 = new javax.swing.JCheckBox();
        i18 = new javax.swing.JCheckBox();
        i28 = new javax.swing.JCheckBox();
        i33 = new javax.swing.JCheckBox();
        i9 = new javax.swing.JCheckBox();
        i4 = new javax.swing.JCheckBox();
        i19 = new javax.swing.JCheckBox();
        i29 = new javax.swing.JCheckBox();
        i24 = new javax.swing.JCheckBox();
        i34 = new javax.swing.JCheckBox();
        i14 = new javax.swing.JCheckBox();
        i35 = new javax.swing.JCheckBox();
        i30 = new javax.swing.JCheckBox();
        i25 = new javax.swing.JCheckBox();
        i20 = new javax.swing.JCheckBox();
        i15 = new javax.swing.JCheckBox();
        i10 = new javax.swing.JCheckBox();
        i5 = new javax.swing.JCheckBox();
        i0 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        esya = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        bagis = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        ilan1 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        ilan2 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        ilan4 = new javax.swing.JComboBox<>();
        jLabel78 = new javax.swing.JLabel();
        ilan3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        kullanici = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        kadiHesap = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        sifreHesap = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        yardim = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EEE");
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        ustPanel.setBackground(new java.awt.Color(243, 156, 18));

        jLabelClose.setFont(new java.awt.Font("Arial Narrow", 0, 21)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setAlignmentY(0.0F);
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });

        jLabelFullSize.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        jLabelFullSize.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFullSize.setText("□");
        jLabelFullSize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFullSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFullSizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelFullSizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelFullSizeMouseExited(evt);
            }
        });

        jLabelMinimized.setFont(new java.awt.Font("Arial Narrow", 0, 21)); // NOI18N
        jLabelMinimized.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimized.setText("—");
        jLabelMinimized.setToolTipText("");
        jLabelMinimized.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimized.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizedMouseExited(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_search_20px.png"))); // NOI18N
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextField1.setBackground(new java.awt.Color(243, 156, 18));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout ustPanelLayout = new javax.swing.GroupLayout(ustPanel);
        ustPanel.setLayout(ustPanelLayout);
        ustPanelLayout.setHorizontalGroup(
            ustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ustPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 974, Short.MAX_VALUE)
                .addComponent(jLabelMinimized)
                .addGap(18, 18, 18)
                .addComponent(jLabelFullSize)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addContainerGap())
        );
        ustPanelLayout.setVerticalGroup(
            ustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ustPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelFullSize)
                        .addComponent(jLabelMinimized)
                        .addComponent(jLabelClose))
                    .addGroup(ustPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ustPanelLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        solPanel.setBackground(java.awt.Color.darkGray);

        jLabelTitle.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Elazığ Ev Eşya");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        evPanel.setBackground(java.awt.Color.darkGray);
        evPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        evPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                evPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                evPanelMouseExited(evt);
            }
        });
        evPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_apartment_40px_1.png"))); // NOI18N
        evPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(243, 156, 18));
        jLabel5.setOpaque(true);
        evPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ev");
        evPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        esyaPanel.setBackground(java.awt.Color.darkGray);
        esyaPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        esyaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esyaPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                esyaPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                esyaPanelMouseExited(evt);
            }
        });
        esyaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_new_product_40px.png"))); // NOI18N
        esyaPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel8.setBackground(new java.awt.Color(243, 156, 18));
        esyaPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Eşya ");
        esyaPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        evEklePanel.setBackground(java.awt.Color.darkGray);
        evEklePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        evEklePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evEklePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                evEklePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                evEklePanelMouseExited(evt);
            }
        });
        evEklePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_plus_40px_1.png"))); // NOI18N
        evEklePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel11.setBackground(new java.awt.Color(243, 156, 18));
        evEklePanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 50, 6));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ev Ekle ");
        evEklePanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        esyaEklePanel.setBackground(java.awt.Color.darkGray);
        esyaEklePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        esyaEklePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esyaEklePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                esyaEklePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                esyaEklePanelMouseExited(evt);
            }
        });
        esyaEklePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_plus_40px_1.png"))); // NOI18N
        esyaEklePanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel14.setBackground(new java.awt.Color(243, 156, 18));
        esyaEklePanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 50, 6));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Eşya Ekle");
        esyaEklePanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        bagisYapPanel.setBackground(java.awt.Color.darkGray);
        bagisYapPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bagisYapPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bagisYapPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bagisYapPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bagisYapPanelMouseExited(evt);
            }
        });
        bagisYapPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_donate_40px.png"))); // NOI18N
        bagisYapPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel17.setBackground(new java.awt.Color(243, 156, 18));
        bagisYapPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Bağış Yap");
        bagisYapPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        hesabimPanel.setBackground(java.awt.Color.darkGray);
        hesabimPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hesabimPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hesabimPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hesabimPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hesabimPanelMouseExited(evt);
            }
        });
        hesabimPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_40px.png"))); // NOI18N
        hesabimPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel20.setBackground(new java.awt.Color(243, 156, 18));
        hesabimPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Kullanıcı Hesabım");
        hesabimPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 20, -1, -1));

        yardimPanel.setBackground(java.awt.Color.darkGray);
        yardimPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yardimPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yardimPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yardimPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yardimPanelMouseExited(evt);
            }
        });
        yardimPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yardimPanelKeyPressed(evt);
            }
        });
        yardimPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_help_40px.png"))); // NOI18N
        yardimPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel29.setBackground(new java.awt.Color(243, 156, 18));
        yardimPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Yardım");
        yardimPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("© Copyright EEE 2020");

        javax.swing.GroupLayout solPanelLayout = new javax.swing.GroupLayout(solPanel);
        solPanel.setLayout(solPanelLayout);
        solPanelLayout.setHorizontalGroup(
            solPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(evPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(esyaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(evEklePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(esyaEklePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bagisYapPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(hesabimPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
            .addComponent(yardimPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(solPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(solPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel31)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addGap(28, 28, 28))
        );
        solPanelLayout.setVerticalGroup(
            solPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(evPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(evEklePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(esyaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(esyaEklePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bagisYapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(hesabimPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(yardimPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addContainerGap())
        );

        ortaPanel.setBackground(new java.awt.Color(153, 153, 153));

        esyaEkle.setBackground(new java.awt.Color(153, 153, 153));
        esyaEkle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eşya Ekle", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jPanel13.setBackground(new java.awt.Color(153, 153, 153));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İlan Kısa Detay", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(51, 51, 51));

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setText("İlan Başlığı *");

        ilanesya.setBackground(new java.awt.Color(204, 204, 204));
        ilanesya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilanesyaActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 51, 51));
        jLabel62.setText("Fiyat *");

        fiyatesya.setBackground(new java.awt.Color(204, 204, 204));
        fiyatesya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fiyatesyaKeyTyped(evt);
            }
        });

        aciklamaEsya.setBackground(new java.awt.Color(204, 204, 204));
        aciklamaEsya.setColumns(20);
        aciklamaEsya.setRows(5);
        jScrollPane5.setViewportView(aciklamaEsya);

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setText("Açıklama *");

        kategoriEsya.setBackground(new java.awt.Color(102, 102, 102));
        kategoriEsya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Bilgisayar", "Cep Telefonu", "Fotoğraf & Kamera", "Ev Dekorasyon", "Ev Elektroniği", "Elektrikli Ev Aletleri", "Giyim & Aksesuar", "Kişisel Bakım & Kozmetik", "Diğer" }));
        kategoriEsya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriEsyaActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("Kategori*");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fiyatesya)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel60)
                            .addComponent(ilanesya)
                            .addComponent(jLabel62)
                            .addComponent(jLabel61)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(jLabel55)
                            .addComponent(kategoriEsya, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ilanesya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fiyatesya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kategoriEsya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(153, 153, 153));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel14.setPreferredSize(new java.awt.Dimension(684, 311));

        jTabbedPane3.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane3.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel15.setBackground(new java.awt.Color(153, 153, 153));

        jLabel63.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 51));
        jLabel63.setText("İl  *");

        jLabel64.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 51, 51));
        jLabel64.setText("İlçe *");

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 51));
        jLabel65.setText("Mahalle *");

        ilEsya.setBackground(new java.awt.Color(102, 102, 102));
        ilEsya.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ilEsya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elazığ" }));

        ilceEsya.setBackground(new java.awt.Color(102, 102, 102));
        ilceEsya.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ilceEsya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Ağın", "Alacakaya", "Arıcak", "Baskil", "Karakoçan", "Keban", "Kovancılar", "Maden", "Merkez", "Palu", "Sivrice" }));
        ilceEsya.setToolTipText("");
        ilceEsya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilceEsyaActionPerformed(evt);
            }
        });

        mahalleEsya.setBackground(new java.awt.Color(102, 102, 102));
        mahalleEsya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Merkez Mah                                                                 ", "Şenpınar Mah                                                               ", "Afet Evleri Mah (Yeni Yerleşim Yeri Mah) (Demirçarık Köyü)                 ", "Altınayva Köyü                                                             ", "Armutlu Mah (Samançay Köyü)                                                ", "Aşağıyabanlı Köyü                                                          ", "Bademli Köyü                                                               ", "Bahadırlar Köyü                                                            ", "Balkayası Köyü                                                             ", "Beyelması Köyü                                                             ", "Demirçarık Köyü                                                            ", "Dibekli Köyü                                                               ", "Gümüşsuyu Mah (Samançay Köyü)                                              ", "Kaşpınar Köyü                                                              ", "Konak Mah (Saraycık Köyü)                                                  ", "Kurtuluş Mah (Öğrendik Köyü)                                               ", "Modanlı Köyü                                                               ", "Ortayabanlı Mah (Aşağıyabanlı Köyü)                                        ", "Öğrendik Köyü                                                              ", "Pulköy Köyü                                                                ", "Salkımlı Mah (Yenipayam Köyü)                                              ", "Samançay Köyü                                                              ", "Saraycık Köyü                                                              ", "Tarlabaşı Mah (Öğrendik Köyü)                                              ", "Yedibağ Köyü                                                               ", "Yenipayam Köyü                                                             ", "Altınçanak Mah                                                             ", "Altıoluk Mah                                                               ", "Gülaman Mah                                                                ", "Gündoğdu Mah                                                               ", "Merkez Mah                                                                 ", "Sularbaşı Mah                                                              ", "Bağin Mah (Yalnızdamlar Köyü)                                              ", "Bakladamlar Köyü                                                           ", "Çakmakkaya Köyü                                                            ", "Çallıca Mah (Çataklı Köyü)                                                 ", "Çanakça Köyü                                                               ", "Çataklı Köyü                                                               ", "Davan Mah (Çanakça Köyü)                                                   ", "Düzağaç Mah (İncebayır Köyü)                                               ", "Esenlik Köyü                                                               ", "Gürçubuk Köyü                                                              ", "Halkalı Köyü                                                               ", "İncebayır Köyü                                                             ", "Kayranlı Köyü                                                              ", "Oğuz Mah (İncebayır Köyü)                                                  ", "Yalnızdamlar Köyü                                                          ", "Yılmaz Mah (İncebayır Köyü)                                                ", "Gümüşyaka Mah                                                              ", "Halil Yavuz Mah                                                            ", "Hürriyet Mah                                                               ", "Mustafa Çelebi Mah                                                         ", "Saman Mah                                                                  ", "Serinevler Mah                                                             ", "Simserkis Mah                                                              ", "Vali Göktayoğlu Mah                                                        ", "Akyıldız Mah (Küplüce Köyü)                                                ", "Albayrak Mah (Küplüce Köyü)                                                ", "Boğazlı Mah (Kayahisar Köyü)                                               ", "Bozçavuş Köyü                                                              ", "Bölükbaşı Mah (Bükardı Köyü)                                               ", "Cami Mah (Erimli Köyü)                                                     ", "Cumhuriyet Mah (Erimli Köyü)                                               ", "Çavuşdere Köyü                                                             ", "Çay Mah (Üçocak Köyü)                                                      ", "Çevrecik Köyü                                                              ", "Erbağı Köyü                                                                ", "Göründü Köyü                                                               ", "Göztepe Mah (Yoğunbilek Köyü)                                              ", "Güleç Mah (Erimli Köyü)                                                    ", "Güvenevler Mah (Erimli Köyü)                                               ", "Haberci Mah (Üçocak Köyü)                                                  ", "Ilıcak Mah (Küplüce Köyü)                                                  ", "Kambertepe Köyü                                                            ", "Kaplanbağ Mah (Bükardı Köyü)                                               ", "Karakaş Köyü                                                               ", "Kayahisar Köyü                                                             ", "Kışla Mah (Erimli Köyü)                                                    ", "Kutlu Düğün Mah (Üçocak Köyü)                                              ", "Küplüce Köyü                                                               ", "Merkez Mah (Üçocak Köyü)                                                   ", "Ormanpınar Köyü                                                            ", "Pınarbaşı Mah (Bükardı Köyü)                                               ", "Til Mah (Karakaş Köyü)                                                     ", "Uzun Söğüt Mah (Yoğunbilek Köyü)                                           ", "Yaylabaşı Mah (Bükardı Köyü)                                               ", "Yoğunbilek Köyü                                                            ", "Zeynet Mah (Bükardı Köyü)                                                  ", "Ziyaret Mah (Üçocak Köyü)                                                  ", "Canbeyler Mah                                                              ", "Cumhuriyet Mah                                                             ", "Eskibaskil Mah                                                             ", "Mustafa Demirel Mah                                                        ", "Odabaşı Mah                                                                ", "Şefkat Mah                                                                 ", "Adacık Mah (Topaluşağı Köyü)                                               ", "Akarsu Mah (Emirhan Köyü)                                                  ", "Akbayır Mah (Eskiköy Köyü)                                                 ", "Akçalar Mah (Konacık Köyü)                                                 ", "Akdemir Köyü                                                               ", "Akkonak Mah (Şeyh Hasan Köyü)                                              ", "Akkuş Mah (Doğancık Köyü)                                                  ", "Aksakal Mah (Suyatağı Köyü)                                                ", "Aktaş Mah (Hacımustafaköy Köyü)                                            ", "Akyazı Mah (Aşağıkuluşağı Köyü)                                            ", "Aladikme Köyü                                                              ", "Alangören Köyü                                                             ", "Ali Bal Mah (Akdemir Köyü)                                                 ", "Aliağa Mah (Şahindere Köyü)                                                ", "Alibaba Mah (Gemici Köyü)                                                  ", "Alihac Mah (Karagedik Köyü)                                                ", "Altınuşağı Köyü                                                            ", "Ambarlı Mah (Koçyolu Köyü)                                                 ", "Asaflar Mah (Doğancık Köyü)                                                ", "Aşağı Ardışlı Mah (Karakaş Köyü)                                           ", "Aşağı Atlılar Mah (Karakaş Köyü)                                           ", "Aşağı Eşme Mah (Yalındam Köyü)                                             ", "Aşağı Kardeşler Mah (Harabekayış Köyü)                                     ", "Aşağıevler Mah (Yaylanlı Köyü)                                             ", "Aşağıgeçit Mah (Akuşağı Köyü)                                              ", "Atamlar Mah (Karoğlu Köyü)                                                 ", "Aydınlar Mezrası Mah (Aşağıkuluşağı Köyü)                                  ", "Aydoğan Mah (Aladikme Köyü)                                                ", "Bahçeli Evler Mah (Kadıköy Köyü)                                           ", "Ballıca Mah (Sarıtaş Köyü)                                                 ", "Barış Mah (Aşağıkuluşağı Köyü)                                             ", "Başağaç Mah (Hacıuşağı Köyü)                                               ", "Baznalar Mah (Yukarıkuluşağı Köyü)                                         ", "Bejan Mah (Şahaplı Köyü)                                                   ", "Bekcili Mah (Doğancık Köyü)                                                ", "Bekirmustafa Mah (Paşakonağı Köyü)                                         ", "Belhan Mah (Kayabeyli Köyü)                                                ", "Besikan Mah (Koçyolu Köyü)                                                 ", "Beyler Mah (Aşağıkuluşağı Köyü)                                            ", "Beyler Mah (Resulkahya Köyü)                                               ", "Bilaluşağı Köyü                                                            ", "Bolucuk Mah (Doğancık Köyü)                                                ", "Bozarmut Mah (Sarıtaş Köyü)                                                ", "Bozoğlak Köyü                                                              ", "Bozolar Mah (Aladikme Köyü)                                                ", "Büyüler Mah (Karaali Köyü)                                                 ", "Cansız Kayış Mah (Aladikme Köyü)                                           ", "Ceberler Mah (Çavuşlu Köyü)                                                ", "Cebrail Mah (Akuşağı Köyü)                                                 ", "Çağlar Mah (Meydancık Köyü)                                                ", "Çakırlı Mah (Karaali Köyü)                                                 ", "Çamaltı Mah (Yaylanlı Köyü)                                                ", "Çamlı Mah (Hacımustafaköy Köyü)                                            ", "Çapkurlar Mah (Çavuşlu Köyü)                                               ", "Çavuşlu Mah (Beşbölük Köyü)                                                ", "Çayıran Mah (Paşakonağı Köyü)                                              ", "Çevreköy Mah (Suyatağı Köyü)                                               ", "Çitili Mah (Karaali Köyü)                                                  ", "Çoğanlı Mah (İmikuşağı Köyü)                                               ", "Çoğraş Mah (Aladikme Köyü)                                                 ", "Çubuklu Mah (Karoğlu Köyü)                                                 ", "Çulhalar Mah (Koçyolu Köyü)                                                ", "Dallıca Mah (Altınuşağı Köyü)                                              ", "Damlataş Mah (Hacımustafaköy Köyü)                                         ", "Davut Mah (Yıldızlı Köyü)                                                  ", "Dayılar Mah (Kutlugün Köyü)                                                ", "Deliktaş Köyü                                                              ", "Demirlibahçe Köyü                                                          ", "Dervişler Mah (Akuşağı Köyü)                                               ", "Deşt Mah (Gemici Köyü)                                                     ", "Diğer Karakaş Mah (Karakaş Köyü)                                           ", "Dilek Mah (Konalga Köyü)                                                   ", "Diyerbeyler Mah (Akuşağı Köyü)                                             ", "Doğanlar Mah (Altınuşağı Köyü)                                             ", "Dokoşağı Mah (Karaali Köyü)                                                ", "Dolma Mah (Bozoğlak Köyü)                                                  ", "Doraş Mah (Tavşanuşağı Köyü)                                               ", "Dörtyol Mah (Kızıluşağı Köyü)                                              ", "Dursunlar Mah (Hacımustafaköy Köyü)                                        ", "Düğüntepe Köyü                                                             ", "Düşeli Mah (Aladikme Köyü)                                                 ", "Düz Mah (Beşbölük Köyü)                                                    ", "Düz Mah (Doğancık Köyü)                                                    ", "Erler Mah (Hacıhüseyinler Köyü)                                            ", "Eskiköy Köyü                                                               ", "Faduluşağı Mah (Sarıtaş Köyü)                                              ", "Fakir Mah (Emirhan Köyü)                                                   ", "Fırat Mah (Yaylanlı Köyü)                                                  ", "Gedebük Mah (Pınarlı Köyü)                                                 ", "Gedek Mah (Yukarıkuluşağı Köyü)                                            ", "Gejikan Mah (Şahaplı Köyü)                                                 ", "Geli Mah (Topaluşağı Köyü)                                                 ", "Gemici Köyü                                                                ", "Göleler Mah (Akuşağı Köyü)                                                 ", "Göllüce Mah (Karakaş Köyü)                                                 ", "Göluşağı Mah (Beşbölük Köyü)                                               ", "Gülhaç Mah (Resulkahya Köyü)                                               ", "Güllübağ Mah (Konalga Köyü)                                                ", "Güllüce Mah (Alangören Köyü)                                               ", "Gümüşçay Mah (Konalga Köyü)                                                ", "Gündüz Mah (Kızıluşağı Köyü)                                               ", "Güneşli Mah (Şituşağı Köyü)                                                ", "Güzelli Mah (Düğüntepe Köyü)                                               ", "Hacı Hasan Mah (Işıklar Köyü)                                              ", "Hacı Mah (Hacımustafaköy Köyü)                                             ", "Hacı Ömer Mah (Aladikme Köyü)                                              ", "Hacıhaliloğlu Mah (Kızıluşağı Köyü)                                        ", "Hacıhüseyinler Köyü                                                        ", "Hacımehmetli Köyü                                                          ", "Hacımustafa Mah (Hacıhüseyinler Köyü)                                      ", "Hacıuşağı Köyü                                                             ", "Hacıyusuflar Mah (Konalga Köyü)                                            ", "Haci  Bekir Mah (Harabekayış Köyü)                                         ", "Haci Temur Mah (Akuşağı Köyü)                                              ", "Haliçler Mah (Koçyolu Köyü)                                                ", "Halitoğlu Mah (Akuşağı Köyü)                                               ", "Harabekayış Köyü                                                           ", "Hardi Mah (Gemici Köyü)                                                    ", "Hardiçay Mah (Deliktaş Köyü)                                               ", "Harman Mah (Karaali Köyü)                                                  ", "Harmanlı Mah (Yıldızlı Köyü)                                               ", "Harmetik Mah (Koçyolu Köyü)                                                ", "Haydarkulu Mah (Konacık Köyü)                                              ", "Hocalar Mah (Hacıhüseyinler Köyü)                                          ", "Hüyükköy Köyü                                                              ", "Işıklar Köyü                                                               ", "Işıklı Mah (Yeniocak Köyü)                                                 ", "İlhanlar Mah (Çavuşlu Köyü)                                                ", "İlhanlar Mah (Doğancık Köyü)                                               ", "İpşir Mah (Karakaş Köyü)                                                   ", "İskender Mah (Aşağıkuluşağı Köyü)                                          ", "Kale Mah (Suyatağı Köyü)                                                   ", "Kalecik Mah (Sarıtaş Köyü)                                                 ", "Kaluşağı Mah (Çavuşlu Köyü)                                                ", "Kamikli Mah (Çiğdemlik Köyü)                                               ", "Kanatlı Mah (Eskiköy Köyü)                                                 ", "Karaali Köyü                                                               ", "Karaca Mah (Hacımustafaköy Köyü)                                           ", "Karagedik Köyü                                                             ", "Karakaş Köyü                                                               ", "Karakavak Mah (Hacımustafaköy Köyü)                                        ", "Karameşe Mah (Karakaş Köyü)                                                ", "Karpuzlu Mah (Karagedik Köyü)                                              ", "Karşıyaka Mah (Pınarlı Köyü)                                               ", "Kasımlar Mah (Yukarıkuluşağı Köyü)                                         ", "Kasuşağı Mah (Karagedik Köyü)                                              ", "Kayabeyli Köyü                                                             ", "Keçik Mah (Karoğlu Köyü)                                                   ", "Keçilli Mah (Emirhan Köyü)                                                 ", "Kem Mah (Topaluşağı Köyü)                                                  ", "Kemerli Mah (Doğancık Köyü)                                                ", "Kılıçlı Mah (Söğütdere Köyü)                                               ", "Kıran Mah (Konacık Köyü)                                                   ", "Kırhasan Mah (Çiğdemlik Köyü)                                              ", "Kızılyazı Mah (Hacımehmetli Köyü)                                          ", "Kiziruşağı Mah (Tatlıpayam Köyü)                                           ", "Koçyolu Köyü                                                               ", "Konacık Köyü                                                               ", "Konalga Köyü                                                               ", "Konuklu Mah (Akuşağı Köyü)                                                 ", "Köfteler Mah (Gemici Köyü)                                                 ", "Körbekir Mah (Harabekayış Köyü)                                            ", "Kösek Mah (Kızıluşağı Köyü)                                                ", "Köseoğlu Mah (Kızıluşağı Köyü)                                             ", "Köz Mah (Resulkahya Köyü)                                                  ", "Kumlu Mah (Düğüntepe Köyü)                                                 ", "Kuran Mah (Yaylanlı Köyü)                                                  ", "Kurucu Mah (Konalga Köyü)                                                  ", "Kurugül Mah (Yaylanlı Köyü)                                                ", "Kuşsarayı Köyü                                                             ", "Kut Mah (Karoğlu Köyü)                                                     ", "Kuzucuk Mah (Yukarıkuluşağı Köyü)                                          ", "Küllük Mah (Kutlugün Köyü)                                                 ", "Laçular Mah (Konalga Köyü)                                                 ", "Memişler Mah (Aşağıkuluşağı Köyü)                                          ", "Merkez Mah (Akuşağı Köyü)                                                  ", "Merkez Mah (Altınuşağı Köyü)                                               ", "Merkez Mah (Aşağıkuluşağı Köyü)                                            ", "Merkez Mah (Beşbölük Köyü)                                                 ", "Merkez Mah (Çavuşlu Köyü)                                                  ", "Merkez Mah (Çiğdemlik Köyü)                                                ", "Merkez Mah (Emirhan Köyü)                                                  ", "Merkez Mah (Habibuşağı Köyü)                                               ", "Merkez Mah (İçlikaval Köyü)                                                ", "Merkez Mah (İmikuşağı Köyü)                                                ", "Merkez Mah (Kadıköy Köyü)                                                  ", "Merkez Mah (Karagedik Köyü)                                                ", "Merkez Mah (Karakaş Köyü)                                                  ", "Merkez Mah (Karoğlu Köyü)                                                  ", "Merkez Mah (Kızıluşağı Köyü)                                               ", "Merkez Mah (Kumlutarla Köyü)                                               ", "Merkez Mah (Kutlugün Köyü)                                                 ", "Merkez Mah (Paşakonağı Köyü)                                               ", "Merkez Mah (Pınarlı Köyü)                                                  ", "Merkez Mah (Sarıtaş Köyü)                                                  ", "Merkez Mah (Söğütdere Köyü)                                                ", "Merkez Mah (Suyatağı Köyü)                                                 ", "Merkez Mah (Şituşağı Köyü)                                                 ", "Merkez Mah (Yalındam Köyü)                                                 ", "Merkez Mah (Yeniocak Köyü)                                                 ", "Merkez Mah (Yukarıkuluşağı Köyü)                                           ", "Meşeşaban Mah (Yıldızlı Köyü)                                              ", "Meval Uşağı Mah (Akuşağı Köyü)                                             ", "Meydancık Köyü                                                             ", "Mışmişler Mah (Yaylanlı Köyü)                                              ", "Mollabekir Mah (Aşağıkuluşağı Köyü)                                        ", "Mollaismail Mah (Yukarıkuluşağı Köyü)                                      ", "Munzur Mah (Şahaplı Köyü)                                                  ", "Ocaklı Mah (Söğütdere Köyü)                                                ", "Okul Ve Sağlık Ocağı Mah (Şituşağı Köyü)                                   ", "Omik Mah (Topaluşağı Köyü)                                                 ", "Onbaşı Mah (Kızıluşağı Köyü)                                               ", "Ovacık Mah (Konalga Köyü)                                                  ", "Öteşaluşağı Mah (Akuşağı Köyü)                                             ", "Özbaşı Mah (Konalga Köyü)                                                  ", "Resulkahya Köyü                                                            ", "Sağırlar Mah (Yalındam Köyü)                                               ", "Sakolar Mah (Söğütdere Köyü)                                               ", "Sal Mah (Konalga Köyü)                                                     ", "Samanlı Mah (Hacıuşağı Köyü)                                               ", "Sapanlı Mah (Topaluşağı Köyü)                                              ", "Sekmen Mah (Sarıtaş Köyü)                                                  ", "Selviler Mah (Aladikme Köyü)                                               ", "Sinan Mah (Gemici Köyü)                                                    ", "Sincan Mah (Tatlıpayam Köyü)                                               ", "Soylu Mah (Beşbölük Köyü)                                                  ", "Subaşı Mah (Doğancık Köyü)                                                 ", "Subaylar Mah (Akdemir Köyü)                                                ", "Süleyman Mah (Yıldızlı Köyü)                                               ", "Sütlüce Mah (Emirhan Köyü)                                                 ", "Şah Mah (Söğütdere Köyü)                                                   ", "Şahaplı Köyü                                                               ", "Şahindere Köyü                                                             ", "Şahinler Mah (Altınuşağı Köyü)                                             ", "Şarge Mah (Hacımehmetli Köyü)                                              ", "Şeyh Hasan Köyü                                                            ", "Şimşek Mah (Karaali Köyü)                                                  ", "Şituşağı Köyü                                                              ", "Şükür Mah (Şituşağı Köyü)                                                  ", "Tabaklar Mah (Yukarıkuluşağı Köyü)                                         ", "Tacikan Mah (Söğütdere Köyü)                                               ", "Tarlacık Mah (Şituşağı Köyü)                                               ", "Taşkapı Mah (Hacıuşağı Köyü)                                               ", "Taşlık Mah (Karakaş Köyü)                                                  ", "Tatlıpayam Köyü                                                            ", "Tavuklu Mah (Düğüntepe Köyü)                                               ", "Tekağaç Mah (Aladikme Köyü)                                                ", "Temurhalil Mah (Yukarıkuluşağı Köyü)                                       ", "Tepe Altı Mah (Tavşanuşağı Köyü)                                           ", "Topal Mah (Karoğlu Köyü)                                                   ", "Topaluşağı Köyü                                                            ", "Topluca Mah (Akdemir Köyü)                                                 ", "Tuzluca Mah (Işıklar Köyü)                                                 ", "Türbe Mah (Hacımehmetli Köyü)                                              ", "Uğurlu Mah (Konalga Köyü)                                                  ", "Üçbölük Mah (Şeyh Hasan Köyü)                                              ", "Üsmıhtan Mah (Söğütdere Köyü)                                              ", "Üzümlü Mah (Konalga Köyü)                                                  ", "Velipalas Mah (Aladikme Köyü)                                              ", "Y.İ.Ö.B.O. Mah (Doğancık Köyü)                                             ", "Yağmurlu Mah (Konalga Köyü)                                                ", "Yamaçlı Mah (Hacımustafaköy Köyü)                                          ", "Yanık Bağ Mah (Hacıhüseyinler Köyü)                                        ", "Yapraklı Mah (Eskiköy Köyü)                                                ", "Yapraklı Mah (Hacıhüseyinler Köyü)                                         ", "Yaşar Mah (Hacımustafaköy Köyü)                                            ", "Yaylanlı Köyü                                                              ", "Yazıevleri Mah (Yeniocak Köyü)                                             ", "Yazıkonak Mah (Harabekayış Köyü)                                           ", "Yeni Mah (Çavuşlu Köyü)                                                    ", "Yeni Mah (Yukarıkuluşağı Köyü)                                             ", "Yıldızlı Köyü                                                              ", "Yırıklar Mah (Koçyolu Köyü)                                                ", "Yukarı Ardıçlı Mah (Karakaş Köyü)                                          ", "Yukarı Atlılar Mah (Karakaş Köyü)                                          ", "Yukarı Çide Mah (Akuşağı Köyü)                                             ", "Yukarı Deliktaş Mah (Deliktaş Köyü)                                        ", "Yukarı Eşme Mah (Yalındam Köyü)                                            ", "Yukarı Kardeşler Mah (Harabekayış Köyü)                                    ", "Yukarı Zemzem Mah (Karoğlu Köyü)                                           ", "Yukarıgeçit Mah (Akuşağı Köyü)                                             ", "Yukarıköy Mah (Doğancık Köyü)                                              ", "Yusuflu Mah (Çavuşlu Köyü)                                                 ", "Yuvacık Mah (Şituşağı Köyü)                                                ", "Yuvalar Mah (Şituşağı Köyü)                                                ", "Yüzgeçler Mah (Çiğdemlik Köyü)                                             ", "Zelihan Mah (Aladikme Köyü)                                                ", "Ziyaret Mah (Doğancık Köyü)                                                ", "Bahçelievler Mah                                                           ", "Gölpınar Mah                                                               ", "Karşıyaka Mah                                                              ", "Kırkpınar Mah                                                              ", "Kulubaba Mah                                                               ", "Tepe Mah                                                                   ", "Yeni Mah                                                                   ", "Abdalan Mah (Okçular Köyü)                                                 ", "Ağamezrası Köyü                                                            ", "Akarbaşı Köyü                                                              ", "Akbulak Köyü                                                               ", "Akçiçek Köyü                                                               ", "Akkuş Köyü                                                                 ", "Akpınar Köyü                                                               ", "Akyokuş Köyü                                                               ", "Alabal Köyü                                                                ", "Alayağmur Köyü                                                             ", "Ali Mezrası Mah (Yoğunağaç Köyü)                                           ", "Altınoluk Köyü                                                             ", "Aşağı Mah (Kuşçu Köyü)                                                     ", "Aşağıovacık Köyü                                                           ", "Bağlıağaç Köyü                                                             ", "Bahçecik Köyü                                                              ", "Balcalı Köyü                                                               ", "Bardaklı Köyü                                                              ", "Başyurt Köyü                                                               ", "Bazlama Köyü                                                               ", "Beydere Köyü                                                               ", "Bulgurcuk Köyü                                                             ", "Cabbar Mah (Alayağmur Köyü)                                                ", "Cumhuriyet Köyü                                                            ", "Çalıkaya Köyü                                                              ", "Çamardı Köyü                                                               ", "Çan Köyü                                                                   ", "Çanakçı Köyü                                                               ", "Çatalyol Köyü                                                              ", "Çavuşyolu Köyü                                                             ", "Çayırdam Köyü                                                              ", "Çayırgülü Köyü                                                             ", "Çayırlık Mah (Çayırgülü Köyü)                                              ", "Çelebi Köyü                                                                ", "Çitak Köyü                                                                 ", "Çukurca Mah (Yoğunağaç Köyü)                                               ", "Dal Mah (Koçyiğitler Köyü)                                                 ", "Dede Mezrası Mah (Üçbudak Köyü)                                            ", "Değirmen Mah (Alayağmur Köyü)                                              ", "Değirmendere Mah (Alabal Köyü)                                             ", "Değirmendüzü Mah (Balcalı Köyü)                                            ", "Delitaş Mah (Korudibi Köyü)                                                ", "Demirdelen Köyü                                                            ", "Demirtaş Köyü                                                              ", "Demirtepe Köyü                                                             ", "Derince Mah (Yalıntaş Köyü)                                                ", "Deveci Köyü                                                                ", "Deveci Yol Altı Mah (Kuşçu Köyü)                                           ", "Doğançukur Mah (Sarihan Köyü)                                              ", "Doğanoğlu Köyü                                                             ", "Dokuz Veren Mah (Kümbet Köyü)                                              ", "Dumluyazı Köyü                                                             ", "Durmuşköy Köyü                                                             ", "Dursun Mah (Çamardı Köyü)                                                  ", "Düğünlü Mah (Kavakdere Köyü)                                               ", "Elif Mah (Akarbaşı Köyü)                                                   ", "Gelincik Mah (Okçular Köyü)                                                ", "Gordan Mah (Pamuklu Köyü)                                                  ", "Gölyaylası Mah (Sarıcan Köyü)                                              ", "Gözerek Köyü                                                               ", "Gülhüseyin Mah (Okçular Köyü)                                              ", "Güllüce Köyü                                                               ", "Gümüşakar Köyü                                                             ", "Gündeğdi Köyü                                                              ", "Hamurkesen Köyü                                                            ", "Hamzalı Köyü                                                               ", "İlbey Mah (Akarbaşı Köyü)                                                  ", "İnceler Mah (Kızılpınar Köyü)                                              ", "İsabey Köyü                                                                ", "Kalecik Köyü                                                               ", "Kalkankaya Köyü                                                            ", "Karabük Mah (Mahmutlu Köyü)                                                ", "Karaçan Köyü                                                               ", "Karakoçan Köyü                                                             ", "Karapınar Köyü                                                             ", "Karasakal Köyü                                                             ", "Kavakdere Köyü                                                             ", "Kavalcık Köyü                                                              ", "Keklikköy Köyü                                                             ", "Kengerli Mah (Yeniköy Köyü)                                                ", "Kırgıl Köyü                                                                ", "Kızılca Köyü                                                               ", "Kızılpınar Köyü                                                            ", "Kocadayı Köyü                                                              ", "Koç Mah (Akarbaşı Köyü)                                                    ", "Koçan Mah (Okçular Köyü)                                                   ", "Koçyiğitler Köyü                                                           ", "Korudibi Köyü                                                              ", "Köm Mah (Hamurkesen Köyü)                                                  ", "Köryusuf Köyü                                                              ", "Kubatlı Mah (Kuşbayırı Köyü)                                               ", "Kucak Mah (Korudibi Köyü)                                                  ", "Kulundere Köyü                                                             ", "Kuruca Mah (Koçyiğitler Köyü)                                              ", "Kuruk Mah (Doğanoğlu Köyü)                                                 ", "Kuşbayırı Köyü                                                             ", "Kuşçu Köyü                                                                 ", "Kuşçu Palu Yolu Mah (Kuşçu Köyü)                                           ", "Kümbet Köyü                                                                ", "Mahmutlu Köyü                                                              ", "Maksutali Köyü                                                             ", "Meşeli Mah (Okçular Köyü)                                                  ", "Mezra Mah (Gündeğdi Köyü)                                                  ", "Milahasan Mah (Akbulak Köyü)                                               ", "Mirahmet Köyü                                                              ", "Okçular Köyü                                                               ", "Ormancık Köyü                                                              ", "Orta Mah (Pamuklu Köyü)                                                    ", "Özlüce Köyü                                                                ", "Paşayaylası Köyü                                                           ", "Pembelik Mah (Pamuklu Köyü)                                                ", "Pilavtepe Köyü                                                             ", "Polan Mah (Alabal Köyü)                                                    ", "Sağın Köyü                                                                 ", "Sağucak Köyü                                                               ", "Sarı Ceviz Mah (Yalıntaş Köyü)                                             ", "Sarıbaşak Köyü                                                             ", "Sarihan Köyü                                                               ", "Söğütlü Mah (Altınoluk Köyü)                                               ", "Subaşı Mah (Sarıcan Köyü)                                                  ", "Süleyman Çiftliği Mah (Akçiçek Köyü)                                       ", "Şahhüseyin Mah (Ağamezrası Köyü)                                           ", "Şeman Mah (Korudibi Köyü)                                                  ", "Tatlıca Mah (Kızılpınar Köyü)                                              ", "Tekardıç Köyü                                                              ", "Tepebaşı Mah (Çelebi Köyü)                                                 ", "Turan Mah (Dumluyazı Köyü)                                                 ", "Uysal Mah (Durmuşköy Köyü)                                                 ", "Üçbudak Köyü                                                               ", "Ürünlü Mah (Koçyiğitler Köyü)                                              ", "Yalıntaş Köyü                                                              ", "Yamac Yolu Mah (Kuşçu Köyü)                                                ", "Yemişlik Mah (Sağın Köyü)                                                  ", "Yenice Köyü                                                                ", "Yenikaya Köyü                                                              ", "Yeniköy Köyü                                                               ", "Yeşilbelen Köyü                                                            ", "Yoğunağaç Köyü                                                             ", "Yolcatı Mah (Yenice Köyü)                                                  ", "Yoncalı Mah (Dumluyazı Köyü)                                               ", "Yukarıovacık Köyü                                                          ", "Yücekonak Köyü                                                             ", "Yüzev Köyü                                                                 ", "Zilgölü Mah (Alayağmur Köyü)                                               ", "Baraj Mah                                                                  ", "Değirmenbaşı Mah                                                           ", "Fırat Mah                                                                  ", "Kallar Mah                                                                 ", "Acısu Mah (Akçatepe Köyü)                                                  ", "Akçatepe Köyü                                                              ", "Akgömlek Köyü                                                              ", "Alikan Mezrası Mah (Çevrekaya Köyü)                                        ", "Altınkürek Köyü                                                            ", "Arkulu Mah (Aslankaşı Köyü)                                                ", "Aslankaşı Köyü                                                             ", "Aşağı Demirli Mah (Beydeğirmeni Köyü)                                      ", "Aşağı Mah (Örenyaka Köyü)                                                  ", "Aşağıçakmak Köyü                                                           ", "Aşörgen Mah (Altıyaka Köyü)                                                ", "Bademli Köyü                                                               ", "Bahçeli Köyü                                                               ", "Bayındır Köyü                                                              ", "Beydeğirmeni Köyü                                                          ", "Bölükçalı Köyü                                                             ", "Büklümlü Köyü                                                              ", "Cabbar Mah (Altıyaka Köyü)                                                 ", "Ciban Mezrası Mah (Akgömlek Köyü)                                          ", "Çakmaklı Mah (Beydeğirmeni Köyü)                                           ", "Çalık Çayı Mah (Kurşunkaya Köyü)                                           ", "Çalık Köyü                                                                 ", "Çay Mezrası Mah (Çevrekaya Köyü)                                           ", "Çevrekaya Köyü                                                             ", "Dede Mah (Altıyaka Köyü)                                                   ", "Değirmen Mevkii Mah (Bademli Köyü)                                         ", "Denizli Köyü                                                               ", "Derince Mezrası Mah (Altınkürek Köyü)                                      ", "Doğan Mah (Akçatepe Köyü)                                                  ", "Dursunlu Mah (Göldere Köyü)                                                ", "Dursunlu Mezrası Mah (Kuşçu Köyü)                                          ", "Dürümlü Köyü                                                               ", "Emre Mah (Akçatepe Köyü)                                                   ", "Gökbelen Köyü                                                              ", "Göldere Köyü                                                               ", "Güneytepe Köyü                                                             ", "Hamurlu Mezrası Mah (Çevrekaya Köyü)                                       ", "İbolar Mah (Aslankaşı Köyü)                                                ", "Karabey Mezrası Mah (Topkıran Köyü)                                        ", "Karaçor Mezrası Mah (Akgömlek Köyü)                                        ", "Karaçor Mezrası Mah (Gökbelen Köyü)                                        ", "Karahüseyin Mezrası Mah (Gökbelen Köyü)                                    ", "Karşı Mah (Örenyaka Köyü)                                                  ", "Karşı Mevkii Mah (Altınkürek Köyü)                                         ", "Karşıyaka Mah (Altıyaka Köyü)                                              ", "Kırklar Mezrası Mah (Sağdıçlar Köyü)                                       ", "Koçemin Mah (Altıyaka Köyü)                                                ", "Konak Mezrası Mah (Topkıran Köyü)                                          ", "Kopuzlu Köyü                                                               ", "Koyunuşağı Köyü                                                            ", "Kurşunkaya Köyü                                                            ", "Kuşçu Köyü                                                                 ", "Mandere Mezrası Mah (Taşkesen Köyü)                                        ", "Melilan Mah (Beydeğirmeni Köyü)                                            ", "Merkez Mah (Altıyaka Köyü)                                                 ", "Orta Mevkii Mah (Altınkürek Köyü)                                          ", "Orta Mezra Mah (Sağdıçlar Köyü)                                            ", "Pınarlar Mah (Nimri Köyü)                                                  ", "Sağdıçlar Köyü                                                             ", "Sino Mezrası Mah (Bademli Köyü)                                            ", "Soğanlı Mah (Kurşunkaya Köyü)                                              ", "Soğuk Su Mezrası Mah (Gökbelen Köyü)                                       ", "Süleymanlı Mah (Çalık Köyü)                                                ", "Şahverdiyen Mah (Altınkürek Köyü)                                          ", "Şüşan Mah (Altınkürek Köyü)                                                ", "Taktah Mezrası Mah (Çevrekaya Köyü)                                        ", "Taşkesen Köyü                                                              ", "Taşkonak Mezrası Mah (Çevrekaya Köyü)                                      ", "Topkıran Köyü                                                              ", "Ulupınar Köyü                                                              ", "Üçpınar Köyü                                                               ", "Yahyalı Mezrası Mah (Denizli Köyü)                                         ", "Yukarı Demirli Mah (Beydeğirmeni Köyü)                                     ", "Yukarı Kuşçu Mah (Kuşçu Köyü)                                              ", "Yukarı Mah (Örenyaka Köyü)                                                 ", "Yukarı Mevkii Mah (Altınkürek Köyü)                                        ", "Bağlar Mah                                                                 ", "Bahçelievler Mah                                                           ", "Çarşı Başı Mah                                                             ", "Çay Başı Mah                                                               ", "Fatih Mah                                                                  ", "Gültepe Mah                                                                ", "Heybet Mah                                                                 ", "İsmet Paşa Mah                                                             ", "Kapıaçmaz Mah                                                              ", "Toki Mah                                                                   ", "Tuna Mah                                                                   ", "Yeni Mah                                                                   ", "Adalı Köyü                                                                 ", "Akmezra Köyü                                                               ", "Akpınar Mah (Karaman Köyü)                                                 ", "Altınkum Mah (Çaybağı Köyü)                                                ", "Aşağı Kazanlar Mah (Yukarıkazanlar Köyü)                                   ", "Aşağı Mezra Mah (Kolluca Köyü)                                             ", "Aşağıdemirci Köyü                                                          ", "Aşağıkanatlı Köyü                                                          ", "Aşağıköse Köyü                                                             ", "Aşağımirahmet Köyü                                                         ", "Avlağı Köyü                                                                ", "Ayyıldız Mah (Ekinözü Köyü)                                                ", "Bağgülü Köyü                                                               ", "Bahçelievler Mah (Kavakköy Köyü)                                           ", "Bahçelievler Mah (Yarımca Köyü)                                            ", "Başaklı Mah (Karasungur Köyü)                                              ", "Bayramyazı Köyü                                                            ", "Beroç Mah (Yenidam Köyü)                                                   ", "Beşaret Mah (Kuşçu Köyü)                                                   ", "Beşpınar Köyü                                                              ", "Beyaz Pınar Mah (Karıncaköy Köyü)                                          ", "Bilalköy Köyü                                                              ", "Bülbül Mah (Bağgülü Köyü)                                                  ", "Cumhuriyet Mah (Çakırkaş Köyü)                                             ", "Çarşı Mah (Yarımca Köyü)                                                   ", "Çatakbaşı Köyü                                                             ", "Çaybağı Köyü                                                               ", "Çelebi Köyü                                                                ", "Çiftlik Köyü                                                               ", "Değirmentaşı Köyü                                                          ", "Demirbaş Mah (Yeşildere Köyü)                                              ", "Demirci Köyü                                                               ", "Dörtyol Mah (Uyandık Köyü)                                                 ", "Durmuşlar Köyü                                                             ", "Ekinbağı Köyü                                                              ", "Ekinözü Köyü                                                               ", "Emirhan Mah (Gözecik Köyü)                                                 ", "Esen Tepe Mah (Yarımca Köyü)                                               ", "Esenkavak Mah (Yeşildere Köyü)                                             ", "Esentepe Mah (Ekinözü Köyü)                                                ", "Fatih Mah (Yarımca Köyü)                                                   ", "Gedikyurt Köyü                                                             ", "Giyimli Mah (Uyandık Köyü)                                                 ", "Göçmezler Köyü                                                             ", "Gökçedal Köyü                                                              ", "Gölbaşı Mah (Çatakbaşı Köyü)                                               ", "Gözecik Köyü                                                               ", "Gülçatı Köyü                                                               ", "Güler Mah (Soğukpınar Köyü)                                                ", "Günceren Mah (Aşağımirahmet Köyü)                                          ", "Güneşli Mah (Topağaç Köyü)                                                 ", "Hacı Yusuf Mah (Yeşildere Köyü)                                            ", "Hacımekke Köyü                                                             ", "Hacısam Köyü                                                               ", "Hoşmat Mah (Çakırkaş Köyü)                                                 ", "İğdeli Köyü                                                                ", "İncedal Mah (Durmuşlar Köyü)                                               ", "İsaağamezrası Köyü                                                         ", "Kacar Köyü                                                                 ", "Kamışlı Mah (Soğukpınar Köyü)                                              ", "Karabörk Köyü                                                              ", "Karaman Köyü                                                               ", "Karasungur Köyü                                                            ", "Karıncaköy Köyü                                                            ", "Kavakköy Köyü                                                              ", "Kayalık Köyü                                                               ", "Kemaşlı Mah (Karasungur Köyü)                                              ", "Kireçalan Mah (Uyandık Köyü)                                               ", "Kolluca Köyü                                                               ", "Konaklı Mah (Değirmentaşı Köyü)                                            ", "Kopuzlar Mah (Uyandık Köyü)                                                ", "Köprüdere Köyü                                                             ", "Kuşağacı Köyü                                                              ", "Kuşaklı Mah (Uyandık Köyü)                                                 ", "Kuşçu Köyü                                                                 ", "Levent Mah (Soğanlı Köyü)                                                  ", "Mezra Mezrası Mah (Kuşçu Köyü)                                             ", "Mirmehmet Mah (Çatakbaşı Köyü)                                             ", "Muratbağı Köyü                                                             ", "Mustafaköy Köyü                                                            ", "Mutlucan Mah (Uyandık Köyü)                                                ", "Nişankaya Köyü                                                             ", "Okçular Köyü                                                               ", "Osmanağa Köyü                                                              ", "Payamlı Köyü                                                               ", "Piyazgül Mah (Karıncaköy Köyü)                                             ", "Salkımlı Köyü                                                              ", "Saraybahçe Köyü                                                            ", "Sarı Çoban Mah (Soğanlı Köyü)                                              ", "Sarıbuğday Köyü                                                            ", "Selim Mah (Çelebi Köyü)                                                    ", "Seyrantepe Mah (Yeşildere Köyü)                                            ", "Soğanlı Köyü                                                               ", "Soğukpınar Köyü                                                            ", "Sorukom Mah (Soğanlı Köyü)                                                 ", "Sultanbağ Mah (Çelebi Köyü)                                                ", "Sürekli Köyü                                                               ", "Sütpınar Mah (İğdeli Köyü)                                                 ", "Şekerci Köyü                                                               ", "Şenova Köyü                                                                ", "Tabanözü Köyü                                                              ", "Taşçanak Köyü                                                              ", "Taşören Köyü                                                               ", "Tatar Köyü                                                                 ", "Tepebağ Köyü                                                               ", "Topağaç Köyü                                                               ", "Topağaç Mah (Çaybağı Köyü)                                                 ", "Topraklı Mah (Soğanlı Köyü)                                                ", "Tuluk Mah (Karasungur Köyü)                                                ", "Uyandık Köyü                                                               ", "Uyandık Mah (Çaybağı Köyü)                                                 ", "Uzunova Köyü                                                               ", "Vali Fahribey Köyü                                                         ", "Yamaçova Mah (Karaman Köyü)                                                ", "Yanıkara Mah (Gökçedal Köyü)                                               ", "Yanlızçam Mah (Aşağımirahmet Köyü)                                         ", "Yazıbaşı Köyü                                                              ", "Yenidam Köyü                                                               ", "Yenikaya Mah (Sarıbuğday Köyü)                                             ", "Yeniköy Köyü                                                               ", "Yeşildere Köyü                                                             ", "Yeşilköy Köyü                                                              ", "Yıdıbek Mah (Soğanlı Köyü)                                                 ", "Yılbaşı Köyü                                                               ", "Yol Bükü Mah (Çakırkaş Köyü)                                               ", "Yoncalıbayır Köyü                                                          ", "Yukarı Köse Mah (Aşağıköse Köyü)                                           ", "Yukarıdemirli Köyü                                                         ", "Yukarıkanatlı Köyü                                                         ", "Yukarıkazanlar Köyü                                                        ", "Yukarımirahmet Köyü                                                        ", "Yünlüce Mah (Değirmentaşı Köyü)                                            ", "Bahçelievler Mah                                                           ", "Camii Kebir Mah                                                            ", "Acıbadem Mah (Çitliköy Köyü)                                               ", "Ağadibek Köyü                                                              ", "Akboğa Köyü                                                                ", "Akburç Mah (Naldöken Köyü)                                                 ", "Altıntarla Köyü                                                            ", "Arslantaşı Köyü                                                            ", "Aşağı Karatop Mah (Karatop Köyü)                                           ", "Aşağı Meydancık Mah (Çayırköy Köyü)                                        ", "Bağarası Mah (Dutpınar Köyü)                                               ", "Bahçe Mah (Naldöken Köyü)                                                  ", "Bahçedere Köyü                                                             ", "Bakaçak Mah (Dutpınar Köyü)                                                ", "Bezikan Mah (Çayırköy Köyü)                                                ", "Bük Mah (Kaşlıca Köyü)                                                     ", "Camii Mah (Çitliköy Köyü)                                                  ", "Cumhuriyetçi Köyü                                                          ", "Çakıroğlu Köyü                                                             ", "Çalkaya Köyü                                                               ", "Çay Mah (Naldöken Köyü)                                                    ", "Çayırköm Mah (Çitliköy Köyü)                                               ", "Çayırköy Köyü                                                              ", "Çınarçık Mah (Dutpınar Köyü)                                               ", "Çörekli Mah (Tekevler Köyü)                                                ", "Dağ Mah (Polatköy Köyü)                                                    ", "Demokan Mah (Naldöken Köyü)                                                ", "Dere Mah (Çitliköy Köyü)                                                   ", "Dere Mah (Örtülü Köyü)                                                     ", "Dilekkaya Mah (Tekevler Köyü)                                              ", "Dutpınar Köyü                                                              ", "Eğerli Mah (Kayalar Köyü)                                                  ", "Eğrikavak Köyü                                                             ", "Göl Önü Mah (Gezin Köyü)                                                   ", "Günbağı Mah (Kaşlıca Köyü)                                                 ", "Güvendik Mah (Durmuştepe Köyü)                                             ", "Güzelbağ Mah (Kayalar Köyü)                                                ", "Güzelevler Mah (Naldöken Köyü)                                             ", "Hanevleri Köyü                                                             ", "Haraba Mah (Cumhuriyetçi Köyü)                                             ", "Haraba Mah (Çitliköy Köyü)                                                 ", "Harabe Mah (Tekevler Köyü)                                                 ", "Hatunköy Köyü                                                              ", "Hopanlar Mah (Ağadibek Köyü)                                               ", "Işıktepe Köyü                                                              ", "İstasyon Mah (Kızıltepe Köyü)                                              ", "Karabıyık Mah (Çayırköy Köyü)                                              ", "Karagülle Mah (Durmuştepe Köyü)                                            ", "Karataş Mah (Işıktepe Köyü)                                                ", "Karatop Köyü                                                               ", "Kartaldere Köyü                                                            ", "Kaşlıca Köyü                                                               ", "Kavak Gazi Ercan Mah (Kavak Köyü)                                          ", "Kavak Kara Ali Mah (Kavak Köyü)                                            ", "Kavak Köyü                                                                 ", "Kavak Küçük Bilal Mah (Kavak Köyü)                                         ", "Kayalar Köyü                                                               ", "Kısabekir Mah (Sağrılı Köyü)                                               ", "Kızıltepe Köyü                                                             ", "Kirazlı Mah (Cumhuriyetçi Köyü)                                            ", "Koçkonağı Köyü                                                             ", "Köy Sokağı Mah (Kızıltepe Köyü)                                            ", "Kumyazı Köyü                                                               ", "Kutuşağı Mah (Naldöken Köyü)                                               ", "Küçükkömler Mah (Sağrılı Köyü)                                             ", "Küçükova Köyü                                                              ", "Mastek Mah (Karatop Köyü)                                                  ", "Merkez Mah (Gezin Köyü)                                                    ", "Meşedibi Mah (Karatop Köyü)                                                ", "Mollalar Mah (Çakıroğlu Köyü)                                              ", "Naldöken Köyü                                                              ", "Nüzul Mah (Sağrılı Köyü)                                                   ", "Osman Çayır Mah (Çalkaya Köyü)                                             ", "Örtülü Köyü                                                                ", "Özay Mah (Eğrikavak Köyü)                                                  ", "Özyurt Mah (Tekevler Köyü)                                                 ", "Plajköy Köyü                                                               ", "Polatköy Köyü                                                              ", "Sağrılı Köyü                                                               ", "Samanlı Mah (Çitliköy Köyü)                                                ", "Sarıkavak Mah (Çalkaya Köyü)                                               ", "Sarıyer Mah (Naldöken Köyü)                                                ", "Seterli Mah (Arslantaşı Köyü)                                              ", "Seyhan Mah (Koçkonağı Köyü)                                                ", "Sinan Mah (Durmuştepe Köyü)                                                ", "Şaman Mah (Naldöken Köyü)                                                  ", "Şehbayram Mah (Kayalar Köyü)                                               ", "Şehoğlu Mah (Yoncapınar Köyü)                                              ", "Tecer Mah (Yoncapınar Köyü)                                                ", "Tekevler Köyü                                                              ", "Tellikaya Mah (Koçkonağı Köyü)                                             ", "Tellolar Mah (Çakıroğlu Köyü)                                              ", "Tepe Mah (Polatköy Köyü)                                                   ", "Tepecik Köyü                                                               ", "Ter Yaylası Mah (Arslantaşı Köyü)                                          ", "Tokmak Mah (Karatop Köyü)                                                  ", "Topaluşağı Köyü                                                            ", "Tut Mah (Koçkonağı Köyü)                                                   ", "Tuzluca Mah (Kumyazı Köyü)                                                 ", "Yalınca Mah (Kaşlıca Köyü)                                                 ", "Yeni Mah (Naldöken Köyü)                                                   ", "Yenibahçe Köyü                                                             ", "Yeşilova Köyü                                                              ", "Yıldızhan Köyü                                                             ", "Yoncalı Mah (Ağadibek Köyü)                                                ", "Yoncalı Mah (Kayalar Köyü)                                                 ", "Yoncapınar Köyü                                                            ", "Yörecik Mah (Dutpınar Köyü)                                                ", "Yukarı Konaklar Mah (Çitliköy Köyü)                                        ", "Yukarı Meydancık Mah (Çayırköy Köyü)                                       ", "Yurtbaşı Mah (Örtülü Köyü)                                                 ", "Zahuran Mah (Sağrılı Köyü)                                                 ", "Zibe Mah (Tekevler Köyü)                                                   ", "Ziyaret Evleri Mah (Kartaldere Köyü)                                       ", "Zuğur Evleri Mah (Çalkaya Köyü)                                            ", "Abdullah Paşa Mah                                                          ", "Cumhuriyet Mah                                                             ", "Hilalkent Mah                                                              ", "Aksaray Mah                                                                ", "Ala Yaprak Mah                                                             ", "Çaydaçıra Mah                                                              ", "Göllü Bağ Mah                                                              ", "Gümüş Kavak Mah                                                            ", "Hayvan Ürünleri Osb Mah                                                    ", "Kızılay Mah                                                                ", "Sugözü Mah                                                                 ", "Yıldız Bağları Mah                                                         ", "Doğu Kent Mah                                                              ", "Ağılcık Mah (Çalıca Köyü)                                                  ", "Akçakale Mah (Akçakale Köyü)                                               ", "Ali Çavuş Mah (Öksüzuşağı Köyü)                                            ", "Aydınlar Mah (Öksüzuşağı Köyü)                                             ", "Ayranlı Mah (Karaali Köyü)                                                 ", "Bahçelievler Mah (Hankendi Köyü)                                           ", "Bakidere Mah (Gülpınar Köyü)                                               ", "Bölüklü Mah (Bölüklü Köyü)                                                 ", "Bulutlu Mah (Bulutlu Köyü)                                                 ", "Cami Mah (Sakabaşı Köyü)                                                   ", "Cansızlar Mah (Çalıca Köyü)                                                ", "Cumhuriyet Mah (Gölköy Köyü)                                               ", "Çalıca Mah (Çalıca Köyü)                                                   ", "Çavuş Mah (Çalıca Köyü)                                                    ", "Çayırlar Mah (Gökçe Köyü)                                                  ", "Çolaklar Mah (Öksüzuşağı Köyü)                                             ", "Danalı Mah (Gülpınar Köyü)                                                 ", "Dikili Mah (Sütlüce Köyü)                                                  ", "Dilek Mah (Hankendi Köyü)                                                  ", "Doloca Mah (Koçharmanı Köyü)                                               ", "Durupınar Mah (Durupınar Köyü)                                             ", "Emiruşağı Mah (Sütlüce Köyü)                                               ", "Gökçe Mah (Gökçe Köyü)                                                     ", "Gölköy Mah (Gölköy Köyü)                                                   ", "Gözpınar Mah (Gözpınar Köyü)                                               ", "Güleç Mah (Bölüklü Köyü)                                                   ", "Gülmahmut Mah (Kelmahmut Köyü)                                             ", "Günaçtı Köyü                                                               ", "Günaçtı Mah (Günaçtı Köyü)                                                 ", "Günbağı Mah (Günbağı Köyü)                                                 ", "Hacı Ali Mah (Bölüklü Köyü)                                                ", "Hacı Efendi Mah (Öksüzuşağı Köyü)                                          ", "Halilağa Mah (Küllük Köyü)                                                 ", "Haraba Cami Mah (Çalıca Köyü)                                              ", "Harikalan Mah (Koçharmanı Köyü)                                            ", "Işıkyolu Mah (Işıkyolu Köyü)                                               ", "İlyas Mah (Sakabaşı Köyü)                                                  ", "Karaali Köyü                                                               ", "Karaali Mah (Karaali Köyü)                                                 ", "Kıluşağı Mah (Sütlüce Köyü)                                                ", "Koçharmanı Mah (Koçharmanı Köyü)                                           ", "Konacık Mah (Küllük Köyü)                                                  ", "Koparuşağı Mah (Koparuşağı Köyü)                                           ", "Küllük Mah (Küllük Köyü)                                                   ", "Kütuşağı Mah (Öksüzuşağı Köyü)                                             ", "Mahmutlu Mah (Karaali Köyü)                                                ", "Meduşağı Mah (Küllük Köyü)                                                 ", "Oğulcuk Mah (Sütlüce Köyü)                                                 ", "Oluklu Mah (Öksüzuşağı Köyü)                                               ", "Ortaçalı Mah (Ortaçalı Köyü)                                               ", "Özgürler Mah (Hankendi Köyü)                                               ", "Resul Kerim Mah (Bölüklü Köyü)                                             ", "Sakabaşı Mah (Sakabaşı Köyü)                                               ", "Sancaklı Mah (Sancaklı Köyü)                                               ", "Sarıgül Mah (Sarıgül Köyü)                                                 ", "Sarılı Mah (Sarılı Köyü)                                                   ", "Sarıtosun Mah (Gülpınar Köyü)                                              ", "Sarıyumak Mah (Bulutlu Köyü)                                               ", "Savuşağı Mah (Koçharmanı Köyü)                                             ", "Sinan Mah (Sinanköy Köyü)                                                  ", "Sütlüce Köyü                                                               ", "Sütlüce Mah (Sütlüce Köyü)                                                 ", "Şabanlı Mah (Şabanlı Köyü)                                                 ", "Şahaplı Mah (Şahaplı Köyü)                                                 ", "Şehit Saffet Akbaş Mah (Öksüzuşağı Köyü)                                   ", "Şiğolar Mah (Sakabaşı Köyü)                                                ", "Temürköy Mah (Temürköy Köyü)                                               ", "Yağızlar Mah (Bölüklü Köyü)                                                ", "Yalındamlar Mah (Yalındamlar Köyü)                                         ", "Yazıpınarı Mah (Yazıpınarı Köyü)                                           ", "Yedievler Mah (Gökçe Köyü)                                                 ", "Yenikonak Mah (Yenikonak Köyü)                                             ", "Yenikonutlar Mah (Gökçe Köyü)                                              ", "Yenimah Mah (Sütlüce Köyü)                                                 ", "Yeşilkent Mah (Hankendi Köyü)                                              ", "Yıldız Mah (Gökçe Köyü)                                                    ", "Yolçatı Mah (Yolçatı Köyü)                                                 ", "Zeynikler Mah (Öksüzuşağı Köyü)                                            ", "Alibey Mah (Aydıncık Köyü)                                                 ", "Aydıncık Mah (Aydıncık Köyü)                                               ", "Beşoluk Mah (Beşoluk Köyü)                                                 ", "Beydalı Mah (Beydalı Köyü)                                                 ", "Beydoğmuş Mah (Beydoğmuş Köyü)                                             ", "Bük Mah (Beşoluk Köyü)                                                     ", "Çakıl Mah (Aydıncık Köyü)                                                  ", "Çakmaközü Mah (Erbildi Köyü)                                               ", "Çatalharman Mah (Çatalharman Köyü)                                         ", "Çırçır Mah (Gümüşbağlar Köyü)                                              ", "Çolaklı Mah (Kurtdere Köyü)                                                ", "Çömlek Mah (Meşeli Köyü)                                                   ", "Düzler-Gülmez Mah (Gümüşbağlar Köyü)                                       ", "Ebil Mah (Kaplıkaya Köyü)                                                  ", "Ekinli Mah (Kurtdere Köyü)                                                 ", "Erbildi Mah (Erbildi Köyü)                                                 ", "Gümüşbağlar Mah (Gümüşbağlar Köyü)                                         ", "Güneyçayırı Mah (Güneyçayırı Köyü)                                         ", "Hacıhasan Mah (Beydoğmuş Köyü)                                             ", "Han Mah (Meşeli Köyü)                                                      ", "Hıdolar Mah (Kurtdere Köyü)                                                ", "Kabakçılar Mah (Kurtdere Köyü)                                             ", "Kaplıkaya Mah (Kaplıkaya Köyü)                                             ", "Karataş Mah (Karataş Köyü)                                                 ", "Koparoğlu Mah (Kurtdere Köyü)                                              ", "Kölemehmet Mah (Kurtdere Köyü)                                             ", "Körpe Mah (Körpe Köyü)                                                     ", "Kurtoğlu Mah (Kurtdere Köyü)                                               ", "Kümeevler Mah (Gümüşbağlar Köyü)                                           ", "Meşeli Mah (Meşeli Köyü)                                                   ", "Obuz Mah (Obuz Köyü)                                                       ", "Oymaağaç Mah (Oymaağaç Köyü)                                               ", "Pinoğlu Mah (Çatalharman Köyü)                                             ", "Salkaya Mah (Salkaya Köyü)                                                 ", "Sarıbük Mah (Sarıbük Köyü)                                                 ", "Seki Mah (Beydoğmuş Köyü)                                                  ", "Serince Mah (Serince Köyü)                                                 ", "Tanrıvermiş Mah (Aydıncık Köyü)                                            ", "Toraman Mah (Kaplıkaya Köyü)                                               ", "Yılangeçiren Mah (Salkaya Köyü)                                            ", "Esen Tepe Mah                                                              ", "Fevzi Çakmak Mah                                                           ", "İcadiye Mah                                                                ", "İzzet Paşa Mah                                                             ", "Rızaiye Mah                                                                ", "Safran Mah                                                                 ", "Üniversite Mah                                                             ", "Yeni Mah                                                                   ", "Acıpayam Mah (Acıpayam Köyü)                                               ", "Akmezra Sahil Önü Mah (Yurtbaşı Köyü)                                      ", "Alaca Mah (Merkez Mah) (Alaca Köyü)                                        ", "Alatarla Mah (Alatarla Köyü)                                               ", "Allahuekber Mah (Şahinkaya Köyü)                                           ", "Alpagut Mah (Merkez Mah) (Alpağut Köyü)                                    ", "Altınkuşak Köyü                                                            ", "Altınkuşak Mah (Altınkuşak Köyü)                                           ", "Arındık Mah (Merkez Mah) (Arındık Köyü)                                    ", "Asagııçme Mah (İçme Köyü)                                                  ", "Aşağı Beyleruşağı Mah (Sünköy Köyü)                                        ", "Aşağıbağ Mah (Şeyhhacı Köyü)                                               ", "Aşağıdemirtaş Mah (Aşağıdemirtaş Köyü)                                     ", "Avcılı Mah (Merkez Mah) (Avcılı Köyü)                                      ", "Aydınlar Mah (Aydınlar Köyü)                                               ", "Azozgen Mah (Üçağaç Köyü)                                                  ", "Badempınarı Mah (Badempınarı Köyü)                                         ", "Bağdere Mah (Bağdere Köyü)                                                 ", "Bağlar Mah (Korucu Köyü)                                                   ", "Bağlar Mah (Yurtbaşı Köyü)                                                 ", "Bağlarca Mah (Bağlarca Köyü)                                               ", "Bahçekapı Mah (Akçakiraz Köyü)                                             ", "Balıbey Mah (Balıbey Köyü)                                                 ", "Ballıca Mah (Ballıca Köyü)                                                 ", "Balpınarı Mah (Merkez Mah) (Balpınar Köyü)                                 ", "Bektaş Mah (Sünköy Köyü)                                                   ", "Beşevler Mah (Fatmalı Köyü)                                                ", "Beşik Mah (Merkez Mah) (Beşikköy Köyü)                                     ", "Budaklı Mah (Sultanuşağı Köyü)                                             ", "Bük Mah (Yolüstü Köyü)                                                     ", "Cadde Boyu Mah (Sultanuşağı Köyü)                                          ", "Cevizlik Mah (Şeyhhacı Köyü)                                               ", "Cipköy Mah (Merkez Mah) (Cipköy Köyü)                                      ", "Cumhuriyet Mah (Yazıkonak Köyü)                                            ", "Cumhuriyet Mah (Yurtbaşı Köyü)                                             ", "Çellik Mah (Şahinkaya Köyü)                                                ", "Çırak Mah (Üçağaç Köyü)                                                    ", "Çiçek Mah (Aşağıdemirtaş Köyü)                                             ", "Çöteli Mah (Merkez Mah) (Çöteli Köyü)                                      ", "Dallıca Mah (Dallıca Köyü)                                                 ", "Dambüyük Mah (Dambüyük Köyü)                                               ", "Dedepınarı Mah (Dedepınarı Köyü)                                           ", "Değirmendere Mah (Şeyhhacı Köyü)                                           ", "Değirmenönü Mah (Değirmenönü Köyü)                                         ", "Esenkent Mah (Esenkent Köyü)                                               ", "Fatih Mah (Yazıkonak Köyü)                                                 ", "Fatmalı Mah (Fatmalı Köyü)                                                 ", "Gadıderesi Mah (Şeyhhacı Köyü)                                             ", "Gedenek Mah (Yemişlik Köyü)                                                ", "Gedikyolu Mah (Gedikyolu Köyü)                                             ", "Gözebaşı Mah (Gözebaşı Köyü)                                               ", "Gülpınar Mah (Yurtbaşı Köyü)                                               ", "Güneşli Mah (Aşağıdemirtaş Köyü)                                           ", "Gürdal Mah (Hıdırbaba Köyü)                                                ", "Güzelyalı Mah (Güzelyalı Köyü)                                             ", "Hacı Mah (Koçkale Köyü)                                                    ", "Hacıosman Mah (Aşağıdemirtaş Köyü)                                         ", "Hacıömer Mah (Yukarıdemirtaş Köyü)                                         ", "Hal Mah (Hal Köyü)                                                         ", "Halil Ağa Mah (Sarıkamış Köyü)                                             ", "Harmantepe Mah (Merkez Mah) (Harmantepe Köyü)                              ", "Hazar Gölü Mah (İçme Köyü)                                                 ", "Hıdırbaba Mah (Merkez Mah) (Hıdırbaba Köyü)                                ", "Hıdıroğlu Mah (Yemişlik Köyü)                                              ", "Hoşköy Mah (Hoşköy Köyü)                                                   ", "Hürriyet Mah (Akçakiraz Köyü)                                              ", "İstasiyon Mah (Korucu Köyü)                                                ", "Kalkantepe Mah (Merkez Mah) (Kalkantepe Köyü)                              ", "Karaçavuş Mah (Merkez Mah) (Karaçavuş Köyü)                                ", "Karagöl Mah (Aşağıdemirtaş Köyü)                                           ", "Karagöl Mah (Yukarıdemirtaş Köyü)                                          ", "Karaman Mah (Tohumlu Köyü)                                                 ", "Karasu Mah (Yemişlik Köyü)                                                 ", "Karpınar Mah (Şahinkaya Köyü)                                              ", "Kaşıkçılar Mah (Sarıkamış Köyü)                                            ", "Kavakpınar Mah (Merkez Mah) (Kavakpınar Köyü)                              ", "Kavaktepe Mah (Kavaktepe Köyü)                                             ", "Kayalar Mah (Balpınar Köyü)                                                ", "Kengerli Mah (Yemişlik Köyü)                                               ", "Kepektaş Mah (Merkez Mah) (Kepektaş Köyü)                                  ", "Kesikköprü Mah (Aşağıdemirtaş Köyü)                                        ", "Kıraç Mah (Akçakiraz Köyü)                                                 ", "Kıraç Mah (Kıraçköy Köyü)                                                  ", "Kireçli Mah (Kıraçköy Köyü)                                                ", "Koçabağı Mah (Sünköy Köyü)                                                 ", "Koçkale Mah (Koçkale Köyü)                                                 ", "Kom Mah (Kuşhane Köyü)                                                     ", "Konak Mah (Dallıca Köyü)                                                   ", "Konak Mah (Yazıkonak Köyü)                                                 ", "Konakalmaz Mah (Konakalmaz Köyü)                                           ", "Korucu Mah (Korucu Köyü)                                                   ", "Koruk Mah (Koruköy Köyü)                                                   ", "Korular Mah (Balpınar Köyü)                                                ", "Kozluk Mah (Merkez Mah) (Kozluk Köyü)                                      ", "Kumla Mah (Kumla Köyü)                                                     ", "Kumlukbağları Mah (Sarıyakup Köyü)                                         ", "Kuruçay Mah (Üçağaç Köyü)                                                  ", "Kuşhane Mah (Kuşhane Köyü)                                                 ", "Kuyulu Mah (Kuyulu Köyü)                                                   ", "Kültür Mah (Akçakiraz Köyü)                                                ", "Mağara Mah (Üçağaç Köyü)                                                   ", "Mansurşağı Mah (Sünköy Köyü)                                               ", "Mastar Mah (Değirmenönü Köyü)                                              ", "Mastar Mah (İçme Köyü)                                                     ", "Merkez Mah (Muratcık Köyü)                                                 ", "Merkez Mah (Poyraz Köyü)                                                   ", "Merkez Mah (Yazıkonak Köyü)                                                ", "Merkez Mah (Yürekli Köyü)                                                  ", "Meryem Mah (Yemişlik Köyü)                                                 ", "Mollahasan Mah (Sultanuşağı Köyü)                                          ", "Munzuroğlu Mah (Kıraçköy Köyü)                                             ", "Muzuroğlu Mah (Güzelyalı Köyü)                                             ", "Nuralı Mah (Nuralı Köyü)                                                   ", "Org. Eşref Bitlis Mah (Yurtbaşı Köyü)                                      ", "Ortahan Mah (Koruköy Köyü)                                                 ", "Ömerağa Mah (Aşağıdemirtaş Köyü)                                           ", "Örehan Mah (Çöteli Köyü)                                                   ", "Örençay Mah (Örençay Köyü)                                                 ", "Öztürk Mah (Değirmenönü Köyü)                                              ", "Paşalar Mah (Akçakiraz Köyü)                                               ", "Pelteköy Mah (Merkez Mah) (Pelteköy Köyü)                                  ", "Pirinçci Mah (Pirinççi Köyü)                                               ", "Pürüntüz Mah (Yemişlik Köyü)                                               ", "Sanayi Mah (Yazıkonak Köyü)                                                ", "Sanayi Mah (Yurtbaşı Köyü)                                                 ", "Sanayiosb Mah (Yazıkonak Köyü)                                             ", "Sarıçubuk Mah (Sarıçubuk Köyü)                                             ", "Sarıkamış Mah (Sarıkamış Köyü)                                             ", "Sarıyakup Mah (Sarıyakup Köyü)                                             ", "Sedeftepe Mah (Sedeftepe Köyü)                                             ", "Sipahi Mah (Yemişlik Köyü)                                                 ", "Solhunpınar Mah (Karaçavuş Köyü)                                           ", "Sultanuşağı Köyü                                                           ", "Süleyman Mah (Sultanuşağı Köyü)                                            ", "Sünköy Mah (Merkez Mah) (Sünköy Köyü)                                      ", "Şahinkaya Mah (Şahinkaya Köyü)                                             ", "Şavaklı Mah (Yürekli Köyü)                                                 ", "Şehsuvar Mah (Şehsuvar Köyü)                                               ", "Şemsiveren Mah (Altınkuşak Köyü)                                           ", "Şıkan Mah (Üçağaç Köyü)                                                    ", "Şoş Mah (Tohumlu Köyü)                                                     ", "Tadım Mah (Tadım Köyü)                                                     ", "Tapanlı Mah (Dambüyük Köyü)                                                ", "Tepeköy Mah (Tepeköy Köyü)                                                 ", "Tohumlu Mah (Tohumlu Köyü)                                                 ", "Uzuntarla Mah (Merkez Mah) (Uzuntarla Köyü)                                ", "Üçağaç Mah (Merkez Mah) (Üçağaç Köyü)                                      ", "Üçtepe Mah (Altınkuşak Köyü)                                               ", "Ürünveren Mah (Ürünveren Köyü)                                             ", "Vartinik Mah (Kuşhane Köyü)                                                ", "Venk Mah (Yalnız Köyü)                                                     ", "Veran Mah (Şahinkaya Köyü)                                                 ", "Y.İçme Mah (İçme Köyü)                                                     ", "Yadigar Mah (Yemişlik Köyü)                                                ", "Yalnız Mah (Yalnız Köyü)                                                   ", "Yedigöze Mah (Yedigöze Köyü)                                               ", "Yemişlik Mah (Yemişlik Köyü)                                               ", "Yeni Bağlar Mah (Yazıkonak Köyü)                                           ", "Yeni Mah (Yurtbaşı Köyü)                                                   ", "Yenice Mah (Akçakiraz Köyü)                                                ", "Yeniköy Mah (Yemişlik Köyü)                                                ", "Yeşilkuşak Mah (Akçakiraz Köyü)                                            ", "Yeşilyurt Mah (Akçakiraz Köyü)                                             ", "Yeşilyurt Mah (Gözebaşı Köyü)                                              ", "Yolüstü Mah (Yolüstü Köyü)                                                 ", "Yukarı Beyleruşağı Mah (Sünköy Köyü)                                       ", "Yukarıbağ Mah (Şeyhhacı Köyü)                                              ", "Yukarıçakmak Mah (Merkez Mah) (Yukarıçakmak Köyü)                          ", "Yukarıdemirtaş Mah (Yukarıdemirtaş Köyü)                                   ", "Yusuf Mah (Beşikköy Köyü)                                                  ", "Yüzbaşı Mah (Akçakiraz Köyü)                                               ", "Zafer Mah (Akçakiraz Köyü)                                                 ", "Alamutsitesi Mah (Gölardı Köyü)                                            ", "Alikaya Mah (Karasaz Köyü)                                                 ", "Cevizdere Mah (Cevizdere Köyü)                                             ", "Çağlar Mah (Çağlar Köyü)                                                   ", "Dereboğazı Mah (Merkez Mah) (Dereboğazı Köyü)                              ", "Doğankuş Mah (Merkez Mah) (Doğankuş Köyü)                                  ", "Elmapınarı Mah (Merkez Mah) (Elmapınarı Köyü)                              ", "Eyüp Bağları Mah (Yenikapı Köyü)                                           ", "Gölardı Mah (Merkez Mah) (Gölardı Köyü)                                    ", "Gölardısitesi-1 Mah (Gölardı Köyü)                                         ", "Gölardısitesi-2 Mah (Gölardı Köyü)                                         ", "Gölkenarı Mah (Cevizdere Köyü)                                             ", "Güntaşı Mah (Mollakendi Köyü)                                              ", "Hacıali Mah (Gölardı Köyü)                                                 ", "İkitepe Mah (Merkez Mah) (İkitepe Köyü)                                    ", "Karasaz Mah (Merkez Mah) (Karasaz Köyü)                                    ", "Karşıbağ Mah (Mollakendi Köyü)                                             ", "Kuşcu Mah (Cevizdere Köyü)                                                 ", "Mollakendi Mah (Mollakendi Köyü)                                           ", "Sarıcan Mah (Gölardı Köyü)                                                 ", "Seringölsitesi Mah (Gölardı Köyü)                                          ", "Sevsak Mah (Gölardı Köyü)                                                  ", "Soğukpınar Mah (Cevizdere Köyü)                                            ", "Sulaf Mah (Cevizdere Köyü)                                                 ", "Tepebaşısitesi Mah (Gölardı Köyü)                                          ", "Yenikapı Mah (Merkez Mah) (Yenikapı Köyü)                                  ", "Yünlüce Mah (Merkez Mah) (Yünlüce Köyü)                                    ", "Çatal Çeşme Mah                                                            ", "Harput Mah                                                                 ", "Karşıyaka Mah                                                              ", "Kırklar Mah                                                                ", "Mustafa Paşa Mah                                                           ", "Salı Baba Mah                                                              ", "Sanayi Mah                                                                 ", "Ulu Kent Mah                                                               ", "Akpınar Mah                                                                ", "Çarşı Mah                                                                  ", "Kültür Mah                                                                 ", "Nail Bey Mah                                                               ", "Rüstem Paşa Mah                                                            ", "Sarayatik Mah                                                              ", "Ataşehir Mah                                                               ", "Hicret Mah                                                                 ", "Olgunlar Mah                                                               ", "Sürsürü Mah                                                                ", "Girne Mah (Beyhan Köyü)                                                    ", "Güney Mah (Beyhan Köyü)                                                    ", "İstasyon Mah (Beyhan Köyü)                                                 ", "Karşıyaka Mah (Beyhan Köyü)                                                ", "Akbulut Köyü                                                               ", "Akdemir Mah (Gökdere Köyü)                                                 ", "Aksaray Mah (Karataş Köyü)                                                 ", "Akyürek Köyü                                                               ", "Altınölçek Köyü                                                            ", "Andılar Köyü                                                               ", "Arındık Köyü                                                               ", "Atik Köyü                                                                  ", "Bahçelievler Mah (Baltaşı Köyü)                                            ", "Balkaya Mah (Keklikdere Köyü)                                              ", "Beydoğan Köyü                                                              ", "Bircan Mah (Bozçanak Köyü)                                                 ", "Bozçanak Köyü                                                              ", "Bölükelma Köyü                                                             ", "Burgudere Köyü                                                             ", "Bük Mezrası Mah (Köklüce Köyü)                                             ", "Büyükçaltı Köyü                                                            ", "Çaybaşı Mah (Baltaşı Köyü)                                                 ", "Damlapınar Köyü                                                            ", "Dol Küçük Mezrası Mah (Köklüce Köyü)                                       ", "Dutağacı Mah (Kırkbulak Köyü)                                              ", "Eşmekaya Mah (Karataş Köyü)                                                ", "Gemtepe Köyü                                                               ", "Gökdere Köyü                                                               ", "Gömelan Mah (Damlapınar Köyü)                                              ", "Güllüce Köyü                                                               ", "Gümeçbağlar Köyü                                                           ", "Gümüşkaynak Köyü                                                           ", "Gümüşlü Mah (Akbulut Köyü)                                                 ", "Hama Mah (Bozçanak Köyü)                                                   ", "Hamzabey Mah (Karacabağ Köyü)                                              ", "Hanönü Mah (Bozçanak Köyü)                                                 ", "Hasbey Köyü                                                                ", "Hüssam Mah (Arındık Köyü)                                                  ", "İncesu Mah (Andılar Köyü)                                                  ", "Karacabağ Köyü                                                             ", "Karasalkım Köyü                                                            ", "Karataş Köyü                                                               ", "Kasıl Köyü                                                                 ", "Kayaönü Köyü                                                               ", "Keklikdere Köyü                                                            ", "Keseköprü Mah (Örencik Köyü)                                               ", "Kırkbulak Köyü                                                             ", "Köklüce Köyü                                                               ", "Köroğlu Mah (Üçdeğirmenler Köyü)                                           ", "Küçükçaltı Köyü                                                            ", "Örencik Köyü                                                               ", "Örgülü Köyü                                                                ", "Payamlı Mah (Kırkbulak Köyü)                                               ", "Pınarbaşı Mah (Karasalkım Köyü)                                            ", "Seydili Köyü                                                               ", "Sivrikaya Mah (Gökdere Köyü)                                               ", "Şeyhpiran Mah (Arındık Köyü)                                               ", "Tarhana Köyü                                                               ", "Taştek Mah (Karacabağ Köyü)                                                ", "Umurca Mah (Akyürek Köyü)                                                  ", "Umutkaya Köyü                                                              ", "Üçdeğirmenler Köyü                                                         ", "Yarımtepe Köyü                                                             ", "Yaylacık Mah (Kayaönü Köyü)                                                ", "Yazmacık Mah (Akyürek Köyü)                                                ", "Yeşilbayır Köyü                                                            ", "Aşağı Mah                                                                  ", "Cumhuriyet Mah                                                             ", "Çarşı Mah                                                                  ", "Esentepe Mah                                                               ", "Kalekent Mah                                                               ", "Karşıbahçeler Mah                                                          ", "Kültür Mah                                                                 ", "Numune Mah                                                                 ", "Yenimahalle Mah                                                            ", "Yukarı Palu Mah                                                            ", "Ağılözü Mah (Kürkköy Köyü)                                                 ", "Akbuğday Köyü                                                              ", "Akseki Köyü                                                                ", "Alaattinköy Köyü                                                           ", "Alıncık Köyü                                                               ", "Ali Topal Mah (Topaluşağı Köyü)                                            ", "Asaf Mah (Gelindere Köyü)                                                  ", "Aşağı Çolitır Mah (Gözeli Köyü)                                            ", "Aşağı Mah (Çevrimtaş Köyü)                                                 ", "Aşağıçanakçı Köyü                                                          ", "Atayurdu Mah (Kösebayır Köyü)                                              ", "Aylık Mah (Kayabağları Köyü)                                               ", "Badem Ağacı Mah (Kürkköy Köyü)                                             ", "Başkaynak Köyü                                                             ", "Bekçitepe Köyü                                                             ", "Bekerme Mah (Akseki Köyü)                                                  ", "Bekirağa Mah (Topaluşağı Köyü)                                             ", "Bekirgölü Mah (Gözeli Köyü)                                                ", "Boğaz Mah (Kavallı Köyü)                                                   ", "Cami Mah (Gözeli Köyü)                                                     ", "Canbek Mah (Üğrük Köyü)                                                    ", "Candı Mah (Çatakkaya Köyü)                                                 ", "Cellatlar Mah (Dörtbölük Köyü)                                             ", "Çamurluk Mah (Topaluşağı Köyü)                                             ", "Çatakkaya Köyü                                                             ", "Çelemlik Mah (Yaruşağı Köyü)                                               ", "Çortunlu Köyü                                                              ", "Çöl Dere Mah (Kürkköy Köyü)                                                ", "Dedeyolu Köyü                                                              ", "Değirmen Önü Mah (Haftasar Köyü)                                           ", "Delolar Mah (Dörtbölük Köyü)                                               ", "Demuşağı Mah (Çortunlu Köyü)                                               ", "Derebey Mah (Topaluşağı Köyü)                                              ", "Dereboynu Köyü                                                             ", "Dikmen Köyü                                                                ", "Doğanbağı Köyü                                                             ", "Doğanlar Mah (Bekçitepe Köyü)                                              ", "Dörtbölük Köyü                                                             ", "Durak Mah (Bekçitepe Köyü)                                                 ", "Duygulu Köyü                                                               ", "Düztaş Mah (Gelindere Köyü)                                                ", "Elbistan Mah (Akbuğday Köyü)                                               ", "Elmalıdere Mah (Nergize Köyü)                                              ", "Elmasuyu Köyü                                                              ", "Esaflar Mah (Gözeli Köyü)                                                  ", "Eski Bağlar Mah (Kürkköy Köyü)                                             ", "Eskiköy Mah (Kamışlık Köyü)                                                ", "Eylolar Mah (Gözeli Köyü)                                                  ", "Fenk Mah (Akseki Köyü)                                                     ", "Gazazi Mah (Görgülü Köyü)                                                  ", "Gelindere Köyü                                                             ", "Göl Mezrası Mah (Sürek Köyü)                                               ", "Göl Önü Mah (Kürkköy Köyü)                                                 ", "Gölcük Mah (Sürek Köyü)                                                    ", "Görgülü Köyü                                                               ", "Gözeli Köyü                                                                ", "Günay Köyü                                                                 ", "Günbalı Köyü                                                               ", "Hacılar Köyü                                                               ", "Hacılar Mah (Hacılar Köyü)                                                 ", "Haraba Mah (Dörtbölük Köyü)                                                ", "Hayat Mah (Gelindere Köyü)                                                 ", "Hindogiller Mah (Yedikardeş Köyü)                                          ", "Huğ Üzü Mah (Kürkköy Köyü)                                                 ", "Ilıncak Köyü                                                               ", "İbokaçlar Mah (Gözeli Köyü)                                                ", "İbolar Mah (Soğukpınar Köyü)                                               ", "İmran Göze Mah (Kürkköy Köyü)                                              ", "Kalaba Köyü                                                                ", "Kaldırım Mah (Dörtbölük Köyü)                                              ", "Kamışlık Köyü                                                              ", "Karlık Mah (Haftasar Köyü)                                                 ", "Karşılan Mah (Kürkköy Köyü)                                                ", "Kasaplar Mah (Gelindere Köyü)                                              ", "Kasımuşağı Mah (Çortunlu Köyü)                                             ", "Kavak Mah (Akbuğday Köyü)                                                  ", "Kavak Üstü Mah (Kavakköy Köyü)                                             ", "Kavakköy Köyü                                                              ", "Kavallı Köyü                                                               ", "Kayabağları Köyü                                                           ", "Kayapınar Köyü                                                             ", "Keçiler Mah (Topaluşağı Köyü)                                              ", "Kekeç Mah (Gözeli Köyü)                                                    ", "Kel Hüseyin Mah (Günbalı Köyü)                                             ", "Kesrik Mah (Sürek Köyü)                                                    ", "Kıdiş Mah (Topaluşağı Köyü)                                                ", "Kılıçkaya Köyü                                                             ", "Konak Mah (Canuşağı Köyü)                                                  ", "Kösebayır Köyü                                                             ", "Köy Karşısı Mah (Dereboynu Köyü)                                           ", "Kürkköy Köyü                                                               ", "Merkez Mah (Canuşağı Köyü)                                                 ", "Merkez Mah (Çevrimtaş Köyü)                                                ", "Merkez Mah (Haftasar Köyü)                                                 ", "Merkez Mah (Sürek Köyü)                                                    ", "Merkez Mah (Topaluşağı Köyü)                                               ", "Merkez Mah (Yedikardeş Köyü)                                               ", "Moğal Mah (Haftasar Köyü)                                                  ", "Molla Hüseyin Mah (Günbalı Köyü)                                           ", "Mullaali Köyü                                                              ", "Nahal Mah (Haftasar Köyü)                                                  ", "Nene Gölü Mah (Görgülü Köyü)                                               ", "Nergize Köyü                                                               ", "Omolar Mah (Soğukpınar Köyü)                                               ", "Paha Mah (Nergize Köyü)                                                    ", "Sakız Ağacı Mah (Kürkköy Köyü)                                             ", "Sekiler Mah (Kavallı Köyü)                                                 ", "Simotlar Mah (Gözeli Köyü)                                                 ", "Sincan Mah (Dereboynu Köyü)                                                ", "Soğukpınar Köyü                                                            ", "Söğütler Mah (Çatakkaya Köyü)                                              ", "Suludere Mah (Dörtbölük Köyü)                                              ", "Şirin Mah (Gözeli Köyü)                                                    ", "Tahtikler Mah (Tarlatepe Köyü)                                             ", "Tarlatepe Köyü                                                             ", "Taşlıyayla Köyü                                                            ", "Tek Pınar Mah (Yedikardeş Köyü)                                            ", "Teyara Mah (Nergize Köyü)                                                  ", "Tilkidere Mah (Tarlatepe Köyü)                                             ", "Tuztaşı/Değirmen Mah (Kürkköy Köyü)                                        ", "Urlik Mah (Yedikardeş Köyü)                                                ", "Uslu Köyü                                                                  ", "Uzun Çimen Mah (Yedikardeş Köyü)                                           ", "Üçlerce Köyü                                                               ", "Üğrük Köyü                                                                 ", "Ürüdüler Mah (Topaluşağı Köyü)                                             ", "Yaruşağı Köyü                                                              ", "Yayla Evleri Mah (Çevrimtaş Köyü)                                          ", "Yaylaevleri Mah (Bekçitepe Köyü)                                           ", "Yazevleri Mah (Çatakkaya Köyü)                                             ", "Yazı Mah (Kösebayır Köyü)                                                  ", "Yedipınar Köyü                                                             ", "Yenice Mah (Uslu Köyü)                                                     ", "Yeniköy Mah (Günay Köyü)                                                   ", "Yukarı Teştek Mah (Dereboynu Köyü)                                         ", "Yukarıçanakçı Köyü                                                         ", "Yürekkaya Köyü                                                             ", "Ziyalar Mah (Canuşağı Köyü)                                                ", "Akpınar Mah                                                                ", "Gölbaşı Mah                                                                ", "Hazar Mah                                                                  ", "Karaçalı Mah                                                               ", "Kültür Mah                                                                 ", "Olgunlar Mah                                                               ", "Sanayi Mah" }));

        jLabel66.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(51, 51, 51));
        jLabel66.setText("Açık Adres *");

        acikAdresEsya.setBackground(new java.awt.Color(204, 204, 204));
        acikAdresEsya.setColumns(20);
        acikAdresEsya.setRows(5);
        jScrollPane6.setViewportView(acikAdresEsya);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(ilEsya, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(ilceEsya, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mahalleEsya, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ilEsya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ilceEsya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mahalleEsya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Adres Bilgileri", jPanel15);

        jPanel16.setBackground(new java.awt.Color(153, 153, 153));

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(51, 51, 51));
        jLabel67.setText("Adı Soyadı *");

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(51, 51, 51));
        jLabel68.setText("Cep Telefonu *");

        isimEsya.setBackground(new java.awt.Color(204, 204, 204));
        isimEsya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isimEsyaActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 51, 51));
        jLabel69.setText("+90");

        telefonNoEsya.setBackground(new java.awt.Color(204, 204, 204));
        telefonNoEsya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonNoEsyaActionPerformed(evt);
            }
        });
        telefonNoEsya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonNoEsyaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel67)
                    .addComponent(jLabel68)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addGap(2, 2, 2)
                        .addComponent(telefonNoEsya))
                    .addComponent(isimEsya, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isimEsya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(telefonNoEsya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("İletişim Bilgileri", jPanel16);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3))
        );

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fotoğraf Yükle", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        resimLabel1.setBackground(new java.awt.Color(153, 153, 153));
        resimLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/icons8_image_237px.png"))); // NOI18N
        resimLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        resimLabel1.setOpaque(true);

        fotografSec1.setEditable(false);
        fotografSec1.setBackground(new java.awt.Color(204, 204, 204));
        fotografSec1.setForeground(new java.awt.Color(51, 51, 51));
        fotografSec1.setText("Fotoğrafları Seçin:");
        fotografSec1.setMaximumSize(new java.awt.Dimension(200, 200));
        fotografSec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotografSec1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_image_file_add_30px.png"))); // NOI18N
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(fotografSec1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resimLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resimLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fotografSec1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(153, 153, 153));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detaylı Bilgi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        markaEsya.setBackground(new java.awt.Color(204, 204, 204));

        jLabel71.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 51, 51));
        jLabel71.setText("Model*");

        modelEsya.setBackground(new java.awt.Color(204, 204, 204));

        jLabel72.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(51, 51, 51));
        jLabel72.setText("Durumu*");

        durumEsya.setBackground(new java.awt.Color(102, 102, 102));
        durumEsya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Sıfır ", "İkinci El" }));
        durumEsya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durumEsyaActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(51, 51, 51));
        jLabel73.setText("Garanti*");

        garantiEsya.setBackground(new java.awt.Color(102, 102, 102));
        garantiEsya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Mevcut", "Mevcut Değil" }));
        garantiEsya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garantiEsyaActionPerformed(evt);
            }
        });

        takasEsya.setBackground(new java.awt.Color(102, 102, 102));
        takasEsya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Evet", "Hayır" }));
        takasEsya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takasEsyaActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(51, 51, 51));
        jLabel74.setText("Takaslı*");

        teknikOzelliklerEsya.setBackground(new java.awt.Color(204, 204, 204));
        teknikOzelliklerEsya.setColumns(20);
        teknikOzelliklerEsya.setRows(5);
        teknikOzelliklerEsya.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teknik Özelliker(Alt Alta Yazmanız Önerilir)*", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jScrollPane7.setViewportView(teknikOzelliklerEsya);

        jLabel75.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(51, 51, 51));
        jLabel75.setText("Marka *");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(durumEsya, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(markaEsya, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                        .addComponent(jLabel71)
                        .addComponent(modelEsya, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                        .addComponent(jLabel72)
                        .addComponent(jLabel73)
                        .addComponent(garantiEsya, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel74)
                        .addComponent(takasEsya, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel75))
                .addGap(175, 175, 175)
                .addComponent(jScrollPane7)
                .addGap(233, 233, 233))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markaEsya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modelEsya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(durumEsya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(garantiEsya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(takasEsya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 108, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7)))
                .addContainerGap())
        );

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton5.setText("İlanı Oluştur");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout esyaEkleLayout = new javax.swing.GroupLayout(esyaEkle);
        esyaEkle.setLayout(esyaEkleLayout);
        esyaEkleLayout.setHorizontalGroup(
            esyaEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esyaEkleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esyaEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(esyaEkleLayout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(esyaEkleLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(esyaEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        esyaEkleLayout.setVerticalGroup(
            esyaEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esyaEkleLayout.createSequentialGroup()
                .addGroup(esyaEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(esyaEkleLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(esyaEkleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(esyaEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ev.setBackground(new java.awt.Color(153, 153, 153));
        ev.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ev", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setRowHeight(315);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, evekleList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${baslik}"));
        columnBinding.setColumnName("İlan Adı");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fiyat}"));
        columnBinding.setColumnName("Fiyat(TL)");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${adi}"));
        columnBinding.setColumnName("İlan Sahibi");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${image}"));
        columnBinding.setColumnName("Resim");
        columnBinding.setColumnClass(javax.swing.ImageIcon.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${aidat}"));
        columnBinding.setColumnName("Aidat");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${acikadres}"));
        columnBinding.setColumnName("Acikadres");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${balkon}"));
        columnBinding.setColumnName("Balkon");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${binaYasi}"));
        columnBinding.setColumnName("Bina Yasi");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bulunduguKat}"));
        columnBinding.setColumnName("Bulundugu Kat");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cephe}"));
        columnBinding.setColumnName("Cephe");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ceptelefonu}"));
        columnBinding.setColumnName("Ceptelefonu");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${disOzellikler}"));
        columnBinding.setColumnName("Dis Ozellikler");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${esyaDurumu}"));
        columnBinding.setColumnName("Esya Durumu");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${icOzellikler}"));
        columnBinding.setColumnName("Ic Ozellikler");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${il}"));
        columnBinding.setColumnName("Il");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ilce}"));
        columnBinding.setColumnName("Ilce");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${isitma}"));
        columnBinding.setColumnName("Isitma");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${katSayisi}"));
        columnBinding.setColumnName("Kat Sayisi");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kullanimDurumu}"));
        columnBinding.setColumnName("Kullanim Durumu");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mahalle}"));
        columnBinding.setColumnName("Mahalle");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${metrekare}"));
        columnBinding.setColumnName("Metrekare");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${odaSayisi}"));
        columnBinding.setColumnName("Oda Sayisi");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ulasim}"));
        columnBinding.setColumnName("Ulasim");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
            jTable1.getColumnModel().getColumn(10).setResizable(false);
            jTable1.getColumnModel().getColumn(11).setResizable(false);
            jTable1.getColumnModel().getColumn(12).setResizable(false);
            jTable1.getColumnModel().getColumn(13).setResizable(false);
            jTable1.getColumnModel().getColumn(14).setResizable(false);
            jTable1.getColumnModel().getColumn(15).setResizable(false);
            jTable1.getColumnModel().getColumn(16).setResizable(false);
            jTable1.getColumnModel().getColumn(17).setResizable(false);
            jTable1.getColumnModel().getColumn(18).setResizable(false);
            jTable1.getColumnModel().getColumn(19).setResizable(false);
            jTable1.getColumnModel().getColumn(20).setResizable(false);
            jTable1.getColumnModel().getColumn(21).setResizable(false);
            jTable1.getColumnModel().getColumn(22).setResizable(false);
        }
        tableHide(jTable1, 4);
        tableHide(jTable1, 5);
        tableHide(jTable1, 6);
        tableHide(jTable1, 7);
        tableHide(jTable1, 8);
        tableHide(jTable1, 9);
        tableHide(jTable1, 10);
        tableHide(jTable1, 11);
        tableHide(jTable1, 12);
        tableHide(jTable1, 13);
        tableHide(jTable1, 14);
        tableHide(jTable1, 15);
        tableHide(jTable1, 16);
        tableHide(jTable1, 17);
        tableHide(jTable1, 18);
        tableHide(jTable1, 19);
        tableHide(jTable1, 20);
        tableHide(jTable1, 21);
        tableHide(jTable1, 22);

        javax.swing.GroupLayout evLayout = new javax.swing.GroupLayout(ev);
        ev.setLayout(evLayout);
        evLayout.setHorizontalGroup(
            evLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1439, Short.MAX_VALUE)
        );
        evLayout.setVerticalGroup(
            evLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
        );

        evEkle.setBackground(new java.awt.Color(153, 153, 153));
        evEkle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ev Ekle", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        evEkle.setPreferredSize(new java.awt.Dimension(1291, 888));

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İlan Kısa Detay", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("m² *");

        metrekare.setBackground(new java.awt.Color(204, 204, 204));
        metrekare.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                metrekareKeyTyped(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("Oda Sayısı *");

        odaSayisi.setBackground(new java.awt.Color(102, 102, 102));
        odaSayisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "1+0", "1+1", "2+0", "2+1", "2+2", "3+1", "3+2", "4+1", "4+2", "4+3", "4+4", "5 ve üzeri" }));
        odaSayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odaSayisiActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Bina Yaşı *");

        bulunduguKat.setBackground(new java.awt.Color(102, 102, 102));
        bulunduguKat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Zemin Kat", "Giriş Kat", "Müstakil", "Çatı Katı", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "10 veya üzeri" }));

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("Bulunduğu Kat *");

        binaYasi.setBackground(new java.awt.Color(102, 102, 102));
        binaYasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "0", "1", "2", "3", "4", "5 - 10 arası", "10 - 15 arası", "15 - 20 arası", "20 veya üstü" }));

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setText("Eşya Durumu *");

        katSayisi.setBackground(new java.awt.Color(102, 102, 102));
        katSayisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15+" }));

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setText("Kat Sayısı *");

        isitma.setBackground(new java.awt.Color(102, 102, 102));
        isitma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Mevcut Değil", "Soba", "Doğalgaz Sobası", "Klima", "Doğalgaz(Kombi)", "Yerden Isıtma", "Kat Kaloriferi" }));

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setText("Isıtma *");

        balkon.setBackground(new java.awt.Color(102, 102, 102));
        balkon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz\t", "Mevcut", "Mevcut Değil" }));

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setText("Balkon *");

        esyaDurumu.setBackground(new java.awt.Color(102, 102, 102));
        esyaDurumu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Eşya Mevcut", "Eşya Mevcut Değil" }));

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("Kullanım Durumu *");

        kullanimDurumu.setBackground(new java.awt.Color(102, 102, 102));
        kullanimDurumu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Şeçiniz", "Boş", "Kiracı", "Mülk Sahibi" }));
        kullanimDurumu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanimDurumuActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setText("Aidat(TL) *");

        aidat.setBackground(new java.awt.Color(204, 204, 204));
        aidat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aidatKeyTyped(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("İlan Başlığı *");

        ilan.setBackground(new java.awt.Color(204, 204, 204));

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Açıklama *");

        aciklama.setBackground(new java.awt.Color(204, 204, 204));
        aciklama.setColumns(20);
        aciklama.setRows(5);
        jScrollPane4.setViewportView(aciklama);

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setText("Fiyat *");

        fiyat.setBackground(new java.awt.Color(204, 204, 204));
        fiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiyatActionPerformed(evt);
            }
        });
        fiyat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fiyatKeyTyped(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setText("TL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kullanimDurumu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(esyaDurumu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balkon, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isitma, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(katSayisi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(binaYasi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bulunduguKat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(odaSayisi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(metrekare, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ilan, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel59))
                    .addComponent(aidat, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(metrekare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(odaSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bulunduguKat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(binaYasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(katSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isitma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balkon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(esyaDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kullanimDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aidat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setPreferredSize(new java.awt.Dimension(684, 311));

        jTabbedPane2.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane2.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setText("İl  *");

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setText("İlçe *");

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setText("Mahalle *");

        il.setBackground(new java.awt.Color(102, 102, 102));
        il.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        il.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elazığ" }));

        ilce.setBackground(new java.awt.Color(102, 102, 102));
        ilce.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ilce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Ağın", "Alacakaya", "Arıcak", "Baskil", "Karakoçan", "Keban", "Kovancılar", "Maden", "Merkez", "Palu", "Sivrice" }));
        ilce.setToolTipText("");
        ilce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilceActionPerformed(evt);
            }
        });

        mahalle.setBackground(new java.awt.Color(102, 102, 102));
        mahalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Merkez Mah                                                                 ", "Şenpınar Mah                                                               ", "Afet Evleri Mah (Yeni Yerleşim Yeri Mah) (Demirçarık Köyü)                 ", "Altınayva Köyü                                                             ", "Armutlu Mah (Samançay Köyü)                                                ", "Aşağıyabanlı Köyü                                                          ", "Bademli Köyü                                                               ", "Bahadırlar Köyü                                                            ", "Balkayası Köyü                                                             ", "Beyelması Köyü                                                             ", "Demirçarık Köyü                                                            ", "Dibekli Köyü                                                               ", "Gümüşsuyu Mah (Samançay Köyü)                                              ", "Kaşpınar Köyü                                                              ", "Konak Mah (Saraycık Köyü)                                                  ", "Kurtuluş Mah (Öğrendik Köyü)                                               ", "Modanlı Köyü                                                               ", "Ortayabanlı Mah (Aşağıyabanlı Köyü)                                        ", "Öğrendik Köyü                                                              ", "Pulköy Köyü                                                                ", "Salkımlı Mah (Yenipayam Köyü)                                              ", "Samançay Köyü                                                              ", "Saraycık Köyü                                                              ", "Tarlabaşı Mah (Öğrendik Köyü)                                              ", "Yedibağ Köyü                                                               ", "Yenipayam Köyü                                                             ", "Altınçanak Mah                                                             ", "Altıoluk Mah                                                               ", "Gülaman Mah                                                                ", "Gündoğdu Mah                                                               ", "Merkez Mah                                                                 ", "Sularbaşı Mah                                                              ", "Bağin Mah (Yalnızdamlar Köyü)                                              ", "Bakladamlar Köyü                                                           ", "Çakmakkaya Köyü                                                            ", "Çallıca Mah (Çataklı Köyü)                                                 ", "Çanakça Köyü                                                               ", "Çataklı Köyü                                                               ", "Davan Mah (Çanakça Köyü)                                                   ", "Düzağaç Mah (İncebayır Köyü)                                               ", "Esenlik Köyü                                                               ", "Gürçubuk Köyü                                                              ", "Halkalı Köyü                                                               ", "İncebayır Köyü                                                             ", "Kayranlı Köyü                                                              ", "Oğuz Mah (İncebayır Köyü)                                                  ", "Yalnızdamlar Köyü                                                          ", "Yılmaz Mah (İncebayır Köyü)                                                ", "Gümüşyaka Mah                                                              ", "Halil Yavuz Mah                                                            ", "Hürriyet Mah                                                               ", "Mustafa Çelebi Mah                                                         ", "Saman Mah                                                                  ", "Serinevler Mah                                                             ", "Simserkis Mah                                                              ", "Vali Göktayoğlu Mah                                                        ", "Akyıldız Mah (Küplüce Köyü)                                                ", "Albayrak Mah (Küplüce Köyü)                                                ", "Boğazlı Mah (Kayahisar Köyü)                                               ", "Bozçavuş Köyü                                                              ", "Bölükbaşı Mah (Bükardı Köyü)                                               ", "Cami Mah (Erimli Köyü)                                                     ", "Cumhuriyet Mah (Erimli Köyü)                                               ", "Çavuşdere Köyü                                                             ", "Çay Mah (Üçocak Köyü)                                                      ", "Çevrecik Köyü                                                              ", "Erbağı Köyü                                                                ", "Göründü Köyü                                                               ", "Göztepe Mah (Yoğunbilek Köyü)                                              ", "Güleç Mah (Erimli Köyü)                                                    ", "Güvenevler Mah (Erimli Köyü)                                               ", "Haberci Mah (Üçocak Köyü)                                                  ", "Ilıcak Mah (Küplüce Köyü)                                                  ", "Kambertepe Köyü                                                            ", "Kaplanbağ Mah (Bükardı Köyü)                                               ", "Karakaş Köyü                                                               ", "Kayahisar Köyü                                                             ", "Kışla Mah (Erimli Köyü)                                                    ", "Kutlu Düğün Mah (Üçocak Köyü)                                              ", "Küplüce Köyü                                                               ", "Merkez Mah (Üçocak Köyü)                                                   ", "Ormanpınar Köyü                                                            ", "Pınarbaşı Mah (Bükardı Köyü)                                               ", "Til Mah (Karakaş Köyü)                                                     ", "Uzun Söğüt Mah (Yoğunbilek Köyü)                                           ", "Yaylabaşı Mah (Bükardı Köyü)                                               ", "Yoğunbilek Köyü                                                            ", "Zeynet Mah (Bükardı Köyü)                                                  ", "Ziyaret Mah (Üçocak Köyü)                                                  ", "Canbeyler Mah                                                              ", "Cumhuriyet Mah                                                             ", "Eskibaskil Mah                                                             ", "Mustafa Demirel Mah                                                        ", "Odabaşı Mah                                                                ", "Şefkat Mah                                                                 ", "Adacık Mah (Topaluşağı Köyü)                                               ", "Akarsu Mah (Emirhan Köyü)                                                  ", "Akbayır Mah (Eskiköy Köyü)                                                 ", "Akçalar Mah (Konacık Köyü)                                                 ", "Akdemir Köyü                                                               ", "Akkonak Mah (Şeyh Hasan Köyü)                                              ", "Akkuş Mah (Doğancık Köyü)                                                  ", "Aksakal Mah (Suyatağı Köyü)                                                ", "Aktaş Mah (Hacımustafaköy Köyü)                                            ", "Akyazı Mah (Aşağıkuluşağı Köyü)                                            ", "Aladikme Köyü                                                              ", "Alangören Köyü                                                             ", "Ali Bal Mah (Akdemir Köyü)                                                 ", "Aliağa Mah (Şahindere Köyü)                                                ", "Alibaba Mah (Gemici Köyü)                                                  ", "Alihac Mah (Karagedik Köyü)                                                ", "Altınuşağı Köyü                                                            ", "Ambarlı Mah (Koçyolu Köyü)                                                 ", "Asaflar Mah (Doğancık Köyü)                                                ", "Aşağı Ardışlı Mah (Karakaş Köyü)                                           ", "Aşağı Atlılar Mah (Karakaş Köyü)                                           ", "Aşağı Eşme Mah (Yalındam Köyü)                                             ", "Aşağı Kardeşler Mah (Harabekayış Köyü)                                     ", "Aşağıevler Mah (Yaylanlı Köyü)                                             ", "Aşağıgeçit Mah (Akuşağı Köyü)                                              ", "Atamlar Mah (Karoğlu Köyü)                                                 ", "Aydınlar Mezrası Mah (Aşağıkuluşağı Köyü)                                  ", "Aydoğan Mah (Aladikme Köyü)                                                ", "Bahçeli Evler Mah (Kadıköy Köyü)                                           ", "Ballıca Mah (Sarıtaş Köyü)                                                 ", "Barış Mah (Aşağıkuluşağı Köyü)                                             ", "Başağaç Mah (Hacıuşağı Köyü)                                               ", "Baznalar Mah (Yukarıkuluşağı Köyü)                                         ", "Bejan Mah (Şahaplı Köyü)                                                   ", "Bekcili Mah (Doğancık Köyü)                                                ", "Bekirmustafa Mah (Paşakonağı Köyü)                                         ", "Belhan Mah (Kayabeyli Köyü)                                                ", "Besikan Mah (Koçyolu Köyü)                                                 ", "Beyler Mah (Aşağıkuluşağı Köyü)                                            ", "Beyler Mah (Resulkahya Köyü)                                               ", "Bilaluşağı Köyü                                                            ", "Bolucuk Mah (Doğancık Köyü)                                                ", "Bozarmut Mah (Sarıtaş Köyü)                                                ", "Bozoğlak Köyü                                                              ", "Bozolar Mah (Aladikme Köyü)                                                ", "Büyüler Mah (Karaali Köyü)                                                 ", "Cansız Kayış Mah (Aladikme Köyü)                                           ", "Ceberler Mah (Çavuşlu Köyü)                                                ", "Cebrail Mah (Akuşağı Köyü)                                                 ", "Çağlar Mah (Meydancık Köyü)                                                ", "Çakırlı Mah (Karaali Köyü)                                                 ", "Çamaltı Mah (Yaylanlı Köyü)                                                ", "Çamlı Mah (Hacımustafaköy Köyü)                                            ", "Çapkurlar Mah (Çavuşlu Köyü)                                               ", "Çavuşlu Mah (Beşbölük Köyü)                                                ", "Çayıran Mah (Paşakonağı Köyü)                                              ", "Çevreköy Mah (Suyatağı Köyü)                                               ", "Çitili Mah (Karaali Köyü)                                                  ", "Çoğanlı Mah (İmikuşağı Köyü)                                               ", "Çoğraş Mah (Aladikme Köyü)                                                 ", "Çubuklu Mah (Karoğlu Köyü)                                                 ", "Çulhalar Mah (Koçyolu Köyü)                                                ", "Dallıca Mah (Altınuşağı Köyü)                                              ", "Damlataş Mah (Hacımustafaköy Köyü)                                         ", "Davut Mah (Yıldızlı Köyü)                                                  ", "Dayılar Mah (Kutlugün Köyü)                                                ", "Deliktaş Köyü                                                              ", "Demirlibahçe Köyü                                                          ", "Dervişler Mah (Akuşağı Köyü)                                               ", "Deşt Mah (Gemici Köyü)                                                     ", "Diğer Karakaş Mah (Karakaş Köyü)                                           ", "Dilek Mah (Konalga Köyü)                                                   ", "Diyerbeyler Mah (Akuşağı Köyü)                                             ", "Doğanlar Mah (Altınuşağı Köyü)                                             ", "Dokoşağı Mah (Karaali Köyü)                                                ", "Dolma Mah (Bozoğlak Köyü)                                                  ", "Doraş Mah (Tavşanuşağı Köyü)                                               ", "Dörtyol Mah (Kızıluşağı Köyü)                                              ", "Dursunlar Mah (Hacımustafaköy Köyü)                                        ", "Düğüntepe Köyü                                                             ", "Düşeli Mah (Aladikme Köyü)                                                 ", "Düz Mah (Beşbölük Köyü)                                                    ", "Düz Mah (Doğancık Köyü)                                                    ", "Erler Mah (Hacıhüseyinler Köyü)                                            ", "Eskiköy Köyü                                                               ", "Faduluşağı Mah (Sarıtaş Köyü)                                              ", "Fakir Mah (Emirhan Köyü)                                                   ", "Fırat Mah (Yaylanlı Köyü)                                                  ", "Gedebük Mah (Pınarlı Köyü)                                                 ", "Gedek Mah (Yukarıkuluşağı Köyü)                                            ", "Gejikan Mah (Şahaplı Köyü)                                                 ", "Geli Mah (Topaluşağı Köyü)                                                 ", "Gemici Köyü                                                                ", "Göleler Mah (Akuşağı Köyü)                                                 ", "Göllüce Mah (Karakaş Köyü)                                                 ", "Göluşağı Mah (Beşbölük Köyü)                                               ", "Gülhaç Mah (Resulkahya Köyü)                                               ", "Güllübağ Mah (Konalga Köyü)                                                ", "Güllüce Mah (Alangören Köyü)                                               ", "Gümüşçay Mah (Konalga Köyü)                                                ", "Gündüz Mah (Kızıluşağı Köyü)                                               ", "Güneşli Mah (Şituşağı Köyü)                                                ", "Güzelli Mah (Düğüntepe Köyü)                                               ", "Hacı Hasan Mah (Işıklar Köyü)                                              ", "Hacı Mah (Hacımustafaköy Köyü)                                             ", "Hacı Ömer Mah (Aladikme Köyü)                                              ", "Hacıhaliloğlu Mah (Kızıluşağı Köyü)                                        ", "Hacıhüseyinler Köyü                                                        ", "Hacımehmetli Köyü                                                          ", "Hacımustafa Mah (Hacıhüseyinler Köyü)                                      ", "Hacıuşağı Köyü                                                             ", "Hacıyusuflar Mah (Konalga Köyü)                                            ", "Haci  Bekir Mah (Harabekayış Köyü)                                         ", "Haci Temur Mah (Akuşağı Köyü)                                              ", "Haliçler Mah (Koçyolu Köyü)                                                ", "Halitoğlu Mah (Akuşağı Köyü)                                               ", "Harabekayış Köyü                                                           ", "Hardi Mah (Gemici Köyü)                                                    ", "Hardiçay Mah (Deliktaş Köyü)                                               ", "Harman Mah (Karaali Köyü)                                                  ", "Harmanlı Mah (Yıldızlı Köyü)                                               ", "Harmetik Mah (Koçyolu Köyü)                                                ", "Haydarkulu Mah (Konacık Köyü)                                              ", "Hocalar Mah (Hacıhüseyinler Köyü)                                          ", "Hüyükköy Köyü                                                              ", "Işıklar Köyü                                                               ", "Işıklı Mah (Yeniocak Köyü)                                                 ", "İlhanlar Mah (Çavuşlu Köyü)                                                ", "İlhanlar Mah (Doğancık Köyü)                                               ", "İpşir Mah (Karakaş Köyü)                                                   ", "İskender Mah (Aşağıkuluşağı Köyü)                                          ", "Kale Mah (Suyatağı Köyü)                                                   ", "Kalecik Mah (Sarıtaş Köyü)                                                 ", "Kaluşağı Mah (Çavuşlu Köyü)                                                ", "Kamikli Mah (Çiğdemlik Köyü)                                               ", "Kanatlı Mah (Eskiköy Köyü)                                                 ", "Karaali Köyü                                                               ", "Karaca Mah (Hacımustafaköy Köyü)                                           ", "Karagedik Köyü                                                             ", "Karakaş Köyü                                                               ", "Karakavak Mah (Hacımustafaköy Köyü)                                        ", "Karameşe Mah (Karakaş Köyü)                                                ", "Karpuzlu Mah (Karagedik Köyü)                                              ", "Karşıyaka Mah (Pınarlı Köyü)                                               ", "Kasımlar Mah (Yukarıkuluşağı Köyü)                                         ", "Kasuşağı Mah (Karagedik Köyü)                                              ", "Kayabeyli Köyü                                                             ", "Keçik Mah (Karoğlu Köyü)                                                   ", "Keçilli Mah (Emirhan Köyü)                                                 ", "Kem Mah (Topaluşağı Köyü)                                                  ", "Kemerli Mah (Doğancık Köyü)                                                ", "Kılıçlı Mah (Söğütdere Köyü)                                               ", "Kıran Mah (Konacık Köyü)                                                   ", "Kırhasan Mah (Çiğdemlik Köyü)                                              ", "Kızılyazı Mah (Hacımehmetli Köyü)                                          ", "Kiziruşağı Mah (Tatlıpayam Köyü)                                           ", "Koçyolu Köyü                                                               ", "Konacık Köyü                                                               ", "Konalga Köyü                                                               ", "Konuklu Mah (Akuşağı Köyü)                                                 ", "Köfteler Mah (Gemici Köyü)                                                 ", "Körbekir Mah (Harabekayış Köyü)                                            ", "Kösek Mah (Kızıluşağı Köyü)                                                ", "Köseoğlu Mah (Kızıluşağı Köyü)                                             ", "Köz Mah (Resulkahya Köyü)                                                  ", "Kumlu Mah (Düğüntepe Köyü)                                                 ", "Kuran Mah (Yaylanlı Köyü)                                                  ", "Kurucu Mah (Konalga Köyü)                                                  ", "Kurugül Mah (Yaylanlı Köyü)                                                ", "Kuşsarayı Köyü                                                             ", "Kut Mah (Karoğlu Köyü)                                                     ", "Kuzucuk Mah (Yukarıkuluşağı Köyü)                                          ", "Küllük Mah (Kutlugün Köyü)                                                 ", "Laçular Mah (Konalga Köyü)                                                 ", "Memişler Mah (Aşağıkuluşağı Köyü)                                          ", "Merkez Mah (Akuşağı Köyü)                                                  ", "Merkez Mah (Altınuşağı Köyü)                                               ", "Merkez Mah (Aşağıkuluşağı Köyü)                                            ", "Merkez Mah (Beşbölük Köyü)                                                 ", "Merkez Mah (Çavuşlu Köyü)                                                  ", "Merkez Mah (Çiğdemlik Köyü)                                                ", "Merkez Mah (Emirhan Köyü)                                                  ", "Merkez Mah (Habibuşağı Köyü)                                               ", "Merkez Mah (İçlikaval Köyü)                                                ", "Merkez Mah (İmikuşağı Köyü)                                                ", "Merkez Mah (Kadıköy Köyü)                                                  ", "Merkez Mah (Karagedik Köyü)                                                ", "Merkez Mah (Karakaş Köyü)                                                  ", "Merkez Mah (Karoğlu Köyü)                                                  ", "Merkez Mah (Kızıluşağı Köyü)                                               ", "Merkez Mah (Kumlutarla Köyü)                                               ", "Merkez Mah (Kutlugün Köyü)                                                 ", "Merkez Mah (Paşakonağı Köyü)                                               ", "Merkez Mah (Pınarlı Köyü)                                                  ", "Merkez Mah (Sarıtaş Köyü)                                                  ", "Merkez Mah (Söğütdere Köyü)                                                ", "Merkez Mah (Suyatağı Köyü)                                                 ", "Merkez Mah (Şituşağı Köyü)                                                 ", "Merkez Mah (Yalındam Köyü)                                                 ", "Merkez Mah (Yeniocak Köyü)                                                 ", "Merkez Mah (Yukarıkuluşağı Köyü)                                           ", "Meşeşaban Mah (Yıldızlı Köyü)                                              ", "Meval Uşağı Mah (Akuşağı Köyü)                                             ", "Meydancık Köyü                                                             ", "Mışmişler Mah (Yaylanlı Köyü)                                              ", "Mollabekir Mah (Aşağıkuluşağı Köyü)                                        ", "Mollaismail Mah (Yukarıkuluşağı Köyü)                                      ", "Munzur Mah (Şahaplı Köyü)                                                  ", "Ocaklı Mah (Söğütdere Köyü)                                                ", "Okul Ve Sağlık Ocağı Mah (Şituşağı Köyü)                                   ", "Omik Mah (Topaluşağı Köyü)                                                 ", "Onbaşı Mah (Kızıluşağı Köyü)                                               ", "Ovacık Mah (Konalga Köyü)                                                  ", "Öteşaluşağı Mah (Akuşağı Köyü)                                             ", "Özbaşı Mah (Konalga Köyü)                                                  ", "Resulkahya Köyü                                                            ", "Sağırlar Mah (Yalındam Köyü)                                               ", "Sakolar Mah (Söğütdere Köyü)                                               ", "Sal Mah (Konalga Köyü)                                                     ", "Samanlı Mah (Hacıuşağı Köyü)                                               ", "Sapanlı Mah (Topaluşağı Köyü)                                              ", "Sekmen Mah (Sarıtaş Köyü)                                                  ", "Selviler Mah (Aladikme Köyü)                                               ", "Sinan Mah (Gemici Köyü)                                                    ", "Sincan Mah (Tatlıpayam Köyü)                                               ", "Soylu Mah (Beşbölük Köyü)                                                  ", "Subaşı Mah (Doğancık Köyü)                                                 ", "Subaylar Mah (Akdemir Köyü)                                                ", "Süleyman Mah (Yıldızlı Köyü)                                               ", "Sütlüce Mah (Emirhan Köyü)                                                 ", "Şah Mah (Söğütdere Köyü)                                                   ", "Şahaplı Köyü                                                               ", "Şahindere Köyü                                                             ", "Şahinler Mah (Altınuşağı Köyü)                                             ", "Şarge Mah (Hacımehmetli Köyü)                                              ", "Şeyh Hasan Köyü                                                            ", "Şimşek Mah (Karaali Köyü)                                                  ", "Şituşağı Köyü                                                              ", "Şükür Mah (Şituşağı Köyü)                                                  ", "Tabaklar Mah (Yukarıkuluşağı Köyü)                                         ", "Tacikan Mah (Söğütdere Köyü)                                               ", "Tarlacık Mah (Şituşağı Köyü)                                               ", "Taşkapı Mah (Hacıuşağı Köyü)                                               ", "Taşlık Mah (Karakaş Köyü)                                                  ", "Tatlıpayam Köyü                                                            ", "Tavuklu Mah (Düğüntepe Köyü)                                               ", "Tekağaç Mah (Aladikme Köyü)                                                ", "Temurhalil Mah (Yukarıkuluşağı Köyü)                                       ", "Tepe Altı Mah (Tavşanuşağı Köyü)                                           ", "Topal Mah (Karoğlu Köyü)                                                   ", "Topaluşağı Köyü                                                            ", "Topluca Mah (Akdemir Köyü)                                                 ", "Tuzluca Mah (Işıklar Köyü)                                                 ", "Türbe Mah (Hacımehmetli Köyü)                                              ", "Uğurlu Mah (Konalga Köyü)                                                  ", "Üçbölük Mah (Şeyh Hasan Köyü)                                              ", "Üsmıhtan Mah (Söğütdere Köyü)                                              ", "Üzümlü Mah (Konalga Köyü)                                                  ", "Velipalas Mah (Aladikme Köyü)                                              ", "Y.İ.Ö.B.O. Mah (Doğancık Köyü)                                             ", "Yağmurlu Mah (Konalga Köyü)                                                ", "Yamaçlı Mah (Hacımustafaköy Köyü)                                          ", "Yanık Bağ Mah (Hacıhüseyinler Köyü)                                        ", "Yapraklı Mah (Eskiköy Köyü)                                                ", "Yapraklı Mah (Hacıhüseyinler Köyü)                                         ", "Yaşar Mah (Hacımustafaköy Köyü)                                            ", "Yaylanlı Köyü                                                              ", "Yazıevleri Mah (Yeniocak Köyü)                                             ", "Yazıkonak Mah (Harabekayış Köyü)                                           ", "Yeni Mah (Çavuşlu Köyü)                                                    ", "Yeni Mah (Yukarıkuluşağı Köyü)                                             ", "Yıldızlı Köyü                                                              ", "Yırıklar Mah (Koçyolu Köyü)                                                ", "Yukarı Ardıçlı Mah (Karakaş Köyü)                                          ", "Yukarı Atlılar Mah (Karakaş Köyü)                                          ", "Yukarı Çide Mah (Akuşağı Köyü)                                             ", "Yukarı Deliktaş Mah (Deliktaş Köyü)                                        ", "Yukarı Eşme Mah (Yalındam Köyü)                                            ", "Yukarı Kardeşler Mah (Harabekayış Köyü)                                    ", "Yukarı Zemzem Mah (Karoğlu Köyü)                                           ", "Yukarıgeçit Mah (Akuşağı Köyü)                                             ", "Yukarıköy Mah (Doğancık Köyü)                                              ", "Yusuflu Mah (Çavuşlu Köyü)                                                 ", "Yuvacık Mah (Şituşağı Köyü)                                                ", "Yuvalar Mah (Şituşağı Köyü)                                                ", "Yüzgeçler Mah (Çiğdemlik Köyü)                                             ", "Zelihan Mah (Aladikme Köyü)                                                ", "Ziyaret Mah (Doğancık Köyü)                                                ", "Bahçelievler Mah                                                           ", "Gölpınar Mah                                                               ", "Karşıyaka Mah                                                              ", "Kırkpınar Mah                                                              ", "Kulubaba Mah                                                               ", "Tepe Mah                                                                   ", "Yeni Mah                                                                   ", "Abdalan Mah (Okçular Köyü)                                                 ", "Ağamezrası Köyü                                                            ", "Akarbaşı Köyü                                                              ", "Akbulak Köyü                                                               ", "Akçiçek Köyü                                                               ", "Akkuş Köyü                                                                 ", "Akpınar Köyü                                                               ", "Akyokuş Köyü                                                               ", "Alabal Köyü                                                                ", "Alayağmur Köyü                                                             ", "Ali Mezrası Mah (Yoğunağaç Köyü)                                           ", "Altınoluk Köyü                                                             ", "Aşağı Mah (Kuşçu Köyü)                                                     ", "Aşağıovacık Köyü                                                           ", "Bağlıağaç Köyü                                                             ", "Bahçecik Köyü                                                              ", "Balcalı Köyü                                                               ", "Bardaklı Köyü                                                              ", "Başyurt Köyü                                                               ", "Bazlama Köyü                                                               ", "Beydere Köyü                                                               ", "Bulgurcuk Köyü                                                             ", "Cabbar Mah (Alayağmur Köyü)                                                ", "Cumhuriyet Köyü                                                            ", "Çalıkaya Köyü                                                              ", "Çamardı Köyü                                                               ", "Çan Köyü                                                                   ", "Çanakçı Köyü                                                               ", "Çatalyol Köyü                                                              ", "Çavuşyolu Köyü                                                             ", "Çayırdam Köyü                                                              ", "Çayırgülü Köyü                                                             ", "Çayırlık Mah (Çayırgülü Köyü)                                              ", "Çelebi Köyü                                                                ", "Çitak Köyü                                                                 ", "Çukurca Mah (Yoğunağaç Köyü)                                               ", "Dal Mah (Koçyiğitler Köyü)                                                 ", "Dede Mezrası Mah (Üçbudak Köyü)                                            ", "Değirmen Mah (Alayağmur Köyü)                                              ", "Değirmendere Mah (Alabal Köyü)                                             ", "Değirmendüzü Mah (Balcalı Köyü)                                            ", "Delitaş Mah (Korudibi Köyü)                                                ", "Demirdelen Köyü                                                            ", "Demirtaş Köyü                                                              ", "Demirtepe Köyü                                                             ", "Derince Mah (Yalıntaş Köyü)                                                ", "Deveci Köyü                                                                ", "Deveci Yol Altı Mah (Kuşçu Köyü)                                           ", "Doğançukur Mah (Sarihan Köyü)                                              ", "Doğanoğlu Köyü                                                             ", "Dokuz Veren Mah (Kümbet Köyü)                                              ", "Dumluyazı Köyü                                                             ", "Durmuşköy Köyü                                                             ", "Dursun Mah (Çamardı Köyü)                                                  ", "Düğünlü Mah (Kavakdere Köyü)                                               ", "Elif Mah (Akarbaşı Köyü)                                                   ", "Gelincik Mah (Okçular Köyü)                                                ", "Gordan Mah (Pamuklu Köyü)                                                  ", "Gölyaylası Mah (Sarıcan Köyü)                                              ", "Gözerek Köyü                                                               ", "Gülhüseyin Mah (Okçular Köyü)                                              ", "Güllüce Köyü                                                               ", "Gümüşakar Köyü                                                             ", "Gündeğdi Köyü                                                              ", "Hamurkesen Köyü                                                            ", "Hamzalı Köyü                                                               ", "İlbey Mah (Akarbaşı Köyü)                                                  ", "İnceler Mah (Kızılpınar Köyü)                                              ", "İsabey Köyü                                                                ", "Kalecik Köyü                                                               ", "Kalkankaya Köyü                                                            ", "Karabük Mah (Mahmutlu Köyü)                                                ", "Karaçan Köyü                                                               ", "Karakoçan Köyü                                                             ", "Karapınar Köyü                                                             ", "Karasakal Köyü                                                             ", "Kavakdere Köyü                                                             ", "Kavalcık Köyü                                                              ", "Keklikköy Köyü                                                             ", "Kengerli Mah (Yeniköy Köyü)                                                ", "Kırgıl Köyü                                                                ", "Kızılca Köyü                                                               ", "Kızılpınar Köyü                                                            ", "Kocadayı Köyü                                                              ", "Koç Mah (Akarbaşı Köyü)                                                    ", "Koçan Mah (Okçular Köyü)                                                   ", "Koçyiğitler Köyü                                                           ", "Korudibi Köyü                                                              ", "Köm Mah (Hamurkesen Köyü)                                                  ", "Köryusuf Köyü                                                              ", "Kubatlı Mah (Kuşbayırı Köyü)                                               ", "Kucak Mah (Korudibi Köyü)                                                  ", "Kulundere Köyü                                                             ", "Kuruca Mah (Koçyiğitler Köyü)                                              ", "Kuruk Mah (Doğanoğlu Köyü)                                                 ", "Kuşbayırı Köyü                                                             ", "Kuşçu Köyü                                                                 ", "Kuşçu Palu Yolu Mah (Kuşçu Köyü)                                           ", "Kümbet Köyü                                                                ", "Mahmutlu Köyü                                                              ", "Maksutali Köyü                                                             ", "Meşeli Mah (Okçular Köyü)                                                  ", "Mezra Mah (Gündeğdi Köyü)                                                  ", "Milahasan Mah (Akbulak Köyü)                                               ", "Mirahmet Köyü                                                              ", "Okçular Köyü                                                               ", "Ormancık Köyü                                                              ", "Orta Mah (Pamuklu Köyü)                                                    ", "Özlüce Köyü                                                                ", "Paşayaylası Köyü                                                           ", "Pembelik Mah (Pamuklu Köyü)                                                ", "Pilavtepe Köyü                                                             ", "Polan Mah (Alabal Köyü)                                                    ", "Sağın Köyü                                                                 ", "Sağucak Köyü                                                               ", "Sarı Ceviz Mah (Yalıntaş Köyü)                                             ", "Sarıbaşak Köyü                                                             ", "Sarihan Köyü                                                               ", "Söğütlü Mah (Altınoluk Köyü)                                               ", "Subaşı Mah (Sarıcan Köyü)                                                  ", "Süleyman Çiftliği Mah (Akçiçek Köyü)                                       ", "Şahhüseyin Mah (Ağamezrası Köyü)                                           ", "Şeman Mah (Korudibi Köyü)                                                  ", "Tatlıca Mah (Kızılpınar Köyü)                                              ", "Tekardıç Köyü                                                              ", "Tepebaşı Mah (Çelebi Köyü)                                                 ", "Turan Mah (Dumluyazı Köyü)                                                 ", "Uysal Mah (Durmuşköy Köyü)                                                 ", "Üçbudak Köyü                                                               ", "Ürünlü Mah (Koçyiğitler Köyü)                                              ", "Yalıntaş Köyü                                                              ", "Yamac Yolu Mah (Kuşçu Köyü)                                                ", "Yemişlik Mah (Sağın Köyü)                                                  ", "Yenice Köyü                                                                ", "Yenikaya Köyü                                                              ", "Yeniköy Köyü                                                               ", "Yeşilbelen Köyü                                                            ", "Yoğunağaç Köyü                                                             ", "Yolcatı Mah (Yenice Köyü)                                                  ", "Yoncalı Mah (Dumluyazı Köyü)                                               ", "Yukarıovacık Köyü                                                          ", "Yücekonak Köyü                                                             ", "Yüzev Köyü                                                                 ", "Zilgölü Mah (Alayağmur Köyü)                                               ", "Baraj Mah                                                                  ", "Değirmenbaşı Mah                                                           ", "Fırat Mah                                                                  ", "Kallar Mah                                                                 ", "Acısu Mah (Akçatepe Köyü)                                                  ", "Akçatepe Köyü                                                              ", "Akgömlek Köyü                                                              ", "Alikan Mezrası Mah (Çevrekaya Köyü)                                        ", "Altınkürek Köyü                                                            ", "Arkulu Mah (Aslankaşı Köyü)                                                ", "Aslankaşı Köyü                                                             ", "Aşağı Demirli Mah (Beydeğirmeni Köyü)                                      ", "Aşağı Mah (Örenyaka Köyü)                                                  ", "Aşağıçakmak Köyü                                                           ", "Aşörgen Mah (Altıyaka Köyü)                                                ", "Bademli Köyü                                                               ", "Bahçeli Köyü                                                               ", "Bayındır Köyü                                                              ", "Beydeğirmeni Köyü                                                          ", "Bölükçalı Köyü                                                             ", "Büklümlü Köyü                                                              ", "Cabbar Mah (Altıyaka Köyü)                                                 ", "Ciban Mezrası Mah (Akgömlek Köyü)                                          ", "Çakmaklı Mah (Beydeğirmeni Köyü)                                           ", "Çalık Çayı Mah (Kurşunkaya Köyü)                                           ", "Çalık Köyü                                                                 ", "Çay Mezrası Mah (Çevrekaya Köyü)                                           ", "Çevrekaya Köyü                                                             ", "Dede Mah (Altıyaka Köyü)                                                   ", "Değirmen Mevkii Mah (Bademli Köyü)                                         ", "Denizli Köyü                                                               ", "Derince Mezrası Mah (Altınkürek Köyü)                                      ", "Doğan Mah (Akçatepe Köyü)                                                  ", "Dursunlu Mah (Göldere Köyü)                                                ", "Dursunlu Mezrası Mah (Kuşçu Köyü)                                          ", "Dürümlü Köyü                                                               ", "Emre Mah (Akçatepe Köyü)                                                   ", "Gökbelen Köyü                                                              ", "Göldere Köyü                                                               ", "Güneytepe Köyü                                                             ", "Hamurlu Mezrası Mah (Çevrekaya Köyü)                                       ", "İbolar Mah (Aslankaşı Köyü)                                                ", "Karabey Mezrası Mah (Topkıran Köyü)                                        ", "Karaçor Mezrası Mah (Akgömlek Köyü)                                        ", "Karaçor Mezrası Mah (Gökbelen Köyü)                                        ", "Karahüseyin Mezrası Mah (Gökbelen Köyü)                                    ", "Karşı Mah (Örenyaka Köyü)                                                  ", "Karşı Mevkii Mah (Altınkürek Köyü)                                         ", "Karşıyaka Mah (Altıyaka Köyü)                                              ", "Kırklar Mezrası Mah (Sağdıçlar Köyü)                                       ", "Koçemin Mah (Altıyaka Köyü)                                                ", "Konak Mezrası Mah (Topkıran Köyü)                                          ", "Kopuzlu Köyü                                                               ", "Koyunuşağı Köyü                                                            ", "Kurşunkaya Köyü                                                            ", "Kuşçu Köyü                                                                 ", "Mandere Mezrası Mah (Taşkesen Köyü)                                        ", "Melilan Mah (Beydeğirmeni Köyü)                                            ", "Merkez Mah (Altıyaka Köyü)                                                 ", "Orta Mevkii Mah (Altınkürek Köyü)                                          ", "Orta Mezra Mah (Sağdıçlar Köyü)                                            ", "Pınarlar Mah (Nimri Köyü)                                                  ", "Sağdıçlar Köyü                                                             ", "Sino Mezrası Mah (Bademli Köyü)                                            ", "Soğanlı Mah (Kurşunkaya Köyü)                                              ", "Soğuk Su Mezrası Mah (Gökbelen Köyü)                                       ", "Süleymanlı Mah (Çalık Köyü)                                                ", "Şahverdiyen Mah (Altınkürek Köyü)                                          ", "Şüşan Mah (Altınkürek Köyü)                                                ", "Taktah Mezrası Mah (Çevrekaya Köyü)                                        ", "Taşkesen Köyü                                                              ", "Taşkonak Mezrası Mah (Çevrekaya Köyü)                                      ", "Topkıran Köyü                                                              ", "Ulupınar Köyü                                                              ", "Üçpınar Köyü                                                               ", "Yahyalı Mezrası Mah (Denizli Köyü)                                         ", "Yukarı Demirli Mah (Beydeğirmeni Köyü)                                     ", "Yukarı Kuşçu Mah (Kuşçu Köyü)                                              ", "Yukarı Mah (Örenyaka Köyü)                                                 ", "Yukarı Mevkii Mah (Altınkürek Köyü)                                        ", "Bağlar Mah                                                                 ", "Bahçelievler Mah                                                           ", "Çarşı Başı Mah                                                             ", "Çay Başı Mah                                                               ", "Fatih Mah                                                                  ", "Gültepe Mah                                                                ", "Heybet Mah                                                                 ", "İsmet Paşa Mah                                                             ", "Kapıaçmaz Mah                                                              ", "Toki Mah                                                                   ", "Tuna Mah                                                                   ", "Yeni Mah                                                                   ", "Adalı Köyü                                                                 ", "Akmezra Köyü                                                               ", "Akpınar Mah (Karaman Köyü)                                                 ", "Altınkum Mah (Çaybağı Köyü)                                                ", "Aşağı Kazanlar Mah (Yukarıkazanlar Köyü)                                   ", "Aşağı Mezra Mah (Kolluca Köyü)                                             ", "Aşağıdemirci Köyü                                                          ", "Aşağıkanatlı Köyü                                                          ", "Aşağıköse Köyü                                                             ", "Aşağımirahmet Köyü                                                         ", "Avlağı Köyü                                                                ", "Ayyıldız Mah (Ekinözü Köyü)                                                ", "Bağgülü Köyü                                                               ", "Bahçelievler Mah (Kavakköy Köyü)                                           ", "Bahçelievler Mah (Yarımca Köyü)                                            ", "Başaklı Mah (Karasungur Köyü)                                              ", "Bayramyazı Köyü                                                            ", "Beroç Mah (Yenidam Köyü)                                                   ", "Beşaret Mah (Kuşçu Köyü)                                                   ", "Beşpınar Köyü                                                              ", "Beyaz Pınar Mah (Karıncaköy Köyü)                                          ", "Bilalköy Köyü                                                              ", "Bülbül Mah (Bağgülü Köyü)                                                  ", "Cumhuriyet Mah (Çakırkaş Köyü)                                             ", "Çarşı Mah (Yarımca Köyü)                                                   ", "Çatakbaşı Köyü                                                             ", "Çaybağı Köyü                                                               ", "Çelebi Köyü                                                                ", "Çiftlik Köyü                                                               ", "Değirmentaşı Köyü                                                          ", "Demirbaş Mah (Yeşildere Köyü)                                              ", "Demirci Köyü                                                               ", "Dörtyol Mah (Uyandık Köyü)                                                 ", "Durmuşlar Köyü                                                             ", "Ekinbağı Köyü                                                              ", "Ekinözü Köyü                                                               ", "Emirhan Mah (Gözecik Köyü)                                                 ", "Esen Tepe Mah (Yarımca Köyü)                                               ", "Esenkavak Mah (Yeşildere Köyü)                                             ", "Esentepe Mah (Ekinözü Köyü)                                                ", "Fatih Mah (Yarımca Köyü)                                                   ", "Gedikyurt Köyü                                                             ", "Giyimli Mah (Uyandık Köyü)                                                 ", "Göçmezler Köyü                                                             ", "Gökçedal Köyü                                                              ", "Gölbaşı Mah (Çatakbaşı Köyü)                                               ", "Gözecik Köyü                                                               ", "Gülçatı Köyü                                                               ", "Güler Mah (Soğukpınar Köyü)                                                ", "Günceren Mah (Aşağımirahmet Köyü)                                          ", "Güneşli Mah (Topağaç Köyü)                                                 ", "Hacı Yusuf Mah (Yeşildere Köyü)                                            ", "Hacımekke Köyü                                                             ", "Hacısam Köyü                                                               ", "Hoşmat Mah (Çakırkaş Köyü)                                                 ", "İğdeli Köyü                                                                ", "İncedal Mah (Durmuşlar Köyü)                                               ", "İsaağamezrası Köyü                                                         ", "Kacar Köyü                                                                 ", "Kamışlı Mah (Soğukpınar Köyü)                                              ", "Karabörk Köyü                                                              ", "Karaman Köyü                                                               ", "Karasungur Köyü                                                            ", "Karıncaköy Köyü                                                            ", "Kavakköy Köyü                                                              ", "Kayalık Köyü                                                               ", "Kemaşlı Mah (Karasungur Köyü)                                              ", "Kireçalan Mah (Uyandık Köyü)                                               ", "Kolluca Köyü                                                               ", "Konaklı Mah (Değirmentaşı Köyü)                                            ", "Kopuzlar Mah (Uyandık Köyü)                                                ", "Köprüdere Köyü                                                             ", "Kuşağacı Köyü                                                              ", "Kuşaklı Mah (Uyandık Köyü)                                                 ", "Kuşçu Köyü                                                                 ", "Levent Mah (Soğanlı Köyü)                                                  ", "Mezra Mezrası Mah (Kuşçu Köyü)                                             ", "Mirmehmet Mah (Çatakbaşı Köyü)                                             ", "Muratbağı Köyü                                                             ", "Mustafaköy Köyü                                                            ", "Mutlucan Mah (Uyandık Köyü)                                                ", "Nişankaya Köyü                                                             ", "Okçular Köyü                                                               ", "Osmanağa Köyü                                                              ", "Payamlı Köyü                                                               ", "Piyazgül Mah (Karıncaköy Köyü)                                             ", "Salkımlı Köyü                                                              ", "Saraybahçe Köyü                                                            ", "Sarı Çoban Mah (Soğanlı Köyü)                                              ", "Sarıbuğday Köyü                                                            ", "Selim Mah (Çelebi Köyü)                                                    ", "Seyrantepe Mah (Yeşildere Köyü)                                            ", "Soğanlı Köyü                                                               ", "Soğukpınar Köyü                                                            ", "Sorukom Mah (Soğanlı Köyü)                                                 ", "Sultanbağ Mah (Çelebi Köyü)                                                ", "Sürekli Köyü                                                               ", "Sütpınar Mah (İğdeli Köyü)                                                 ", "Şekerci Köyü                                                               ", "Şenova Köyü                                                                ", "Tabanözü Köyü                                                              ", "Taşçanak Köyü                                                              ", "Taşören Köyü                                                               ", "Tatar Köyü                                                                 ", "Tepebağ Köyü                                                               ", "Topağaç Köyü                                                               ", "Topağaç Mah (Çaybağı Köyü)                                                 ", "Topraklı Mah (Soğanlı Köyü)                                                ", "Tuluk Mah (Karasungur Köyü)                                                ", "Uyandık Köyü                                                               ", "Uyandık Mah (Çaybağı Köyü)                                                 ", "Uzunova Köyü                                                               ", "Vali Fahribey Köyü                                                         ", "Yamaçova Mah (Karaman Köyü)                                                ", "Yanıkara Mah (Gökçedal Köyü)                                               ", "Yanlızçam Mah (Aşağımirahmet Köyü)                                         ", "Yazıbaşı Köyü                                                              ", "Yenidam Köyü                                                               ", "Yenikaya Mah (Sarıbuğday Köyü)                                             ", "Yeniköy Köyü                                                               ", "Yeşildere Köyü                                                             ", "Yeşilköy Köyü                                                              ", "Yıdıbek Mah (Soğanlı Köyü)                                                 ", "Yılbaşı Köyü                                                               ", "Yol Bükü Mah (Çakırkaş Köyü)                                               ", "Yoncalıbayır Köyü                                                          ", "Yukarı Köse Mah (Aşağıköse Köyü)                                           ", "Yukarıdemirli Köyü                                                         ", "Yukarıkanatlı Köyü                                                         ", "Yukarıkazanlar Köyü                                                        ", "Yukarımirahmet Köyü                                                        ", "Yünlüce Mah (Değirmentaşı Köyü)                                            ", "Bahçelievler Mah                                                           ", "Camii Kebir Mah                                                            ", "Acıbadem Mah (Çitliköy Köyü)                                               ", "Ağadibek Köyü                                                              ", "Akboğa Köyü                                                                ", "Akburç Mah (Naldöken Köyü)                                                 ", "Altıntarla Köyü                                                            ", "Arslantaşı Köyü                                                            ", "Aşağı Karatop Mah (Karatop Köyü)                                           ", "Aşağı Meydancık Mah (Çayırköy Köyü)                                        ", "Bağarası Mah (Dutpınar Köyü)                                               ", "Bahçe Mah (Naldöken Köyü)                                                  ", "Bahçedere Köyü                                                             ", "Bakaçak Mah (Dutpınar Köyü)                                                ", "Bezikan Mah (Çayırköy Köyü)                                                ", "Bük Mah (Kaşlıca Köyü)                                                     ", "Camii Mah (Çitliköy Köyü)                                                  ", "Cumhuriyetçi Köyü                                                          ", "Çakıroğlu Köyü                                                             ", "Çalkaya Köyü                                                               ", "Çay Mah (Naldöken Köyü)                                                    ", "Çayırköm Mah (Çitliköy Köyü)                                               ", "Çayırköy Köyü                                                              ", "Çınarçık Mah (Dutpınar Köyü)                                               ", "Çörekli Mah (Tekevler Köyü)                                                ", "Dağ Mah (Polatköy Köyü)                                                    ", "Demokan Mah (Naldöken Köyü)                                                ", "Dere Mah (Çitliköy Köyü)                                                   ", "Dere Mah (Örtülü Köyü)                                                     ", "Dilekkaya Mah (Tekevler Köyü)                                              ", "Dutpınar Köyü                                                              ", "Eğerli Mah (Kayalar Köyü)                                                  ", "Eğrikavak Köyü                                                             ", "Göl Önü Mah (Gezin Köyü)                                                   ", "Günbağı Mah (Kaşlıca Köyü)                                                 ", "Güvendik Mah (Durmuştepe Köyü)                                             ", "Güzelbağ Mah (Kayalar Köyü)                                                ", "Güzelevler Mah (Naldöken Köyü)                                             ", "Hanevleri Köyü                                                             ", "Haraba Mah (Cumhuriyetçi Köyü)                                             ", "Haraba Mah (Çitliköy Köyü)                                                 ", "Harabe Mah (Tekevler Köyü)                                                 ", "Hatunköy Köyü                                                              ", "Hopanlar Mah (Ağadibek Köyü)                                               ", "Işıktepe Köyü                                                              ", "İstasyon Mah (Kızıltepe Köyü)                                              ", "Karabıyık Mah (Çayırköy Köyü)                                              ", "Karagülle Mah (Durmuştepe Köyü)                                            ", "Karataş Mah (Işıktepe Köyü)                                                ", "Karatop Köyü                                                               ", "Kartaldere Köyü                                                            ", "Kaşlıca Köyü                                                               ", "Kavak Gazi Ercan Mah (Kavak Köyü)                                          ", "Kavak Kara Ali Mah (Kavak Köyü)                                            ", "Kavak Köyü                                                                 ", "Kavak Küçük Bilal Mah (Kavak Köyü)                                         ", "Kayalar Köyü                                                               ", "Kısabekir Mah (Sağrılı Köyü)                                               ", "Kızıltepe Köyü                                                             ", "Kirazlı Mah (Cumhuriyetçi Köyü)                                            ", "Koçkonağı Köyü                                                             ", "Köy Sokağı Mah (Kızıltepe Köyü)                                            ", "Kumyazı Köyü                                                               ", "Kutuşağı Mah (Naldöken Köyü)                                               ", "Küçükkömler Mah (Sağrılı Köyü)                                             ", "Küçükova Köyü                                                              ", "Mastek Mah (Karatop Köyü)                                                  ", "Merkez Mah (Gezin Köyü)                                                    ", "Meşedibi Mah (Karatop Köyü)                                                ", "Mollalar Mah (Çakıroğlu Köyü)                                              ", "Naldöken Köyü                                                              ", "Nüzul Mah (Sağrılı Köyü)                                                   ", "Osman Çayır Mah (Çalkaya Köyü)                                             ", "Örtülü Köyü                                                                ", "Özay Mah (Eğrikavak Köyü)                                                  ", "Özyurt Mah (Tekevler Köyü)                                                 ", "Plajköy Köyü                                                               ", "Polatköy Köyü                                                              ", "Sağrılı Köyü                                                               ", "Samanlı Mah (Çitliköy Köyü)                                                ", "Sarıkavak Mah (Çalkaya Köyü)                                               ", "Sarıyer Mah (Naldöken Köyü)                                                ", "Seterli Mah (Arslantaşı Köyü)                                              ", "Seyhan Mah (Koçkonağı Köyü)                                                ", "Sinan Mah (Durmuştepe Köyü)                                                ", "Şaman Mah (Naldöken Köyü)                                                  ", "Şehbayram Mah (Kayalar Köyü)                                               ", "Şehoğlu Mah (Yoncapınar Köyü)                                              ", "Tecer Mah (Yoncapınar Köyü)                                                ", "Tekevler Köyü                                                              ", "Tellikaya Mah (Koçkonağı Köyü)                                             ", "Tellolar Mah (Çakıroğlu Köyü)                                              ", "Tepe Mah (Polatköy Köyü)                                                   ", "Tepecik Köyü                                                               ", "Ter Yaylası Mah (Arslantaşı Köyü)                                          ", "Tokmak Mah (Karatop Köyü)                                                  ", "Topaluşağı Köyü                                                            ", "Tut Mah (Koçkonağı Köyü)                                                   ", "Tuzluca Mah (Kumyazı Köyü)                                                 ", "Yalınca Mah (Kaşlıca Köyü)                                                 ", "Yeni Mah (Naldöken Köyü)                                                   ", "Yenibahçe Köyü                                                             ", "Yeşilova Köyü                                                              ", "Yıldızhan Köyü                                                             ", "Yoncalı Mah (Ağadibek Köyü)                                                ", "Yoncalı Mah (Kayalar Köyü)                                                 ", "Yoncapınar Köyü                                                            ", "Yörecik Mah (Dutpınar Köyü)                                                ", "Yukarı Konaklar Mah (Çitliköy Köyü)                                        ", "Yukarı Meydancık Mah (Çayırköy Köyü)                                       ", "Yurtbaşı Mah (Örtülü Köyü)                                                 ", "Zahuran Mah (Sağrılı Köyü)                                                 ", "Zibe Mah (Tekevler Köyü)                                                   ", "Ziyaret Evleri Mah (Kartaldere Köyü)                                       ", "Zuğur Evleri Mah (Çalkaya Köyü)                                            ", "Abdullah Paşa Mah                                                          ", "Cumhuriyet Mah                                                             ", "Hilalkent Mah                                                              ", "Aksaray Mah                                                                ", "Ala Yaprak Mah                                                             ", "Çaydaçıra Mah                                                              ", "Göllü Bağ Mah                                                              ", "Gümüş Kavak Mah                                                            ", "Hayvan Ürünleri Osb Mah                                                    ", "Kızılay Mah                                                                ", "Sugözü Mah                                                                 ", "Yıldız Bağları Mah                                                         ", "Doğu Kent Mah                                                              ", "Ağılcık Mah (Çalıca Köyü)                                                  ", "Akçakale Mah (Akçakale Köyü)                                               ", "Ali Çavuş Mah (Öksüzuşağı Köyü)                                            ", "Aydınlar Mah (Öksüzuşağı Köyü)                                             ", "Ayranlı Mah (Karaali Köyü)                                                 ", "Bahçelievler Mah (Hankendi Köyü)                                           ", "Bakidere Mah (Gülpınar Köyü)                                               ", "Bölüklü Mah (Bölüklü Köyü)                                                 ", "Bulutlu Mah (Bulutlu Köyü)                                                 ", "Cami Mah (Sakabaşı Köyü)                                                   ", "Cansızlar Mah (Çalıca Köyü)                                                ", "Cumhuriyet Mah (Gölköy Köyü)                                               ", "Çalıca Mah (Çalıca Köyü)                                                   ", "Çavuş Mah (Çalıca Köyü)                                                    ", "Çayırlar Mah (Gökçe Köyü)                                                  ", "Çolaklar Mah (Öksüzuşağı Köyü)                                             ", "Danalı Mah (Gülpınar Köyü)                                                 ", "Dikili Mah (Sütlüce Köyü)                                                  ", "Dilek Mah (Hankendi Köyü)                                                  ", "Doloca Mah (Koçharmanı Köyü)                                               ", "Durupınar Mah (Durupınar Köyü)                                             ", "Emiruşağı Mah (Sütlüce Köyü)                                               ", "Gökçe Mah (Gökçe Köyü)                                                     ", "Gölköy Mah (Gölköy Köyü)                                                   ", "Gözpınar Mah (Gözpınar Köyü)                                               ", "Güleç Mah (Bölüklü Köyü)                                                   ", "Gülmahmut Mah (Kelmahmut Köyü)                                             ", "Günaçtı Köyü                                                               ", "Günaçtı Mah (Günaçtı Köyü)                                                 ", "Günbağı Mah (Günbağı Köyü)                                                 ", "Hacı Ali Mah (Bölüklü Köyü)                                                ", "Hacı Efendi Mah (Öksüzuşağı Köyü)                                          ", "Halilağa Mah (Küllük Köyü)                                                 ", "Haraba Cami Mah (Çalıca Köyü)                                              ", "Harikalan Mah (Koçharmanı Köyü)                                            ", "Işıkyolu Mah (Işıkyolu Köyü)                                               ", "İlyas Mah (Sakabaşı Köyü)                                                  ", "Karaali Köyü                                                               ", "Karaali Mah (Karaali Köyü)                                                 ", "Kıluşağı Mah (Sütlüce Köyü)                                                ", "Koçharmanı Mah (Koçharmanı Köyü)                                           ", "Konacık Mah (Küllük Köyü)                                                  ", "Koparuşağı Mah (Koparuşağı Köyü)                                           ", "Küllük Mah (Küllük Köyü)                                                   ", "Kütuşağı Mah (Öksüzuşağı Köyü)                                             ", "Mahmutlu Mah (Karaali Köyü)                                                ", "Meduşağı Mah (Küllük Köyü)                                                 ", "Oğulcuk Mah (Sütlüce Köyü)                                                 ", "Oluklu Mah (Öksüzuşağı Köyü)                                               ", "Ortaçalı Mah (Ortaçalı Köyü)                                               ", "Özgürler Mah (Hankendi Köyü)                                               ", "Resul Kerim Mah (Bölüklü Köyü)                                             ", "Sakabaşı Mah (Sakabaşı Köyü)                                               ", "Sancaklı Mah (Sancaklı Köyü)                                               ", "Sarıgül Mah (Sarıgül Köyü)                                                 ", "Sarılı Mah (Sarılı Köyü)                                                   ", "Sarıtosun Mah (Gülpınar Köyü)                                              ", "Sarıyumak Mah (Bulutlu Köyü)                                               ", "Savuşağı Mah (Koçharmanı Köyü)                                             ", "Sinan Mah (Sinanköy Köyü)                                                  ", "Sütlüce Köyü                                                               ", "Sütlüce Mah (Sütlüce Köyü)                                                 ", "Şabanlı Mah (Şabanlı Köyü)                                                 ", "Şahaplı Mah (Şahaplı Köyü)                                                 ", "Şehit Saffet Akbaş Mah (Öksüzuşağı Köyü)                                   ", "Şiğolar Mah (Sakabaşı Köyü)                                                ", "Temürköy Mah (Temürköy Köyü)                                               ", "Yağızlar Mah (Bölüklü Köyü)                                                ", "Yalındamlar Mah (Yalındamlar Köyü)                                         ", "Yazıpınarı Mah (Yazıpınarı Köyü)                                           ", "Yedievler Mah (Gökçe Köyü)                                                 ", "Yenikonak Mah (Yenikonak Köyü)                                             ", "Yenikonutlar Mah (Gökçe Köyü)                                              ", "Yenimah Mah (Sütlüce Köyü)                                                 ", "Yeşilkent Mah (Hankendi Köyü)                                              ", "Yıldız Mah (Gökçe Köyü)                                                    ", "Yolçatı Mah (Yolçatı Köyü)                                                 ", "Zeynikler Mah (Öksüzuşağı Köyü)                                            ", "Alibey Mah (Aydıncık Köyü)                                                 ", "Aydıncık Mah (Aydıncık Köyü)                                               ", "Beşoluk Mah (Beşoluk Köyü)                                                 ", "Beydalı Mah (Beydalı Köyü)                                                 ", "Beydoğmuş Mah (Beydoğmuş Köyü)                                             ", "Bük Mah (Beşoluk Köyü)                                                     ", "Çakıl Mah (Aydıncık Köyü)                                                  ", "Çakmaközü Mah (Erbildi Köyü)                                               ", "Çatalharman Mah (Çatalharman Köyü)                                         ", "Çırçır Mah (Gümüşbağlar Köyü)                                              ", "Çolaklı Mah (Kurtdere Köyü)                                                ", "Çömlek Mah (Meşeli Köyü)                                                   ", "Düzler-Gülmez Mah (Gümüşbağlar Köyü)                                       ", "Ebil Mah (Kaplıkaya Köyü)                                                  ", "Ekinli Mah (Kurtdere Köyü)                                                 ", "Erbildi Mah (Erbildi Köyü)                                                 ", "Gümüşbağlar Mah (Gümüşbağlar Köyü)                                         ", "Güneyçayırı Mah (Güneyçayırı Köyü)                                         ", "Hacıhasan Mah (Beydoğmuş Köyü)                                             ", "Han Mah (Meşeli Köyü)                                                      ", "Hıdolar Mah (Kurtdere Köyü)                                                ", "Kabakçılar Mah (Kurtdere Köyü)                                             ", "Kaplıkaya Mah (Kaplıkaya Köyü)                                             ", "Karataş Mah (Karataş Köyü)                                                 ", "Koparoğlu Mah (Kurtdere Köyü)                                              ", "Kölemehmet Mah (Kurtdere Köyü)                                             ", "Körpe Mah (Körpe Köyü)                                                     ", "Kurtoğlu Mah (Kurtdere Köyü)                                               ", "Kümeevler Mah (Gümüşbağlar Köyü)                                           ", "Meşeli Mah (Meşeli Köyü)                                                   ", "Obuz Mah (Obuz Köyü)                                                       ", "Oymaağaç Mah (Oymaağaç Köyü)                                               ", "Pinoğlu Mah (Çatalharman Köyü)                                             ", "Salkaya Mah (Salkaya Köyü)                                                 ", "Sarıbük Mah (Sarıbük Köyü)                                                 ", "Seki Mah (Beydoğmuş Köyü)                                                  ", "Serince Mah (Serince Köyü)                                                 ", "Tanrıvermiş Mah (Aydıncık Köyü)                                            ", "Toraman Mah (Kaplıkaya Köyü)                                               ", "Yılangeçiren Mah (Salkaya Köyü)                                            ", "Esen Tepe Mah                                                              ", "Fevzi Çakmak Mah                                                           ", "İcadiye Mah                                                                ", "İzzet Paşa Mah                                                             ", "Rızaiye Mah                                                                ", "Safran Mah                                                                 ", "Üniversite Mah                                                             ", "Yeni Mah                                                                   ", "Acıpayam Mah (Acıpayam Köyü)                                               ", "Akmezra Sahil Önü Mah (Yurtbaşı Köyü)                                      ", "Alaca Mah (Merkez Mah) (Alaca Köyü)                                        ", "Alatarla Mah (Alatarla Köyü)                                               ", "Allahuekber Mah (Şahinkaya Köyü)                                           ", "Alpagut Mah (Merkez Mah) (Alpağut Köyü)                                    ", "Altınkuşak Köyü                                                            ", "Altınkuşak Mah (Altınkuşak Köyü)                                           ", "Arındık Mah (Merkez Mah) (Arındık Köyü)                                    ", "Asagııçme Mah (İçme Köyü)                                                  ", "Aşağı Beyleruşağı Mah (Sünköy Köyü)                                        ", "Aşağıbağ Mah (Şeyhhacı Köyü)                                               ", "Aşağıdemirtaş Mah (Aşağıdemirtaş Köyü)                                     ", "Avcılı Mah (Merkez Mah) (Avcılı Köyü)                                      ", "Aydınlar Mah (Aydınlar Köyü)                                               ", "Azozgen Mah (Üçağaç Köyü)                                                  ", "Badempınarı Mah (Badempınarı Köyü)                                         ", "Bağdere Mah (Bağdere Köyü)                                                 ", "Bağlar Mah (Korucu Köyü)                                                   ", "Bağlar Mah (Yurtbaşı Köyü)                                                 ", "Bağlarca Mah (Bağlarca Köyü)                                               ", "Bahçekapı Mah (Akçakiraz Köyü)                                             ", "Balıbey Mah (Balıbey Köyü)                                                 ", "Ballıca Mah (Ballıca Köyü)                                                 ", "Balpınarı Mah (Merkez Mah) (Balpınar Köyü)                                 ", "Bektaş Mah (Sünköy Köyü)                                                   ", "Beşevler Mah (Fatmalı Köyü)                                                ", "Beşik Mah (Merkez Mah) (Beşikköy Köyü)                                     ", "Budaklı Mah (Sultanuşağı Köyü)                                             ", "Bük Mah (Yolüstü Köyü)                                                     ", "Cadde Boyu Mah (Sultanuşağı Köyü)                                          ", "Cevizlik Mah (Şeyhhacı Köyü)                                               ", "Cipköy Mah (Merkez Mah) (Cipköy Köyü)                                      ", "Cumhuriyet Mah (Yazıkonak Köyü)                                            ", "Cumhuriyet Mah (Yurtbaşı Köyü)                                             ", "Çellik Mah (Şahinkaya Köyü)                                                ", "Çırak Mah (Üçağaç Köyü)                                                    ", "Çiçek Mah (Aşağıdemirtaş Köyü)                                             ", "Çöteli Mah (Merkez Mah) (Çöteli Köyü)                                      ", "Dallıca Mah (Dallıca Köyü)                                                 ", "Dambüyük Mah (Dambüyük Köyü)                                               ", "Dedepınarı Mah (Dedepınarı Köyü)                                           ", "Değirmendere Mah (Şeyhhacı Köyü)                                           ", "Değirmenönü Mah (Değirmenönü Köyü)                                         ", "Esenkent Mah (Esenkent Köyü)                                               ", "Fatih Mah (Yazıkonak Köyü)                                                 ", "Fatmalı Mah (Fatmalı Köyü)                                                 ", "Gadıderesi Mah (Şeyhhacı Köyü)                                             ", "Gedenek Mah (Yemişlik Köyü)                                                ", "Gedikyolu Mah (Gedikyolu Köyü)                                             ", "Gözebaşı Mah (Gözebaşı Köyü)                                               ", "Gülpınar Mah (Yurtbaşı Köyü)                                               ", "Güneşli Mah (Aşağıdemirtaş Köyü)                                           ", "Gürdal Mah (Hıdırbaba Köyü)                                                ", "Güzelyalı Mah (Güzelyalı Köyü)                                             ", "Hacı Mah (Koçkale Köyü)                                                    ", "Hacıosman Mah (Aşağıdemirtaş Köyü)                                         ", "Hacıömer Mah (Yukarıdemirtaş Köyü)                                         ", "Hal Mah (Hal Köyü)                                                         ", "Halil Ağa Mah (Sarıkamış Köyü)                                             ", "Harmantepe Mah (Merkez Mah) (Harmantepe Köyü)                              ", "Hazar Gölü Mah (İçme Köyü)                                                 ", "Hıdırbaba Mah (Merkez Mah) (Hıdırbaba Köyü)                                ", "Hıdıroğlu Mah (Yemişlik Köyü)                                              ", "Hoşköy Mah (Hoşköy Köyü)                                                   ", "Hürriyet Mah (Akçakiraz Köyü)                                              ", "İstasiyon Mah (Korucu Köyü)                                                ", "Kalkantepe Mah (Merkez Mah) (Kalkantepe Köyü)                              ", "Karaçavuş Mah (Merkez Mah) (Karaçavuş Köyü)                                ", "Karagöl Mah (Aşağıdemirtaş Köyü)                                           ", "Karagöl Mah (Yukarıdemirtaş Köyü)                                          ", "Karaman Mah (Tohumlu Köyü)                                                 ", "Karasu Mah (Yemişlik Köyü)                                                 ", "Karpınar Mah (Şahinkaya Köyü)                                              ", "Kaşıkçılar Mah (Sarıkamış Köyü)                                            ", "Kavakpınar Mah (Merkez Mah) (Kavakpınar Köyü)                              ", "Kavaktepe Mah (Kavaktepe Köyü)                                             ", "Kayalar Mah (Balpınar Köyü)                                                ", "Kengerli Mah (Yemişlik Köyü)                                               ", "Kepektaş Mah (Merkez Mah) (Kepektaş Köyü)                                  ", "Kesikköprü Mah (Aşağıdemirtaş Köyü)                                        ", "Kıraç Mah (Akçakiraz Köyü)                                                 ", "Kıraç Mah (Kıraçköy Köyü)                                                  ", "Kireçli Mah (Kıraçköy Köyü)                                                ", "Koçabağı Mah (Sünköy Köyü)                                                 ", "Koçkale Mah (Koçkale Köyü)                                                 ", "Kom Mah (Kuşhane Köyü)                                                     ", "Konak Mah (Dallıca Köyü)                                                   ", "Konak Mah (Yazıkonak Köyü)                                                 ", "Konakalmaz Mah (Konakalmaz Köyü)                                           ", "Korucu Mah (Korucu Köyü)                                                   ", "Koruk Mah (Koruköy Köyü)                                                   ", "Korular Mah (Balpınar Köyü)                                                ", "Kozluk Mah (Merkez Mah) (Kozluk Köyü)                                      ", "Kumla Mah (Kumla Köyü)                                                     ", "Kumlukbağları Mah (Sarıyakup Köyü)                                         ", "Kuruçay Mah (Üçağaç Köyü)                                                  ", "Kuşhane Mah (Kuşhane Köyü)                                                 ", "Kuyulu Mah (Kuyulu Köyü)                                                   ", "Kültür Mah (Akçakiraz Köyü)                                                ", "Mağara Mah (Üçağaç Köyü)                                                   ", "Mansurşağı Mah (Sünköy Köyü)                                               ", "Mastar Mah (Değirmenönü Köyü)                                              ", "Mastar Mah (İçme Köyü)                                                     ", "Merkez Mah (Muratcık Köyü)                                                 ", "Merkez Mah (Poyraz Köyü)                                                   ", "Merkez Mah (Yazıkonak Köyü)                                                ", "Merkez Mah (Yürekli Köyü)                                                  ", "Meryem Mah (Yemişlik Köyü)                                                 ", "Mollahasan Mah (Sultanuşağı Köyü)                                          ", "Munzuroğlu Mah (Kıraçköy Köyü)                                             ", "Muzuroğlu Mah (Güzelyalı Köyü)                                             ", "Nuralı Mah (Nuralı Köyü)                                                   ", "Org. Eşref Bitlis Mah (Yurtbaşı Köyü)                                      ", "Ortahan Mah (Koruköy Köyü)                                                 ", "Ömerağa Mah (Aşağıdemirtaş Köyü)                                           ", "Örehan Mah (Çöteli Köyü)                                                   ", "Örençay Mah (Örençay Köyü)                                                 ", "Öztürk Mah (Değirmenönü Köyü)                                              ", "Paşalar Mah (Akçakiraz Köyü)                                               ", "Pelteköy Mah (Merkez Mah) (Pelteköy Köyü)                                  ", "Pirinçci Mah (Pirinççi Köyü)                                               ", "Pürüntüz Mah (Yemişlik Köyü)                                               ", "Sanayi Mah (Yazıkonak Köyü)                                                ", "Sanayi Mah (Yurtbaşı Köyü)                                                 ", "Sanayiosb Mah (Yazıkonak Köyü)                                             ", "Sarıçubuk Mah (Sarıçubuk Köyü)                                             ", "Sarıkamış Mah (Sarıkamış Köyü)                                             ", "Sarıyakup Mah (Sarıyakup Köyü)                                             ", "Sedeftepe Mah (Sedeftepe Köyü)                                             ", "Sipahi Mah (Yemişlik Köyü)                                                 ", "Solhunpınar Mah (Karaçavuş Köyü)                                           ", "Sultanuşağı Köyü                                                           ", "Süleyman Mah (Sultanuşağı Köyü)                                            ", "Sünköy Mah (Merkez Mah) (Sünköy Köyü)                                      ", "Şahinkaya Mah (Şahinkaya Köyü)                                             ", "Şavaklı Mah (Yürekli Köyü)                                                 ", "Şehsuvar Mah (Şehsuvar Köyü)                                               ", "Şemsiveren Mah (Altınkuşak Köyü)                                           ", "Şıkan Mah (Üçağaç Köyü)                                                    ", "Şoş Mah (Tohumlu Köyü)                                                     ", "Tadım Mah (Tadım Köyü)                                                     ", "Tapanlı Mah (Dambüyük Köyü)                                                ", "Tepeköy Mah (Tepeköy Köyü)                                                 ", "Tohumlu Mah (Tohumlu Köyü)                                                 ", "Uzuntarla Mah (Merkez Mah) (Uzuntarla Köyü)                                ", "Üçağaç Mah (Merkez Mah) (Üçağaç Köyü)                                      ", "Üçtepe Mah (Altınkuşak Köyü)                                               ", "Ürünveren Mah (Ürünveren Köyü)                                             ", "Vartinik Mah (Kuşhane Köyü)                                                ", "Venk Mah (Yalnız Köyü)                                                     ", "Veran Mah (Şahinkaya Köyü)                                                 ", "Y.İçme Mah (İçme Köyü)                                                     ", "Yadigar Mah (Yemişlik Köyü)                                                ", "Yalnız Mah (Yalnız Köyü)                                                   ", "Yedigöze Mah (Yedigöze Köyü)                                               ", "Yemişlik Mah (Yemişlik Köyü)                                               ", "Yeni Bağlar Mah (Yazıkonak Köyü)                                           ", "Yeni Mah (Yurtbaşı Köyü)                                                   ", "Yenice Mah (Akçakiraz Köyü)                                                ", "Yeniköy Mah (Yemişlik Köyü)                                                ", "Yeşilkuşak Mah (Akçakiraz Köyü)                                            ", "Yeşilyurt Mah (Akçakiraz Köyü)                                             ", "Yeşilyurt Mah (Gözebaşı Köyü)                                              ", "Yolüstü Mah (Yolüstü Köyü)                                                 ", "Yukarı Beyleruşağı Mah (Sünköy Köyü)                                       ", "Yukarıbağ Mah (Şeyhhacı Köyü)                                              ", "Yukarıçakmak Mah (Merkez Mah) (Yukarıçakmak Köyü)                          ", "Yukarıdemirtaş Mah (Yukarıdemirtaş Köyü)                                   ", "Yusuf Mah (Beşikköy Köyü)                                                  ", "Yüzbaşı Mah (Akçakiraz Köyü)                                               ", "Zafer Mah (Akçakiraz Köyü)                                                 ", "Alamutsitesi Mah (Gölardı Köyü)                                            ", "Alikaya Mah (Karasaz Köyü)                                                 ", "Cevizdere Mah (Cevizdere Köyü)                                             ", "Çağlar Mah (Çağlar Köyü)                                                   ", "Dereboğazı Mah (Merkez Mah) (Dereboğazı Köyü)                              ", "Doğankuş Mah (Merkez Mah) (Doğankuş Köyü)                                  ", "Elmapınarı Mah (Merkez Mah) (Elmapınarı Köyü)                              ", "Eyüp Bağları Mah (Yenikapı Köyü)                                           ", "Gölardı Mah (Merkez Mah) (Gölardı Köyü)                                    ", "Gölardısitesi-1 Mah (Gölardı Köyü)                                         ", "Gölardısitesi-2 Mah (Gölardı Köyü)                                         ", "Gölkenarı Mah (Cevizdere Köyü)                                             ", "Güntaşı Mah (Mollakendi Köyü)                                              ", "Hacıali Mah (Gölardı Köyü)                                                 ", "İkitepe Mah (Merkez Mah) (İkitepe Köyü)                                    ", "Karasaz Mah (Merkez Mah) (Karasaz Köyü)                                    ", "Karşıbağ Mah (Mollakendi Köyü)                                             ", "Kuşcu Mah (Cevizdere Köyü)                                                 ", "Mollakendi Mah (Mollakendi Köyü)                                           ", "Sarıcan Mah (Gölardı Köyü)                                                 ", "Seringölsitesi Mah (Gölardı Köyü)                                          ", "Sevsak Mah (Gölardı Köyü)                                                  ", "Soğukpınar Mah (Cevizdere Köyü)                                            ", "Sulaf Mah (Cevizdere Köyü)                                                 ", "Tepebaşısitesi Mah (Gölardı Köyü)                                          ", "Yenikapı Mah (Merkez Mah) (Yenikapı Köyü)                                  ", "Yünlüce Mah (Merkez Mah) (Yünlüce Köyü)                                    ", "Çatal Çeşme Mah                                                            ", "Harput Mah                                                                 ", "Karşıyaka Mah                                                              ", "Kırklar Mah                                                                ", "Mustafa Paşa Mah                                                           ", "Salı Baba Mah                                                              ", "Sanayi Mah                                                                 ", "Ulu Kent Mah                                                               ", "Akpınar Mah                                                                ", "Çarşı Mah                                                                  ", "Kültür Mah                                                                 ", "Nail Bey Mah                                                               ", "Rüstem Paşa Mah                                                            ", "Sarayatik Mah                                                              ", "Ataşehir Mah                                                               ", "Hicret Mah                                                                 ", "Olgunlar Mah                                                               ", "Sürsürü Mah                                                                ", "Girne Mah (Beyhan Köyü)                                                    ", "Güney Mah (Beyhan Köyü)                                                    ", "İstasyon Mah (Beyhan Köyü)                                                 ", "Karşıyaka Mah (Beyhan Köyü)                                                ", "Akbulut Köyü                                                               ", "Akdemir Mah (Gökdere Köyü)                                                 ", "Aksaray Mah (Karataş Köyü)                                                 ", "Akyürek Köyü                                                               ", "Altınölçek Köyü                                                            ", "Andılar Köyü                                                               ", "Arındık Köyü                                                               ", "Atik Köyü                                                                  ", "Bahçelievler Mah (Baltaşı Köyü)                                            ", "Balkaya Mah (Keklikdere Köyü)                                              ", "Beydoğan Köyü                                                              ", "Bircan Mah (Bozçanak Köyü)                                                 ", "Bozçanak Köyü                                                              ", "Bölükelma Köyü                                                             ", "Burgudere Köyü                                                             ", "Bük Mezrası Mah (Köklüce Köyü)                                             ", "Büyükçaltı Köyü                                                            ", "Çaybaşı Mah (Baltaşı Köyü)                                                 ", "Damlapınar Köyü                                                            ", "Dol Küçük Mezrası Mah (Köklüce Köyü)                                       ", "Dutağacı Mah (Kırkbulak Köyü)                                              ", "Eşmekaya Mah (Karataş Köyü)                                                ", "Gemtepe Köyü                                                               ", "Gökdere Köyü                                                               ", "Gömelan Mah (Damlapınar Köyü)                                              ", "Güllüce Köyü                                                               ", "Gümeçbağlar Köyü                                                           ", "Gümüşkaynak Köyü                                                           ", "Gümüşlü Mah (Akbulut Köyü)                                                 ", "Hama Mah (Bozçanak Köyü)                                                   ", "Hamzabey Mah (Karacabağ Köyü)                                              ", "Hanönü Mah (Bozçanak Köyü)                                                 ", "Hasbey Köyü                                                                ", "Hüssam Mah (Arındık Köyü)                                                  ", "İncesu Mah (Andılar Köyü)                                                  ", "Karacabağ Köyü                                                             ", "Karasalkım Köyü                                                            ", "Karataş Köyü                                                               ", "Kasıl Köyü                                                                 ", "Kayaönü Köyü                                                               ", "Keklikdere Köyü                                                            ", "Keseköprü Mah (Örencik Köyü)                                               ", "Kırkbulak Köyü                                                             ", "Köklüce Köyü                                                               ", "Köroğlu Mah (Üçdeğirmenler Köyü)                                           ", "Küçükçaltı Köyü                                                            ", "Örencik Köyü                                                               ", "Örgülü Köyü                                                                ", "Payamlı Mah (Kırkbulak Köyü)                                               ", "Pınarbaşı Mah (Karasalkım Köyü)                                            ", "Seydili Köyü                                                               ", "Sivrikaya Mah (Gökdere Köyü)                                               ", "Şeyhpiran Mah (Arındık Köyü)                                               ", "Tarhana Köyü                                                               ", "Taştek Mah (Karacabağ Köyü)                                                ", "Umurca Mah (Akyürek Köyü)                                                  ", "Umutkaya Köyü                                                              ", "Üçdeğirmenler Köyü                                                         ", "Yarımtepe Köyü                                                             ", "Yaylacık Mah (Kayaönü Köyü)                                                ", "Yazmacık Mah (Akyürek Köyü)                                                ", "Yeşilbayır Köyü                                                            ", "Aşağı Mah                                                                  ", "Cumhuriyet Mah                                                             ", "Çarşı Mah                                                                  ", "Esentepe Mah                                                               ", "Kalekent Mah                                                               ", "Karşıbahçeler Mah                                                          ", "Kültür Mah                                                                 ", "Numune Mah                                                                 ", "Yenimahalle Mah                                                            ", "Yukarı Palu Mah                                                            ", "Ağılözü Mah (Kürkköy Köyü)                                                 ", "Akbuğday Köyü                                                              ", "Akseki Köyü                                                                ", "Alaattinköy Köyü                                                           ", "Alıncık Köyü                                                               ", "Ali Topal Mah (Topaluşağı Köyü)                                            ", "Asaf Mah (Gelindere Köyü)                                                  ", "Aşağı Çolitır Mah (Gözeli Köyü)                                            ", "Aşağı Mah (Çevrimtaş Köyü)                                                 ", "Aşağıçanakçı Köyü                                                          ", "Atayurdu Mah (Kösebayır Köyü)                                              ", "Aylık Mah (Kayabağları Köyü)                                               ", "Badem Ağacı Mah (Kürkköy Köyü)                                             ", "Başkaynak Köyü                                                             ", "Bekçitepe Köyü                                                             ", "Bekerme Mah (Akseki Köyü)                                                  ", "Bekirağa Mah (Topaluşağı Köyü)                                             ", "Bekirgölü Mah (Gözeli Köyü)                                                ", "Boğaz Mah (Kavallı Köyü)                                                   ", "Cami Mah (Gözeli Köyü)                                                     ", "Canbek Mah (Üğrük Köyü)                                                    ", "Candı Mah (Çatakkaya Köyü)                                                 ", "Cellatlar Mah (Dörtbölük Köyü)                                             ", "Çamurluk Mah (Topaluşağı Köyü)                                             ", "Çatakkaya Köyü                                                             ", "Çelemlik Mah (Yaruşağı Köyü)                                               ", "Çortunlu Köyü                                                              ", "Çöl Dere Mah (Kürkköy Köyü)                                                ", "Dedeyolu Köyü                                                              ", "Değirmen Önü Mah (Haftasar Köyü)                                           ", "Delolar Mah (Dörtbölük Köyü)                                               ", "Demuşağı Mah (Çortunlu Köyü)                                               ", "Derebey Mah (Topaluşağı Köyü)                                              ", "Dereboynu Köyü                                                             ", "Dikmen Köyü                                                                ", "Doğanbağı Köyü                                                             ", "Doğanlar Mah (Bekçitepe Köyü)                                              ", "Dörtbölük Köyü                                                             ", "Durak Mah (Bekçitepe Köyü)                                                 ", "Duygulu Köyü                                                               ", "Düztaş Mah (Gelindere Köyü)                                                ", "Elbistan Mah (Akbuğday Köyü)                                               ", "Elmalıdere Mah (Nergize Köyü)                                              ", "Elmasuyu Köyü                                                              ", "Esaflar Mah (Gözeli Köyü)                                                  ", "Eski Bağlar Mah (Kürkköy Köyü)                                             ", "Eskiköy Mah (Kamışlık Köyü)                                                ", "Eylolar Mah (Gözeli Köyü)                                                  ", "Fenk Mah (Akseki Köyü)                                                     ", "Gazazi Mah (Görgülü Köyü)                                                  ", "Gelindere Köyü                                                             ", "Göl Mezrası Mah (Sürek Köyü)                                               ", "Göl Önü Mah (Kürkköy Köyü)                                                 ", "Gölcük Mah (Sürek Köyü)                                                    ", "Görgülü Köyü                                                               ", "Gözeli Köyü                                                                ", "Günay Köyü                                                                 ", "Günbalı Köyü                                                               ", "Hacılar Köyü                                                               ", "Hacılar Mah (Hacılar Köyü)                                                 ", "Haraba Mah (Dörtbölük Köyü)                                                ", "Hayat Mah (Gelindere Köyü)                                                 ", "Hindogiller Mah (Yedikardeş Köyü)                                          ", "Huğ Üzü Mah (Kürkköy Köyü)                                                 ", "Ilıncak Köyü                                                               ", "İbokaçlar Mah (Gözeli Köyü)                                                ", "İbolar Mah (Soğukpınar Köyü)                                               ", "İmran Göze Mah (Kürkköy Köyü)                                              ", "Kalaba Köyü                                                                ", "Kaldırım Mah (Dörtbölük Köyü)                                              ", "Kamışlık Köyü                                                              ", "Karlık Mah (Haftasar Köyü)                                                 ", "Karşılan Mah (Kürkköy Köyü)                                                ", "Kasaplar Mah (Gelindere Köyü)                                              ", "Kasımuşağı Mah (Çortunlu Köyü)                                             ", "Kavak Mah (Akbuğday Köyü)                                                  ", "Kavak Üstü Mah (Kavakköy Köyü)                                             ", "Kavakköy Köyü                                                              ", "Kavallı Köyü                                                               ", "Kayabağları Köyü                                                           ", "Kayapınar Köyü                                                             ", "Keçiler Mah (Topaluşağı Köyü)                                              ", "Kekeç Mah (Gözeli Köyü)                                                    ", "Kel Hüseyin Mah (Günbalı Köyü)                                             ", "Kesrik Mah (Sürek Köyü)                                                    ", "Kıdiş Mah (Topaluşağı Köyü)                                                ", "Kılıçkaya Köyü                                                             ", "Konak Mah (Canuşağı Köyü)                                                  ", "Kösebayır Köyü                                                             ", "Köy Karşısı Mah (Dereboynu Köyü)                                           ", "Kürkköy Köyü                                                               ", "Merkez Mah (Canuşağı Köyü)                                                 ", "Merkez Mah (Çevrimtaş Köyü)                                                ", "Merkez Mah (Haftasar Köyü)                                                 ", "Merkez Mah (Sürek Köyü)                                                    ", "Merkez Mah (Topaluşağı Köyü)                                               ", "Merkez Mah (Yedikardeş Köyü)                                               ", "Moğal Mah (Haftasar Köyü)                                                  ", "Molla Hüseyin Mah (Günbalı Köyü)                                           ", "Mullaali Köyü                                                              ", "Nahal Mah (Haftasar Köyü)                                                  ", "Nene Gölü Mah (Görgülü Köyü)                                               ", "Nergize Köyü                                                               ", "Omolar Mah (Soğukpınar Köyü)                                               ", "Paha Mah (Nergize Köyü)                                                    ", "Sakız Ağacı Mah (Kürkköy Köyü)                                             ", "Sekiler Mah (Kavallı Köyü)                                                 ", "Simotlar Mah (Gözeli Köyü)                                                 ", "Sincan Mah (Dereboynu Köyü)                                                ", "Soğukpınar Köyü                                                            ", "Söğütler Mah (Çatakkaya Köyü)                                              ", "Suludere Mah (Dörtbölük Köyü)                                              ", "Şirin Mah (Gözeli Köyü)                                                    ", "Tahtikler Mah (Tarlatepe Köyü)                                             ", "Tarlatepe Köyü                                                             ", "Taşlıyayla Köyü                                                            ", "Tek Pınar Mah (Yedikardeş Köyü)                                            ", "Teyara Mah (Nergize Köyü)                                                  ", "Tilkidere Mah (Tarlatepe Köyü)                                             ", "Tuztaşı/Değirmen Mah (Kürkköy Köyü)                                        ", "Urlik Mah (Yedikardeş Köyü)                                                ", "Uslu Köyü                                                                  ", "Uzun Çimen Mah (Yedikardeş Köyü)                                           ", "Üçlerce Köyü                                                               ", "Üğrük Köyü                                                                 ", "Ürüdüler Mah (Topaluşağı Köyü)                                             ", "Yaruşağı Köyü                                                              ", "Yayla Evleri Mah (Çevrimtaş Köyü)                                          ", "Yaylaevleri Mah (Bekçitepe Köyü)                                           ", "Yazevleri Mah (Çatakkaya Köyü)                                             ", "Yazı Mah (Kösebayır Köyü)                                                  ", "Yedipınar Köyü                                                             ", "Yenice Mah (Uslu Köyü)                                                     ", "Yeniköy Mah (Günay Köyü)                                                   ", "Yukarı Teştek Mah (Dereboynu Köyü)                                         ", "Yukarıçanakçı Köyü                                                         ", "Yürekkaya Köyü                                                             ", "Ziyalar Mah (Canuşağı Köyü)                                                ", "Akpınar Mah                                                                ", "Gölbaşı Mah                                                                ", "Hazar Mah                                                                  ", "Karaçalı Mah                                                               ", "Kültür Mah                                                                 ", "Olgunlar Mah                                                               ", "Sanayi Mah" }));

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Açık Adres *");

        acikAdres.setBackground(new java.awt.Color(204, 204, 204));
        acikAdres.setColumns(20);
        acikAdres.setRows(5);
        jScrollPane3.setViewportView(acikAdres);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(il, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(ilce, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mahalle, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(il, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ilce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mahalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Adres Bilgileri", jPanel6);

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("Adı Soyadı *");

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("Cep Telefonu *");

        isim.setBackground(new java.awt.Color(204, 204, 204));
        isim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isimActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setText("+90");

        telefonNo.setBackground(new java.awt.Color(204, 204, 204));
        telefonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonNoActionPerformed(evt);
            }
        });
        telefonNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonNoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(2, 2, 2)
                        .addComponent(telefonNo))
                    .addComponent(isim, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(telefonNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("İletişim Bilgileri", jPanel7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fotoğraf Yükle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        resimLabel.setBackground(new java.awt.Color(153, 153, 153));
        resimLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_image_160px.png"))); // NOI18N
        resimLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        resimLabel.setOpaque(true);

        fotografSec.setEditable(false);
        fotografSec.setBackground(new java.awt.Color(204, 204, 204));
        fotografSec.setForeground(new java.awt.Color(51, 51, 51));
        fotografSec.setText("Fotoğrafları Seçin:");
        fotografSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotografSecActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_image_file_add_30px.png"))); // NOI18N
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resimLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(fotografSec, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(resimLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotografSec))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detaylı Bilgi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));

        d1.setText("Asansör");
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });

        d4.setText("Hidrofor");

        d7.setText("Kamera Sistemi");

        d10.setText("Yüzme Havuzu (Kapalı)");
        d10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d10ActionPerformed(evt);
            }
        });

        d13.setText("Ses Yalıtımı");

        d16.setText("Tenis Kortu");

        d19.setText("Isı Yalıtımı");

        d20.setText("Oyun Parkı");

        d17.setText("Kapıcı");

        d14.setText("Jeneratör");

        d11.setText("Uydu");
        d11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d11ActionPerformed(evt);
            }
        });

        d5.setText("Kapalı Garaj");

        d8.setText("Otopark");

        d2.setText("Buhar Odası");

        d3.setText("Güvenlik");

        d6.setText("Hamam");

        d9.setText("Kablo Tv");

        d12.setText("Kreş");

        d15.setText("Sauna");

        d18.setText("Su Deposu");

        d21.setText("Yüzme Havuzu (Açık)");
        d21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d21ActionPerformed(evt);
            }
        });

        d0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d0.setText("Seçmek İstemiyorum");
        d0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54))
                    .addComponent(d2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)))
                .addGap(417, 417, 417))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(d0)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d2)
                            .addComponent(d3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d5)
                            .addComponent(d6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d8)
                            .addComponent(d9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d11)
                            .addComponent(d12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d14)
                            .addComponent(d15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d17)
                            .addComponent(d18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d20)
                            .addComponent(d21)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d1)
                        .addGap(18, 18, 18)
                        .addComponent(d4)
                        .addGap(18, 18, 18)
                        .addComponent(d7)
                        .addGap(18, 18, 18)
                        .addComponent(d10)
                        .addGap(18, 18, 18)
                        .addComponent(d13)
                        .addGap(18, 18, 18)
                        .addComponent(d16)
                        .addGap(18, 18, 18)
                        .addComponent(d19)))
                .addGap(64, 64, 64))
        );

        jTabbedPane1.addTab("Dış Özellikler", jPanel11);

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));

        u1.setText("Anayol");
        u1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u1ActionPerformed(evt);
            }
        });

        u2.setText("Cadde");

        u3.setText("Otobüs Durağı");

        u4.setText("Dolmuş");
        u4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u4ActionPerformed(evt);
            }
        });

        u5.setText("Tren İstasyonu");

        u6.setText("E-5");

        u7.setText("Minübüs");
        u7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u7ActionPerformed(evt);
            }
        });

        u0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        u0.setText("Seçmek İstemiyorum");
        u0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(u0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(518, 518, 518))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(u2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(u1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(42, 42, 42))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(u3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(30, 30, 30))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(u4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(23, 23, 23))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(u5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(7, 7, 7))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(u6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(40, 40, 40))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(u7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(42, 42, 42)))
                    .addGap(538, 538, 538)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(u0)
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(u1)
                    .addGap(18, 18, 18)
                    .addComponent(u2)
                    .addGap(18, 18, 18)
                    .addComponent(u3)
                    .addGap(18, 18, 18)
                    .addComponent(u4)
                    .addGap(18, 18, 18)
                    .addComponent(u5)
                    .addGap(18, 18, 18)
                    .addComponent(u6)
                    .addGap(18, 18, 18)
                    .addComponent(u7)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Ulaşım", jPanel12);

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));

        c2.setText("Güney");

        c3.setText("Doğu");

        c1.setText("Kuzey");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        c4.setText("Batı");

        c0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c0.setText("Seçmek İstemiyorum");
        c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(c1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(137, 137, 137)
                .addComponent(c2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(118, 118, 118)
                .addComponent(c3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(128, 128, 128)
                .addComponent(c4, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(37, 37, 37))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(c0)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(c0)
                .addGap(125, 125, 125)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(c4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c3)
                    .addComponent(c2)
                    .addComponent(c1))
                .addGap(214, 214, 214))
        );

        jTabbedPane1.addTab("Cephe", jPanel8);

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        i6.setText("Alarm(Yangın)");

        i1.setText("ADSL");

        i11.setText("Barbekü");

        i21.setText("Fiber İnternet");

        i16.setText("Buzdolabı");

        i26.setText("Jakuzi");

        i31.setText("Küvet");

        i2.setText("Mutfak(Ankastre)");

        i7.setText("Panjur");

        i12.setText("Çamaşır Odası");

        i17.setText("Spot Aydınlatma");

        i32.setText("Parke Zemin");

        i22.setText("Ankastre Fırın");

        i27.setText("Laminant Zemin");

        i3.setText("Teras");

        i8.setText("Parmak İzi");

        i13.setText("Çelik Kapı");

        i18.setText("Akıllı Ev");

        i28.setText("Boyalı");

        i33.setText("Duşakabin");

        i9.setText("Kiler");

        i4.setText("Giyinme Odası");

        i19.setText("Seramik Zemin");

        i29.setText("Şofben");

        i24.setText("Termosifon");

        i34.setText("Balkon");

        i14.setText("Mutfak Doğalgazı");

        i35.setText("Şömine");

        i30.setText("Çamaşır Makinesi");

        i25.setText("Klima");

        i20.setText("Isıcam");

        i15.setText("Gömme Dolap");

        i10.setText("Ebeveyn Banyosu");

        i5.setText("Bulaşık Makinesi");

        i0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        i0.setText("Seçmek İstemiyorum");
        i0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(i6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54))
                    .addComponent(i2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i0)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(i33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(i35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(i18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(14, 14, 14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(50, 50, 50))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addComponent(i14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(61, 61, 61))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addComponent(i10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(58, 58, 58))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(63, 63, 63))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(i30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5)))
                        .addGap(327, 327, 327))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i0)
                .addGap(47, 47, 47)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(i5)
                        .addGap(18, 18, 18)
                        .addComponent(i10)
                        .addGap(18, 18, 18)
                        .addComponent(i15)
                        .addGap(18, 18, 18)
                        .addComponent(i20)
                        .addGap(18, 18, 18)
                        .addComponent(i25)
                        .addGap(18, 18, 18)
                        .addComponent(i30))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(i1)
                            .addComponent(i2)
                            .addComponent(i3)
                            .addComponent(i4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(i6)
                            .addComponent(i7)
                            .addComponent(i8)
                            .addComponent(i9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(i11)
                            .addComponent(i12)
                            .addComponent(i13)
                            .addComponent(i14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(i16)
                            .addComponent(i17)
                            .addComponent(i18)
                            .addComponent(i19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(i21)
                            .addComponent(i22)
                            .addComponent(i24)
                            .addComponent(i35))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(i26)
                            .addComponent(i27)
                            .addComponent(i28)
                            .addComponent(i29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(i31)
                            .addComponent(i32)
                            .addComponent(i33)
                            .addComponent(i34))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("İç Özellikler", jPanel10);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setText("İlanı Oluştur");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout evEkleLayout = new javax.swing.GroupLayout(evEkle);
        evEkle.setLayout(evEkleLayout);
        evEkleLayout.setHorizontalGroup(
            evEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(evEkleLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(evEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(evEkleLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(evEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        evEkleLayout.setVerticalGroup(
            evEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(evEkleLayout.createSequentialGroup()
                .addGroup(evEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(evEkleLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(evEkleLayout.createSequentialGroup()
                        .addGroup(evEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(evEkleLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(evEkleLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        esya.setBackground(new java.awt.Color(153, 153, 153));
        esya.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eşya", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        esya.setForeground(new java.awt.Color(51, 51, 51));
        esya.setToolTipText("");

        jTable2.setBackground(new java.awt.Color(153, 153, 153));
        jTable2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(51, 51, 51));
        jTable2.setRowHeight(315);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, esyaekleList2, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ilanEsya}"));
        columnBinding.setColumnName("İlan");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fiyatEsya}"));
        columnBinding.setColumnName("Fiyat(TL)");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kategoriEsya}"));
        columnBinding.setColumnName("Kategori ");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${image}"));
        columnBinding.setColumnName("Resim");
        columnBinding.setColumnClass(javax.swing.ImageIcon.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${markaEsya}"));
        columnBinding.setColumnName("Marka Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${modelEsya}"));
        columnBinding.setColumnName("Model Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${durumEsya}"));
        columnBinding.setColumnName("Durum Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${aciklamaEsya}"));
        columnBinding.setColumnName("Aciklama Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${garantiEsya}"));
        columnBinding.setColumnName("Garanti Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${takasEsya}"));
        columnBinding.setColumnName("Takas Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ilEsya}"));
        columnBinding.setColumnName("Il Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ilceEsya}"));
        columnBinding.setColumnName("Ilce Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mahalleEsya}"));
        columnBinding.setColumnName("Mahalle Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${acikAdresEsya}"));
        columnBinding.setColumnName("Acik Adres Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${teknikOzelliklerEsya}"));
        columnBinding.setColumnName("Teknik Ozellikler Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${isimEsya}"));
        columnBinding.setColumnName("Isim Esya");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefonNoEsya}"));
        columnBinding.setColumnName("Telefon No Esya");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setResizable(false);
            jTable2.getColumnModel().getColumn(8).setResizable(false);
            jTable2.getColumnModel().getColumn(9).setResizable(false);
            jTable2.getColumnModel().getColumn(10).setResizable(false);
            jTable2.getColumnModel().getColumn(11).setResizable(false);
            jTable2.getColumnModel().getColumn(12).setResizable(false);
            jTable2.getColumnModel().getColumn(13).setResizable(false);
            jTable2.getColumnModel().getColumn(14).setResizable(false);
            jTable2.getColumnModel().getColumn(15).setResizable(false);
            jTable2.getColumnModel().getColumn(16).setResizable(false);
        }
        tableHide(jTable2, 4);
        tableHide(jTable2, 5);
        tableHide(jTable2, 6);
        tableHide(jTable2, 7);
        tableHide(jTable2, 8);
        tableHide(jTable2, 9);
        tableHide(jTable2, 10);
        tableHide(jTable2, 11);
        tableHide(jTable2, 12);
        tableHide(jTable2, 13);
        tableHide(jTable2, 14);
        tableHide(jTable2, 15);
        tableHide(jTable2, 16);

        javax.swing.GroupLayout esyaLayout = new javax.swing.GroupLayout(esya);
        esya.setLayout(esyaLayout);
        esyaLayout.setHorizontalGroup(
            esyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1430, Short.MAX_VALUE)
        );
        esyaLayout.setVerticalGroup(
            esyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esyaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE))
        );

        bagis.setBackground(new java.awt.Color(153, 153, 153));
        bagis.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bağış Yap", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("BAĞIŞ YAPMAK İSTİYORUM");

        jPanel19.setBackground(java.awt.Color.darkGray);
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ilan1.setBackground(new java.awt.Color(204, 204, 204));
        ilan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilan1ActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("İsim Soyisim*");

        ilan2.setBackground(new java.awt.Color(204, 204, 204));
        ilan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilan2ActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Bağış Türünüz*");

        jLabel77.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Telefon Numarası*");

        ilan4.setBackground(new java.awt.Color(102, 102, 102));
        ilan4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Ev", "Eşya", "Diğer" }));
        ilan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilan4ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Açıklama*");

        ilan3.setBackground(new java.awt.Color(204, 204, 204));
        ilan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilan3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 102));
        jButton4.setText("Bağışımı Kaydet");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bagisLayout = new javax.swing.GroupLayout(bagis);
        bagis.setLayout(bagisLayout);
        bagisLayout.setHorizontalGroup(
            bagisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bagisLayout.createSequentialGroup()
                .addContainerGap(476, Short.MAX_VALUE)
                .addGroup(bagisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(jLabel77)
                    .addComponent(jLabel76)
                    .addComponent(jLabel70)
                    .addGroup(bagisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bagisLayout.createSequentialGroup()
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(450, 450, 450))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bagisLayout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addGap(539, 539, 539)))
                    .addComponent(ilan1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bagisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bagisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ilan3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ilan4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ilan2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)))))
        );
        bagisLayout.setVerticalGroup(
            bagisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bagisLayout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ilan1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ilan2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ilan4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ilan3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        kullanici.setBackground(new java.awt.Color(153, 153, 153));
        kullanici.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kullanıcı Hesabım", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel79.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Kullanıcı Adınız:");

        kadiHesap.setEditable(false);
        kadiHesap.setBackground(new java.awt.Color(204, 204, 204));
        kadiHesap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kadiHesapActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Şifreniz:");

        sifreHesap.setEditable(false);
        sifreHesap.setBackground(new java.awt.Color(204, 204, 204));
        sifreHesap.setText("jPasswordField1");

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton6.setText("Şifremi Değiştirmek İstiyorum");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/icons8_eye_37px_2.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout kullaniciLayout = new javax.swing.GroupLayout(kullanici);
        kullanici.setLayout(kullaniciLayout);
        kullaniciLayout.setHorizontalGroup(
            kullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kullaniciLayout.createSequentialGroup()
                .addGap(497, 497, 497)
                .addGroup(kullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kullaniciLayout.createSequentialGroup()
                            .addComponent(jLabel80)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(kadiHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel79)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(kullaniciLayout.createSequentialGroup()
                        .addComponent(sifreHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel27)))
                .addContainerGap(438, Short.MAX_VALUE))
        );
        kullaniciLayout.setVerticalGroup(
            kullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kullaniciLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kadiHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(kullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        yardim.setBackground(new java.awt.Color(153, 153, 153));
        yardim.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yardım", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Çok Yakında..");

        javax.swing.GroupLayout yardimLayout = new javax.swing.GroupLayout(yardim);
        yardim.setLayout(yardimLayout);
        yardimLayout.setHorizontalGroup(
            yardimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yardimLayout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(262, 262, 262))
        );
        yardimLayout.setVerticalGroup(
            yardimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yardimLayout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(305, 305, 305))
        );

        javax.swing.GroupLayout ortaPanelLayout = new javax.swing.GroupLayout(ortaPanel);
        ortaPanel.setLayout(ortaPanelLayout);
        ortaPanelLayout.setHorizontalGroup(
            ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ortaPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(bagis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(kullanici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(yardim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(esyaEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(evEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 1449, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(esya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        ortaPanelLayout.setVerticalGroup(
            ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(bagis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(kullanici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(yardim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(esyaEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(evEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(ortaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ortaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(esya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(solPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ustPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ortaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ustPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ortaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(solPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void changeColor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        this.setLocation(getLocation().x + evt.getX() - poX,
                getLocation().y + evt.getY() - poY);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased

    }//GEN-LAST:event_formMouseReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        poX = evt.getX();
        poY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinimizedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizedMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizedMouseClicked

    private void jLabelMinimizedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizedMouseEntered
        jLabelMinimized.setForeground(Color.red);
    }//GEN-LAST:event_jLabelMinimizedMouseEntered

    private void jLabelMinimizedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizedMouseExited
        jLabelMinimized.setForeground(Color.white);
    }//GEN-LAST:event_jLabelMinimizedMouseExited

    private void jLabelFullSizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFullSizeMouseClicked
        if (this.getExtendedState() != anasayfaFrame.MAXIMIZED_BOTH) {

            this.setExtendedState(anasayfaFrame.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(anasayfaFrame.NORMAL);
        }
    }//GEN-LAST:event_jLabelFullSizeMouseClicked

    private void jLabelFullSizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFullSizeMouseEntered

        jLabelFullSize.setForeground(Color.red);
    }//GEN-LAST:event_jLabelFullSizeMouseEntered

    private void jLabelFullSizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFullSizeMouseExited
        jLabelFullSize.setForeground(Color.white);

    }//GEN-LAST:event_jLabelFullSizeMouseExited

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        jLabelClose.setForeground(Color.red);
        jLabelClose.setText(":(");
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        jLabelClose.setForeground(Color.white);
        jLabelClose.setText("X");
    }//GEN-LAST:event_jLabelCloseMouseExited

    public void bar (JLabel lab){
        jLabel8.setOpaque(false);
        jLabel20.setOpaque(false);      
       
        jLabel14.setOpaque(false);
      
        jLabel5.setOpaque(false);
        jLabel11.setOpaque(false);
        jLabel29.setOpaque(false);
        jLabel17.setOpaque(false);
      
        lab.setOpaque(true);
        solPanel.repaint();
    }
    
    public  static void  gizle(JPanel panel){
        
         esyaEkle.setVisible(false);
         ev.setVisible(false);
         evEkle.setVisible(false);
         esya.setVisible(false);
         bagis.setVisible(false);
         kullanici.setVisible(false);
        
         yardim.setVisible(false);
        
        panel.setVisible(true);
        
        ortaPanel.repaint();
    }
    
    private void evPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evPanelMouseClicked
       bar(jLabel5);
       gizle(ev); 
       jTextField1.setVisible(true);
        jLabel32.setVisible(true);
        jPanel1.setVisible(true);

      
       
    }//GEN-LAST:event_evPanelMouseClicked

    private void evPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evPanelMouseEntered
        evPanel.setBackground(Color.gray);
    }//GEN-LAST:event_evPanelMouseEntered

    private void evPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evPanelMouseExited
        evPanel.setBackground(Color.darkGray);
    }//GEN-LAST:event_evPanelMouseExited

    private void evEklePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evEklePanelMouseClicked
        bar(jLabel11);
        gizle(evEkle);
        jTextField1.setVisible(false);
        jLabel32.setVisible(false);
        jPanel1.setVisible(false);
        evEkle.repaint();
   
     
    }//GEN-LAST:event_evEklePanelMouseClicked

    private void evEklePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evEklePanelMouseEntered
       evEklePanel.setBackground(Color.gray);
    }//GEN-LAST:event_evEklePanelMouseEntered

    private void evEklePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evEklePanelMouseExited
       evEklePanel.setBackground(Color.darkGray);
    }//GEN-LAST:event_evEklePanelMouseExited

    private void esyaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esyaPanelMouseClicked
        bar(jLabel8);
        gizle(esya);
               jTextField1.setVisible(true);
        jLabel32.setVisible(true);
        jPanel1.setVisible(true);
            
      
    }//GEN-LAST:event_esyaPanelMouseClicked

    private void esyaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esyaPanelMouseEntered
      esyaPanel.setBackground(Color.gray);
    }//GEN-LAST:event_esyaPanelMouseEntered

    private void esyaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esyaPanelMouseExited
        esyaPanel.setBackground(Color.darkGray);
    }//GEN-LAST:event_esyaPanelMouseExited

    private void esyaEklePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esyaEklePanelMouseClicked
        bar(jLabel14);
        gizle(esyaEkle);
        jTextField1.setVisible(false);
        jLabel32.setVisible(false);
        jPanel1.setVisible(false);
      
  
        
    }//GEN-LAST:event_esyaEklePanelMouseClicked

    private void esyaEklePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esyaEklePanelMouseEntered
        esyaEklePanel.setBackground(Color.gray);
    }//GEN-LAST:event_esyaEklePanelMouseEntered

    private void esyaEklePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esyaEklePanelMouseExited
        esyaEklePanel.setBackground(Color.darkGray);
    }//GEN-LAST:event_esyaEklePanelMouseExited

    private void bagisYapPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagisYapPanelMouseClicked
        bar(jLabel17);
        gizle(bagis);
        jTextField1.setVisible(false);
        jLabel32.setVisible(false);
         jPanel1.setVisible(false);
        
       
    }//GEN-LAST:event_bagisYapPanelMouseClicked

    private void bagisYapPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagisYapPanelMouseEntered
        bagisYapPanel.setBackground(Color.gray);
    }//GEN-LAST:event_bagisYapPanelMouseEntered

    private void bagisYapPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagisYapPanelMouseExited
        bagisYapPanel.setBackground(Color.darkGray);
    }//GEN-LAST:event_bagisYapPanelMouseExited

    private void hesabimPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hesabimPanelMouseClicked
        bar(jLabel20);
        gizle(kullanici);
                jTextField1.setVisible(false);
        jLabel32.setVisible(false);
        jPanel1.setVisible(false);
     
      
    }//GEN-LAST:event_hesabimPanelMouseClicked

    private void hesabimPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hesabimPanelMouseEntered
        hesabimPanel.setBackground(Color.gray);
    }//GEN-LAST:event_hesabimPanelMouseEntered

    private void hesabimPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hesabimPanelMouseExited
        hesabimPanel.setBackground(Color.darkGray);
    }//GEN-LAST:event_hesabimPanelMouseExited

    private void yardimPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yardimPanelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_yardimPanelKeyPressed

    private void yardimPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yardimPanelMouseClicked
        bar(jLabel29);
        gizle(yardim);
       jTextField1.setVisible(false);
        jLabel32.setVisible(false);
        jPanel1.setVisible(false);
               
       
    }//GEN-LAST:event_yardimPanelMouseClicked

    private void yardimPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yardimPanelMouseEntered
        yardimPanel.setBackground(Color.gray);
    }//GEN-LAST:event_yardimPanelMouseEntered

    private void yardimPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yardimPanelMouseExited
        yardimPanel.setBackground(Color.darkGray);
    }//GEN-LAST:event_yardimPanelMouseExited

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
    jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_search_20px_1.png")));    
    
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
     jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_search_20px.png")));
    }//GEN-LAST:event_jLabel32MouseExited

    private void telefonNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonNoKeyTyped

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_telefonNoKeyTyped

    private void telefonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonNoActionPerformed

    private void isimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isimActionPerformed

    private void ilceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilceActionPerformed

    private void kullanimDurumuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanimDurumuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanimDurumuActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void u7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u7ActionPerformed

    private void u4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u4ActionPerformed

    private void u1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u1ActionPerformed

    private void d21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d21ActionPerformed

    private void d11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d11ActionPerformed

    private void d10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d10ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d1ActionPerformed

    private void fiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiyatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fiyatActionPerformed

    private void fiyatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fiyatKeyTyped
                if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }

    }//GEN-LAST:event_fiyatKeyTyped

    private void metrekareKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_metrekareKeyTyped
                if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_metrekareKeyTyped

    private void aidatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aidatKeyTyped
                if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_aidatKeyTyped

    private void d0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d0ActionPerformed
        if (d0.isSelected()) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(false);
            d5.setVisible(false);
            d6.setVisible(false);
            d7.setVisible(false);
            d8.setVisible(false);
            d9.setVisible(false);
            d10.setVisible(false);
            d11.setVisible(false);
            d12.setVisible(false);
            d13.setVisible(false);
            d14.setVisible(false);
            d15.setVisible(false);
            d16.setVisible(false);
            d17.setVisible(false);
            d18.setVisible(false);
            d19.setVisible(false);
            d20.setVisible(false);
            d21.setVisible(false);   
        } else {
            d1.setVisible(true);
            d2.setVisible(true);
            d3.setVisible(true);
            d4.setVisible(true);
            d5.setVisible(true);
            d6.setVisible(true);
            d7.setVisible(true);
            d8.setVisible(true);
            d9.setVisible(true);
            d10.setVisible(true);
            d11.setVisible(true);
            d12.setVisible(true);
            d13.setVisible(true);
            d14.setVisible(true);
            d15.setVisible(true);
            d16.setVisible(true);
            d17.setVisible(true);
            d18.setVisible(true);
            d19.setVisible(true);
            d20.setVisible(true);
            d21.setVisible(true);  
            
        }
    }//GEN-LAST:event_d0ActionPerformed

    private void u0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u0ActionPerformed
        if (u0.isSelected()) {
            u1.setVisible(false);
            u2.setVisible(false);
            u3.setVisible(false);
            u4.setVisible(false);
            u5.setVisible(false);
            u6.setVisible(false);
            u7.setVisible(false);
        }else {
            u1.setVisible(true);
            u2.setVisible(true);
            u3.setVisible(true);
            u4.setVisible(true);
            u5.setVisible(true);
            u6.setVisible(true);
            u7.setVisible(true);
            
        }
    }//GEN-LAST:event_u0ActionPerformed

    private void c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0ActionPerformed
        if (c0.isSelected()) {
            c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            c4.setVisible(false);
        }else{
            c1.setVisible(true);
            c2.setVisible(true);
            c3.setVisible(true);
            c4.setVisible(true); 
            
        }
        
    }//GEN-LAST:event_c0ActionPerformed

    private void i0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i0ActionPerformed
         if (i0.isSelected()) {
             
            i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);

        }else {
             i1.setVisible(true);
            i2.setVisible(true);
            i3.setVisible(true);
            i4.setVisible(true);
            i5.setVisible(true);
            i6.setVisible(true);
            i7.setVisible(true);
            i8.setVisible(true);
            i9.setVisible(true);
            i10.setVisible(true);
            i11.setVisible(true);
            i12.setVisible(true);
            i13.setVisible(true);
            i14.setVisible(true);
            i15.setVisible(true);
            i16.setVisible(true);
            i17.setVisible(true);
            i18.setVisible(true);
            i19.setVisible(true);
            i20.setVisible(true);
            i21.setVisible(true);
            i22.setVisible(true);
            i24.setVisible(true);
            i25.setVisible(true);
            i26.setVisible(true);
            i27.setVisible(true);
            i28.setVisible(true);
            i29.setVisible(true);
            i30.setVisible(true);
            i31.setVisible(true);
            i32.setVisible(true);
            i33.setVisible(true);
            i34.setVisible(true);
            i35.setVisible(true);
         }
    }//GEN-LAST:event_i0ActionPerformed

    
        public boolean ilanBak(String baslik) {
        PreparedStatement st;
        ResultSet rs;
        boolean ilan_exit = false;

        String guery = "SELECT * FROM `evekle` WHERE `baslik` = ?";

        try {
            st = mysqL.getConnection().prepareStatement(guery);
            st.setString(1, baslik);
            rs = st.executeQuery();

            if (rs.next()) {
                ilan_exit = true;
                JOptionPane.showMessageDialog(null, "Bu ilan önceden kayıtlı", "Farklı bir ilan ismi deneyin", 2);

            }

        } catch (SQLException ex) {
            Logger.getLogger(anasayfaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ilan_exit;
    }
        public boolean bosKontrol(){
                    String b1 = ilan.getText();
                    String b2 = aciklama.getText();
                    String b3 = fiyat.getText();
                    String b4 = metrekare.getText();
                    String b5 = odaSayisi.getSelectedItem().toString();
                    String b6 = bulunduguKat.getSelectedItem().toString();
                    String b7 = binaYasi.getSelectedItem().toString();
                    String b8 = katSayisi.getSelectedItem().toString();
                    String b9 = isitma.getSelectedItem().toString();
                    String b10 = balkon.getSelectedItem().toString();
                    String b11 = esyaDurumu.getSelectedItem().toString();
                    String b12 = kullanimDurumu.getSelectedItem().toString();
                    String b13 = aidat.getText();
                    String b14 = il.getSelectedItem().toString();
                    String b15 = ilce.getSelectedItem().toString();
                    String b16 = mahalle.getSelectedItem().toString();
                    String b17 = acikAdres.getText();
                    String b18 = isim.getText();
                    String b19 = telefonNo.getText();
                    String b20 = "";
                    
                    if (b1.trim().equals("") || b2.trim().equals("") || b3.trim().equals("") || b4.trim().equals("") || 
                        b5.trim().equals("Seçiniz") ||  b6.trim().equals("Seçiniz") || b7.trim().equals("Seçiniz") || b8.trim().equals("Seçiniz") 
                        || b9.trim().equals("Seçiniz") || b10.trim().equals("Seçiniz") || b11.trim().equals("Seçiniz") || b12.trim().equals("Seçiniz") || 
                            b13.trim().equals("Seçiniz") || b14.trim().equals("Seçiniz") || b15.trim().equals("Seçiniz") || b16.trim().equals("Seçiniz") || 
                            b17.trim().equals("") || b18.trim().equals("") || b19.trim().equals("")    ) {
                         JOptionPane.showMessageDialog(null, "Lütfen Bilgilerinizi Kontrol Edin!", "Boş Geçmeyiniz!", 2);
            return false;
                
            }else{
       
        return true;
        }
        }
        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                    String b1 = ilan.getText();
                    String b2 = aciklama.getText();
                    String b3 = fiyat.getText();
                    String b4 = metrekare.getText();
                    String b5 = odaSayisi.getSelectedItem().toString();
                    String b6 = bulunduguKat.getSelectedItem().toString();
                    String b7 = binaYasi.getSelectedItem().toString();
                    String b8 = katSayisi.getSelectedItem().toString();
                    String b9 = isitma.getSelectedItem().toString();
                    String b10 = balkon.getSelectedItem().toString();
                    String b11 = esyaDurumu.getSelectedItem().toString();
                    String b12 = kullanimDurumu.getSelectedItem().toString();
                    String b13 = aidat.getText();
                    String b14 = il.getSelectedItem().toString();
                    String b15 = ilce.getSelectedItem().toString();
                    String b16 = mahalle.getSelectedItem().toString();
                    String b17 = acikAdres.getText();
                    String b18 = isim.getText();
                    String b19 = telefonNo.getText();
                    String b20 = "";
                    
                    if (d0.isSelected()) {
                        b20 += "Seçim Yapılmadı" + " ";                        
                        }
                    if (d1.isSelected() && !d0.isSelected()) {
                        b20 += d1.getText() + " ";                        
                        }
                    if (d2.isSelected() && !d0.isSelected() ) {
                        b20 += d2.getText() + " ";                        
                        }
                    if (d3.isSelected() && !d0.isSelected()) {
                        b20 += d3.getText() + " ";                        
                        }
                    if (d4.isSelected() && !d0.isSelected()) {
                        b20 += d4.getText() + " ";                        
                        }
                    if (d5.isSelected() && !d0.isSelected()) {
                        b20 += d5.getText() + " ";                        
                        }
                    if (d6.isSelected() && !d0.isSelected()) {
                        b20 += d6.getText() + " ";                        
                        }
                    if (d7.isSelected() && !d0.isSelected()) {
                        b20 += d7.getText() + " ";                        
                        }
                    if (d8.isSelected() && !d0.isSelected()) {
                        b20 += d8.getText() + " ";                        
                        }  
                      if (d9.isSelected() && !d0.isSelected()) {
                        b20 += d9.getText() + " ";                        
                        }
                        if (d10.isSelected() && !d0.isSelected()) {
                        b20 += d10.getText() + " ";                        
                        }
                          if (d11.isSelected() && !d0.isSelected()) {
                        b20 += d11.getText() + " ";                        
                        }
                            if (d12.isSelected() && !d0.isSelected()) {
                        b20 += d12.getText() + " ";                        
                        }
                              if (d13.isSelected() && !d0.isSelected()) {
                        b20 += d13.getText() + " ";                        
                        }
                                if (d14.isSelected() && !d0.isSelected()) {
                        b20 += d14.getText() + " ";                        
                        }
                                  if (d15.isSelected() && !d0.isSelected()) {
                        b20 += d15.getText() + " ";                        
                        }
                                    if (d16.isSelected() && !d0.isSelected()) {
                        b20 += d16.getText() + " ";                        
                        }
                                      if (d17.isSelected() && !d0.isSelected()) {
                        b20 += d17.getText() + " ";                        
                        }
                                        if (d18.isSelected() && !d0.isSelected()) {
                        b20 += d18.getText() + " ";                        
                        }
                                          if (d19.isSelected() && !d0.isSelected()) {
                        b20 += d19.getText() + " ";                        
                        }
                                            if (d20.isSelected() && !d0.isSelected()) {
                        b20 += d20.getText() + " ";                        
                        }
                                            if (d21.isSelected() && !d0.isSelected()) {
                        b20 += d21.getText() + " ";                        
                        }  
                    String b21 = "";
                    if (u0.isSelected()) {
                        b21 += "Seçim Yapılmadı" + " ";
                    }
                    if (u1.isSelected()) {
                         b21 += u1.getText() + " ";
                    }
                    if (u2.isSelected() && !u0.isSelected()) {
                         b21 += u2.getText() + " ";
                    } 
                    if (u3.isSelected() && !u0.isSelected()) {
                         b21 += u3.getText() + " ";
                    }
                    if (u3.isSelected() && !u0.isSelected()) {
                         b21 += u3.getText() + " ";
                    }
                    if (u4.isSelected() && !u0.isSelected()) {
                         b21 += u4.getText() + " ";
                    }
                    if (u5.isSelected() && !u0.isSelected()) {
                         b21 += u5.getText() + " ";
                    }
                    if (u6.isSelected() && !u0.isSelected()) {
                         b21 += u6.getText() + " ";
                    }
                    if (u7.isSelected() && !u0.isSelected()) {
                         b21 += u7.getText() + " ";
                    }
                    
                    String b22 = "";
                     if (c0.isSelected()) {
                         b22 += "Seçim Yapılmadı" + " ";
                    }
                     
                     if (c1.isSelected() && !c0.isSelected()) {
                         b22 += c1.getText() + " ";
                    }
                     
                     if (c2.isSelected() && !c0.isSelected()) {
                         b22 += c2.getText() + " ";
                    }
                     
                     if (c3.isSelected() && !c0.isSelected()) {
                         b22 += c3.getText() + " ";
                    }
                     
                     if (c4.isSelected() && !c0.isSelected()) {
                         b22 += c4.getText() + " ";
                    }
                    
                     
                    String b23="";
                    
                    if (i0.isSelected()) {
                        b23 = "Seçim Yapılmadı" + " ";
                    }
                    if (i1.isSelected() && !i0.isSelected()) {
                        b23 = i1.getText() + " ";
                    }
                    if (i2.isSelected() && !i0.isSelected()) {
                        b23 = i2.getText() + " ";
                    }
                    if (i3.isSelected() && !i0.isSelected()) {
                        b23 = i3.getText() + " ";
                    }
                    if (i4.isSelected() && !i0.isSelected()) {
                        b23 = i4.getText() + " ";
                    }
                    if (i5.isSelected() && !i0.isSelected()) {
                        b23 = i5.getText() + " ";
                    }
                    if (i6.isSelected() && !i0.isSelected()) {
                        b23 = i6.getText() + " ";
                    }
                    if (i7.isSelected() && !i0.isSelected()) {
                        b23 = i7.getText() + " ";
                    }
                    if (i8.isSelected() && !i0.isSelected()) {
                        b23 = i8.getText() + " ";
                    }
                    if (i9.isSelected() && !i0.isSelected()) {
                        b23 = i9.getText() + " ";
                    }
                    if (i10.isSelected() && !i0.isSelected()) {
                        b23 = i10.getText() + " ";
                    }
                    if (i11.isSelected() && !i0.isSelected()) {
                        b23 = i11.getText() + " ";
                    }
                    if (i12.isSelected() && !i0.isSelected()) {
                        b23 = i12.getText() + " ";
                    }
                    if (i13.isSelected() && !i0.isSelected()) {
                        b23 = i13.getText() + " ";
                    }
                    if (i14.isSelected() && !i0.isSelected()) {
                        b23 = i14.getText() + " ";
                    }
                    if (i15.isSelected() && !i0.isSelected()) {
                        b23 = i15.getText() + " ";
                    }
                    if (i16.isSelected() && !i0.isSelected()) {
                        b23 = i16.getText() + " ";
                    }
                    if (i17.isSelected() && !i0.isSelected()) {
                        b23 = i17.getText() + " ";
                    }
                    if (i18.isSelected() && !i0.isSelected()) {
                        b23 = i18.getText() + " ";
                    }
                    if (i19.isSelected() && !i0.isSelected()) {
                        b23 = i19.getText() + " ";
                    }
                    if (i20.isSelected() && !i0.isSelected()) {
                        b23 = i20.getText() + " ";
                    }
                    if (i21.isSelected() && !i0.isSelected()) {
                        b23 = i21.getText() + " ";
                    }
                    if (i22.isSelected() && !i0.isSelected()) {
                        b23 = i22.getText() + " ";
                    }

                    if (i24.isSelected() && !i0.isSelected()) {
                        b23 = i24.getText() + " ";
                    }
                    if (i25.isSelected() && !i0.isSelected()) {
                        b23 = i25.getText() + " ";
                    }
                    if (i26.isSelected() && !i0.isSelected()) {
                        b23 = i26.getText() + " ";
                    }
                    if (i27.isSelected() && !i0.isSelected()) {
                        b23 = i27.getText() + " ";
                    }
                    if (i28.isSelected() && !i0.isSelected()) {
                        b23 = i28.getText() + " ";
                    }
                    if (i29.isSelected() && !i0.isSelected()) {
                        b23 = i29.getText() + " ";
                    }
                    if (i30.isSelected() && !i0.isSelected()) {
                        b23 = i30.getText() + " ";
                    }
                    if (i31.isSelected() && !i0.isSelected()) {
                        b23 = i31.getText() + " ";
                    }
                    if (i32.isSelected() && !i0.isSelected()) {
                        b23 = i32.getText() + " ";
                    }
                    if (i33.isSelected() && !i0.isSelected()) {
                        b23 = i33.getText() + " ";
                    }
                    if (i34.isSelected() && !i0.isSelected()) {
                        b23 = i34.getText() + " ";
                    }
                    if (i35.isSelected() && !i0.isSelected()) {
                        b23 = i35.getText() + " ";
                    }
                    

   
                    
                     


            
                    

            
                if (bosKontrol()) {
            
        
      
                    if (!ilanBak(b1)  ) {
                        
        
                    
                    PreparedStatement ps;
                    ResultSet re;
                    String evKayitQery = "INSERT INTO `evekle`(`baslik`, `aciklama`, `fiyat`, `metrekare`, `odaSayisi`, `bulunduguKat`, `binaYasi`, `katSayisi`,"
                            + " `isitma`, `balkon`, `esyaDurumu`, `kullanimDurumu`, "
                            + "`aidat`, `il`, `ilce`, `mahalle`, `acikadres`, `adi`, `ceptelefonu`, `disOzellikler`, "
                            + "`ulasim`, `cephe`, `icÖzellikler`, `evResim`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                    
                    try {
                        ps = mysqL.getConnection().prepareStatement(evKayitQery);
                        img = new FileInputStream(new File(s));
                        
                       
                        ps.setString(1, b1);
                        ps.setString(2, b2);
                        ps.setString(3, b3);
                        ps.setString(4, b4);
                        ps.setString(5, b5);
                        ps.setString(6, b6);
                        ps.setString(7, b7);
                        ps.setString(8, b8);
                        ps.setString(9, b9);
                        ps.setString(10, b10);
                        ps.setString(11, b11);
                        ps.setString(12, b12);
                        ps.setString(13, b13);
                        ps.setString(14, b14);
                        ps.setString(15, b15);
                        ps.setString(16, b16);
                        ps.setString(17, b17);
                        ps.setString(18, b18);
                        ps.setString(19, b19);
                        ps.setString(20, b20);
                        ps.setString(21, b21);
                        ps.setString(22, b22);
                        ps.setString(23, b23);
                        ps.setBinaryStream(24,(InputStream)img);
                        ps.executeUpdate();
 
                        try {
                            if (ps.executeUpdate() != 0) {
                               

                                JOptionPane.showMessageDialog(null, "İlanınız Oluşturldu.");
                                ps.executeUpdate();
                            } else {
                                JOptionPane.showMessageDialog(null, "Hata: Bilgilerinizi Kontrol Edin!");       
                            }

                        } catch (Exception ex) {
                            Logger.getLogger(anasayfaFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(anasayfaFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }   catch (FileNotFoundException ex) { 
                            Logger.getLogger(anasayfaFrame.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                }
                    }
                    
                    
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    private void odaSayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odaSayisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odaSayisiActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Resim", "jpg", "gif", "png");
        fc.addChoosableFileFilter(filter);
        int result = fc.showSaveDialog(null);
        
            File selectedFile = fc.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
             s = path;
            System.out.println(s );
            
                        Image img  = null ;
            try {
                img = ImageIO.read(selectedFile);
            } catch (IOException ex) {
                Logger.getLogger(anasayfaFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            fotografSec.setText(path);
           
            System.out.print(s);
            resimLabel.setIcon(new ImageIcon(img.getScaledInstance(resimLabel.getWidth(),
                    resimLabel.getHeight(), Image.SCALE_SMOOTH)));
        
       
  

    }//GEN-LAST:event_jButton1ActionPerformed

    private void fotografSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotografSecActionPerformed

    }//GEN-LAST:event_fotografSecActionPerformed
    public void tableHide(JTable a, int b){
   a.getColumnModel().getColumn(b).setMinWidth(0);
   a.getColumnModel().getColumn(b).setMaxWidth(0);
   a.getColumnModel().getColumn(b).setWidth(0);
        
        
    }
    
    
    private void ilanesyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilanesyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilanesyaActionPerformed

    private void kategoriEsyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriEsyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategoriEsyaActionPerformed

    private void ilceEsyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilceEsyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilceEsyaActionPerformed

    private void isimEsyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isimEsyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isimEsyaActionPerformed

    private void telefonNoEsyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonNoEsyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonNoEsyaActionPerformed

    private void telefonNoEsyaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonNoEsyaKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_telefonNoEsyaKeyTyped

    private void fotografSec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotografSec1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografSec1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Resim", "jpg", "gif", "png");
        fc.addChoosableFileFilter(filter);
        int result = fc.showSaveDialog(null);
        
            File selectedFile = fc.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
             sEsya = path;
           
            
                        Image img2  = null ;
            try {
                img2 = ImageIO.read(selectedFile);
            } catch (IOException ex) {
                Logger.getLogger(anasayfaFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            fotografSec1.setText(path);
           
  
            resimLabel1.setIcon(new ImageIcon(img2.getScaledInstance(resimLabel1.getWidth(),
                    resimLabel1.getHeight(), Image.SCALE_SMOOTH)));
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void durumEsyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durumEsyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durumEsyaActionPerformed

    private void garantiEsyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garantiEsyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_garantiEsyaActionPerformed

    private void takasEsyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takasEsyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_takasEsyaActionPerformed

    public boolean esyaBosKontrol(){
        String b1 = ilanesya.getText();
        String b2 = fiyatesya.getText();
        String b3 = aciklamaEsya.getText();
        String b4 = kategoriEsya.getSelectedItem().toString();
        String b5 = markaEsya.getText();
        String b6 = modelEsya.getText();
        String b7 = durumEsya.getSelectedItem().toString();
        String b8 = garantiEsya.getSelectedItem().toString();
        String b9 = takasEsya.getSelectedItem().toString();
        String b10 = ilEsya.getSelectedItem().toString();
        String b11 = ilceEsya.getSelectedItem().toString();
        String b12 = mahalleEsya.getSelectedItem().toString();
        String b13 = acikAdresEsya.getText();
        String b14 = teknikOzelliklerEsya.getText();
        String b15 = isimEsya.getText();
        String b16 = telefonNoEsya.getText();
        
                    if (b1.trim().equals("") || b2.trim().equals("") || b3.trim().equals("") || b4.trim().equals("Seçiniz") || 
                        b5.trim().equals("") ||  b6.trim().equals("Seçiniz") || b7.trim().equals("Seçiniz") || b8.trim().equals("Seçiniz") 
                        || b9.trim().equals("Seçiniz") || b10.trim().equals("Seçiniz") || b11.trim().equals("Seçiniz") || b12.trim().equals("Seçiniz") || 
                            b13.trim().equals("") || b14.trim().equals("") || b15.trim().equals("") || b16.trim().equals("")   ) {
                         JOptionPane.showMessageDialog(null, "Lütfen Bilgilerinizi Kontrol Edin!", "Boş Geçmeyiniz!", 2);
            return false;
                
            }else{
       
                    
        return true;
        }

    }
    
            public boolean ilanEvBak(String ilanEsya) {
        PreparedStatement st;
        ResultSet rs;
        boolean ilan_exit = false;

        String guery = "SELECT * FROM `esyaekle` WHERE `ilanEsya` = ?";

        try {
            st = mysqL.getConnection().prepareStatement(guery);
            st.setString(1, ilanEsya);
            rs = st.executeQuery();

            if (rs.next()) {
                ilan_exit = true;
                JOptionPane.showMessageDialog(null, "Bu ilan önceden kayıtlı", "Farklı bir ilan ismi deneyin", 2);

            }

        } catch (SQLException ex) {
            Logger.getLogger(anasayfaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ilan_exit;
    }
    
    
    
    
    
    
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        String b1 = ilanesya.getText();
        String b2 = fiyatesya.getText();
        String b3 = aciklamaEsya.getText();
        String b4 = kategoriEsya.getSelectedItem().toString();
        String b5 = markaEsya.getText();
        String b6 = modelEsya.getText();
        String b7 = durumEsya.getSelectedItem().toString();
        String b8 = garantiEsya.getSelectedItem().toString();
        String b9 = takasEsya.getSelectedItem().toString();
        String b10 = ilEsya.getSelectedItem().toString();
        String b11 = ilceEsya.getSelectedItem().toString();
        String b12 = mahalleEsya.getSelectedItem().toString();
        String b13 = acikAdresEsya.getText();
        String b14 = teknikOzelliklerEsya.getText();
        String b15 = isimEsya.getText();
        String b16 = telefonNoEsya.getText();
        
        
        if (esyaBosKontrol()) {
            if (!ilanEvBak(b1)) {
                
            
                    PreparedStatement ps;
                    ResultSet re;
                    String esyaKayitQery = "INSERT INTO `esyaekle`(`ilanEsya`, `fiyatEsya`, `aciklamaEsya`, `kategoriEsya`, "
                            + "`markaEsya`, `modelEsya`, `durumEsya`, `garantiEsya`, `takasEsya`, `ilEsya`, `ilceEsya`, "
                            + "`mahalleEsya`, `acikAdresEsya`, `teknikOzelliklerEsya`, `isimEsya`, `telefonNoEsya`, `resim`)"
                            + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";     
                    
                    
                                        try {
                        ps = mysqL.getConnection().prepareStatement(esyaKayitQery);
                        img2 = new FileInputStream(new File(sEsya));
                        
                       
                        ps.setString(1, b1);
                        ps.setString(2, b2);
                        ps.setString(3, b3);
                        ps.setString(4, b4);
                        ps.setString(5, b5);
                        ps.setString(6, b6);
                        ps.setString(7, b7);
                        ps.setString(8, b8);
                        ps.setString(9, b9);
                        ps.setString(10, b10);
                        ps.setString(11, b11);
                        ps.setString(12, b12);
                        ps.setString(13, b13);
                        ps.setString(14, b14);
                        ps.setString(15, b15);
                        ps.setString(16, b16);
                        ps.setBinaryStream(17,(InputStream)img2);
                         ps.executeUpdate();
 
                        try {
                            if (ps.executeUpdate() != 0) {
                               

                                JOptionPane.showMessageDialog(null, "İlanınız Oluşturldu.");
                                ps.executeUpdate();
                            } else {
                                JOptionPane.showMessageDialog(null, "Hata: Bilgilerinizi Kontrol Edin!");       
                            }

                        } catch (Exception ex) {
                            Logger.getLogger(anasayfaFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(anasayfaFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }   catch (FileNotFoundException ex) { 
                            Logger.getLogger(anasayfaFrame.class.getName()).log(Level.SEVERE, null, ex);
                        } 
            }
        }

       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void fiyatesyaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fiyatesyaKeyTyped
                       if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_fiyatesyaKeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
         esyaDetay esyadty = new esyaDetay();
        int i = jTable2.getSelectedRow();
        ImageIcon image1 =  (ImageIcon)jTable2.getValueAt(i, 3);
        Image image2 = image1.getImage().getScaledInstance(385, 420, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        esyadty.resimEsya.setIcon(image3);

        String b1 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 0);
        esyadty.baslikEsya.setText(b1);

        String b2 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 1 );
        esyadty.fiyatEsya.setText(b2);

        String b3 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 2);
        esyadty.kategori.setText(b3);

        String b4 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 4);
        esyadty.markaEsya.setText(b4);

        String b5 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 5);
        esyadty.modelEsya.setText(b5);

        String b6 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 8);
        esyadty.garantiEsya.setText(b6);

        String b7 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 9);
        esyadty.takasEsya.setText(b7);

        String b8 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 15);
        esyadty.ilanshbEsya.setText(b8);

        String b9 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 16);
        esyadty.telefonEsya.setText(b9);

        String b10 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 10);
        esyadty.ilEsya.setText(b10);

        String b11 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 11);
        esyadty.ilceEsya.setText(b11);

        String b12 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 12);
        esyadty.mahalleEsya.setText(b12);

        String b13 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 13);
        esyadty.acikAdresEsya.setText(b13);

        String b14 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 14);
        esyadty.teknik2.setText(b14);

        String b15 = (String)jTable2.getValueAt(jTable2.getSelectedRow(), 7);
        esyadty.aciklama.setText(b15);

        esyadty.setVisible(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void ilan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilan1ActionPerformed

    private void ilan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilan2ActionPerformed

    private void ilan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilan4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilan4ActionPerformed

    private void ilan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilan3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilan3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if (ilan1.getText().trim().equals("") || ilan2.getText().trim().equals("") || ilan3.getText().trim().equals("") || ilan4.getSelectedItem().toString().equals("Seçiniz")) {
           JOptionPane.showMessageDialog(null, "Hata: Bilgileri Eksiksiz Doldurun");
        }
        else{
            JOptionPane.showMessageDialog(null, "Kaydınız Oluşturldu. En yakın zamanda sizinle iletişime geçeceğiz.");
        }
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void kadiHesapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kadiHesapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kadiHesapActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       sifreDegistirAna sifre = new sifreDegistirAna();
       sifre.setVisible(true);
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        String c =String.valueOf(sifreHesap.getPassword());
        
        System.out.println(c);
        jLabel81.setText(c);
        
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        String search = jTextField1.getText().toUpperCase();
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
        evDetay evdty = new evDetay();
        int i = jTable1.getSelectedRow();
        ImageIcon image1 =  (ImageIcon)jTable1.getValueAt(i, 3);
        Image image2 = image1.getImage().getScaledInstance(385, 420, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        
        String bslk = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        evDetay.baslik.setText(bslk);
        
        String ai = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 4);
        evDetay.aidat.setText(ai);
        
        String ft = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 1);
        evDetay.fiyat.setText(ft);
        
        String bn= (String)jTable1.getValueAt(jTable1.getSelectedRow(), 6 );
        evDetay.balkon.setText(bn);
        
        String m2=(String)jTable1.getValueAt(jTable1.getSelectedRow(), 20);
        evDetay.metrekare.setText(m2);
        
        String by = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 7);
        evDetay.binaYasi.setText(by);
        
        String os = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 21);
        evDetay.odaSayisi.setText(os);
        
        String cephe = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 9);
        evDetay.cephe.setText(cephe);
        
        String ilans=(String)jTable1.getValueAt(jTable1.getSelectedRow(), 2);
        evDetay.ilanSahibi.setText(ilans);
        
        String tlfn =  (String)jTable1.getValueAt(jTable1.getSelectedRow(), 10);
        evDetay.telefon.setText(tlfn);
        
        String il= (String)jTable1.getValueAt(jTable1.getSelectedRow(), 14);
        evDetay.il.setText(il);
        
        
        String ilce =  (String)jTable1.getValueAt(jTable1.getSelectedRow(), 15);
        evDetay.ilce.setText(ilce);
        
        String mhle = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 19);
        evDetay.mahalle.setText(mhle);
        
        String adrs = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 5);
        evDetay.mahalle.setText(adrs);
        
        String icO = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 13);
        evDetay.icOzellikler.setText(icO);
        
        String disO = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 11);
        evDetay.disOzellikler.setText(disO);
        
        String ulasim = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 22);
        evDetay.ulasim.setText(ulasim);
        
        String kulnmdurumu = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 18);
        evDetay.kullanimDurumu.setText(kulnmdurumu);

        
        evdty.jLabel1.setIcon(image3);
        evdty.setVisible(true);

 
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(anasayfaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anasayfaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anasayfaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anasayfaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                new anasayfaFrame().setVisible(true);
                
                gizle(ev);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea acikAdres;
    private javax.swing.JTextArea acikAdresEsya;
    private javax.swing.JTextArea aciklama;
    private javax.swing.JTextArea aciklamaEsya;
    private javax.swing.JTextField aidat;
    public static javax.swing.JPanel bagis;
    private javax.swing.JPanel bagisYapPanel;
    private javax.swing.JComboBox<String> balkon;
    private javax.swing.JComboBox<String> binaYasi;
    private javax.swing.JComboBox<String> bulunduguKat;
    private javax.swing.JCheckBox c0;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox d0;
    private javax.swing.JCheckBox d1;
    private javax.swing.JCheckBox d10;
    private javax.swing.JCheckBox d11;
    private javax.swing.JCheckBox d12;
    private javax.swing.JCheckBox d13;
    private javax.swing.JCheckBox d14;
    private javax.swing.JCheckBox d15;
    private javax.swing.JCheckBox d16;
    private javax.swing.JCheckBox d17;
    private javax.swing.JCheckBox d18;
    private javax.swing.JCheckBox d19;
    private javax.swing.JCheckBox d2;
    private javax.swing.JCheckBox d20;
    private javax.swing.JCheckBox d21;
    private javax.swing.JCheckBox d3;
    private javax.swing.JCheckBox d4;
    private javax.swing.JCheckBox d5;
    private javax.swing.JCheckBox d6;
    private javax.swing.JCheckBox d7;
    private javax.swing.JCheckBox d8;
    private javax.swing.JCheckBox d9;
    private javax.swing.JComboBox<String> durumEsya;
    private javax.persistence.EntityManager entityManager;
    public static javax.swing.JPanel esya;
    private javax.swing.JComboBox<String> esyaDurumu;
    public static javax.swing.JPanel esyaEkle;
    private javax.swing.JPanel esyaEklePanel;
    private javax.swing.JPanel esyaPanel;
    private java.util.List<eee_Main.Esyaekle> esyaekleList;
    private java.util.List<eee_Main.Esyaekle> esyaekleList1;
    private java.util.List<eee_Main.Esyaekle> esyaekleList2;
    private java.util.List<eee_Main.Esyaekle> esyaekleList3;
    private java.util.List<eee_Main.Esyaekle> esyaekleList4;
    private javax.persistence.Query esyaekleQuery;
    private javax.persistence.Query esyaekleQuery1;
    private javax.persistence.Query esyaekleQuery2;
    private javax.persistence.Query esyaekleQuery3;
    private javax.persistence.Query esyaekleQuery4;
    public static javax.swing.JPanel ev;
    public static javax.swing.JPanel evEkle;
    private javax.swing.JPanel evEklePanel;
    private javax.swing.JPanel evPanel;
    private java.util.List<eee_Main.Evekle> evekleList;
    private javax.persistence.Query evekleQuery;
    private javax.swing.JTextField fiyat;
    private javax.swing.JTextField fiyatesya;
    private javax.swing.JTextField fotografSec;
    private javax.swing.JTextField fotografSec1;
    private javax.swing.JComboBox<String> garantiEsya;
    private javax.swing.JPanel hesabimPanel;
    private javax.swing.JCheckBox i0;
    private javax.swing.JCheckBox i1;
    private javax.swing.JCheckBox i10;
    private javax.swing.JCheckBox i11;
    private javax.swing.JCheckBox i12;
    private javax.swing.JCheckBox i13;
    private javax.swing.JCheckBox i14;
    private javax.swing.JCheckBox i15;
    private javax.swing.JCheckBox i16;
    private javax.swing.JCheckBox i17;
    private javax.swing.JCheckBox i18;
    private javax.swing.JCheckBox i19;
    private javax.swing.JCheckBox i2;
    private javax.swing.JCheckBox i20;
    private javax.swing.JCheckBox i21;
    private javax.swing.JCheckBox i22;
    private javax.swing.JCheckBox i24;
    private javax.swing.JCheckBox i25;
    private javax.swing.JCheckBox i26;
    private javax.swing.JCheckBox i27;
    private javax.swing.JCheckBox i28;
    private javax.swing.JCheckBox i29;
    private javax.swing.JCheckBox i3;
    private javax.swing.JCheckBox i30;
    private javax.swing.JCheckBox i31;
    private javax.swing.JCheckBox i32;
    private javax.swing.JCheckBox i33;
    private javax.swing.JCheckBox i34;
    private javax.swing.JCheckBox i35;
    private javax.swing.JCheckBox i4;
    private javax.swing.JCheckBox i5;
    private javax.swing.JCheckBox i6;
    private javax.swing.JCheckBox i7;
    private javax.swing.JCheckBox i8;
    private javax.swing.JCheckBox i9;
    private javax.swing.JComboBox<String> il;
    private javax.swing.JComboBox<String> ilEsya;
    private javax.swing.JTextField ilan;
    private javax.swing.JTextField ilan1;
    private javax.swing.JTextField ilan2;
    private javax.swing.JTextField ilan3;
    private javax.swing.JComboBox<String> ilan4;
    private javax.swing.JTextField ilanesya;
    private javax.swing.JComboBox<String> ilce;
    private javax.swing.JComboBox<String> ilceEsya;
    private javax.swing.JTextField isim;
    private javax.swing.JTextField isimEsya;
    private javax.swing.JComboBox<String> isitma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelFullSize;
    private javax.swing.JLabel jLabelMinimized;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField kadiHesap;
    private javax.swing.JComboBox<String> katSayisi;
    private javax.swing.JComboBox<String> kategoriEsya;
    public static javax.swing.JPanel kullanici;
    private javax.swing.JComboBox<String> kullanimDurumu;
    private javax.swing.JComboBox<String> mahalle;
    private javax.swing.JComboBox<String> mahalleEsya;
    private javax.swing.JTextField markaEsya;
    private javax.swing.JTextField metrekare;
    private javax.swing.JTextField modelEsya;
    private javax.swing.JComboBox<String> odaSayisi;
    public static javax.swing.JPanel ortaPanel;
    private javax.swing.JLabel resimLabel;
    private javax.swing.JLabel resimLabel1;
    public static javax.swing.JPasswordField sifreHesap;
    private javax.swing.JPanel solPanel;
    private javax.swing.JComboBox<String> takasEsya;
    private javax.swing.JTextArea teknikOzelliklerEsya;
    private javax.swing.JTextField telefonNo;
    private javax.swing.JTextField telefonNoEsya;
    private javax.swing.JCheckBox u0;
    private javax.swing.JCheckBox u1;
    private javax.swing.JCheckBox u2;
    private javax.swing.JCheckBox u3;
    private javax.swing.JCheckBox u4;
    private javax.swing.JCheckBox u5;
    private javax.swing.JCheckBox u6;
    private javax.swing.JCheckBox u7;
    private javax.swing.JPanel ustPanel;
    public static javax.swing.JPanel yardim;
    private javax.swing.JPanel yardimPanel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
     InputStream img;
     InputStream img2;
    private String s = null;
    private String sEsya = null;

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resimler/1111.png")));
    }
 
    
    
}

