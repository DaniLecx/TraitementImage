/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitementimage;

import filtres.*;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.UIManager;


/**
 *
 * @author danilecx
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    private boolean paletteEnabled, roiEnabled;
    private int minValue, maxValue, values[];
    private Point mousePressed, mouseReleased;
    
    public mainFrame() {
        initComponents();
        getContentPane().setBackground(new Color(34,40,49));
        paletteEnabled = roiEnabled = false;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imgSrc = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        imgFin = new javax.swing.JLabel();
        depLabel = new javax.swing.JLabel();
        finLabel = new javax.swing.JLabel();
        leftArrowLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        loadImage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        srcColorPalette = new javax.swing.JLabel();
        endColorPalette = new javax.swing.JLabel();
        sizeXField = new javax.swing.JTextField();
        sizeYField = new javax.swing.JTextField();
        grayScaleLabel = new javax.swing.JLabel();
        paletteLabel1 = new javax.swing.JLabel();
        histogramLabel = new javax.swing.JLabel();
        histogram = new javax.swing.JLabel();
        roiLabel1 = new javax.swing.JLabel();
        highValueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        paletteLabel3 = new javax.swing.JLabel();
        paletteLabel4 = new javax.swing.JLabel();
        paletteLabel5 = new javax.swing.JLabel();
        expansionXField = new javax.swing.JTextField();
        expansionYField = new javax.swing.JTextField();
        seuilSimple = new javax.swing.JTextField();
        multiSeuil1 = new javax.swing.JTextField();
        multiSeuil2 = new javax.swing.JTextField();
        egalisationLabel = new javax.swing.JLabel();
        paletteLabel6 = new javax.swing.JLabel();
        filtreComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(34, 40, 49));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(34, 40, 49));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(520, 520));

        imgSrc.setBackground(new java.awt.Color(57, 62, 70));
        imgSrc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSrc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 62, 70)));
        imgSrc.setOpaque(true);
        imgSrc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgSrcMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgSrcMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imgSrcMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(imgSrc);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(520, 520));

        imgFin.setBackground(new java.awt.Color(57, 62, 70));
        imgFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 62, 70)));
        imgFin.setOpaque(true);
        jScrollPane2.setViewportView(imgFin);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        depLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        depLabel.setForeground(new java.awt.Color(238, 238, 238));
        depLabel.setText("Image de départ");
        jPanel2.add(depLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        finLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        finLabel.setForeground(new java.awt.Color(238, 238, 238));
        finLabel.setText("Image de fin");
        jPanel2.add(finLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        leftArrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traitementimage/images/left-arrow.png"))); // NOI18N
        leftArrowLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftArrowLabelMouseClicked(evt);
            }
        });
        jPanel2.add(leftArrowLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 250, -1, -1));

        jPanel3.setBackground(new java.awt.Color(57, 62, 70));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traitementimage/images/loadImage.png"))); // NOI18N
        loadImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadImageMouseClicked(evt);
            }
        });
        jPanel3.add(loadImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(238, 238, 238));
        jSeparator1.setForeground(new java.awt.Color(238, 238, 238));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 20, 190));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Taille");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        srcColorPalette.setBackground(new java.awt.Color(255, 255, 255));
        srcColorPalette.setOpaque(true);
        jPanel3.add(srcColorPalette, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 40, 20));

        endColorPalette.setBackground(new java.awt.Color(255, 0, 0));
        endColorPalette.setOpaque(true);
        endColorPalette.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                endColorPaletteMouseClicked(evt);
            }
        });
        jPanel3.add(endColorPalette, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 40, 20));

        sizeXField.setForeground(new java.awt.Color(238, 238, 238));
        sizeXField.setText("x");
        sizeXField.setCaretColor(new java.awt.Color(238, 238, 238));
        sizeXField.setOpaque(false);
        sizeXField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeXFieldActionPerformed(evt);
            }
        });
        jPanel3.add(sizeXField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 40, -1));

        sizeYField.setForeground(new java.awt.Color(238, 238, 238));
        sizeYField.setText("y");
        sizeYField.setCaretColor(new java.awt.Color(238, 238, 238));
        sizeYField.setOpaque(false);
        sizeYField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeYFieldActionPerformed(evt);
            }
        });
        jPanel3.add(sizeYField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 40, -1));

        grayScaleLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        grayScaleLabel.setForeground(new java.awt.Color(238, 238, 238));
        grayScaleLabel.setText("Grayscale");
        grayScaleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grayScaleLabelMouseClicked(evt);
            }
        });
        jPanel3.add(grayScaleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        paletteLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        paletteLabel1.setForeground(new java.awt.Color(238, 238, 238));
        paletteLabel1.setText("Palette");
        paletteLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paletteLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(paletteLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        histogramLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        histogramLabel.setForeground(new java.awt.Color(238, 238, 238));
        histogramLabel.setText("Histogramme");
        histogramLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                histogramLabelMouseClicked(evt);
            }
        });
        jPanel3.add(histogramLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        histogram.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 40, 49)));
        jPanel3.add(histogram, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 260, 100));

        roiLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        roiLabel1.setForeground(new java.awt.Color(238, 238, 238));
        roiLabel1.setText("ROI");
        roiLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roiLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(roiLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        highValueLabel.setForeground(new java.awt.Color(238, 238, 238));
        highValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(highValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 50, 20));

        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pixels");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("255");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nuance de gris");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        paletteLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        paletteLabel3.setForeground(new java.awt.Color(238, 238, 238));
        paletteLabel3.setText("Filtres");
        jPanel3.add(paletteLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 110, -1, -1));

        paletteLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        paletteLabel4.setForeground(new java.awt.Color(238, 238, 238));
        paletteLabel4.setText("Zoom");
        jPanel3.add(paletteLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        paletteLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        paletteLabel5.setForeground(new java.awt.Color(238, 238, 238));
        paletteLabel5.setText("Seuillage simple");
        jPanel3.add(paletteLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        expansionXField.setForeground(new java.awt.Color(238, 238, 238));
        expansionXField.setCaretColor(new java.awt.Color(238, 238, 238));
        expansionXField.setOpaque(false);
        expansionXField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expansionXFieldActionPerformed(evt);
            }
        });
        jPanel3.add(expansionXField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 40, -1));

        expansionYField.setForeground(new java.awt.Color(238, 238, 238));
        expansionYField.setCaretColor(new java.awt.Color(238, 238, 238));
        expansionYField.setOpaque(false);
        expansionYField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expansionYFieldActionPerformed(evt);
            }
        });
        jPanel3.add(expansionYField, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 40, -1));

        seuilSimple.setForeground(new java.awt.Color(238, 238, 238));
        seuilSimple.setCaretColor(new java.awt.Color(238, 238, 238));
        seuilSimple.setOpaque(false);
        seuilSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seuilSimpleActionPerformed(evt);
            }
        });
        jPanel3.add(seuilSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 40, -1));

        multiSeuil1.setForeground(new java.awt.Color(238, 238, 238));
        multiSeuil1.setCaretColor(new java.awt.Color(238, 238, 238));
        multiSeuil1.setOpaque(false);
        multiSeuil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiSeuil1ActionPerformed(evt);
            }
        });
        jPanel3.add(multiSeuil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 40, -1));

        multiSeuil2.setForeground(new java.awt.Color(238, 238, 238));
        multiSeuil2.setCaretColor(new java.awt.Color(238, 238, 238));
        multiSeuil2.setOpaque(false);
        multiSeuil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiSeuil2ActionPerformed(evt);
            }
        });
        jPanel3.add(multiSeuil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, 40, -1));

        egalisationLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        egalisationLabel.setForeground(new java.awt.Color(238, 238, 238));
        egalisationLabel.setText("Egalisation");
        egalisationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                egalisationLabelMouseClicked(evt);
            }
        });
        jPanel3.add(egalisationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, -1));

        paletteLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        paletteLabel6.setForeground(new java.awt.Color(238, 238, 238));
        paletteLabel6.setText("Multi-seuillage");
        jPanel3.add(paletteLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, -1));

        filtreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médian", "Moyen", "Gaussien", "Laplacien", "Kirsch", "Sobel", "Prewitt", "Roberts" }));
        filtreComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtreComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(filtreComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 90, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 1080, 214));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadImageMouseClicked
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String sname = file.getAbsolutePath();
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(sname));
            } catch (IOException e) {
                e.printStackTrace();
            }
            sizeXField.setText(String.valueOf(img.getWidth()));
            sizeYField.setText(String.valueOf(img.getHeight()));
            imgSrc.setIcon(new ImageIcon(img));
            imgFin.setIcon(new ImageIcon(img));
            updateHistogram();
        }  
    }//GEN-LAST:event_loadImageMouseClicked

    private void expansionYFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expansionYFieldActionPerformed
        bilinearInterpolation();
    }//GEN-LAST:event_expansionYFieldActionPerformed

    private void sizeYFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeYFieldActionPerformed
        updateImageSize();
    }//GEN-LAST:event_sizeYFieldActionPerformed

    private void imgSrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSrcMouseClicked
        if(paletteEnabled)
        {
            Point loc = evt.getLocationOnScreen();
            
            Robot robot;
            Color color = Color.WHITE;
            try {
                robot = new Robot();
                color = robot.getPixelColor((int)loc.getX(), (int)loc.getY());
            } catch (AWTException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            srcColorPalette.setBackground(color);

            replaceColor();
        }
    }//GEN-LAST:event_imgSrcMouseClicked

    private void endColorPaletteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_endColorPaletteMouseClicked
        Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.RED);
        endColorPalette.setBackground(newColor);
        if(paletteEnabled)
            replaceColor();
    }//GEN-LAST:event_endColorPaletteMouseClicked

    private void leftArrowLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftArrowLabelMouseClicked
        ImageIcon icon = (ImageIcon) imgFin.getIcon();
        BufferedImage img = getBufferedImage(icon);
        Image scaledImg = img.getScaledInstance(icon.getIconWidth(), icon.getIconHeight(), Image.SCALE_SMOOTH);
        imgSrc.setIcon(new ImageIcon(scaledImg));
        updateHistogram();
    }//GEN-LAST:event_leftArrowLabelMouseClicked

    private void imgSrcMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSrcMouseReleased
       if(roiEnabled)
       {
           mouseReleased = evt.getPoint();
           
           
           ImageIcon icon = (ImageIcon) imgSrc.getIcon();
           BufferedImage fullImage = getBufferedImage(icon);
           int x, y, width, height;
           x = (mousePressed.getX() < mouseReleased.getX())? (int)mousePressed.getX() : (int)mouseReleased.getX();
           width = (int) Math.abs(mousePressed.getX() - mouseReleased.getX());
           y = (mousePressed.getY() < mouseReleased.getY())? (int)mousePressed.getY() : (int)mouseReleased.getY();
           height = (int) Math.abs(mousePressed.getY() - mouseReleased.getY());
           if(fullImage.getWidth() < 512)
                x -= 256-fullImage.getWidth()/2;

           if(fullImage.getHeight()< 512)
                y -= 256-fullImage.getWidth()/2;
           
           
           BufferedImage newImage = fullImage.getSubimage(x, y, width, height);
           imgFin.setIcon(new ImageIcon(newImage));
           
       }
    }//GEN-LAST:event_imgSrcMouseReleased

    private void imgSrcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSrcMousePressed
        if(roiEnabled)
        {
            mousePressed = evt.getPoint();
        }
    }//GEN-LAST:event_imgSrcMousePressed

    private void paletteLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paletteLabel1MouseClicked

        if(paletteEnabled)
        {
            paletteLabel1.setForeground(new Color(238, 238, 238));
            paletteEnabled = false;
        }
        else
        {
            paletteLabel1.setForeground(new Color(0, 173, 181));
            paletteEnabled = true;
            
        }
    }//GEN-LAST:event_paletteLabel1MouseClicked

    private void histogramLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_histogramLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_histogramLabelMouseClicked

    private void roiLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roiLabel1MouseClicked
        if(roiEnabled)
        {
            roiLabel1.setForeground(new Color(238, 238, 238));
            roiEnabled = false;
        }
        else
        {
            roiLabel1.setForeground(new Color(0, 173, 181));
            roiEnabled = true;
            
        }
    }//GEN-LAST:event_roiLabel1MouseClicked

    private void grayScaleLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grayScaleLabelMouseClicked
        ImageIcon icon = (ImageIcon) imgSrc.getIcon();
        BufferedImage img = getBufferedImage(icon);
        int r, g, b, rgba, average;
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                rgba = img.getRGB(i, j);
                r = (rgba >> 16) & 0x000000FF;
                g = (rgba >> 8) & 0x000000FF;
                b = (rgba) & 0x000000FF;
                average = (r + g + b) / 3;
                rgba = (rgba & 0xFF000000) + (average << 16) + (average << 8) + average;
                img.setRGB(i, j, rgba);
            }
        }
        imgFin.setIcon(new ImageIcon(img));
        updateHistogram();
    }//GEN-LAST:event_grayScaleLabelMouseClicked

    private void sizeXFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeXFieldActionPerformed
        updateImageSize();
    }//GEN-LAST:event_sizeXFieldActionPerformed

    private void multiSeuil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiSeuil2ActionPerformed
        multiSeuillage();
    }//GEN-LAST:event_multiSeuil2ActionPerformed

    private void expansionXFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expansionXFieldActionPerformed
        bilinearInterpolation();
    }//GEN-LAST:event_expansionXFieldActionPerformed

    private void seuilSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seuilSimpleActionPerformed
        ImageIcon icon = (ImageIcon) imgSrc.getIcon();
        BufferedImage img = getBufferedImage(icon);
        int rgba;
        int seuil = Integer.parseInt(seuilSimple.getText());
        
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                rgba = img.getRGB(i, j);
                if((rgba & 0xFF) < seuil)
                    img.setRGB(i, j, (rgba & 0xFF000000));
                else
                    img.setRGB(i, j, ((rgba & 0xFF000000) + 0x00FFFFFF));
            }
        }
        
        imgFin.setIcon(new ImageIcon(img));
        
        updateHistogram();
    }//GEN-LAST:event_seuilSimpleActionPerformed

    private void multiSeuil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiSeuil1ActionPerformed
        multiSeuillage();
    }//GEN-LAST:event_multiSeuil1ActionPerformed

    private void egalisationLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egalisationLabelMouseClicked
        histogramEgalisation();
    }//GEN-LAST:event_egalisationLabelMouseClicked

    private void filtreComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtreComboBoxActionPerformed
        ImageIcon icon = (ImageIcon) imgSrc.getIcon();
        BufferedImage img = getBufferedImage(icon);
        
        int index = filtreComboBox.getSelectedIndex();
        switch(index)
        {
            case 0: // Médian
                imgFin.setIcon(new ImageIcon(MedianFilter.getImage(img)));
                break;
            case 1: // Moyen
                imgFin.setIcon(new ImageIcon(MeanFilter.getImage(img)));
                break;
            case 2: // Gaussien
                imgFin.setIcon(new ImageIcon(GaussianFilter.getImage(img)));
                break;
            case 3: // Laplacien
                imgFin.setIcon(new ImageIcon(LaplacianFilter.getImage(img)));
                break;
            case 4: // Kirsch
                break;
            case 5: // Sobel
                break;
            case 6: // Prewitt
                break;
            case 7: // Roberts
                break;
            default:
                System.out.println("Pas de filtre selectionné");
            
        }
    }//GEN-LAST:event_filtreComboBoxActionPerformed

    private void updateImageSize()
    {
        ImageIcon icon = (ImageIcon) imgSrc.getIcon();
        BufferedImage img = getBufferedImage(icon);
        Image scaledImg = img.getScaledInstance(Integer.parseInt(sizeXField.getText()), Integer.parseInt(sizeYField.getText()), Image.SCALE_SMOOTH);
        imgFin.setIcon(new ImageIcon(scaledImg));
        updateHistogram();
        
    }
    
    private void replaceColor()
    {
        int inputRGB = srcColorPalette.getBackground().getRGB();
        int outputRGB = endColorPalette.getBackground().getRGB();
        ImageIcon icon = (ImageIcon) imgSrc.getIcon();
        BufferedImage img = getBufferedImage(icon);
        
        BufferedImage argbImage = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = argbImage.createGraphics();
        g.drawImage(img, 0, 0, null);
        g.dispose();
        
        for (int i = 0; i < img.getHeight(); i++) {
            for (int j = 0; j < img.getWidth(); j++) {
                if(img.getRGB(i, j) == inputRGB)
                {
                    argbImage.setRGB(i, j, outputRGB);
                }
            }
        }
        
        imgFin.setIcon(new ImageIcon(argbImage));
        updateHistogram();
    }
    
    private BufferedImage getBufferedImage(ImageIcon icon)
    {
        BufferedImage bi = new BufferedImage(
        icon.getIconWidth(),
        icon.getIconHeight(),
        BufferedImage.TYPE_INT_RGB);
        
        Graphics g = bi.createGraphics();
        // paint the Icon to the BufferedImage.
        icon.paintIcon(null, g, 0,0);
        g.dispose();
        return bi;
    }
    
    private void bilinearInterpolation()
    {
        String x, y;
        ImageIcon icon = (ImageIcon) imgSrc.getIcon();
        BufferedImage img = getBufferedImage(icon);
        x = this.expansionXField.getText();
        y = this.expansionYField.getText();
        this.imgFin.setIcon(new ImageIcon(BilinearInterpolation.scale(img, Float.parseFloat(x) , Float.parseFloat(y))));
        updateHistogram();
    }
    
    private void updateHistogram()
    {
        
        values = new int[256];
        int highValue = 0;
        ImageIcon icon = (ImageIcon) imgFin.getIcon();
        BufferedImage img = getBufferedImage(icon);
        
        
        // Get pixel number of same color
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                //System.out.println((img.getRGB(i, j) & 0x000000FF));
                values[img.getRGB(i, j) & 0xFF]++; // Add 1 to that color in values
            }
        }
        
    
        // Get color with most pixels
        minValue = -1;
        for(int i = 0; i < values.length; i++)
        {
            if(values[i] > img.getWidth()*img.getHeight()/100) // Get min and max values for equalisation
            {
                maxValue = i;
                
                if(minValue == -1)
                {
                    if(i == 0)
                        minValue = 0;
                    else
                        minValue = i;
                }
            }
                    
            if(values[i] > values[highValue])
                highValue = i;
        }
        highValueLabel.setText(String.valueOf(values[highValue]));
        
        BufferedImage histo = new BufferedImage(histogram.getWidth(), histogram.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = histo.createGraphics();
        
//        g2d.setColor(Color.BLUE);
//        g2d.fillRect(0, 0, histo.getWidth(), histo.getHeight());
        for(int i = 0; i < values.length; i++)
        {
            g2d.setColor(new Color(i, i, i));
            g2d.drawLine(i, histo.getHeight(), i, histo.getHeight() - (int) ((double)values[i]/values[highValue]*histo.getHeight()));
        }
        g2d.dispose();
        histogram.setIcon(new ImageIcon(histo));
    }
    
    private void multiSeuillage()
    {
        ImageIcon icon = (ImageIcon) imgSrc.getIcon();
        BufferedImage img = getBufferedImage(icon);
        int rgba;
        int seuil1 = Integer.parseInt(multiSeuil1.getText());
        int seuil2 = Integer.parseInt(multiSeuil2.getText());
        
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                rgba = img.getRGB(i, j);
                if((rgba & 0xFF) < seuil1)
                    img.setRGB(i, j, (rgba & 0xFF000000));
                else if((rgba & 0xFF) > seuil2)
                    img.setRGB(i, j, ((rgba & 0xFF000000) + 0xFFFFFF));
                else
                    img.setRGB(i, j, (rgba & 0xFF000000) + 0x7F7F7F);
                    
            }
        }
        
        imgFin.setIcon(new ImageIcon(img));
        
        updateHistogram();
    }
    
    private void histogramEgalisation()
    {
        int dyn = maxValue-minValue, rgba, oldValue, oldRGB, value;
        int[] temp = new int[256];
        int[] cumulValues = new int[256];
        
        ImageIcon icon = (ImageIcon) imgSrc.getIcon();
        BufferedImage img = getBufferedImage(icon);
        int totpix= img.getWidth()*img.getHeight();
        
//        for(int i = minValue; i <= maxValue; i++ )
//        {
//            temp[(i-minValue)/dyn*histogram.getHeight()] = temp[i];
//        }
//        for (int i = 0; i < img.getWidth(); i++) {
//            for (int j = 0; j < img.getHeight(); j++) {
//                oldRGB = img.getRGB(i, j);
//                oldValue = oldRGB & 0xFF;
//                newValue = (int) ((double)(oldValue-minValue)/dyn*255);
//                img.setRGB(i, j, (oldRGB & 0xFF000000) + (newValue << 16) + (newValue << 8) + newValue);
//            }
//        }

        cumulValues[0] = values[0];
        for(int i=1;i<256;i++){
            cumulValues[i] = cumulValues[i-1] + values[i];
        }
        
        float[] arr = new float[256];
        for(int i=0;i<256;i++){
            arr[i] =  (float)((cumulValues[i]*255.0)/(float)totpix);
        }
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                rgba = img.getRGB(i, j);
                value = (int) arr[img.getRGB(i, j) & 0xFF];
                
                rgba = (rgba & 0xFF000000) + (value << 16) + (value << 8) + value;
                
                img.setRGB(i, j, rgba);
            }
        }
        imgFin.setIcon(new ImageIcon(img));
        updateHistogram();
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainFrame frame = new mainFrame();
                frame.setLocationRelativeTo(null); // Center of the screen
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel depLabel;
    private javax.swing.JLabel egalisationLabel;
    private javax.swing.JLabel endColorPalette;
    private javax.swing.JTextField expansionXField;
    private javax.swing.JTextField expansionYField;
    private javax.swing.JComboBox<String> filtreComboBox;
    private javax.swing.JLabel finLabel;
    private javax.swing.JLabel grayScaleLabel;
    private javax.swing.JLabel highValueLabel;
    private javax.swing.JLabel histogram;
    private javax.swing.JLabel histogramLabel;
    private javax.swing.JLabel imgFin;
    private javax.swing.JLabel imgSrc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel leftArrowLabel;
    private javax.swing.JLabel loadImage;
    private javax.swing.JTextField multiSeuil1;
    private javax.swing.JTextField multiSeuil2;
    private javax.swing.JLabel paletteLabel1;
    private javax.swing.JLabel paletteLabel3;
    private javax.swing.JLabel paletteLabel4;
    private javax.swing.JLabel paletteLabel5;
    private javax.swing.JLabel paletteLabel6;
    private javax.swing.JLabel roiLabel1;
    private javax.swing.JTextField seuilSimple;
    private javax.swing.JTextField sizeXField;
    private javax.swing.JTextField sizeYField;
    private javax.swing.JLabel srcColorPalette;
    // End of variables declaration//GEN-END:variables
}