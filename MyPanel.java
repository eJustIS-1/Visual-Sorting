package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener {
	
	
	 JButton loadButton;
	 JButton sortButton;
	 ShapeFactory shapes = new ShapeFactory();

	
	
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;
    
      
      for (Shape shape: shapes.getShapeList()) {
    	  g2d.setColor(shape.getColor());
    	  shape.drawShape(g2d);
      }
   } 
   
   
   	MyPanel(){
   		JFrame frame = new JFrame("Shape Sorting");
        loadButton = new JButton("Load");
        loadButton.setBounds(200, 10, 100, 25);
        loadButton.addActionListener((ActionListener) this);
        frame.add(loadButton);
        sortButton = new JButton("Sort");
        sortButton.setBounds(300, 10, 100, 25);
        sortButton.addActionListener((ActionListener) this);
        frame.add(sortButton);
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
   	}
   	
   	@Override
    public void actionPerformed(ActionEvent o) {
       if(o.getSource() == loadButton){
          shapes.emptyListHelper();
          shapes.createShapeList();
          repaint();
       }
       
       if(o.getSource() == sortButton){
          shapes.sortHelper();
          repaint();
       }
       
    }
/**
    * This is the main method of the class.
    * @param args
    */
   public static void main(String[] args) {
	   new MyPanel();
   }
}
