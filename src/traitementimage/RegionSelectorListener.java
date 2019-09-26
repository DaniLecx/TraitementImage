/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitementimage;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DaniLecx
 */
public class RegionSelectorListener extends MouseAdapter {

    private final JTextField x1Selection;
    private final JTextField y1Selection;
    private final JTextField x2Selection;
    private final JTextField y2Selection;
    Point origin = null, origin2 = null;
    
    public RegionSelectorListener(JLabel clickedImg, JTextField x1Selection, JTextField y1Selection, JTextField x2Selection, JTextField y2Selection) {
        clickedImg.addMouseListener(this);
        this.x1Selection = x1Selection;
        this.y1Selection = y1Selection;
        this.x2Selection = x2Selection;
        this.y2Selection = y2Selection;
    }
    
    public void mouseClicked(MouseEvent event) {
        if (origin == null) { //If the first corner is not set...

            origin = event.getPoint(); //set it.
            x1Selection.setText(String.valueOf(event.getX()));
            y1Selection.setText(String.valueOf(event.getY()));

        } else if (origin2 == null){ //if the first corner is already set...

            origin2 = event.getPoint(); 
            x2Selection.setText(String.valueOf(event.getX()));
            y2Selection.setText(String.valueOf(event.getY()));
            //calculate width/height substracting from origin
            int width = event.getX() - origin.x;
            int height = event.getY() - origin.y;

            //output the results (replace this)
            System.out.println("Selected X is: "+ origin.x);
            System.out.println("Selected Y is: "+ origin.y);
            System.out.println("Selected width is: "+ width);
            System.out.println("Selected height is: "+ height);
        }
    }
}
