import java.awt.AWTEvent;
/**
 * @author Sukhpal S. Saini and Vasu Kamra
 * 
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
public class splash extends JWindow implements MouseListener{  
	private JLabel splashImgHolder;  
	private Image image;  
	private ImageIcon splashIcon;  
	private JPanel contentPane;  
	private static splash splash;
      
    public splash(){  
        image = new ImageIcon((getClass().getResource("tavneet.jpg")))  
        .getImage();  
        splashIcon = new ImageIcon(image);  
          
       /** 
        * Enables the events defined by the specified event mask parameter to  
        * be delivered to this component. Event types are automatically enabled 
        * when a listener for that event type is added to the component. 
        */         
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);  
          
        try{  
            showSplash();  
        }catch(Exception ex){  
            System.out.println("Error! " + ex.getMessage());  
            System.exit(1);  
        }  
          
        this.setVisible(true);  
          
        try{  
            Thread.sleep(2000); 	
            StarterIt(); 
        }catch(InterruptedException e){  
            //do nothing here!  
        }  
        
    }  
  
  
    @Override  
    public void setVisible(boolean b) {  
        super.setVisible(b);  
    }  
    private void showSplash() throws Exception{  
        splashImgHolder = new JLabel();  
        splashImgHolder.setIcon(splashIcon);  
          
        contentPane = ((JPanel)this.getContentPane());  
        contentPane.setLayout(new BorderLayout());  
        contentPane.add(splashImgHolder, BorderLayout.NORTH);  
          
        setSplashLocation();  
          
        pack();  
          
    }  
  
    /**Starts the main Starter class and destroys this
     * 
     */
    private void StarterIt() { 
    	
    	mainScreen t= new mainScreen(); 
    	dispose();
    }
    private void setSplashLocation() {  
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension frame = this.getSize();       
          
        int x = (int)( frame.getWidth())/2;  
        int y = (int)( frame.getHeight())/2;  
          
   this.setLocation(x, y);  
    }  
    public static void main(String[] arg){  
    splash = new splash();  
    
        //get rid of window as it finished showing  
      //  splash.dispose();  
    }  



	@Override
	public void mouseClicked(MouseEvent arg0) {
		StarterIt();
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}  