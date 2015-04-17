

package tema13;

import java.applet.Applet;
import java.awt.*;

public class Tema13 extends Applet {
    
    Button b1,b2,b3;
    Label l1;
    TextField t1,t2;

    public void init() {
        l1 = new Label("Etiqueta1", Label.CENTER);
        t1 = new TextField("Usuario");
        t2 = new TextField("Contraseña");
        t1.setColumns(20);
        t2.setColumns(20);
        t1.setEditable(true);
        t2.setEditable(true);
        t2.setEchoChar('*');
        b1= new Button("Fácil");
        b2= new Button("Normal");
        b3= new Button("Difícil");
        l1.setForeground(Color.black);
        b1.setForeground(Color.red);
        b2.setForeground(Color.blue);
        b3.setForeground(Color.yellow);
        l1.setBackground(Color.lightGray);
        add(l1);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        setBackground(Color.CYAN);
    }

}
