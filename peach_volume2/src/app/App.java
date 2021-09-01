package app;

import controller.Controle;
import model.Personagem;
import view.Princess;

public class App {
	public static void main(String[] args) {
		Personagem perso = new Personagem(0,250, 400, 400);
		Princess princesa = new Princess(perso);
		Controle control = new Controle(perso,princesa);
		

		
	}

}
