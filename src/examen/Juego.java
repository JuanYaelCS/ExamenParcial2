
package examen;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Juego extends JFrame implements ActionListener {
    String simb = "X",xoy="";
    int derecha,abajo;
    JButton g1,g2,g3,g4,g5,g6,g7,g8,g9;
    JButton g11,g12,g13,g14,g15,g16,g17,g18,g19;
    String elec ="";
       
    public Juego(){
    getContentPane().setLayout(null);
    setTitle("Gato de Gatos");
    
        
        g1 = new JButton("1");
        g1.setBounds(0,0,333,333);
        g1.setFont(new Font("arial",Font.BOLD,100));
        add(g1);
        g1.addActionListener(this);
        
        g2 = new JButton("2");
        g2.setBounds(333,0,333,333);
        g2.setFont(new Font("arial",Font.BOLD,100));
        add(g2);
        g2.addActionListener(this);
        
        
        g3 = new JButton("3");
        g3.setBounds(666,0,333,333);
        g3.setFont(new Font("arial",Font.BOLD,100));
        add(g3);
        g3.addActionListener(this);
        
        g4 = new JButton("4");
        g4.setBounds(0,333,333,333);
        g4.setFont(new Font("arial",Font.BOLD,100));
        add(g4);
        g4.addActionListener(this);
        
        g5 = new JButton("5");
        g5.setBounds(333,333,333,333);
        g5.setFont(new Font("arial",Font.BOLD,100));
        add(g5);
        g5.addActionListener(this);
        
        g6 = new JButton("6");
        g6.setBounds(666,333,333,333);
        g6.setFont(new Font("arial",Font.BOLD,100));
        add(g6);
        g6.addActionListener(this);
        
        g7 = new JButton("7");
        g7.setBounds(0,666,333,333);
        g7.setFont(new Font("arial",Font.BOLD,100));
        add(g7);
        g7.addActionListener(this);
        
        g8 = new JButton("8");
        g8.setBounds(333,666,333,333);
        g8.setFont(new Font("arial",Font.BOLD,100));
        add(g8);
        g8.addActionListener(this);
        
        g9 = new JButton("9");
        g9.setBounds(666,666,333,333);
        g9.setFont(new Font("arial",Font.BOLD,100));
        add(g9);
        g9.addActionListener(this); 
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,999,999);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        
         JOptionPane.showMessageDialog(null, "Elige un juego");
    }
    
    
    
        
    @Override
    public void actionPerformed(ActionEvent e) {
	
    if(e.getSource()==g1){
        
        if((g1.getText()!="X")&&(g1.getText()!="O")){
            
         if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        JOptionPane.showMessageDialog(null, "Elegiste el juego 1"+
                                            "\nInicia: "+simb);
         if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        g1.setVisible(false);
        this.derecha = 0;
        this.abajo=0;
        
        dibujodegatochico();
        this.elec="1";
       
        }else{
             JOptionPane.showMessageDialog(null, "Este juego ya lo gano "+g1.getText());
        
        
        }
    }
    if(e.getSource()==g2){
        if((g2.getText()!="X")&&(g2.getText()!="O")){
             if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        
        JOptionPane.showMessageDialog(null, "Elegiste el juego 2"+
                                            "\nInicia: "+simb);
         if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        g2.setVisible(false);
        this.derecha = 333;
        this.abajo=0;
        dibujodegatochico();
        this.elec="2";
       
        }else{
             JOptionPane.showMessageDialog(null, "Este juego ya lo gano "+g2.getText());
        
        
        }
        
    }
    if(e.getSource()==g3){
        if((g3.getText()!="X")&&(g3.getText()!="O")){
            
         if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        JOptionPane.showMessageDialog(null, "Elegiste el juego 3"+
                                            "\nInicia: "+simb);
         if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        g3.setVisible(false);
        this.derecha = 666;
        this.abajo=0;
        dibujodegatochico();
        this.elec="3";
       
        }else{
             JOptionPane.showMessageDialog(null, "Este juego ya lo gano "+g3.getText());
        
        
        
        }
    }
    if(e.getSource()==g4){
        if((g4.getText()!="X")&&(g4.getText()!="O")){
             if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        JOptionPane.showMessageDialog(null, "Elegiste el juego 4"+
                                            "\nInicia: "+simb);
         if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        g4.setVisible(false);
        this.derecha = 0;
        this.abajo=333;
        dibujodegatochico();
        this.elec="4";
        
        }else{
        JOptionPane.showMessageDialog(null, "Este juego ya lo gano "+g4.getText());
        }
        
    }
    if(e.getSource()==g5){
        if((g5.getText()!="X")&&(g5.getText()!="O")){
             if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        JOptionPane.showMessageDialog(null, "Elegiste el juego 5"+
                                            "\nInicia:"+simb);
         if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        g5.setVisible(false);
        this.derecha = 333;
        this.abajo=333;
        dibujodegatochico();
        this.elec="5";
        
        }else{
        JOptionPane.showMessageDialog(null, "Este juego ya lo gano "+g5.getText());
        }
        
    }
    if(e.getSource()==g6){
        if((g6.getText()!="X")&&(g6.getText()!="O")){
             if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        JOptionPane.showMessageDialog(null, "Elegiste el juego 6"+
                                            "\nInicia: "+simb);
         if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        g6.setVisible(false);
        this.derecha = 666;
        this.abajo=333;
        dibujodegatochico();
        this.elec="6";
        
        }else{
        JOptionPane.showMessageDialog(null, "Este juego ya lo gano "+g6.getText());
        }
        
    }
    if(e.getSource()==g7){
        if((g7.getText()!="X")&&(g7.getText()!="O")){
             if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        JOptionPane.showMessageDialog(null, "Elegiste el juego 7"+
                                            "\nInicia: "+simb);
         if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        g7.setVisible(false);
        this.derecha = 0;
        this.abajo=666;
        dibujodegatochico();
        this.elec="7";
        
        }else{
        JOptionPane.showMessageDialog(null, "Este juego ya lo gano "+g7.getText());
        }
        
    }
    if(e.getSource()==g8){
        if((g8.getText()!="X")&&(g8.getText()!="O")){
             if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        JOptionPane.showMessageDialog(null, "Elegiste el juego 8"+
                                            "\nInicia: "+simb);
         if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        g8.setVisible(false);
        this.derecha = 333;
        this.abajo=666;

        dibujodegatochico();
        this.elec="8";
  
        }else{
        JOptionPane.showMessageDialog(null, "Este juego ya lo gano "+g8.getText());
        }
        
    }
    if(e.getSource()==g9){
        if((g9.getText()!="X")&&(g9.getText()!="O")){
             if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        JOptionPane.showMessageDialog(null, "Elegiste el juego 9"+
                                            "\nInicia: "+simb);
         if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
        g9.setVisible(false);
        this.derecha = 666;
        this.abajo=666;
        dibujodegatochico();
        this.elec="9";
        
        }else{
        JOptionPane.showMessageDialog(null, "Este juego ya lo gano "+g9.getText());
        }
        
    }
    
        
        
        if(e.getSource()==g11){
             if((g11.getText()!="X")&&(g11.getText()!="O")){
            
             if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
            g11.setText(simb);
            verificar();
            verificar2();
            }else{
             JOptionPane.showMessageDialog(null, "Este lugar lo ocupa "+g11.getText());
        
        
        }
            
           
        }
        if(e.getSource()==g12){
            if((g12.getText()!="X")&&(g12.getText()!="O")){
            if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
            g12.setText(simb);
            verificar();
            verificar2();
            }else{
             JOptionPane.showMessageDialog(null, "Este lugar lo ocupa "+g12.getText());}
        }
        
        if(e.getSource()==g13){
            if((g13.getText()!="X")&&(g13.getText()!="O")){
            if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
            g13.setText(simb);
            verificar();
            verificar2();
            }else{
             JOptionPane.showMessageDialog(null, "Este lugar lo ocupa "+g13.getText());}
        }
        
        if(e.getSource()==g14){
            if((g14.getText()!="X")&&(g14.getText()!="O")){
            if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
            g14.setText(simb);
            verificar();
            verificar2();
            }else{
             JOptionPane.showMessageDialog(null, "Este lugar lo ocupa "+g14.getText());}
        }
        
        if(e.getSource()==g15){
            if((g15.getText()!="X")&&(g15.getText()!="O")){
            if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
            g15.setText(simb);
            verificar();
            verificar2();
            }else{
             JOptionPane.showMessageDialog(null, "Este lugar lo ocupa "+g15.getText());}
        }
        if(e.getSource()==g16){
            if((g16.getText()!="X")&&(g16.getText()!="O")){
            if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
            g16.setText(simb);
            verificar();
            verificar2();
            }else{
             JOptionPane.showMessageDialog(null, "Este lugar lo ocupa "+g16.getText());}
        }
        if(e.getSource()==g17){
            if((g17.getText()!="X")&&(g17.getText()!="O")){
            if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
            g17.setText(simb);
            verificar();
            verificar2();
           }else{
             JOptionPane.showMessageDialog(null, "Este lugar lo ocupa "+g17.getText());}
        }
        if(e.getSource()==g18){
            if((g18.getText()!="X")&&(g18.getText()!="O")){
            if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
            g18.setText(simb);
            verificar();
            verificar2();
            }else{
             JOptionPane.showMessageDialog(null, "Este lugar lo ocupa "+g18.getText());}
        }
        
        if(e.getSource()==g19){
            if((g19.getText()!="X")&&(g19.getText()!="O")){
            if(simb=="X"){
            this.simb="O";
            }else{
            this.simb = "X";
            }
            g19.setText(simb);
            verificar();
            verificar2();
            }else{
             JOptionPane.showMessageDialog(null, "Este lugar lo ocupa "+g19.getText());}
        }
        
        
        }

    

    private void dibujodegatochico() {
       
        //arriba
        g11 = new JButton("");
        g11.setBounds(derecha,abajo,111,111);
        add(g11);
        g11.addActionListener(this);
        
        
        g12 = new JButton("");
        g12.setBounds(derecha+111,abajo,111,111);
        add(g12);
        g12.addActionListener(this);
        
        
        g13 = new JButton("");
        g13.setBounds(derecha+222,abajo,111,111);
        add(g13);
        g13.addActionListener(this);
        
        //medio
        g14 = new JButton("");
        g14.setBounds(derecha,abajo+111,111,111);
        add(g14);
        g14.addActionListener(this);
        
        g15 = new JButton("");
        g15.setBounds(derecha+111,abajo+111,111,111);
        add(g15);
        g15.addActionListener(this);
        
        g16 = new JButton("");
        g16.setBounds(derecha+222,abajo+111,111,111);
        add(g16);
        g16.addActionListener(this);
        
        //abajo
        g17 = new JButton("");
        g17.setBounds(derecha,abajo+222,111,111);
        add(g17);
        g17.addActionListener(this);
        
        g18 = new JButton("");
        g18.setBounds(derecha+111,abajo+222,111,111);
        add(g18);
        g18.addActionListener(this);
        
        g19 = new JButton("");
        g19.setBounds(derecha+222,abajo+222,111,111);
        add(g19);
        g19.addActionListener(this); 
        
    }

    private void verificar() {
        if( (((g11.getText()==("X"))||(g11.getText()==("O")))||((g12.getText()==("X"))||(g12.getText()==("O"))))&&((g11.getText()==g12.getText())&&(g12.getText()==g13.getText()))){
            if(this.elec=="1"){
                g1.setText(g11.getText());
                g1.setVisible(true);
                }else{
                    if(this.elec=="2"){
                    g2.setText(g11.getText());
                    g2.setVisible(true);
                        }else{
                            if(this.elec=="3"){
                            g3.setText(g11.getText());
                            g3.setVisible(true);
                            }else{
                                if(this.elec=="4"){
                                g4.setText(g11.getText());
                                g4.setVisible(true);
                                }else{
                                    if(this.elec=="5"){
                                    g5.setText(g11.getText());
                                    g5.setVisible(true);
                                    }else{
                                        if(this.elec=="6"){
                                        g6.setText(g11.getText());
                                        g6.setVisible(true);
                                        }else{
                                            if(this.elec=="7"){
                                            g7.setText(g11.getText());
                                            g7.setVisible(true);
                                            }else{
                                                if(this.elec=="8"){
                                                g8.setText(g11.getText());
                                                g8.setVisible(true);
                                                }else{
                                                    if(this.elec=="9"){
                                                    g9.setText(g11.getText());
                                                    g9.setVisible(true);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
         
            }else{
            
            if( (((g11.getText()==("X"))||(g11.getText()==("O")))||((g14.getText()==("X"))||(g14.getText()==("O"))))&&((g11.getText()==g14.getText())&&(g14.getText()==g17.getText()))  ){
            if(this.elec=="1"){
                g1.setText(g11.getText());
                g1.setVisible(true);
                }else{
                    if(this.elec=="2"){
                    g2.setText(g11.getText());
                    g2.setVisible(true);
                        }else{
                            if(this.elec=="3"){
                            g3.setText(g11.getText());
                            g3.setVisible(true);
                            }else{
                                if(this.elec=="4"){
                                g4.setText(g11.getText());
                                g4.setVisible(true);
                                }else{
                                    if(this.elec=="5"){
                                    g5.setText(g11.getText());
                                    g5.setVisible(true);
                                    }else{
                                        if(this.elec=="6"){
                                        g6.setText(g11.getText());
                                        g6.setVisible(true);
                                        }else{
                                            if(this.elec=="7"){
                                            g7.setText(g11.getText());
                                            g7.setVisible(true);
                                            }else{
                                                if(this.elec=="8"){
                                                g8.setText(g11.getText());
                                                g8.setVisible(true);
                                                }else{
                                                    if(this.elec=="9"){
                                                    g9.setText(g11.getText());
                                                    g9.setVisible(true);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
          
            
                }else{
            if((((g15.getText()==("X"))||(g15.getText()==("O")))||((g12.getText()==("X"))||(g12.getText()==("O"))))&&((g15.getText()==g12.getText())&&(g12.getText()==g18.getText())) ){
            if(this.elec=="1"){
                g1.setText(g15.getText());
                g1.setVisible(true);
                }else{
                    if(this.elec=="2"){
                    g2.setText(g15.getText());
                    g2.setVisible(true);
                        }else{
                            if(this.elec=="3"){
                            g3.setText(g15.getText());
                            g3.setVisible(true);
                            }else{
                                if(this.elec=="4"){
                                g4.setText(g15.getText());
                                g4.setVisible(true);
                                }else{
                                    if(this.elec=="5"){
                                    g5.setText(g15.getText());
                                    g5.setVisible(true);
                                    }else{
                                        if(this.elec=="6"){
                                        g6.setText(g15.getText());
                                        g6.setVisible(true);
                                        }else{
                                            if(this.elec=="7"){
                                            g7.setText(g15.getText());
                                            g7.setVisible(true);
                                            }else{
                                                if(this.elec=="8"){
                                                g8.setText(g15.getText());
                                                g8.setVisible(true);
                                                }else{
                                                    if(this.elec=="9"){
                                                    g9.setText(g15.getText());
                                                    g9.setVisible(true);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
            
                }else{
            if((((g15.getText()==("X"))||(g15.getText()==("O")))||((g14.getText()==("X"))||(g14.getText()==("O"))))&&((g15.getText()==g14.getText())&&(g14.getText()==g16.getText())) ){
            if(this.elec=="1"){
                g1.setText(g15.getText());
                g1.setVisible(true);
                }else{
                    if(this.elec=="2"){
                    g2.setText(g15.getText());
                    g2.setVisible(true);
                        }else{
                            if(this.elec=="3"){
                            g3.setText(g15.getText());
                            g3.setVisible(true);
                            }else{
                                if(this.elec=="4"){
                                g4.setText(g15.getText());
                                g4.setVisible(true);
                                }else{
                                    if(this.elec=="5"){
                                    g5.setText(g15.getText());
                                    g5.setVisible(true);
                                    }else{
                                        if(this.elec=="6"){
                                        g6.setText(g15.getText());
                                        g6.setVisible(true);
                                        }else{
                                            if(this.elec=="7"){
                                            g7.setText(g15.getText());
                                            g7.setVisible(true);
                                            }else{
                                                if(this.elec=="8"){
                                                g8.setText(g15.getText());
                                                g8.setVisible(true);
                                                }else{
                                                    if(this.elec=="9"){
                                                    g9.setText(g15.getText());
                                                    g9.setVisible(true);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
            
                }else{
                if( (((g13.getText()==("X"))||(g13.getText()==("O")))||((g16.getText()==("X"))||(g16.getText()==("O"))))&&((g13.getText()==g16.getText())&&(g16.getText()==g19.getText()))){
                if(this.elec=="1"){
                g1.setText(g13.getText());
                g1.setVisible(true);
                }else{
                    if(this.elec=="2"){
                    g2.setText(g13.getText());
                    g2.setVisible(true);
                        }else{
                            if(this.elec=="3"){
                            g3.setText(g13.getText());
                            g3.setVisible(true);
                            }else{
                                if(this.elec=="4"){
                                g4.setText(g13.getText());
                                g4.setVisible(true);
                                }else{
                                    if(this.elec=="5"){
                                    g5.setText(g13.getText());
                                    g5.setVisible(true);
                                    }else{
                                        if(this.elec=="6"){
                                        g6.setText(g13.getText());
                                        g6.setVisible(true);
                                        }else{
                                            if(this.elec=="7"){
                                            g7.setText(g13.getText());
                                            g7.setVisible(true);
                                            }else{
                                                if(this.elec=="8"){
                                                g8.setText(g13.getText());
                                                g8.setVisible(true);
                                                }else{
                                                    if(this.elec=="9"){
                                                    g9.setText(g13.getText());
                                                    g9.setVisible(true);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
         
            }else{
                    if( (((g13.getText()==("X"))||(g13.getText()==("O")))||((g15.getText()==("X"))||(g15.getText()==("O"))))&&((g13.getText()==g15.getText())&&(g15.getText()==g17.getText()))){
                if(this.elec=="1"){
                g1.setText(g13.getText());
                g1.setVisible(true);
                }else{
                    if(this.elec=="2"){
                    g2.setText(g13.getText());
                    g2.setVisible(true);
                        }else{
                            if(this.elec=="3"){
                            g3.setText(g13.getText());
                            g3.setVisible(true);
                            }else{
                                if(this.elec=="4"){
                                g4.setText(g13.getText());
                                g4.setVisible(true);
                                }else{
                                    if(this.elec=="5"){
                                    g5.setText(g13.getText());
                                    g5.setVisible(true);
                                    }else{
                                        if(this.elec=="6"){
                                        g6.setText(g13.getText());
                                        g6.setVisible(true);
                                        }else{
                                            if(this.elec=="7"){
                                            g7.setText(g13.getText());
                                            g7.setVisible(true);
                                            }else{
                                                if(this.elec=="8"){
                                                g8.setText(g13.getText());
                                                g8.setVisible(true);
                                                }else{
                                                    if(this.elec=="9"){
                                                    g9.setText(g13.getText());
                                                    g9.setVisible(true);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
         
            }else{
                if( (((g19.getText()==("X"))||(g19.getText()==("O")))||((g18.getText()==("X"))||(g18.getText()==("O"))))&&((g19.getText()==g18.getText())&&(g18.getText()==g17.getText()))){
            if(this.elec=="1"){
                g1.setText(g19.getText());
                g1.setVisible(true);
                }else{
                    if(this.elec=="2"){
                    g2.setText(g19.getText());
                    g2.setVisible(true);
                        }else{
                            if(this.elec=="3"){
                            g3.setText(g19.getText());
                            g3.setVisible(true);
                            }else{
                                if(this.elec=="4"){
                                g4.setText(g19.getText());
                                g4.setVisible(true);
                                }else{
                                    if(this.elec=="5"){
                                    g5.setText(g19.getText());
                                    g5.setVisible(true);
                                    }else{
                                        if(this.elec=="6"){
                                        g6.setText(g19.getText());
                                        g6.setVisible(true);
                                        }else{
                                            if(this.elec=="7"){
                                            g7.setText(g19.getText());
                                            g7.setVisible(true);
                                            }else{
                                                if(this.elec=="8"){
                                                g8.setText(g19.getText());
                                                g8.setVisible(true);
                                                }else{
                                                    if(this.elec=="9"){
                                                    g9.setText(g19.getText());
                                                    g9.setVisible(true);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
         
            }else{
            if( (((g19.getText()==("X"))||(g19.getText()==("O")))||((g15.getText()==("X"))||(g15.getText()==("O"))))&&((g19.getText()==g15.getText())&&(g15.getText()==g11.getText()))){
            if(this.elec=="1"){
                g1.setText(g19.getText());
                g1.setVisible(true);
                }else{
                    if(this.elec=="2"){
                    g2.setText(g19.getText());
                    g2.setVisible(true);
                        }else{
                            if(this.elec=="3"){
                            g3.setText(g19.getText());
                            g3.setVisible(true);
                            }else{
                                if(this.elec=="4"){
                                g4.setText(g19.getText());
                                g4.setVisible(true);
                                }else{
                                    if(this.elec=="5"){
                                    g5.setText(g19.getText());
                                    g5.setVisible(true);
                                    }else{
                                        if(this.elec=="6"){
                                        g6.setText(g19.getText());
                                        g6.setVisible(true);
                                        }else{
                                            if(this.elec=="7"){
                                            g7.setText(g19.getText());
                                            g7.setVisible(true);
                                            }else{
                                                if(this.elec=="8"){
                                                g8.setText(g19.getText());
                                                g8.setVisible(true);
                                                }else{
                                                    if(this.elec=="9"){
                                                    g9.setText(g19.getText());
                                                    g9.setVisible(true);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
         
            }else{
                if( ((g11.getText()=="X")||(g11.getText()=="O"))&&
                ((g12.getText()=="X")||(g12.getText()=="O"))&&
                ((g13.getText()=="X")||(g13.getText()=="O"))&&
                ((g14.getText()=="X")||(g14.getText()=="O"))&&
                ((g15.getText()=="X")||(g15.getText()=="O"))&&
                ((g16.getText()=="X")||(g16.getText()=="O"))&&
                ((g17.getText()=="X")||(g17.getText()=="O"))&&
                ((g18.getText()=="X")||(g18.getText()=="O"))&&
                ((g19.getText()=="X")||(g19.getText()=="O"))    ){
                empate();
                }
            }}
            }}}}
        }}
    }
    private void verificar2() {
        if( (((g1.getText()==("X"))||(g1.getText()==("O")))||((g2.getText()==("X"))||(g2.getText()==("O"))))&&((g1.getText()==g2.getText())&&(g2.getText()==g3.getText()))){
           JOptionPane.showMessageDialog(null, "Gano "+g1.getText());
           System.exit(0);
            }else{
            
            if( (((g1.getText()==("X"))||(g1.getText()==("O")))||((g4.getText()==("X"))||(g4.getText()==("O"))))&&((g1.getText()==g4.getText())&&(g4.getText()==g7.getText()))  ){
            JOptionPane.showMessageDialog(null, "Gano "+g1.getText());
            System.exit(0);
                }else{
            if((((g5.getText()==("X"))||(g5.getText()==("O")))||((g2.getText()==("X"))||(g2.getText()==("O"))))&&((g5.getText()==g2.getText())&&(g2.getText()==g8.getText())) ){
            
            JOptionPane.showMessageDialog(null, "Gano "+g5.getText());
            System.exit(0);    
            }else{
            if((((g5.getText()==("X"))||(g5.getText()==("O")))||((g4.getText()==("X"))||(g4.getText()==("O"))))&&((g5.getText()==g4.getText())&&(g4.getText()==g6.getText())) ){
           JOptionPane.showMessageDialog(null, "Gano "+g5.getText());
            System.exit(0);    
            }else{
                if( (((g3.getText()==("X"))||(g3.getText()==("O")))||((g6.getText()==("X"))||(g6.getText()==("O"))))&&((g3.getText()==g6.getText())&&(g6.getText()==g9.getText()))){
               JOptionPane.showMessageDialog(null, "Gano "+g3.getText());
            System.exit(0);
                }else{
                    if( (((g3.getText()==("X"))||(g3.getText()==("O")))||((g5.getText()==("X"))||(g5.getText()==("O"))))&&((g3.getText()==g5.getText())&&(g5.getText()==g7.getText()))){
               JOptionPane.showMessageDialog(null, "Gano "+g3.getText());
            System.exit(0);
                    }else{
                if( (((g9.getText()==("X"))||(g9.getText()==("O")))||((g8.getText()==("X"))||(g8.getText()==("O"))))&&((g9.getText()==g8.getText())&&(g8.getText()==g7.getText()))){
            JOptionPane.showMessageDialog(null, "Gano "+g9.getText());
            System.exit(0);
                }else{
            if( (((g9.getText()==("X"))||(g9.getText()==("O")))||((g5.getText()==("X"))||(g5.getText()==("O"))))&&((g9.getText()==g5.getText())&&(g5.getText()==g1.getText()))){
            JOptionPane.showMessageDialog(null, "Gano "+g9.getText());
         System.exit(0);
            }else{
                if( ((g1.getText()=="X")||(g1.getText()=="O"))&&
                ((g2.getText()=="X")||(g2.getText()=="O"))&&
                ((g3.getText()=="X")||(g3.getText()=="O"))&&
                ((g4.getText()=="X")||(g4.getText()=="O"))&&
                ((g5.getText()=="X")||(g5.getText()=="O"))&&
                ((g6.getText()=="X")||(g6.getText()=="O"))&&
                ((g7.getText()=="X")||(g7.getText()=="O"))&&
                ((g8.getText()=="X")||(g8.getText()=="O"))&&
                ((g9.getText()=="X")||(g9.getText()=="O"))    ){
                empate2();
                }
            }}
            }}}}
        }}
    }
        
    
    private void empate() {
       
            JOptionPane.showMessageDialog(null, "Empate");
            g11.setText("");
            g12.setText("");
            g13.setText("");
            g14.setText("");
            g15.setText("");
            g16.setText("");
            g17.setText("");
            g18.setText("");
            g19.setText("");
            
            
            }

    private void empate2() {
       JOptionPane.showMessageDialog(null, "Empate");
            g1.setText("1");
            g2.setText("2");
            g3.setText("3");
            g4.setText("4");
            g5.setText("5");
            g6.setText("6");
            g7.setText("7");
            g8.setText("8");
            g9.setText("9");
    }

    }