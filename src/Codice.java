import java.awt.*;
import java.awt.event.*;

public class Codice {
	public static Frame f;

	public static void main(String[] args) {	

	   
       f=new Frame("-// Codice Fiscale - Cagni_Logger //-");
       f.setSize(500,450);
       f.setLocation(450,150);
       f.setBackground(new java.awt.Color(86,191,147));

       Label Cog,Nom,g,m,a,c,s,n;
       final TextField cognome,nome,giorno,mese,anno,comune,sex,arearisultato;
       Cog=new Label("Cognome");
       cognome= new TextField(30);
       Nom=new Label("Nome");
       nome= new TextField(30);
       g=new Label("Giorno");
       giorno= new TextField(30);
       m=new Label("Mese");
       mese= new TextField(30);
       a=new Label("Anno");
       anno= new TextField(30);
       c=new Label("Comune");
       comune= new TextField(30);
       s=new Label("Sesso(M/F) ");
       sex= new TextField(30);
       n=new Label("Inserire il giorno e l'anno in numeri e il mese in lettere");
       arearisultato =new TextField(30);
       
       Button Cancella=new Button("Cancella");
       final Button Generab=new Button("Genera  il tuo codice fiscale");
       f.setLayout(null);
       f.add(Nom);
       f.add(nome);
       f.add(Cog);
       f.add(cognome);
       f.add(g);
       f.add(giorno);
       f.add(m);
       f.add(mese);
       f.add(a);
       f.add(anno);
       f.add(c);
       f.add(comune);
       f.add(s);
       f.add(sex);
       f.add(n);
       f.add(arearisultato);
       Cog.setBounds(20,50,60,20);
       cognome.setBounds(90,50,90,20);
       Nom.setBounds(20,100,60,20);
       nome.setBounds(90,100,90,20);
       n.setBounds(20,150,1000,20);
       g.setBounds(20,200,60,20);
       giorno.setBounds(90,200,50,20);
       m.setBounds(160,200,60,20);
       mese.setBounds(230,200,60,20);
       a.setBounds(320,200,60,20);
       anno.setBounds(380,200,60,20);
       c.setBounds(20,250,60,20);
       comune.setBounds(90,250,60,20);
       s.setBounds(20,300,80,20);
       sex.setBounds(100,300,40,20);
       arearisultato.setBounds(120,400,300,20);
       
       Generab.addMouseListener(new MouseListener()
       {
         public void mouseClicked(MouseEvent e)
         {
          String cognome1="",nome1="",giorno1="",comune1="",sex1="",mese1="",anno1="";
          giorno1=giorno.getText();
          cognome1=cognome.getText();
          nome1=nome.getText();
          mese1=mese.getText();
          anno1=anno.getText();
          sex1=cognome.getText();
          comune1=comune.getText();
          Genera Persona1 = new Genera(nome1, cognome1, comune1, mese1, anno1, giorno1, sex1);
          arearisultato.setText("Il tuo codice fiscale e' :  "+Persona1.getCodiceFiscale());
         }
         public void mousePressed(MouseEvent e) {
             throw new UnsupportedOperationException("Not supported yet.");
         }
         public void mouseReleased(MouseEvent e) {
             throw new UnsupportedOperationException("Not supported yet.");
         }
         public void mouseEntered(MouseEvent e) {
             throw new UnsupportedOperationException("Not supported yet.");
         }
         public void mouseExited(MouseEvent e) {
             throw new UnsupportedOperationException("Not supported yet.");
         }

         

       });
       f.add(Generab);
       Generab.setBounds(120,350,300,20);
       Cancella.addMouseListener(new MouseListener()
       {
         public void mouseClicked(MouseEvent e)
         {
          cognome.setText("");
          nome.setText("");
          giorno.setText("");
          mese.setText("");
          anno.setText("");
          sex.setText("");
          comune.setText("");
          arearisultato.setText("");
         }
         public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("");
         }
         public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("");
         }
         public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("");
         }
         public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("");
         }

       });

       f.add(Cancella);
       Cancella.setBounds(20,350,60,20);
	   f.addWindowListener(new WindowAdapter()
       {
		 public void windowClosing (WindowEvent e)
            {
				System.exit(0);
			}
		});
        f.setVisible(true);
  }
}

