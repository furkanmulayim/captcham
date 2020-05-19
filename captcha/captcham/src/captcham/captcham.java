package captcham;
import java.util.Random;


public class captcham extends javax.swing.JFrame {

    int mousepressx;
    int mousepressy;

    String uretilen_kod = "";
    int uretilen_kod_int;
    String birinci_cift, ikinci_cift, ucuncu_cift;

    Random random = new Random();

    int kalan_hak = 3;
    int yenileme_hak = 4;

    public captcham() {
        initComponents();
        captcha();
       
    }
    
    public void captcha(){
         for (int i = 0; i < 2; i++) {
            int a = random.nextInt(32);
            if (a < 10) {
                if (i == 1) {
                    birinci_cift = "" + 0;
                    break;
                } else if (i == 0) {
                    birinci_cift = "" + 0 + a;
                    break;
                }
            }
            birinci_cift = "" + a;
            break;
        }
        for (int i = 0; i < 2; i++) {
            int a = random.nextInt(12);
            if (a < 10) {
                if (i == 1) {
                    ikinci_cift = "" + 0;
                    break;
                } else if (i == 0) {
                    ikinci_cift = "" + 0 + a;
                    break;
                }
            }
            ikinci_cift = "" + a;
            break;
        }
        for (int i = 0; i < 2; i++) {
            int a = random.nextInt(99);
            if (a < 10) {
                if (i == 1) {
                    ucuncu_cift = "" + 0;
                    break;
                } else if (i == 0) {
                    ucuncu_cift = "" + 0 + a;
                    break;
                }
            }
            ucuncu_cift = "" + a;
            break;
        }
        uretilen_kod = "" + birinci_cift + ikinci_cift + ucuncu_cift;
        gelen_captcha.setText(uretilen_kod);
    }

    
    

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        slide_bar = new javax.swing.JLabel();
        gelen_captcha = new javax.swing.JTextField();
        yazilan_captcha = new javax.swing.JTextField();
        giris_buton = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();
        cikis_buton = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(510, 240));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slide_bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                slide_barMouseDragged(evt);
            }
        });
        slide_bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                slide_barMousePressed(evt);
            }
        });
        jPanel2.add(slide_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 17));

        gelen_captcha.setEditable(false);
        gelen_captcha.setBackground(new java.awt.Color(222, 225, 229));
        gelen_captcha.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        gelen_captcha.setForeground(new java.awt.Color(255, 255, 255));
        gelen_captcha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gelen_captcha.setBorder(null);
        gelen_captcha.setEnabled(false);
        jPanel2.add(gelen_captcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 260, 67));

        yazilan_captcha.setBackground(new java.awt.Color(222, 225, 229));
        yazilan_captcha.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        yazilan_captcha.setForeground(new java.awt.Color(142, 143, 147));
        yazilan_captcha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yazilan_captcha.setText("Yukarıdaki CAPTCHA'yı Giriniz");
        yazilan_captcha.setBorder(null);
        yazilan_captcha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yazilan_captchaMouseClicked(evt);
            }
        });
        jPanel2.add(yazilan_captcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 313, 260, 67));

        giris_buton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        giris_buton.setForeground(new java.awt.Color(102, 102, 102));
        giris_buton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        giris_buton.setText("GİRİŞ");
        giris_buton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        giris_buton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giris_butonMouseClicked(evt);
            }
        });
        jPanel2.add(giris_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 90, 40));

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        jPanel2.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 247, -1, -1));

        cikis_buton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/error.png"))); // NOI18N
        cikis_buton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cikis_buton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikis_butonMouseClicked(evt);
            }
        });
        jPanel2.add(cikis_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 170, 20));

        panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/captcha giris paneli son.png"))); // NOI18N
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });
        jPanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(142, 143, 147));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistemi Kapat");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 130, 60));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(142, 143, 147));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Anasayfa");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 130, 60));

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/captcha giristen sonra.png"))); // NOI18N
        jPanel1.add(arkaplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cikis_butonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikis_butonMouseClicked
        System.exit(0); // sistemi kapatıyor
    }//GEN-LAST:event_cikis_butonMouseClicked

    private void slide_barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slide_barMousePressed
        mousepressx = evt.getX();
        mousepressy = evt.getY();
    }//GEN-LAST:event_slide_barMousePressed

    private void slide_barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slide_barMouseDragged
        int kordinatx = evt.getXOnScreen();
        int kordinaty = evt.getYOnScreen();
        this.setLocation(kordinatx - mousepressx, kordinaty - mousepressy);
    }//GEN-LAST:event_slide_barMouseDragged

    private void yazilan_captchaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yazilan_captchaMouseClicked
        if (yazilan_captcha.getText().equals("Yukarıdaki CAPTCHA'yı Giriniz")) {
            yazilan_captcha.setText("");
        }
    }//GEN-LAST:event_yazilan_captchaMouseClicked

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        if (yazilan_captcha.getText().equals("")) {
            yazilan_captcha.setText("Yukarıdaki CAPTCHA'yı Giriniz");
        }
    }//GEN-LAST:event_panelMouseClicked

    private void giris_butonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giris_butonMouseClicked
        if (gelen_captcha.getText().equals(yazilan_captcha.getText())) {
            jPanel2.setVisible(false);
            jPanel1.setVisible(true);
        } else {

            kalan_hak--;
            jLabel3.setText("Kalan Hakkınız: " + kalan_hak);
            if (kalan_hak == 0) {
                System.exit(0);
            }
        }


    }//GEN-LAST:event_giris_butonMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        if (yenileme_hak != 0) {
            yenileme_hak--;
            captcha();
        }
    }//GEN-LAST:event_refreshMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        kalan_hak = 3;
        jLabel3.setText("");
        yenileme_hak = 4;

        yazilan_captcha.setText("Yukarıdaki CAPTCHA'yı Giriniz");
        jPanel2.setVisible(true);
        jPanel1.setVisible(false);
        captcha();
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(captcham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(captcham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(captcham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(captcham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new captcham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaplan;
    private javax.swing.JLabel cikis_buton;
    private javax.swing.JTextField gelen_captcha;
    private javax.swing.JLabel giris_buton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel panel;
    private javax.swing.JLabel refresh;
    private javax.swing.JLabel slide_bar;
    private javax.swing.JTextField yazilan_captcha;
    // End of variables declaration//GEN-END:variables
}
