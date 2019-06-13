/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Velazquez;

import java.awt.Color;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.ConvolveOp;
import java.awt.image.DataBuffer;
import java.awt.image.Kernel;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;
import java.awt.image.RescaleOp;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sm.pgp.biblioteca.ColorRender;
import sm.pgp.biblioteca.Figuras.Tipo;
import sm.pgp.biblioteca.Lienzos.Lienzo2D;
import sm.pgp.biblioteca.Filtros.Seno;
import sm.pgp.biblioteca.Filtros.SepiaOp;
import sm.image.KernelProducer;
import sm.image.LookupTableProducer;
import sm.image.TintOp;
import sm.image.EqualizationOp;
import sm.pgp.biblioteca.Figuras.FiguraPro;
import sm.pgp.biblioteca.FileFilterExtension;
import sm.pgp.biblioteca.Filtros.NegativoOp;
import sm.pgp.biblioteca.Filtros.UmbralizacionOp;
import sm.pgp.biblioteca.LayerRender;
import sm.sound.SMRecorder;
import sm.sound.SMSoundRecorder;

/**
 * Ventana principal del programa donde se aloja el escritorio y toda la interfaz de usuario.
 * @author gervi
 */
public class VentanaPaint extends javax.swing.JFrame {

    /**
     * Constructor de la clase.
     */
    public VentanaPaint() {
        initComponents();
        //this.setMaximumSize(this.getMaximumSize());
        this.setSize(1350, 720);
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/Gervilla.png")));
        panelEscala.setVisible(false);
        panelRotacion.setVisible(false);
        Separador2.setVisible(false);
    }
    /**
     * initComponents generado por NetBeans.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Herramientas = new javax.swing.ButtonGroup();
        BHerram = new javax.swing.JToolBar();
        Nuevo = new javax.swing.JButton();
        Abrir = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Separador1 = new javax.swing.JToolBar.Separator();
        jPanel1 = new javax.swing.JPanel();
        Color c[] = {Color.BLACK, Color.GREEN, Color.YELLOW, Color.BLUE, Color.RED, Color.WHITE};
        ListaColores = new javax.swing.JComboBox<>(c);
        Trazo = new javax.swing.JSpinner();
        Separador2 = new javax.swing.JToolBar.Separator();
        panelRotacion = new javax.swing.JPanel();
        Rotacion = new javax.swing.JSlider();
        Rotar90 = new javax.swing.JButton();
        Rotar180 = new javax.swing.JButton();
        Rotar270 = new javax.swing.JButton();
        panelEscala = new javax.swing.JPanel();
        Incrementar = new javax.swing.JButton();
        Decrementar = new javax.swing.JButton();
        Separador3 = new javax.swing.JToolBar.Separator();
        Seleccionar = new javax.swing.JToggleButton();
        Relleno = new javax.swing.JToggleButton();
        Alisar = new javax.swing.JToggleButton();
        Transparencia = new javax.swing.JToggleButton();
        Separador4 = new javax.swing.JToolBar.Separator();
        ReproductorAudio = new javax.swing.JPanel();
        PlayPause = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        Grabar = new javax.swing.JButton();
        PlayList = new javax.swing.JComboBox<>();
        pruebas = new javax.swing.JButton();
        panelInferior = new javax.swing.JPanel();
        panelEstado = new javax.swing.JPanel();
        HerramientaAct = new javax.swing.JLabel();
        panelAjustes = new javax.swing.JPanel();
        panelBrillo = new javax.swing.JPanel();
        brillo = new javax.swing.JSlider();
        panelEfectos = new javax.swing.JPanel();
        Efectos = new javax.swing.JComboBox<>();
        panelContraste = new javax.swing.JPanel();
        Contraste = new javax.swing.JButton();
        Iluminar = new javax.swing.JButton();
        Oscurecer = new javax.swing.JButton();
        panelSeno = new javax.swing.JPanel();
        FuncionSeno = new javax.swing.JButton();
        Sepia = new javax.swing.JButton();
        Tintar = new javax.swing.JButton();
        Ecualizar = new javax.swing.JButton();
        Negativo = new javax.swing.JButton();
        espColor = new javax.swing.JPanel();
        SplitBands = new javax.swing.JButton();
        EspacioColor = new javax.swing.JComboBox<>();
        panelUmbral = new javax.swing.JPanel();
        Umbral = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        FiguraPro vf[] = {};
        ListaFiguras = new javax.swing.JList<FiguraPro>(vf);
        jPanel2 = new javax.swing.JPanel();
        Lapiz = new javax.swing.JToggleButton();
        Linea = new javax.swing.JToggleButton();
        Rectangulo = new javax.swing.JToggleButton();
        Ovalo = new javax.swing.JToggleButton();
        Abanico = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        trazolbl = new javax.swing.JLabel();
        ColorTrazo = new javax.swing.JButton();
        rellenolbl = new javax.swing.JLabel();
        ColorRelleno = new javax.swing.JButton();
        Escritorio = new javax.swing.JDesktopPane();
        BarraMenu = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        BNuevo = new javax.swing.JMenuItem();
        BAbrir = new javax.swing.JMenuItem();
        BGuardar = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenu();
        Copiar = new javax.swing.JMenuItem();
        Transformar = new javax.swing.JCheckBoxMenuItem();
        Ver = new javax.swing.JMenu();
        VerBGeneral = new javax.swing.JCheckBoxMenuItem();
        VerBProcesado = new javax.swing.JCheckBoxMenuItem();
        VerBEstado = new javax.swing.JCheckBoxMenuItem();
        VerAudio = new javax.swing.JCheckBoxMenuItem();
        Ayuda = new javax.swing.JMenu();
        AcercaD = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);

        BHerram.setRollover(true);
        BHerram.setBorderPainted(false);

        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        Nuevo.setFocusable(false);
        Nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Nuevo.setPreferredSize(new java.awt.Dimension(35, 35));
        Nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        BHerram.add(Nuevo);

        Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abrir.png"))); // NOI18N
        Abrir.setFocusable(false);
        Abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Abrir.setPreferredSize(new java.awt.Dimension(35, 35));
        Abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        BHerram.add(Abrir);

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        Guardar.setFocusable(false);
        Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Guardar.setPreferredSize(new java.awt.Dimension(35, 35));
        Guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        BHerram.add(Guardar);
        BHerram.add(Separador1);

        jPanel1.setMaximumSize(new java.awt.Dimension(100, 32767));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        ListaColores.setRenderer(new ColorRender());
        ListaColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaColoresActionPerformed(evt);
            }
        });
        jPanel1.add(ListaColores);

        Trazo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Trazo.setMinimumSize(new java.awt.Dimension(50, 30));
        Trazo.setPreferredSize(new java.awt.Dimension(50, 30));
        Trazo.setRequestFocusEnabled(false);
        Trazo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TrazoStateChanged(evt);
            }
        });
        jPanel1.add(Trazo);

        BHerram.add(jPanel1);
        BHerram.add(Separador2);

        panelRotacion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Rotacion"));
        panelRotacion.setMaximumSize(new java.awt.Dimension(250, 50));
        panelRotacion.setMinimumSize(new java.awt.Dimension(250, 50));
        panelRotacion.setPreferredSize(new java.awt.Dimension(250, 50));
        panelRotacion.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, -4));

        Rotacion.setMaximum(360);
        Rotacion.setValue(0);
        Rotacion.setPreferredSize(new java.awt.Dimension(100, 26));
        Rotacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RotacionStateChanged(evt);
            }
        });
        Rotacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RotacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RotacionFocusLost(evt);
            }
        });
        panelRotacion.add(Rotacion);

        Rotar90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rotacion90.png"))); // NOI18N
        Rotar90.setPreferredSize(new java.awt.Dimension(30, 30));
        Rotar90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rotar90ActionPerformed(evt);
            }
        });
        panelRotacion.add(Rotar90);

        Rotar180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rotacion180.png"))); // NOI18N
        Rotar180.setPreferredSize(new java.awt.Dimension(30, 30));
        Rotar180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rotar180ActionPerformed(evt);
            }
        });
        panelRotacion.add(Rotar180);

        Rotar270.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rotacion270.png"))); // NOI18N
        Rotar270.setPreferredSize(new java.awt.Dimension(30, 30));
        Rotar270.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rotar270ActionPerformed(evt);
            }
        });
        panelRotacion.add(Rotar270);

        BHerram.add(panelRotacion);

        panelEscala.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Escala"));
        panelEscala.setMaximumSize(new java.awt.Dimension(89, 50));
        panelEscala.setMinimumSize(new java.awt.Dimension(89, 50));
        panelEscala.setName(""); // NOI18N
        panelEscala.setPreferredSize(new java.awt.Dimension(89, 50));
        panelEscala.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, -4));

        Incrementar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/aumentar.png"))); // NOI18N
        Incrementar.setPreferredSize(new java.awt.Dimension(30, 30));
        Incrementar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncrementarActionPerformed(evt);
            }
        });
        panelEscala.add(Incrementar);

        Decrementar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/disminuir.png"))); // NOI18N
        Decrementar.setPreferredSize(new java.awt.Dimension(30, 30));
        Decrementar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecrementarActionPerformed(evt);
            }
        });
        panelEscala.add(Decrementar);

        BHerram.add(panelEscala);
        BHerram.add(Separador3);

        Seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/seleccion.png"))); // NOI18N
        Seleccionar.setFocusable(false);
        Seleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Seleccionar.setPreferredSize(new java.awt.Dimension(35, 35));
        Seleccionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        BHerram.add(Seleccionar);

        Relleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rellenar.png"))); // NOI18N
        Relleno.setFocusable(false);
        Relleno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Relleno.setPreferredSize(new java.awt.Dimension(35, 35));
        Relleno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Relleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenoActionPerformed(evt);
            }
        });
        BHerram.add(Relleno);

        Alisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/alisar.png"))); // NOI18N
        Alisar.setFocusable(false);
        Alisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Alisar.setPreferredSize(new java.awt.Dimension(35, 35));
        Alisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Alisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlisarActionPerformed(evt);
            }
        });
        BHerram.add(Alisar);

        Transparencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/transparencia.png"))); // NOI18N
        Transparencia.setFocusable(false);
        Transparencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Transparencia.setPreferredSize(new java.awt.Dimension(35, 35));
        Transparencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Transparencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransparenciaActionPerformed(evt);
            }
        });
        BHerram.add(Transparencia);

        Separador4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Separador4.setPreferredSize(new java.awt.Dimension(6, 40));
        BHerram.add(Separador4);

        ReproductorAudio.setMaximumSize(new java.awt.Dimension(200, 32767));
        ReproductorAudio.setMinimumSize(new java.awt.Dimension(200, 43));
        ReproductorAudio.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        PlayPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/play24x24.png"))); // NOI18N
        PlayPause.setEnabled(false);
        PlayPause.setFocusable(false);
        PlayPause.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PlayPause.setPreferredSize(new java.awt.Dimension(35, 35));
        PlayPause.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PlayPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayPauseActionPerformed(evt);
            }
        });
        ReproductorAudio.add(PlayPause);

        Stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stop24x24.png"))); // NOI18N
        Stop.setEnabled(false);
        Stop.setFocusable(false);
        Stop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Stop.setPreferredSize(new java.awt.Dimension(35, 35));
        Stop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });
        ReproductorAudio.add(Stop);

        Grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/record24x24.png"))); // NOI18N
        Grabar.setFocusable(false);
        Grabar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Grabar.setPreferredSize(new java.awt.Dimension(35, 35));
        Grabar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrabarActionPerformed(evt);
            }
        });
        ReproductorAudio.add(Grabar);

        PlayList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PlayList.setMaximumSize(new java.awt.Dimension(100, 100));
        PlayList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PlayListItemStateChanged(evt);
            }
        });
        PlayList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlayListKeyPressed(evt);
            }
        });
        ReproductorAudio.add(PlayList);

        BHerram.add(ReproductorAudio);

        pruebas.setText("Pruebas");
        pruebas.setFocusable(false);
        pruebas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pruebas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pruebasActionPerformed(evt);
            }
        });
        BHerram.add(pruebas);

        getContentPane().add(BHerram, java.awt.BorderLayout.PAGE_START);

        panelInferior.setLayout(new java.awt.BorderLayout());

        panelEstado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        HerramientaAct.setText("Trazo libre ");
        panelEstado.add(HerramientaAct);

        panelInferior.add(panelEstado, java.awt.BorderLayout.CENTER);

        panelAjustes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        panelBrillo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Brillo"));
        panelBrillo.setMaximumSize(new java.awt.Dimension(124, 50));
        panelBrillo.setMinimumSize(new java.awt.Dimension(60, 50));
        panelBrillo.setPreferredSize(new java.awt.Dimension(124, 50));
        panelBrillo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, -2));

        brillo.setMaximum(250);
        brillo.setMinimum(-250);
        brillo.setValue(0);
        brillo.setPreferredSize(new java.awt.Dimension(100, 26));
        brillo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                brilloStateChanged(evt);
            }
        });
        brillo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                brilloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                brilloFocusLost(evt);
            }
        });
        panelBrillo.add(brillo);

        panelAjustes.add(panelBrillo);

        panelEfectos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Efectos"));
        panelEfectos.setMinimumSize(new java.awt.Dimension(104, 50));
        panelEfectos.setPreferredSize(new java.awt.Dimension(104, 50));
        panelEfectos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, -2));

        Efectos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Media", "Binomial", "Enfoque", "Relieve", "Laplaciano " }));
        Efectos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EfectosItemStateChanged(evt);
            }
        });
        panelEfectos.add(Efectos);

        panelAjustes.add(panelEfectos);

        panelContraste.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Contraste"));
        panelContraste.setMinimumSize(new java.awt.Dimension(181, 50));
        panelContraste.setPreferredSize(new java.awt.Dimension(124, 50));
        panelContraste.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, -4));

        Contraste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/contraste.png"))); // NOI18N
        Contraste.setPreferredSize(new java.awt.Dimension(30, 30));
        Contraste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasteActionPerformed(evt);
            }
        });
        panelContraste.add(Contraste);

        Iluminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iluminar.png"))); // NOI18N
        Iluminar.setPreferredSize(new java.awt.Dimension(30, 30));
        Iluminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IluminarActionPerformed(evt);
            }
        });
        panelContraste.add(Iluminar);

        Oscurecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/oscurecer.png"))); // NOI18N
        Oscurecer.setPreferredSize(new java.awt.Dimension(30, 30));
        Oscurecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OscurecerActionPerformed(evt);
            }
        });
        panelContraste.add(Oscurecer);

        panelAjustes.add(panelContraste);

        panelSeno.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Filtros"));
        panelSeno.setMinimumSize(new java.awt.Dimension(337, 50));
        panelSeno.setPreferredSize(new java.awt.Dimension(244, 50));
        panelSeno.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, -4));

        FuncionSeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sinusoidal.png"))); // NOI18N
        FuncionSeno.setPreferredSize(new java.awt.Dimension(40, 30));
        FuncionSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionSenoActionPerformed(evt);
            }
        });
        panelSeno.add(FuncionSeno);

        Sepia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sepia.png"))); // NOI18N
        Sepia.setPreferredSize(new java.awt.Dimension(40, 30));
        Sepia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SepiaActionPerformed(evt);
            }
        });
        panelSeno.add(Sepia);

        Tintar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tintar.png"))); // NOI18N
        Tintar.setPreferredSize(new java.awt.Dimension(40, 30));
        Tintar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TintarActionPerformed(evt);
            }
        });
        panelSeno.add(Tintar);

        Ecualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ecualizar.png"))); // NOI18N
        Ecualizar.setPreferredSize(new java.awt.Dimension(40, 30));
        Ecualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcualizarActionPerformed(evt);
            }
        });
        panelSeno.add(Ecualizar);

        Negativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/negativo_24x24.png"))); // NOI18N
        Negativo.setPreferredSize(new java.awt.Dimension(40, 30));
        Negativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegativoActionPerformed(evt);
            }
        });
        panelSeno.add(Negativo);

        panelAjustes.add(panelSeno);

        espColor.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Color"));
        espColor.setMinimumSize(new java.awt.Dimension(137, 50));
        espColor.setPreferredSize(new java.awt.Dimension(137, 50));
        espColor.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, -4));

        SplitBands.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/bandas.png"))); // NOI18N
        SplitBands.setPreferredSize(new java.awt.Dimension(40, 30));
        SplitBands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SplitBandsActionPerformed(evt);
            }
        });
        espColor.add(SplitBands);

        EspacioColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RGB", "YCC", "GREY" }));
        EspacioColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EspacioColorItemStateChanged(evt);
            }
        });
        espColor.add(EspacioColor);

        panelAjustes.add(espColor);

        panelUmbral.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Umbralizacion"));
        panelUmbral.setMinimumSize(new java.awt.Dimension(58, 50));
        panelUmbral.setPreferredSize(new java.awt.Dimension(124, 50));
        panelUmbral.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, -2));

        Umbral.setMaximum(255);
        Umbral.setValue(127);
        Umbral.setPreferredSize(new java.awt.Dimension(100, 26));
        Umbral.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                UmbralStateChanged(evt);
            }
        });
        Umbral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UmbralFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UmbralFocusLost(evt);
            }
        });
        panelUmbral.add(Umbral);

        panelAjustes.add(panelUmbral);

        panelInferior.add(panelAjustes, java.awt.BorderLayout.NORTH);

        getContentPane().add(panelInferior, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setToolTipText("");
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 130));

        ListaFiguras.setCellRenderer(new LayerRender());
        ListaFiguras.setBackground(new java.awt.Color(240, 240, 240));
        ListaFiguras.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Figuras"));
        ListaFiguras.setSelectionForeground(new java.awt.Color(240, 240, 240));
        ListaFiguras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ListaFigurasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(ListaFiguras);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.LINE_END);

        jPanel2.setMaximumSize(new java.awt.Dimension(50, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(50, 33));
        jPanel2.setPreferredSize(new java.awt.Dimension(50, 100));

        Herramientas.add(Lapiz);
        Lapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        Lapiz.setSelected(true);
        Lapiz.setFocusable(false);
        Lapiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lapiz.setPreferredSize(new java.awt.Dimension(35, 35));
        Lapiz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Lapiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LapizActionPerformed(evt);
            }
        });
        jPanel2.add(Lapiz);

        Herramientas.add(Linea);
        Linea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/linea.png"))); // NOI18N
        Linea.setFocusable(false);
        Linea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Linea.setPreferredSize(new java.awt.Dimension(35, 35));
        Linea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineaActionPerformed(evt);
            }
        });
        jPanel2.add(Linea);

        Herramientas.add(Rectangulo);
        Rectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rectangulo.png"))); // NOI18N
        Rectangulo.setFocusable(false);
        Rectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Rectangulo.setPreferredSize(new java.awt.Dimension(35, 35));
        Rectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectanguloActionPerformed(evt);
            }
        });
        jPanel2.add(Rectangulo);

        Herramientas.add(Ovalo);
        Ovalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/elipse.png"))); // NOI18N
        Ovalo.setFocusable(false);
        Ovalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ovalo.setPreferredSize(new java.awt.Dimension(35, 35));
        Ovalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Ovalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvaloActionPerformed(evt);
            }
        });
        jPanel2.add(Ovalo);

        Herramientas.add(Abanico);
        Abanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abanico.png"))); // NOI18N
        Abanico.setToolTipText("");
        Abanico.setFocusable(false);
        Abanico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Abanico.setPreferredSize(new java.awt.Dimension(35, 35));
        Abanico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Abanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbanicoActionPerformed(evt);
            }
        });
        jPanel2.add(Abanico);

        jSeparator1.setMaximumSize(new java.awt.Dimension(50, 10));
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel2.add(jSeparator1);

        trazolbl.setText("Trazo");
        jPanel2.add(trazolbl);

        ColorTrazo.setBackground(new java.awt.Color(0, 0, 0));
        ColorTrazo.setPreferredSize(new java.awt.Dimension(30, 30));
        ColorTrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorTrazoActionPerformed(evt);
            }
        });
        jPanel2.add(ColorTrazo);

        rellenolbl.setText("Relleno");
        jPanel2.add(rellenolbl);

        ColorRelleno.setBackground(new java.awt.Color(0, 0, 0));
        ColorRelleno.setPreferredSize(new java.awt.Dimension(30, 30));
        ColorRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorRellenoActionPerformed(evt);
            }
        });
        jPanel2.add(ColorRelleno);

        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);
        getContentPane().add(Escritorio, java.awt.BorderLayout.CENTER);

        Archivo.setText("Archivo");

        BNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        BNuevo.setText("Nuevo");
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });
        Archivo.add(BNuevo);

        BAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        BAbrir.setText("Abrir");
        BAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAbrirActionPerformed(evt);
            }
        });
        Archivo.add(BAbrir);

        BGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });
        Archivo.add(BGuardar);

        BarraMenu.add(Archivo);

        Editar.setText("Editar");

        Copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Copiar.setText("Copiar");
        Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarActionPerformed(evt);
            }
        });
        Editar.add(Copiar);

        Transformar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        Transformar.setText("Transformar");
        Transformar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransformarActionPerformed(evt);
            }
        });
        Editar.add(Transformar);

        BarraMenu.add(Editar);

        Ver.setText("Ver");

        VerBGeneral.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        VerBGeneral.setSelected(true);
        VerBGeneral.setText("Barra general");
        VerBGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBGeneralActionPerformed(evt);
            }
        });
        Ver.add(VerBGeneral);

        VerBProcesado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        VerBProcesado.setSelected(true);
        VerBProcesado.setText("Barra de procesamiento");
        VerBProcesado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBProcesadoActionPerformed(evt);
            }
        });
        Ver.add(VerBProcesado);

        VerBEstado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        VerBEstado.setSelected(true);
        VerBEstado.setText("Barra de estado");
        VerBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBEstadoActionPerformed(evt);
            }
        });
        Ver.add(VerBEstado);

        VerAudio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        VerAudio.setSelected(true);
        VerAudio.setText("Reproductor de audio");
        VerAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerAudioActionPerformed(evt);
            }
        });
        Ver.add(VerAudio);

        BarraMenu.add(Ver);

        Ayuda.setText("Ayuda");

        AcercaD.setText("Acerca de");
        AcercaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaDActionPerformed(evt);
            }
        });
        Ayuda.add(AcercaD);

        BarraMenu.add(Ayuda);

        setJMenuBar(BarraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void LapizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LapizActionPerformed
        VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            Lienzo2D lienzo = ventana.getLienzo();
            lienzo.setTipo(Tipo.TRAZO);
            this.HerramientaAct.setText("Trazo libre ");
        }
    }//GEN-LAST:event_LapizActionPerformed

    private void LineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineaActionPerformed
        VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            Lienzo2D lienzo = ventana.getLienzo();
            lienzo.setTipo(Tipo.LINEA);
            this.HerramientaAct.setText("Línea ");
        }
    }//GEN-LAST:event_LineaActionPerformed

    private void RectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectanguloActionPerformed
        VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            Lienzo2D lienzo = ventana.getLienzo();
            lienzo.setTipo(Tipo.RECTANGULO);
            this.HerramientaAct.setText("Rectángulo ");
        }
    }//GEN-LAST:event_RectanguloActionPerformed

    private void OvaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvaloActionPerformed
        VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            Lienzo2D lienzo = ventana.getLienzo();
            lienzo.setTipo(Tipo.OVALO);
            this.HerramientaAct.setText("Óvalo ");
        }
    }//GEN-LAST:event_OvaloActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        this.NuevoActionPerformed(evt);
    }//GEN-LAST:event_BNuevoActionPerformed

    private void AbanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbanicoActionPerformed
        VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            Lienzo2D lienzo = ventana.getLienzo();
            lienzo.setTipo(Tipo.ABANICO);
            this.HerramientaAct.setText("Abanica tu vida ");
        }
    }//GEN-LAST:event_AbanicoActionPerformed

    private void ListaColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaColoresActionPerformed
        switch(ListaColores.getSelectedIndex()){
            case 0:
                selectedColor = Color.black;
                break;
            case 1:
                selectedColor = Color.green;
                break;
            case 2:
                selectedColor = Color.yellow;
                break;
            case 3:
                selectedColor = Color.blue;
                break;
            case 4:
                selectedColor = Color.red;
                break;
            case 5:
                selectedColor = Color.white;
                break;
        }
    }//GEN-LAST:event_ListaColoresActionPerformed

    private void TransparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransparenciaActionPerformed
        VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            Lienzo2D lienzo = ventana.getLienzo();
            lienzo.setTransparencia(Transparencia.isSelected());
        }
    }//GEN-LAST:event_TransparenciaActionPerformed

    private void RellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenoActionPerformed
        VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            Lienzo2D lienzo = ventana.getLienzo();
            lienzo.setRelleno(Relleno.isSelected());
        }
        else
            Relleno.setSelected(false);
    }//GEN-LAST:event_RellenoActionPerformed

    private void AlisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlisarActionPerformed
        VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            Lienzo2D lienzo = ventana.getLienzo();
            lienzo.setRenderizado(Alisar.isSelected());
        }
    }//GEN-LAST:event_AlisarActionPerformed

    private void TrazoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TrazoStateChanged
        VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            Lienzo2D lienzo = ventana.getLienzo();
            float trazo = Float.parseFloat(this.Trazo.getValue().toString());
            lienzo.setTrazo(trazo);
        }
    }//GEN-LAST:event_TrazoStateChanged

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        /*VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            Lienzo2D lienzo = ventana.getLienzo();
            lienzo.setEdicion();
            this.HerramientaAct.setText("Seleccionar");
        }*/
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        VentanaInterna ventana = new VentanaInterna(this);
        this.Escritorio.add(ventana);
        ventana.setTitle("nueva");
        ventana.setVisible(true);
        
        BufferedImage imagen;
        imagen = new BufferedImage(300,300,BufferedImage.TYPE_INT_ARGB);
        ventana.getLienzo().setImagen(imagen);
    }//GEN-LAST:event_NuevoActionPerformed

    private void brilloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brilloFocusGained
        VentanaInterna ventana = (VentanaInterna)(Escritorio.getSelectedFrame());
        if(ventana!=null){
            ColorModel cm = ventana.getLienzo().getImagen(false).getColorModel();
            WritableRaster raster = ventana.getLienzo().getImagen(false).copyData(null);
            boolean alfaPre = ventana.getLienzo().getImagen(false).isAlphaPremultiplied();
            imagen = new BufferedImage(cm,raster,alfaPre,null);
        }
    }//GEN-LAST:event_brilloFocusGained

    private void brilloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brilloFocusLost
        imagen = null;
    }//GEN-LAST:event_brilloFocusLost

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        
        dlg.addChoosableFileFilter(new FileFilterExtension(".wav", "WAVE form audio file format"));
        dlg.addChoosableFileFilter(new FileFilterExtension(".jpg", "Joint Photographic Expert Group"));
        dlg.addChoosableFileFilter(new FileFilterExtension(".png", "Portable Network Graphics"));
        
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = new File(dlg.getSelectedFile().getAbsolutePath()){
                @Override
                public String toString(){
                    return this.getName();
                }
            };
            if (f.getName().endsWith(".wav")){
                PlayList.addItem(f);
            }
            else{
                if(f.getName().endsWith(".jpg") || f.getName().endsWith(".png")){
                    try{
                        BufferedImage img = ImageIO.read(f);
                        VentanaInterna ventana = new VentanaInterna(this);
                        ventana.getLienzo().setImagen(img);
                        this.Escritorio.add(ventana);
                        ventana.setTitle(f.getName() + " [RGB]");
                        ventana.setVisible(true);
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(this, "Error al leer la imagen", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Tipo de archivo no reconocido", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_AbrirActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        VentanaInterna ventana=(VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null) {
            JFileChooser dlg = new JFileChooser();
            dlg.addChoosableFileFilter(new FileFilterExtension(".jpg", "Joint Photographic Expert Group"));
            dlg.addChoosableFileFilter(new FileFilterExtension(".png", "Portable Network Graphics"));
            
            int resp = dlg.showSaveDialog(this);
            if (resp == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedImage img = ventana.getLienzo().getImagen(true);
                    if (img != null) {
                        File f = dlg.getSelectedFile();
                        switch(((FileFilterExtension)dlg.getFileFilter()).getExtension()){//********************************************************************************
                            case ".jpg":
                                ImageIO.write(img, "jpg", f);
                                break;
                            case ".png":
                                ImageIO.write(img, "png", f);
                                break;
                            default:
                                throw new Exception();
                        }
                        ventana.setTitle(f.getName());
                    }
                }catch (Exception ex) {
                    System.err.println("Error al guardar la imagen");
                }
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void BAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAbrirActionPerformed
        this.AbrirActionPerformed(evt);
    }//GEN-LAST:event_BAbrirActionPerformed

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        this.GuardarActionPerformed(evt);
    }//GEN-LAST:event_BGuardarActionPerformed

    private void brilloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_brilloStateChanged
        VentanaInterna ventana = (VentanaInterna) (Escritorio.getSelectedFrame());
        if (ventana != null) {
            if(imagen!=null){
                try{
                    RescaleOp rop = new RescaleOp(1.0F, brillo.getValue(), null);
                    BufferedImage imgdest = rop.filter(imagen, ventana.getLienzo().getImagen(false));
                    ventana.getLienzo().setImagen(imgdest);
                    ventana.getLienzo().repaint();
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_brilloStateChanged

    private void EfectosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EfectosItemStateChanged
        VentanaInterna ventana = (VentanaInterna)(Escritorio.getSelectedFrame());
        Kernel k = KernelProducer.createKernel(0);
        ConvolveOp cop;
        
        if(ventana!=null){
            imagen = ventana.getLienzo().getImagen(true);
            if(imagen!=null){
                switch(Efectos.getSelectedIndex())
                {
                    case 0:
                        k = KernelProducer.createKernel(KernelProducer.TYPE_MEDIA_3x3);
                        break;
                    case 1:
                        k = KernelProducer.createKernel(KernelProducer.TYPE_BINOMIAL_3x3);
                        break;
                    case 2:
                        k = KernelProducer.createKernel(KernelProducer.TYPE_ENFOQUE_3x3);
                        break;
                    case 3:
                        k = KernelProducer.createKernel(KernelProducer.TYPE_RELIEVE_3x3);
                        break;
                    case 4:
                        k = KernelProducer.createKernel(KernelProducer.TYPE_LAPLACIANA_3x3);
                }

                cop = new ConvolveOp(k, ConvolveOp.EDGE_NO_OP, null);
                BufferedImage imgEdit = cop.filter(imagen, null);
                ventana.getLienzo().setImagen(imgEdit);
                repaint();
            }
        }
    }//GEN-LAST:event_EfectosItemStateChanged

    private void ContrasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasteActionPerformed
        FiltroContraste(LookupTableProducer.TYPE_SFUNCION);
    }//GEN-LAST:event_ContrasteActionPerformed

    private void IluminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IluminarActionPerformed
        FiltroContraste(LookupTableProducer.TYPE_LOGARITHM);
    }//GEN-LAST:event_IluminarActionPerformed

    private void OscurecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OscurecerActionPerformed
        FiltroContraste(LookupTableProducer.TYPE_POWER);
    }//GEN-LAST:event_OscurecerActionPerformed

    private void FuncionSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionSenoActionPerformed
        VentanaInterna ventana = (VentanaInterna)(Escritorio.getSelectedFrame());
        if (ventana != null){
            BufferedImage imgSource = ventana.getLienzo().getImagen(false);
            if (imgSource != null){
                try{
                    LookupOp lop = new LookupOp(Seno.filtroSeno(180.0), null);
                    lop.filter(imgSource, imgSource);
                    repaint();
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_FuncionSenoActionPerformed

    private void Rotar90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rotar90ActionPerformed
        rotarImagen(90);
    }//GEN-LAST:event_Rotar90ActionPerformed

    private void Rotar180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rotar180ActionPerformed
        rotarImagen(180);
    }//GEN-LAST:event_Rotar180ActionPerformed

    private void Rotar270ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rotar270ActionPerformed
        rotarImagen(270);
    }//GEN-LAST:event_Rotar270ActionPerformed

    private void RotacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RotacionStateChanged
        rotar(Rotacion.getValue(), imagen);
    }//GEN-LAST:event_RotacionStateChanged

    private void RotacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RotacionFocusGained
        VentanaInterna ventana = (VentanaInterna) this.Escritorio.getSelectedFrame();
        if(ventana != null)
            imagen = ventana.getLienzo().getImagen(false);
    }//GEN-LAST:event_RotacionFocusGained

    private void RotacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RotacionFocusLost
        imagen = null;
        Rotacion.setValue(0);
    }//GEN-LAST:event_RotacionFocusLost

    private void IncrementarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncrementarActionPerformed
        escalar(1.25);
    }//GEN-LAST:event_IncrementarActionPerformed

    private void DecrementarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecrementarActionPerformed
        escalar(0.75);
    }//GEN-LAST:event_DecrementarActionPerformed

    private void TintarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TintarActionPerformed
        VentanaInterna ventana = (VentanaInterna)(Escritorio.getSelectedFrame());
        if (ventana != null){
           BufferedImage imgSource = ventana.getLienzo().getImagen(false);
           if(imgSource!= null){
               TintOp tintado = new TintOp(selectedColor,0.5f);
               tintado.filter(imgSource, imgSource);
               repaint();
           }
        }
    }//GEN-LAST:event_TintarActionPerformed

    private void SepiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SepiaActionPerformed
        VentanaInterna ventana = (VentanaInterna)(Escritorio.getSelectedFrame());
        if (ventana != null){
           BufferedImage imgSource = ventana.getLienzo().getImagen(false);
           if(imgSource!= null){
               SepiaOp sepia = new SepiaOp();
               sepia.filter(imgSource, imgSource);
               repaint();
           }
        }
    }//GEN-LAST:event_SepiaActionPerformed

    private void EcualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EcualizarActionPerformed
        VentanaInterna ventana = (VentanaInterna)(Escritorio.getSelectedFrame());
        if (ventana != null){
           BufferedImage imgSource = ventana.getLienzo().getImagen(false);
           if(imgSource!= null){
               EqualizationOp ecualizacion = new EqualizationOp();
               ecualizacion.filter(imgSource, imgSource);
               repaint();
           }
        }
    }//GEN-LAST:event_EcualizarActionPerformed

    private void PlayPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayPauseActionPerformed
        if (player != null && player.isRunning()) {
            clipTime = player.getMicrosecondPosition();
            player.stop();
        }
        else {
            if (sonando != PlayList.getSelectedIndex() || clipTime == 0){
                try {
                    sonando = PlayList.getSelectedIndex();
                    File f = (File)PlayList.getSelectedItem();
                    player = AudioSystem.getClip();
                    player.open(AudioSystem.getAudioInputStream(f));
                    player.addLineListener(new ManejadorAudio());
                    player.start();
                } catch(Exception exception){
                    JOptionPane.showMessageDialog(this, "Error al reproducir el archivo de audio", "Error", JOptionPane.ERROR_MESSAGE);;}
            }
            else{
                player.setMicrosecondPosition(clipTime);
                player.start();
            }
        }
    }//GEN-LAST:event_PlayPauseActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        if (player != null) {
            player.stop();
            clipTime = 0;
            
            Stop.setEnabled(false);
        }
    }//GEN-LAST:event_StopActionPerformed

    private void GrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrabarActionPerformed
        if (recorder == null){
            recorded = new File("grabacion.wav");
            try{
                recorded.createNewFile();
                recorder = new SMSoundRecorder(recorded);
                //((SMSoundRecorder)recorder).addLineListener(new ManejadorAudio());
                recorder.record();
                Grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stopRecord24x24.png")));
            }catch (IOException ex){
                JOptionPane.showMessageDialog(this, "Error al grabar", "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VentanaPaint.class.getName()).log(Level.SEVERE, null, ex);}
        }
        else{
            recorder.stop();
            PlayList.addItem(recorded);
            Grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/record24x24.png")));
            recorder = null;
        }
    }//GEN-LAST:event_GrabarActionPerformed

    private void UmbralStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_UmbralStateChanged
        VentanaInterna ventana = (VentanaInterna) (Escritorio.getSelectedFrame());
        if (ventana != null) {
            if(imagen!=null){
                try{
                    UmbralizacionOp umbralizar = new UmbralizacionOp(Umbral.getValue());
                    umbralizar.filter(imagen, ventana.getLienzo().getImagen(false));
                    repaint();
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_UmbralStateChanged

    private void SplitBandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SplitBandsActionPerformed
        VentanaInterna ventana = (VentanaInterna)(Escritorio.getSelectedFrame());
        if (ventana != null){
           imagen = ventana.getLienzo().getImagen(false);
           if(imagen!= null){
                //Creamos el modelo de color de la nueva imagen basado en un espcio de color GRAY
                ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
                ComponentColorModel cm = new ComponentColorModel(cs, false, false, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
                
                for(int i=0; i < imagen.getRaster().getNumBands(); i++){
                    int bandaActual[] = {i}; 
                    WritableRaster bandRaster = (WritableRaster)imagen.getRaster().createWritableChild(0, 0, imagen.getWidth(), imagen.getHeight(), 0, 0, bandaActual);
                    BufferedImage imgBanda = new BufferedImage(cm, bandRaster, false, null);
                    
                    VentanaInterna VentanaBanda = new VentanaInterna(this);
                    VentanaBanda.setTitle(ventana.getTitle() + " [Banda " + i + "]");
                    VentanaBanda.getLienzo().setImagen(imgBanda);
                    Escritorio.add(VentanaBanda);
                    //bandWindow.assignParent(this);
                    VentanaBanda.setVisible(true);
                }
                repaint();
           }
        }
    }//GEN-LAST:event_SplitBandsActionPerformed

    private void EspacioColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EspacioColorItemStateChanged
        VentanaInterna ventana = (VentanaInterna) (Escritorio.getSelectedFrame());
        if(ventana != null){
            imagen = ventana.getLienzo().getImagen(false);
            
            if(imagen != null){
                ColorSpace cs = null;
                String space = "";
                switch(EspacioColor.getSelectedIndex()){
                    case 0:
                        if (!imagen.getColorModel().getColorSpace().isCS_sRGB() && imagen.getRaster().getNumBands() > 1){   
                            cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
                            space = "[RGB]";
                        }
                        break;
                    case 1:
                        if (imagen.getColorModel().getColorSpace().isCS_sRGB()){
                            cs = ColorSpace.getInstance(ColorSpace.CS_PYCC);
                            space = "[YCC]";
                        }
                        break;
                    case 2:
                        if (imagen.getRaster().getNumBands() > 1){   
                            cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
                            space = "[GRAY]";
                        }
                        break;
                }
                if(cs != null){
                    ColorConvertOp cop = new ColorConvertOp(cs, null);
                    BufferedImage imgdest = cop.filter(imagen, null);
                    VentanaInterna ventanaEC = new VentanaInterna(this);
                    ventanaEC.setTitle(ventana.getTitle() + space);
                    //newWindow.assignParent(this);
                    ventanaEC.getLienzo().setImagen(imgdest);
                    Escritorio.add(ventanaEC);
                    ventanaEC.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_EspacioColorItemStateChanged

    private void VerBGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBGeneralActionPerformed
        BHerram.setVisible(VerBGeneral.isSelected());
    }//GEN-LAST:event_VerBGeneralActionPerformed

    private void VerBProcesadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBProcesadoActionPerformed
        panelAjustes.setVisible(VerBProcesado.isSelected());
    }//GEN-LAST:event_VerBProcesadoActionPerformed

    private void VerBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBEstadoActionPerformed
        panelEstado.setVisible(VerBEstado.isSelected());
    }//GEN-LAST:event_VerBEstadoActionPerformed

    private void UmbralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UmbralFocusGained
        VentanaInterna ventana = (VentanaInterna) this.Escritorio.getSelectedFrame();
        if(ventana!=null){
           ColorModel cm = ventana.getLienzo().getImagen(false).getColorModel();
           WritableRaster raster = ventana.getLienzo().getImagen(false).copyData(null);
           boolean alfaPre = ventana.getLienzo().getImagen(false).isAlphaPremultiplied();
           imagen = new BufferedImage(cm,raster,alfaPre,null);
        }
    }//GEN-LAST:event_UmbralFocusGained

    private void UmbralFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UmbralFocusLost
        imagen = null;
        Umbral.setValue(128);
    }//GEN-LAST:event_UmbralFocusLost

    private void AcercaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaDActionPerformed
        JOptionPane.showMessageDialog(this, "Velazquez: dibujo, procesado y sonido\nVersion: 1.0\nAutor: Pablo Gervilla Palomar", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AcercaDActionPerformed

    private void PlayListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PlayListItemStateChanged
        if (!PlayPause.isEnabled()){
            PlayPause.setEnabled(true);
        }   
    }//GEN-LAST:event_PlayListItemStateChanged

    private void PlayListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlayListKeyPressed
        if(evt.getKeyCode() == 127){
            PlayList.removeItemAt(PlayList.getSelectedIndex());
        }
    }//GEN-LAST:event_PlayListKeyPressed

    private void NegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegativoActionPerformed
        VentanaInterna ventana = (VentanaInterna)(Escritorio.getSelectedFrame());
        if (ventana != null){
            BufferedImage imgSource = ventana.getLienzo().getImagen(false);
            if(imgSource!= null){
                NegativoOp negativo = new NegativoOp();
                negativo.filter(imgSource, imgSource);
                ventana.repaint();
            }
        }
        //FiltroContraste(LookupTableProducer.TYPE_NEGATIVE);
    }//GEN-LAST:event_NegativoActionPerformed

    private void CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarActionPerformed
        VentanaInterna ventana=(VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null) {
            BufferedImage img = ventana.getLienzo().getImagen(true);
            VentanaInterna nuevaVentana = new VentanaInterna(this);
            nuevaVentana.getLienzo().setImagen(img);
            this.Escritorio.add(nuevaVentana);
            nuevaVentana.setTitle("copia_" + ventana.getTitle());
            nuevaVentana.setVisible(true);
        }
    }//GEN-LAST:event_CopiarActionPerformed

    private void VerAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerAudioActionPerformed
        ReproductorAudio.setVisible(VerAudio.isSelected());
    }//GEN-LAST:event_VerAudioActionPerformed

    private void TransformarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransformarActionPerformed
        if (panelEscala.isVisible()){
            panelEscala.setVisible(Transformar.isSelected());
            panelRotacion.setVisible(Transformar.isSelected());
            Separador2.setVisible(Transformar.isSelected());
        }
        else{
        VentanaInterna ventana = (VentanaInterna) this.Escritorio.getSelectedFrame();
            if(ventana != null){
                imagen = ventana.getLienzo().getImagen(false);
                if(imagen != null){
                    panelEscala.setVisible(Transformar.isSelected());
                    panelRotacion.setVisible(Transformar.isSelected());
                    Separador2.setVisible(Transformar.isSelected());
                }
            }
        }
    }//GEN-LAST:event_TransformarActionPerformed

    private void pruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pruebasActionPerformed
        
        //mostrarDibujo();
    }//GEN-LAST:event_pruebasActionPerformed

    private void ColorTrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorTrazoActionPerformed
        VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            ventana.getLienzo().setColorTrazo(selectedColor);
        }
        ColorTrazo.setBackground(selectedColor);
        repaint();
    }//GEN-LAST:event_ColorTrazoActionPerformed

    private void ColorRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorRellenoActionPerformed
        VentanaInterna ventana = (VentanaInterna) Escritorio.getSelectedFrame();
        if (ventana != null){
            ventana.getLienzo().setColorRelleno(selectedColor);
        }
        ColorRelleno.setBackground(selectedColor);
        repaint();
    }//GEN-LAST:event_ColorRellenoActionPerformed

    private void ListaFigurasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaFigurasMousePressed
        VentanaInterna ventana = (VentanaInterna)(Escritorio.getSelectedFrame());
        
        if (ventana != null && !ListaFiguras.isSelectionEmpty()){
            //System.out.println("He seleccionado: " + ListaFiguras.getSelectedIndex());
            //System.out.println("Estaba seleccionado: " + ventana.getLienzo().getIndexFiguraSelec());
            if (ListaFiguras.isSelectedIndex(ventana.getLienzo().getIndexFiguraSelec()) ){
                //System.out.println("entre");
                ventana.getLienzo().setIndexFiguraSelec(-1);
                //System.out.println("A tomar por culo: " + ventana.getLienzo().getIndexFiguraSelec());
                ventana.getLienzo().setEdicion(false);
                ventana.getLienzo().setMarco(null);
            }
            else{
                ventana.getLienzo().setIndexFiguraSelec(ListaFiguras.getSelectedIndex());
                FiguraPro figuraSelect = ventana.getLienzo().getFiguraSelec(ListaFiguras.getSelectedIndex());
                if(figuraSelect != null){
                    ventana.getLienzo().setMarco(figuraSelect.getBounds());
                    ventana.getLienzo().setEdicion(true);
                }
            }
        }
    }//GEN-LAST:event_ListaFigurasMousePressed
    
    private void FiltroContraste(int tipo){
        VentanaInterna ventana = (VentanaInterna) (this.Escritorio.getSelectedFrame());
        if (ventana != null){
           BufferedImage imgSource = ventana.getLienzo().getImagen(false);
           if(imgSource!=null){
               try{
                   LookupTable lt = LookupTableProducer.createLookupTable(tipo);
                   LookupOp lop = new LookupOp(lt, null);
                   // Imagen origen y destino iguales
                   lop.filter(imgSource , imgSource);
                   repaint();
               }
               catch(Exception e){
                   JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
               }
           }
        }
    }
    
    private void rotar(double grados, BufferedImage imagen){
        VentanaInterna ventana = (VentanaInterna) this.Escritorio.getSelectedFrame();
        
        double r = Math.toRadians(grados);
        Point p = new Point(imagen.getWidth()/2, imagen.getHeight()/2);
        AffineTransform at = AffineTransform.getRotateInstance(r,p.x,p.y);
        AffineTransformOp atop;
        atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
        BufferedImage imgdest = atop.filter(imagen, null);
        ventana.getLienzo().setImagen(imgdest);
        repaint();
    }
    
    private void rotarImagen(double grados){
        VentanaInterna ventana = (VentanaInterna) this.Escritorio.getSelectedFrame();
        imagen = ventana.getLienzo().getImagen(false);
        rotar(grados, imagen);
    }
    
    private void escalar (double escala){
        VentanaInterna ventana = (VentanaInterna) this.Escritorio.getSelectedFrame();
        imagen = ventana.getLienzo().getImagen(false);
        
        AffineTransform at = AffineTransform.getScaleInstance(escala, escala);
        AffineTransformOp atop;
        atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
        BufferedImage imgdest = atop.filter(imagen, null);
        ventana.getLienzo().setImagen(imgdest);
        repaint();
            
    }
    
    private void mostrarVentana (String titulo, int tipo){
        
    }
    
    private void mostrarDibujo(){
        VentanaInterna nuevaVentana = new VentanaInterna(this);
        if(((VentanaInterna)Escritorio.getSelectedFrame()) != null){
            nuevaVentana.getLienzo().setImagen(((VentanaInterna)Escritorio.getSelectedFrame()).getLienzo().getImagen(true));
            Escritorio.add(nuevaVentana);
            nuevaVentana.setVisible(true);
        }
    }
    
    protected void cargarLista(){
        if(vFigura.isEmpty()){
            DefaultListModel dlm = new DefaultListModel();
            dlm.clear();
            ListaFiguras.setModel(dlm);
        }
        else{
            DefaultListModel dlm = new DefaultListModel();
            for (FiguraPro f:vFigura){
                dlm.addElement(f);
            }
            ListaFiguras.setModel(dlm);
        }
    }
    
    class ManejadorAudio implements LineListener {
        @Override
        public void update(LineEvent event) {
            if (event.getType() == LineEvent.Type.START) {
                PlayPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pausa24x24.png")));
                Grabar.setEnabled(false);
                Stop.setEnabled(true);
            }
            if (event.getType() == LineEvent.Type.STOP) {
                PlayPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/play24x24.png")));
                Grabar.setEnabled(true);
            }
            if (event.getType() == LineEvent.Type.CLOSE) {
            }
        }
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    
    private BufferedImage imagen;
    Color selectedColor = Color.BLACK;
    //private SMPlayer player = null;
    private Clip player = null;
    long clipTime = 0;
    int sonando;
    SMRecorder recorder = null;
    File recorded;
    ArrayList<FiguraPro> vFigura = new ArrayList();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Abanico;
    private javax.swing.JButton Abrir;
    private javax.swing.JMenuItem AcercaD;
    private javax.swing.JToggleButton Alisar;
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuItem BAbrir;
    private javax.swing.JMenuItem BGuardar;
    private javax.swing.JToolBar BHerram;
    private javax.swing.JMenuItem BNuevo;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton ColorRelleno;
    private javax.swing.JButton ColorTrazo;
    private javax.swing.JButton Contraste;
    private javax.swing.JMenuItem Copiar;
    private javax.swing.JButton Decrementar;
    private javax.swing.JButton Ecualizar;
    private javax.swing.JMenu Editar;
    private javax.swing.JComboBox<String> Efectos;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JComboBox<String> EspacioColor;
    private javax.swing.JButton FuncionSeno;
    private javax.swing.JButton Grabar;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel HerramientaAct;
    private javax.swing.ButtonGroup Herramientas;
    private javax.swing.JButton Iluminar;
    private javax.swing.JButton Incrementar;
    private javax.swing.JToggleButton Lapiz;
    private javax.swing.JToggleButton Linea;
    private javax.swing.JComboBox<Color> ListaColores;
    private javax.swing.JList<FiguraPro> ListaFiguras;
    private javax.swing.JButton Negativo;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton Oscurecer;
    private javax.swing.JToggleButton Ovalo;
    private javax.swing.JComboBox<File> PlayList;
    private javax.swing.JButton PlayPause;
    private javax.swing.JToggleButton Rectangulo;
    private javax.swing.JToggleButton Relleno;
    private javax.swing.JPanel ReproductorAudio;
    private javax.swing.JSlider Rotacion;
    private javax.swing.JButton Rotar180;
    private javax.swing.JButton Rotar270;
    private javax.swing.JButton Rotar90;
    private javax.swing.JToggleButton Seleccionar;
    private javax.swing.JToolBar.Separator Separador1;
    private javax.swing.JToolBar.Separator Separador2;
    private javax.swing.JToolBar.Separator Separador3;
    private javax.swing.JToolBar.Separator Separador4;
    private javax.swing.JButton Sepia;
    private javax.swing.JButton SplitBands;
    private javax.swing.JButton Stop;
    private javax.swing.JButton Tintar;
    private javax.swing.JCheckBoxMenuItem Transformar;
    private javax.swing.JToggleButton Transparencia;
    private javax.swing.JSpinner Trazo;
    private javax.swing.JSlider Umbral;
    private javax.swing.JMenu Ver;
    private javax.swing.JCheckBoxMenuItem VerAudio;
    private javax.swing.JCheckBoxMenuItem VerBEstado;
    private javax.swing.JCheckBoxMenuItem VerBGeneral;
    private javax.swing.JCheckBoxMenuItem VerBProcesado;
    private javax.swing.JSlider brillo;
    private javax.swing.JPanel espColor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelAjustes;
    private javax.swing.JPanel panelBrillo;
    private javax.swing.JPanel panelContraste;
    private javax.swing.JPanel panelEfectos;
    private javax.swing.JPanel panelEscala;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelRotacion;
    private javax.swing.JPanel panelSeno;
    private javax.swing.JPanel panelUmbral;
    private javax.swing.JButton pruebas;
    private javax.swing.JLabel rellenolbl;
    private javax.swing.JLabel trazolbl;
    // End of variables declaration//GEN-END:variables
}
