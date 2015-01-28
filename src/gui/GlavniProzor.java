/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import actions.ActionManager;
import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author tadija
 */
public class GlavniProzor extends javax.swing.JFrame {

    public static GlavniProzor instance = null;
    private final static String newline = "\n";
    private ArrayList<Knjiga> knjigeData = new ArrayList<Knjiga>();
    private DefaultListModel modelKnjiga = new DefaultListModel();
    public int brojKnjiga = 0;
    public static final String FILE_NAME = "knjige.dat";

    /**
     * Creates new form CoreWindow
     */
    public GlavniProzor() {
        initComponents();

        setResizable(false);
        setTitle("Biblioteka");
        setLocationRelativeTo(null);
        //ucitavanje filmova
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(GlavniProzor.FILE_NAME));

            knjigeData = (ArrayList<Knjiga>) in.readObject();
            if (knjigeData == null) {
                knjigeData = new ArrayList<Knjiga>();
            }

            in.close();

        } catch (FileNotFoundException e1) {
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        listaKnjiga.setModel(modelKnjiga);

    }

    public static GlavniProzor getInstance() {
        if (instance == null) {
            instance = new GlavniProzor();
        }
        return instance;
    }

    public boolean dodajKnjigu(Knjiga knjiga) {
        knjigeData.add(knjiga);
        return true;
    }

    public ArrayList<Knjiga> getKnjige() {
        return knjigeData;
    }

    //gui - automatski generisan jer sam koristio NetBeans GUI bilder
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        viewBooksPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        izbrisiBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaKnjiga = new javax.swing.JList();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addBooksPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nazivFld = new javax.swing.JTextField();
        autorFld = new javax.swing.JTextField();
        izdKucaFld = new javax.swing.JTextField();
        godFld = new javax.swing.JTextField();
        addBookBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        zanrBox = new javax.swing.JComboBox();
        jMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitMenu = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        aboutMe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Informacije o knjizi");

        izbrisiBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        izbrisiBtn.setText("Izbrisi knjigu");
        izbrisiBtn.setMaximumSize(new java.awt.Dimension(74, 27));
        izbrisiBtn.setMinimumSize(new java.awt.Dimension(74, 27));
        izbrisiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izbrisiBtnActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaKnjiga);

        jLabel15.setText("Naslov");

        jLabel16.setText("Autor");

        jLabel3.setText("Izdavac");

        jLabel4.setText("Godina");

        jLabel5.setText("Zanr");

        javax.swing.GroupLayout viewBooksPanelLayout = new javax.swing.GroupLayout(viewBooksPanel);
        viewBooksPanel.setLayout(viewBooksPanelLayout);
        viewBooksPanelLayout.setHorizontalGroup(
            viewBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewBooksPanelLayout.createSequentialGroup()
                .addGroup(viewBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(viewBooksPanelLayout.createSequentialGroup()
                        .addGroup(viewBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewBooksPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(viewBooksPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel16)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                        .addComponent(izbrisiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        viewBooksPanelLayout.setVerticalGroup(
            viewBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewBooksPanelLayout.createSequentialGroup()
                .addGroup(viewBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewBooksPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewBooksPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(izbrisiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(viewBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pregled knjiga", viewBooksPanel);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Naziv knjige:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Ime autora:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Zanr:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Izdavacka kuca:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Godina izdavanja:");

        nazivFld.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        autorFld.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        izdKucaFld.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        godFld.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        addBookBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addBookBtn.setText("Dodaj knjigu");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Popunite podatke o knjizi - sva polja su obavezna");

        zanrBox.setModel(new DefaultComboBoxModel(Zanr.values()));

        javax.swing.GroupLayout addBooksPanelLayout = new javax.swing.GroupLayout(addBooksPanel);
        addBooksPanel.setLayout(addBooksPanelLayout);
        addBooksPanelLayout.setHorizontalGroup(
            addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBooksPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(addBooksPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(313, 313, 313))
                    .addGroup(addBooksPanelLayout.createSequentialGroup()
                        .addGroup(addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(62, 62, 62)
                        .addGroup(addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(zanrBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(autorFld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nazivFld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(izdKucaFld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(godFld, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(99, 99, 99)
                        .addComponent(addBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 92, Short.MAX_VALUE))
        );
        addBooksPanelLayout.setVerticalGroup(
            addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBooksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addGroup(addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addBooksPanelLayout.createSequentialGroup()
                        .addGroup(addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addBooksPanelLayout.createSequentialGroup()
                                .addGroup(addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nazivFld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(61, 61, 61))
                            .addGroup(addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(autorFld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel11))
                    .addComponent(izdKucaFld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addBooksPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(godFld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(addBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBooksPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(214, 214, 214))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBooksPanelLayout.createSequentialGroup()
                                .addComponent(zanrBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(205, 205, 205))))
                    .addGroup(addBooksPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))))
        );

        jTabbedPane1.addTab("Dodaj knjigu", addBooksPanel);

        fileMenu.setText("File");

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenu.setText("Sacuvaj sve");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenu);
        fileMenu.add(jSeparator1);
        fileMenu.add(jSeparator2);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitMenu.setText("Izadji");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenu);

        jMenuBar.add(fileMenu);

        aboutMenu.setText("O meni");

        aboutMe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aboutMe.setText("Informacije");
        aboutMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMeActionPerformed(evt);
            }
        });
        aboutMenu.add(aboutMe);

        jMenuBar.add(aboutMenu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMeActionPerformed
        JOptionPane.showMessageDialog(null, "Tadija Lazarevic s16/08");
    }//GEN-LAST:event_aboutMeActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitMenuActionPerformed

    //Vrsi validaciju i dodaje novu knjigu u knjigeData
    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        boolean uspesno = true;
        String imeKnjige = nazivFld.getText();
        String imeAutora = autorFld.getText();
        String imeIzdavaca = izdKucaFld.getText();
        int god = 0;

        try {
            if (imeKnjige.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Ime knjige mora biti popunjeno", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (imeAutora.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Ime autora mora biti popunjeno", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (imeIzdavaca.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Ime izdavacke kuce mora biti popunjeno", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                god = Integer.parseInt(godFld.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Godina mora biti validna (0-2015)", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            }

        } catch (NullPointerException e) {
        }

        if (uspesno) {
            Knjiga knjiga = new Knjiga(imeKnjige, imeAutora, imeIzdavaca, god, (Zanr) zanrBox.getSelectedItem());
            boolean rez = dodajKnjigu(knjiga);
            if (rez) {
                JOptionPane.showMessageDialog(null, "Uspesno dodavanje knjige");
                nazivFld.setText("");
                autorFld.setText("");
                izdKucaFld.setText("");
                godFld.setText("");
                brojKnjiga++;
                modelKnjiga.addElement(imeKnjige + "   -   " + imeAutora + "     -   " + imeIzdavaca + "    -    " + god + "    -    " + zanrBox.getSelectedItem());
            } else {
                JOptionPane.showMessageDialog(null, "Neuspesno dodavanje!");
            }

        }

    }//GEN-LAST:event_addBookBtnActionPerformed

    private void izbrisiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izbrisiBtnActionPerformed
        int index = listaKnjiga.getSelectedIndex();

        try {
            if (index < 0) {
                JOptionPane.showMessageDialog(null, "Izaberite film koji zelite da izbrisete");
            } else {
                modelKnjiga.remove(index);
                JOptionPane.showMessageDialog(null, "Knjiga uspesno izbrisana");
            }

        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }//GEN-LAST:event_izbrisiBtnActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(GlavniProzor.FILE_NAME));
            out.writeObject(GlavniProzor.getInstance().getKnjige());
            out.close();
            JOptionPane.showMessageDialog(null, "Podaci su uspesno sacuvani");

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_saveMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMe;
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JButton addBookBtn;
    private javax.swing.JPanel addBooksPanel;
    private javax.swing.JTextField autorFld;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JTextField godFld;
    private javax.swing.JButton izbrisiBtn;
    private javax.swing.JTextField izdKucaFld;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList listaKnjiga;
    private javax.swing.JTextField nazivFld;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JPanel viewBooksPanel;
    private javax.swing.JComboBox zanrBox;
    // End of variables declaration//GEN-END:variables
}
