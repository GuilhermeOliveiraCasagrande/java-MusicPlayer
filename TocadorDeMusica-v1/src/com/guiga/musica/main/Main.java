package com.guiga.musica.main;

public class Main {

	public static void main(String[] args) {
		PlayerMusica pm = new PlayerMusica();
		if (args.length != 0) {
			pm.Rodar(args);
		} else {
			System.out.println("play [caminho pro arquivo mp3, sem espa�os] -> tocar uma �nica m�scia");
			System.out.println("playlist [caminho para pasta com arquivos mp3] -> tocar uma s�rie de m�sicas");
		}
	}

}
