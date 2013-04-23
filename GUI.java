import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;


public class GUI extends JFrame
{

    //returns an image, display the message if the path is invalid
    protected ImageIcon createImageIcon (String path)
    {
  java.net.URL imgURL = getClass ().getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }


    ImageIcon Apple = createImageIcon ("Apple2.png");

    JPanel outline = new JPanel ();

    Color g = new Color (0, 154, 70);
    Color b = new Color (102, 51, 0);

    JLabel label1 = new JLabel ("Are You Smarter Than", JLabel.CENTER);
    JLabel label2 = new JLabel ("A Twelfth Grader?", Apple, JLabel.CENTER);


    
    public GUI ()
    {
	setTitle ("Are you smarter than a twelfth grader?");
	setSize (600, 450);

	outline.setPreferredSize (new Dimension (600, 400));

	outline.setBackground (g);
	setVisible (true);

	Border inner = BorderFactory.createLineBorder (b, 20);
	Border outer = BorderFactory.createRaisedBevelBorder ();
	Border combined = BorderFactory.createCompoundBorder (outer, inner);
	outline.setBorder (combined);

	getContentPane ().add (outline);




	setVisible (true);

	//window characteristics

	setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	pack ();

    }


    public void displaymenu ()
    {

	ImageIcon Play = createImageIcon ("Play.jpg");
	JButton PlayButton = new JButton ("Play", Play);
	//PlayButton.setGraphic(Play);
	PlayButton.setHorizontalTextPosition(JButton.CENTER);

	ImageIcon Help = createImageIcon ("Help.jpg");
	JButton HelpButton = new JButton ("Help", Help);
	HelpButton.setHorizontalTextPosition(JButton.CENTER);

	ImageIcon Quit = createImageIcon ("Quit.jpg");
	JButton QuitButton = new JButton ("Quit", Quit);
	QuitButton.setHorizontalTextPosition(JButton.CENTER);
	
	label2.setVerticalTextPosition (JLabel.TOP); //position text vertically
	label2.setHorizontalTextPosition (JLabel.CENTER); //position text horizontally
	label1.setFont (new Font ("haettenschweiler", Font.PLAIN, 48));
	label2.setFont (new Font ("haettenschweiler", Font.PLAIN, 48));

	outline.setLayout (new BorderLayout ());


	outline.add (label1, BorderLayout.NORTH);
	outline.add (label2, BorderLayout.CENTER);

	JPanel buttons = new JPanel (new GridLayout (1, 2, 10, 10));

	outline.add (buttons, BorderLayout.SOUTH);

	buttons.add (PlayButton);
	buttons.add (HelpButton);
	buttons.add (QuitButton);

	PlayButton.addActionListener (new DisplayCategoryListener ());
	PlayButton.setEnabled (true);

	setVisible (true);


    }


    class DisplayCategoryListener implements ActionListener
    {

	public void actionPerformed (ActionEvent e)
	{

	    JPanel Category = new JPanel (new GridLayout (5, 2, 10, 10));

	    /*PlayButton.dispose();
	    HelpButton.dispose();
	    QuitButton.dispose();*/


	    Category.setPreferredSize (new Dimension (600, 400));

	    Category.setBackground (g);
	    setVisible (true);

	    Border inner = BorderFactory.createLineBorder (b, 20);
	    Border outer = BorderFactory.createRaisedBevelBorder ();
	    Border combined = BorderFactory.createCompoundBorder (outer, inner);
	    Category.setBorder (combined);

	    setContentPane (Category);

	    String[] buttonStrings = {
		"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

	    JButton[] button = new JButton [10];

	    for (int i = 0 ; i < 10 ; i++)
	    {

		button [i] = new JButton (buttonStrings [i]);
		button [i].addActionListener (new DisplayQuestion ());
		button [i].setEnabled (true);
		Category.add (button [i]);

	    }
	    setVisible (true);

	}
    }



    class DisplayQuestion implements ActionListener
    {

	public void actionPerformed (ActionEvent e)
	{

	    JPanel Question = new JPanel (new BorderLayout ());

	    Question.setPreferredSize (new Dimension (600, 400));

	    Question.setBackground (g);
	    setVisible (true);

	    Border inner = BorderFactory.createLineBorder (b, 20);
	    Border outer = BorderFactory.createRaisedBevelBorder ();
	    Border combined = BorderFactory.createCompoundBorder (outer, inner);
	    Question.setBorder (combined);

	    setContentPane (Question);

	    JLabel Q = new JLabel ("What is the Capital of China?", JLabel.CENTER);
	    
	    Q.setFont (new Font ("haettenschweiler", Font.PLAIN, 36));

	    Question.add (Q, BorderLayout.NORTH);

	    JPanel choices = new JPanel (new GridLayout (2, 2, 10, 10));

	    Question.add (choices, BorderLayout.CENTER);

	    /*JButton A = new JButton ("A");
	    JButton B = new JButton ("B");
	    JButton C = new JButton ("C");
	    JButton D = new JButton ("D");
	    
	    choices.add (A);
	    choices.add(B);
	    choices.add(C);
	    choices.add(D);*/
	    
	    
	    
	    String buttonchoices[] = {"A", "B", "C", "D"};

	    JButton[] button2 = new JButton [4];

	    for (int i = 0 ; i < 4 ; i++)
	    {
		button2 [i] = new JButton (buttonchoices [i]);
		choices.add (button2 [i]);
	    }
	    
	    setVisible (true);

	}
    }



    public static void main (String[] args)
    {



	GUI A = new GUI ();
	A.displaymenu ();

    }
}

