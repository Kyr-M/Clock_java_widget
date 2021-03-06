/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clock;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author admin
 */
public class ClockGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClockGUI
     */
    int posX=0;
    int posY=0;
    int counttime = -1;
    public static int hour;
    public static int min;
    public static int sec;
    public static String time1;
    public ClockGUI() {
        
        new Thread()
        {
           public void run()
            {
                
                while (counttime == -1)
                {
                    Calendar time0 = new GregorianCalendar();
                    
                     hour = time0.get(Calendar.HOUR);
                     min = time0.get(Calendar.MINUTE);
                     sec = time0.get(Calendar.SECOND);
                     int am_pm = time0.get(Calendar.AM_PM);
                    
                    
                    Calendar now = Calendar.getInstance();
                    int year = now.get(Calendar.YEAR);
                    int month = now.get(Calendar.MONTH);
                    int day = now.get(Calendar.DAY_OF_MONTH);
                    
                    
                    
                    String time2 = "";
                    
                    if (am_pm == 1)
                    {
                        time2 = "PM";  
                    }
                    else
                    {
                        time2 = "AM";
                    }
                    String hourS;
                    if(hour<10)
                    {
                        hourS=""+Integer.toString(hour);
                    }
                    else
                    {
                        hourS =Integer.toString(hour);
                    }
                    String minS;
                    if(min<10)
                    {
                        minS="0"+Integer.toString(min);
                    }
                    else
                    {
                        minS =Integer.toString(min);
                    }
                    String time1 = hourS + ":" + minS + ":" + sec + ":" + time2;
                    String time3 = day + "/"  + (month + 1) + "/" + year;
 
                    Clock.setText(time1);
                    Date.setText(time3);
                    
                }
            }
        }
        .start();
        setUndecorated(true);
        initComponents();

        setIcon();
        
        this.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
                posX=e.getX();
                posY=e.getY();
            }
        });
        this.addMouseMotionListener(new MouseAdapter()
        {
            public void mouseDragged(MouseEvent evt)
            {
		//sets frame position when mouse dragged			
		setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);			
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Clock = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        close_widget = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 158, 188));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(20, 33, 61), 4, true));

        Clock.setFont(new java.awt.Font("Alien Encounters", 0, 48)); // NOI18N
        Clock.setForeground(new java.awt.Color(20, 33, 61));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(20, 33, 61), 2, true));

        Date.setFont(new java.awt.Font("Alien Encounters", 3, 24)); // NOI18N
        Date.setForeground(new java.awt.Color(20, 33, 61));
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(20, 33, 61), 2, true));

        close_widget.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_widget.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close-widget.png"))); // NOI18N
        close_widget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_widgetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(close_widget, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(close_widget, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_widgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_widgetMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_close_widgetMouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try
                {
                    Thread.sleep(3000);
                }
                catch(Exception e)
                {
                            
                }
                new ClockGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel close_widget;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("clock.png")));
    }
}
