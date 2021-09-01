package model;

public class Personagem {
	private int posX;
	private int posY;
	private int altura;
	private int largura;
	
	public Personagem(int posX, int posY, int altura, int largura) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.altura = altura;
		this.largura = largura;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	
	
	
	

}
