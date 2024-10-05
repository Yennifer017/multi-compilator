package compi2.multi.compilator;

/**
 *
 * @author yenni
 */

import compi2.multi.compilator.analyzator.Analyzator;
import compi2.multi.compilator.exceptions.FileException;
import compi2.multi.compilator.files.AdmiFiles;
import compi2.multi.compilator.util.AdmiFronted;
import compi2.multi.compilator.util.NumberLine;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Fronted extends javax.swing.JFrame {

    //FIELDS
    private NumberLine numConsole, numDisplayFile;
    private AdmiFiles admiFiles;
    
    private Analyzator analyzator;
    private AdmiFronted admiFronted;

    /**
     * Creates new form Fronted
     */
    public Fronted() {
        initComponents();
        this.setLocationRelativeTo(null);
        initNumeracion();
        initVariables();
        analyzator = new Analyzator();
        admiFronted = new AdmiFronted();
    }

    private void initVariables() {
        admiFiles = new AdmiFiles(treeDisplay, openFilesPanel,
                display, fileNameDisplay);
    }

    private void resizeComponents() {
        treeDirectory.setPreferredSize(new Dimension((int) (0.15 * this.getWidth()), this.getHeight()));
        interfazPanel.setPreferredSize(new Dimension((int) 0.85 * this.getWidth(), this.getHeight()));
    }

    private void initNumeracion() {
        numDisplayFile = new NumberLine(display);
        displayScroll.setRowHeaderView(numDisplayFile);
        numConsole = new NumberLine(console);
        consoleScroll.setRowHeaderView(numConsole);
        numConsole.updateColumna(columnaDisplay);
    }
    
    private void showNoFunction(){
        JOptionPane.showMessageDialog(null, 
                "Sera proximamente implementado");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        treeDirectory = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeDisplay = new javax.swing.JTree();
        interfazPanel = new javax.swing.JPanel();
        displayScroll = new javax.swing.JScrollPane();
        display = new javax.swing.JTextPane();
        consoleScroll = new javax.swing.JScrollPane();
        console = new javax.swing.JTextPane();
        openFilesPanel = new javax.swing.JPanel();
        ClearBtn = new javax.swing.JButton();
        archivoTxt = new javax.swing.JLabel();
        fileNameDisplay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        columnaDisplay = new javax.swing.JLabel();
        AnalyzatorBtn = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        fileMenu1 = new javax.swing.JMenu();
        openDirectoryOp = new javax.swing.JMenuItem();
        closeDirectoryOp = new javax.swing.JMenuItem();
        toolsMenu = new javax.swing.JMenu();
        saveAll = new javax.swing.JMenuItem();
        creditsOp4 = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        openFileOp = new javax.swing.JMenuItem();
        newFileOp = new javax.swing.JMenuItem();
        saveOp = new javax.swing.JMenuItem();
        saveAsOp = new javax.swing.JMenuItem();
        closeFile = new javax.swing.JMenuItem();
        closeAllFilesOp = new javax.swing.JMenuItem();
        saveCloseAllFilesOp = new javax.swing.JMenuItem();
        CodeMenu = new javax.swing.JMenu();
        analyzeAllOp = new javax.swing.JMenuItem();
        showSTop = new javax.swing.JMenuItem();
        showTreeOp = new javax.swing.JMenuItem();
        InformationMenu = new javax.swing.JMenu();
        helpOp = new javax.swing.JMenuItem();
        creditsOp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        treeDirectory.setBackground(new java.awt.Color(0, 0, 0));

        treeDisplay.setBackground(new java.awt.Color(51, 51, 51));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeDisplay.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeDisplayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(treeDisplay);

        javax.swing.GroupLayout treeDirectoryLayout = new javax.swing.GroupLayout(treeDirectory);
        treeDirectory.setLayout(treeDirectoryLayout);
        treeDirectoryLayout.setHorizontalGroup(
            treeDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        treeDirectoryLayout.setVerticalGroup(
            treeDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        interfazPanel.setBackground(new java.awt.Color(20, 20, 20));
        interfazPanel.setForeground(new java.awt.Color(13, 13, 13));

        display.setBackground(new java.awt.Color(0, 0, 43));
        display.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        display.setForeground(new java.awt.Color(234, 234, 234));
        display.setCaretColor(new java.awt.Color(255, 255, 255));
        display.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                displayCaretUpdate(evt);
            }
        });
        display.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                displayCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        display.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                displayKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                displayKeyTyped(evt);
            }
        });
        displayScroll.setViewportView(display);

        console.setBackground(new java.awt.Color(0, 0, 43));
        console.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        console.setForeground(new java.awt.Color(234, 234, 234));
        console.setCaretColor(new java.awt.Color(255, 255, 255));
        consoleScroll.setViewportView(console);

        openFilesPanel.setBackground(new java.awt.Color(0, 0, 0));

        ClearBtn.setBackground(new java.awt.Color(0, 0, 102));
        ClearBtn.setForeground(new java.awt.Color(204, 204, 204));
        ClearBtn.setText("Limpiar Consola");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        archivoTxt.setForeground(new java.awt.Color(255, 255, 255));
        archivoTxt.setText("Archivo actual: ");

        fileNameDisplay.setForeground(new java.awt.Color(255, 255, 255));
        fileNameDisplay.setText("[none]");

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Columna:");

        columnaDisplay.setForeground(new java.awt.Color(204, 204, 204));
        columnaDisplay.setText("0000");

        AnalyzatorBtn.setBackground(new java.awt.Color(0, 0, 102));
        AnalyzatorBtn.setForeground(new java.awt.Color(204, 204, 204));
        AnalyzatorBtn.setText("Analizar");
        AnalyzatorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyzatorBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout interfazPanelLayout = new javax.swing.GroupLayout(interfazPanel);
        interfazPanel.setLayout(interfazPanelLayout);
        interfazPanelLayout.setHorizontalGroup(
            interfazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(openFilesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(interfazPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(interfazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayScroll)
                    .addComponent(consoleScroll)
                    .addGroup(interfazPanelLayout.createSequentialGroup()
                        .addComponent(archivoTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fileNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(interfazPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(columnaDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                        .addComponent(ClearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnalyzatorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        interfazPanelLayout.setVerticalGroup(
            interfazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfazPanelLayout.createSequentialGroup()
                .addComponent(openFilesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(interfazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileNameDisplay)
                    .addComponent(archivoTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayScroll)
                .addGap(18, 18, 18)
                .addGroup(interfazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(columnaDisplay)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnalyzatorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(consoleScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fileMenu1.setText("Carpetas");

        openDirectoryOp.setText("Abrir Visor de carpeta");
        openDirectoryOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDirectoryOpActionPerformed(evt);
            }
        });
        fileMenu1.add(openDirectoryOp);

        closeDirectoryOp.setText("Cerrar Visor de carpeta");
        closeDirectoryOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeDirectoryOpActionPerformed(evt);
            }
        });
        fileMenu1.add(closeDirectoryOp);

        toolsMenu.setText("Herramientas");

        saveAll.setText("Guardar y reiniciar IDE");
        saveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAllActionPerformed(evt);
            }
        });
        toolsMenu.add(saveAll);

        creditsOp4.setText("Cerrar visor y archivos");
        creditsOp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsOp4ActionPerformed(evt);
            }
        });
        toolsMenu.add(creditsOp4);

        fileMenu1.add(toolsMenu);

        menu.add(fileMenu1);

        fileMenu.setText("Archivos");

        openFileOp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openFileOp.setText("Abrir archivo");
        openFileOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileOpActionPerformed(evt);
            }
        });
        fileMenu.add(openFileOp);

        newFileOp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newFileOp.setText("Nuevo archivo");
        newFileOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileOpActionPerformed(evt);
            }
        });
        fileMenu.add(newFileOp);

        saveOp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveOp.setText("Guardar");
        saveOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOpActionPerformed(evt);
            }
        });
        fileMenu.add(saveOp);

        saveAsOp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveAsOp.setText("Guardar como");
        saveAsOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsOpActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsOp);

        closeFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        closeFile.setText("Cerrar archivo");
        closeFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFileActionPerformed(evt);
            }
        });
        fileMenu.add(closeFile);

        closeAllFilesOp.setText("Cerrar todo");
        closeAllFilesOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAllFilesOpActionPerformed(evt);
            }
        });
        fileMenu.add(closeAllFilesOp);

        saveCloseAllFilesOp.setText("Guardar y cerrar todos");
        saveCloseAllFilesOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCloseAllFilesOpActionPerformed(evt);
            }
        });
        fileMenu.add(saveCloseAllFilesOp);

        menu.add(fileMenu);

        CodeMenu.setText("Codigo");

        analyzeAllOp.setText("Analizar todo");
        analyzeAllOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeAllOpActionPerformed(evt);
            }
        });
        CodeMenu.add(analyzeAllOp);

        showSTop.setText("Ver tabla de simbolos");
        showSTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSTopActionPerformed(evt);
            }
        });
        CodeMenu.add(showSTop);

        showTreeOp.setText("Ver arbol de activaciones");
        showTreeOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTreeOpActionPerformed(evt);
            }
        });
        CodeMenu.add(showTreeOp);

        menu.add(CodeMenu);

        InformationMenu.setText("Informacion");

        helpOp.setText("Ayuda");
        helpOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpOpActionPerformed(evt);
            }
        });
        InformationMenu.add(helpOp);

        creditsOp.setText("Creditos");
        creditsOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsOpActionPerformed(evt);
            }
        });
        InformationMenu.add(creditsOp);

        menu.add(InformationMenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(treeDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(interfazPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(interfazPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(treeDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileOpActionPerformed
        admiFronted.openFileOp(admiFiles);

    }//GEN-LAST:event_openFileOpActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        resizeComponents();
    }//GEN-LAST:event_formComponentResized

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        if (evt.getNewState() == MAXIMIZED_BOTH || evt.getNewState() == MAXIMIZED_HORIZ
                || evt.getNewState() == MAXIMIZED_VERT || evt.getNewState() == 0) {
            this.resizeComponents();
        }
    }//GEN-LAST:event_formWindowStateChanged

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        console.setText("");
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void helpOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpOpActionPerformed
        JOptionPane.showMessageDialog(null,
                "Puedes consultar el manual de usuario en el repositorio de github",
                "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpOpActionPerformed

    private void creditsOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsOpActionPerformed
        JOptionPane.showMessageDialog(null,
                "Proyecto creado con un poquito (demasiado) de desesperacion...\n    --Yennifer",
                "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_creditsOpActionPerformed

    private void saveOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOpActionPerformed
        try {
            admiFiles.saveFile();
        } catch (FileException ex) {
            admiFronted.saveAs(admiFiles, display);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el archivo :/");
        }
    }//GEN-LAST:event_saveOpActionPerformed

    private void saveAsOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsOpActionPerformed
        admiFronted.saveAs(admiFiles, display);
    }//GEN-LAST:event_saveAsOpActionPerformed

    private void closeFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFileActionPerformed
        admiFronted.closeFile(admiFiles);
    }//GEN-LAST:event_closeFileActionPerformed

    private void newFileOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileOpActionPerformed
        try {
            if (admiFiles.isOpenProject()) {
                /*String rootPath = admiFiles.saveNewFileInProject();
                admiFiles.closeProject();
                admiFiles.openProject(rootPath);*/
            } else {
                String path = admiFiles.saveNewFile();
                admiFiles.openFile(new File(path));
            }
        } catch (FileException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            admiFronted.showInesperatedError();
        } catch (Exception ex) {
            admiFronted.showInesperatedError();
        }
    }//GEN-LAST:event_newFileOpActionPerformed

    private void AnalyzatorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyzatorBtnActionPerformed
        console.setText(
            analyzator.comprobate(
                display.getText()
            )
        );
    }//GEN-LAST:event_AnalyzatorBtnActionPerformed

    private void showSTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSTopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showSTopActionPerformed

    private void showTreeOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTreeOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showTreeOpActionPerformed

    private void analyzeAllOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeAllOpActionPerformed
        //QUITAR ESTOOOOOOOOOOOOOOOOOOOOOOO
    }//GEN-LAST:event_analyzeAllOpActionPerformed

    private void closeAllFilesOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAllFilesOpActionPerformed
        this.admiFiles.closeOpenFiles();
    }//GEN-LAST:event_closeAllFilesOpActionPerformed

    private void saveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAllActionPerformed
        showNoFunction();
    }//GEN-LAST:event_saveAllActionPerformed

    private void treeDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeDisplayMouseClicked
        admiFronted.openFilesInTreeEvent(evt, admiFiles);
    }//GEN-LAST:event_treeDisplayMouseClicked

    private void openDirectoryOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDirectoryOpActionPerformed
        try {
            admiFiles.openProject();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_openDirectoryOpActionPerformed

    private void closeDirectoryOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeDirectoryOpActionPerformed
        admiFiles.closeDirectoryView();
    }//GEN-LAST:event_closeDirectoryOpActionPerformed

    private void displayCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_displayCaretUpdate
        numDisplayFile.updateColumna(columnaDisplay);
    }//GEN-LAST:event_displayCaretUpdate

    private void displayCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_displayCaretPositionChanged
        numDisplayFile.updateColumna(columnaDisplay);
    }//GEN-LAST:event_displayCaretPositionChanged

    private void displayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_displayKeyTyped
        numDisplayFile.updateColumna(columnaDisplay);
    }//GEN-LAST:event_displayKeyTyped

    private void saveCloseAllFilesOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCloseAllFilesOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveCloseAllFilesOpActionPerformed

    private void creditsOp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsOp4ActionPerformed
        showNoFunction();   
    }//GEN-LAST:event_creditsOp4ActionPerformed

    private void displayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_displayKeyPressed
        admiFronted.rescribeTab(evt, display);
    }//GEN-LAST:event_displayKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalyzatorBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JMenu CodeMenu;
    private javax.swing.JMenu InformationMenu;
    private javax.swing.JMenuItem analyzeAllOp;
    private javax.swing.JLabel archivoTxt;
    private javax.swing.JMenuItem closeAllFilesOp;
    private javax.swing.JMenuItem closeDirectoryOp;
    private javax.swing.JMenuItem closeFile;
    private javax.swing.JLabel columnaDisplay;
    private javax.swing.JTextPane console;
    private javax.swing.JScrollPane consoleScroll;
    private javax.swing.JMenuItem creditsOp;
    private javax.swing.JMenuItem creditsOp4;
    private javax.swing.JTextPane display;
    private javax.swing.JScrollPane displayScroll;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu fileMenu1;
    private javax.swing.JLabel fileNameDisplay;
    private javax.swing.JMenuItem helpOp;
    private javax.swing.JPanel interfazPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem newFileOp;
    private javax.swing.JMenuItem openDirectoryOp;
    private javax.swing.JMenuItem openFileOp;
    private javax.swing.JPanel openFilesPanel;
    private javax.swing.JMenuItem saveAll;
    private javax.swing.JMenuItem saveAsOp;
    private javax.swing.JMenuItem saveCloseAllFilesOp;
    private javax.swing.JMenuItem saveOp;
    private javax.swing.JMenuItem showSTop;
    private javax.swing.JMenuItem showTreeOp;
    private javax.swing.JMenu toolsMenu;
    private javax.swing.JPanel treeDirectory;
    private javax.swing.JTree treeDisplay;
    // End of variables declaration//GEN-END:variables
}
