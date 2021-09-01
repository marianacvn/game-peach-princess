package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.event.MouseInputListener;

import model.Personagem;
import view.Princess;

public class Controle implements KeyListener, MouseListener {
	Personagem personagem;
	Princess princesa;
	
	
	public Controle(Personagem personagem, Princess princesa) {
		super();
		this.personagem = personagem;
		this.princesa = princesa;
		
		princesa.addKeyListener(this);
		princesa.addMouseListener(this);
	}

	

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W) {
				personagem.setPosY(personagem.getPosY()-2);
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			personagem.setPosY(personagem.getPosY()+2);
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			personagem.setPosX(personagem.getPosX()-2);
			
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			personagem.setPosX(personagem.getPosX()+2);
		}
		princesa.getPrincesaLabel().setBounds(personagem.getPosX(),personagem.getPosY(),personagem.getLargura(), personagem.getAltura());
	}
	

	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount() == 0) {
			princesa.getPrincesaLabel().setIcon(princesa.getImage2());
		}
		if(e.getClickCount() == 1) {
			princesa.getPrincesaLabel().setIcon(princesa.getPeIcon());
		}
		if(e.getClickCount() == 2) {
			princesa.getPrincesaLabel().setIcon(princesa.getSentadaIcon());
		} 
		if (e.getClickCount() == 3){
			princesa.getPrincesaLabel().setIcon(princesa.getDeitouIcon());
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	
	}
	


