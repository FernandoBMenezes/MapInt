package com.monderdragon.TYml;

import java.util.ArrayList;

public class Tela {
	public static ArrayList<Integer> ints = new ArrayList<>();

	public Tela() {
		int X = 18;
		int Y = 28;
		String MapInt = "";
		for (int iy = 0; iy < Y; iy++) {
			for (int ix = 0; ix < X; ix++) {
				int c = X * iy + ix;
				if (c < 10) {
					System.out.printf("%s%d%s", "  ", c, ", ");
					MapInt = MapInt + "  " + c + ", ";
				} else {
					if (c < 100) {
						System.out.printf("%s%d%s", " ", c, ", ");
						MapInt = MapInt + " " + c + ", ";
					} else {
						System.out.printf("%d%s", c, ", ");
						MapInt = MapInt + c + ", ";
					}
				}
			}
			System.out.println();
		}
		/*
		 * System.out.println(MapInt); *NOTA PESSOAL* Iria fazer um sistema que
		 * salvasse em um formato .yml esses numeros nessa ordem mas preferi
		 * deixar de lado e só copiar a msg do console e colar
		 */
	}

	public static void main(String[] args) {
		new Tela();
	}
}
