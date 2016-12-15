/*
    [Osu!Shrinker]
    Copyright (C) 2016  NewKey

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

*/


package OsuShrinker;

import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
	

public class Window extends javax.swing.JFrame {

    private static boolean caution=false;
    private boolean pass;


    public Window() {
	initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProgressBar = new javax.swing.JProgressBar();
        Scroll = new javax.swing.JScrollPane();
        T_Area = new javax.swing.JTextPane();
        L_madeBy = new javax.swing.JLabel();
        B_Clear = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        L_Alert = new javax.swing.JLabel();
        C_Taiko = new javax.swing.JCheckBox();
        C_Mania = new javax.swing.JCheckBox();
        C_CTB = new javax.swing.JCheckBox();
        B_SelectFolder = new javax.swing.JButton();
        L_Status = new javax.swing.JLabel();
        C_STD = new javax.swing.JCheckBox();
        L_STD = new javax.swing.JLabel();
        N_STD = new javax.swing.JLabel();
        L_Taiko = new javax.swing.JLabel();
        N_Taiko = new javax.swing.JLabel();
        L_CTB = new javax.swing.JLabel();
        N_CTB = new javax.swing.JLabel();
        L_Mania = new javax.swing.JLabel();
        N_Mania = new javax.swing.JLabel();
        B_Run = new javax.swing.JButton();
        B_Pause = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        L_i = new javax.swing.JLabel();
        L_max = new javax.swing.JLabel();
        L_Separetor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Osu!Shrinker");
        setResizable(false);

        T_Area.setEditable(false);
        Scroll.setViewportView(T_Area);

        L_madeBy.setText("Made by player: NewKey");

        B_Clear.setText("Clear all (Stop)");
        B_Clear.setFocusable(false);
        B_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ClearActionPerformed(evt);
            }
        });

        L_Alert.setText("<html>Check the game Mode to Analyze, The rest will be <font color='red'>PERMANENTLY DELETE</font></html> ");
        L_Alert.setToolTipText("");

        C_Taiko.setText("Taiko");
        C_Taiko.setFocusPainted(false);

        C_Mania.setText("osu!mania");
        C_Mania.setFocusPainted(false);

        C_CTB.setText("Catch the Beat");
        C_CTB.setFocusPainted(false);

        B_SelectFolder.setText("Select Songs Folder");
        B_SelectFolder.setBorderPainted(false);
        B_SelectFolder.setFocusPainted(false);
        B_SelectFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SelectFolderActionPerformed(evt);
            }
        });

        L_Status.setText("<html>Status: <font color='red'>INCORRECT</font></html> ");

        C_STD.setText("Osu! Standard");
        C_STD.setFocusPainted(false);

        L_STD.setText("STD: ");

        N_STD.setText("0");

        L_Taiko.setText("Taiko:");

        N_Taiko.setText("0");

        L_CTB.setText("CTB:");

        N_CTB.setText("0");

        L_Mania.setText("Mania:");

        N_Mania.setText("0");

        B_Run.setText("RUN");
        B_Run.setEnabled(false);
        B_Run.setFocusable(false);
        B_Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(L_Alert)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(L_STD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(N_STD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(L_Taiko)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(N_Taiko, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, PanelLayout.createSequentialGroup()
                                        .addComponent(C_STD)
                                        .addGap(2, 2, 2)
                                        .addComponent(C_Taiko)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C_CTB)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(L_CTB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(N_CTB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(L_Mania)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(N_Mania, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(C_Mania)))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(L_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B_SelectFolder)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(B_Run, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_SelectFolder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_Alert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_STD)
                    .addComponent(C_Taiko)
                    .addComponent(C_CTB)
                    .addComponent(C_Mania))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_Mania)
                        .addComponent(N_Mania))
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_CTB)
                        .addComponent(N_CTB))
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_Taiko)
                        .addComponent(N_Taiko))
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_STD)
                        .addComponent(N_STD)))
                .addGap(18, 18, 18)
                .addComponent(B_Run)
                .addContainerGap())
        );

        B_Pause.setText("||");
        B_Pause.setEnabled(false);
        B_Pause.setFocusable(false);
        B_Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PauseActionPerformed(evt);
            }
        });

        jLabel1.setText("Files:");

        L_i.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_i.setText("0");

        L_max.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L_max.setText("0");

        L_Separetor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Separetor.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProgressBar, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Scroll)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(L_madeBy))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_i, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_Separetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_max, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Pause)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Clear)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Clear)
                    .addComponent(B_Pause)
                    .addComponent(jLabel1)
                    .addComponent(L_i)
                    .addComponent(L_max)
                    .addComponent(L_Separetor))
                .addGap(0, 0, 0)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_madeBy))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    JFileChooser chooser;
    String choosertitle;
    private void B_SelectFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SelectFolderActionPerformed
        chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    chooser.setAcceptAllFileFilterUsed(false);
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
       File route = chooser.getSelectedFile();
       
       if(route.toString().endsWith("Songs")){
	   RunIt.folder=route;
	   L_Status.setText("<html>Status: <font color='blue'>Correct</font></html> ");
	   B_Run.setEnabled(true);
	   T_Area.setText("Songs Route: \n"+route.toString()+"\n");
	   pass=true;
       }else{
	   L_Status.setText("<html>Status: <font color='red'>INCORRECT</font></html> ");
	   B_Run.setEnabled(false);
	   T_Area.setText("Incorrect Songs Route");
	   RunIt.folder=null;
	   pass=false;
       }
      }
    }//GEN-LAST:event_B_SelectFolderActionPerformed

    private static void disAble(){
	B_Run.setEnabled(false);
	C_STD.setEnabled(false);
	C_Mania.setEnabled(false);
	C_CTB.setEnabled(false);
	C_Taiko.setEnabled(false);
	B_Pause.setEnabled(true);
    }
    
    private void B_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ClearActionPerformed
        Clean();
    }//GEN-LAST:event_B_ClearActionPerformed

    public static void Clean(){
	B_Run.setEnabled(true);
	RunIt.Astd=false; RunIt.Amania=false; RunIt.Afruts=false; RunIt.Ataiko=false;
	RunIt.folder=new File("");
	B_Run.setEnabled(false);
	L_max.setText("0");
	L_i.setText("0");
	N_STD.setText("0");
	N_Mania.setText("0");
	N_Taiko.setText("0");
	N_CTB.setText("0");
	C_STD.setEnabled(true);
	C_Mania.setEnabled(true);
	C_CTB.setEnabled(true);
	C_Taiko.setEnabled(true);
	C_STD.setSelected(false);
	C_Mania.setSelected(false);
	C_CTB.setSelected(false);
	C_Taiko.setSelected(false);
	B_Pause.setEnabled(true);
	ProgressBar.setMaximum(0);
	ProgressBar.setMinimum(0);
	ProgressBar.setValue(0);
	T_Area.setText("");
	L_Status.setText("<html>Status: <font color='red'>INCORRECT</font></html> ");
	caution=true;
	RunIt.Stop();
    }
    
    private void B_PauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PauseActionPerformed
	if(B_Pause.getText().contains("||")){
	    B_Pause.setText(">");
	    RunIt.Pause();
	}else
	if(B_Pause.getText().contains(">")){
	    B_Pause.setText("||");
	    RunIt.Resume();
	}
    }//GEN-LAST:event_B_PauseActionPerformed

    private void B_RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RunActionPerformed
        if(C_STD.isSelected() && C_Mania.isSelected() &&
	    C_CTB.isSelected() && C_Taiko.isSelected())
	    JOptionPane.showMessageDialog(null, "My Goodness, do you want delete all the songs?");
	if(!C_STD.isSelected() && !C_Mania.isSelected() &&
	    !C_CTB.isSelected() && !C_Taiko.isSelected())
	    JOptionPane.showMessageDialog(null, "You're not selecting any Game Mode");
	if(C_STD.isSelected() || C_Mania.isSelected() ||
	    C_CTB.isSelected() || C_Taiko.isSelected()){
		if(C_STD.isSelected()){
		    RunIt.Astd=true;
		}
		if(C_Mania.isSelected()){
		    RunIt.Amania=true;
		}
		if(C_CTB.isSelected()){
		    RunIt.Afruts=true;
		}
		if(C_Taiko.isSelected()){
		    RunIt.Ataiko=true;
		}
		if(pass==true){
		if(caution==true){
		    JDialog.setDefaultLookAndFeelDecorated(true);
		    int response = JOptionPane.showConfirmDialog(null, "You already delete a Game Mode Before, Are you sure to delete another Game Mode?", "ALERT",
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		    if (response == JOptionPane.YES_OPTION) {
			int respon = JOptionPane.showConfirmDialog(null, "You still sure? You deleted a Game Mode before.", "ALERT",
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (respon == JOptionPane.NO_OPTION) {
			} else if (respon == JOptionPane.YES_OPTION) {
			    disAble();
			    RunIt.Run();
			}
		    }
		}else{
		    int respon = JOptionPane.showConfirmDialog(null, "Before Run It. Did you create a backup? ", "ALERT",
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		    if (respon == JOptionPane.YES_OPTION) {
			disAble();
			RunIt.Run();
		    }
		}
		}else{
		    JOptionPane.showMessageDialog(null, "You're not selecting the correct Songs Folder");
		}
	}
    }//GEN-LAST:event_B_RunActionPerformed


    public static void main(String args[]) {
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch (ClassNotFoundException e) {
		e.printStackTrace();
	    } catch (InstantiationException e) {
		e.printStackTrace();
	    } catch (IllegalAccessException e) {
		e.printStackTrace();
	    } catch (UnsupportedLookAndFeelException e) {
		e.printStackTrace();
	    }
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		Window Window = new Window();
		goWebsite();
		Window.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ico.png")));
		Window.setLocationRelativeTo(null);
		Window.setVisible(true);
	    }
	});
    }
    
    public static void goWebsite() {
	String text="NewKey";
        L_madeBy.setText("<html>Made by player: <a href=\"\">"+text+"</a></html>");
        L_madeBy.setCursor(new Cursor(Cursor.HAND_CURSOR));
        L_madeBy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try {
                            Desktop.getDesktop().browse(new URI("https://osu.ppy.sh/u/637668"));
                    } catch (URISyntaxException | IOException ex) {}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton B_Clear;
    public static javax.swing.JToggleButton B_Pause;
    public static javax.swing.JButton B_Run;
    public static javax.swing.JButton B_SelectFolder;
    public static javax.swing.JCheckBox C_CTB;
    public static javax.swing.JCheckBox C_Mania;
    public static javax.swing.JCheckBox C_STD;
    public static javax.swing.JCheckBox C_Taiko;
    public static javax.swing.JLabel L_Alert;
    public static javax.swing.JLabel L_CTB;
    public static javax.swing.JLabel L_Mania;
    public static javax.swing.JLabel L_STD;
    public static javax.swing.JLabel L_Separetor;
    public static javax.swing.JLabel L_Status;
    public static javax.swing.JLabel L_Taiko;
    public static javax.swing.JLabel L_i;
    public static javax.swing.JLabel L_madeBy;
    public static javax.swing.JLabel L_max;
    public static javax.swing.JLabel N_CTB;
    public static javax.swing.JLabel N_Mania;
    public static javax.swing.JLabel N_STD;
    public static javax.swing.JLabel N_Taiko;
    public static javax.swing.JPanel Panel;
    public static javax.swing.JProgressBar ProgressBar;
    public static javax.swing.JScrollPane Scroll;
    public static javax.swing.JTextPane T_Area;
    public static javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
