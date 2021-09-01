package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Personagem;

public class Princess extends JFrame {
	
	JLabel princesaLabel;
	JLabel casteloLabel;
	ImageIcon image2;
	ImageIcon image;
	ImageIcon image3;
	ImageIcon peIcon;
	ImageIcon sentadaIcon;
	ImageIcon deitouIcon;
	
	public Princess(Personagem personagem) {
		super("Princess Peach");
		
		
		setResizable(false);
		setLocation(0,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setSize(890, 530);
		
		image3 = new ImageIcon("images/castelo.png");
		casteloLabel = new JLabel(image3);
		image = new ImageIcon("images/princesacortada.png");
		princesaLabel = new JLabel(image);
		image2 = new ImageIcon("images/2.png");
		peIcon = new ImageIcon("images/pe.png");
		sentadaIcon = new ImageIcon("images/sentada.png");
		deitouIcon = new ImageIcon("images/deitou.png");
		
		princesaLabel.setBounds(personagem.getPosX(),personagem.getPosY(), personagem.getLargura(), personagem.getAltura());
		casteloLabel.setBounds(0, 0, 877, 497);
		
		add(princesaLabel);
		add(casteloLabel);
		
		
		setVisible(true);
		
		
		
		
	}

	public JLabel getPrincesaLabel() {
		return princesaLabel;
	}

	public ImageIcon getImage2() {
		return image2;
	}

	public ImageIcon getPeIcon() {
		return peIcon;
	}

	public ImageIcon getSentadaIcon() {
		return sentadaIcon;
	}

	public ImageIcon getDeitouIcon() {
		return deitouIcon;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
