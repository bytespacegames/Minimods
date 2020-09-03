package com.mojang.ld22.screen;

import com.minesaria.minimods.Core;
import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Font;
import com.mojang.ld22.gfx.Screen;

public class InstructionsMenu extends Menu {
	private Menu parent; // Creates a parent object to go back to

	/** The about menu is a read menu about what you have to do in the game. Only contains text and a black background */
	public InstructionsMenu(Menu parent) {
		this.parent = parent; // The parent Menu that it will go back to.
	}

	public void tick() {
		if (input.attack.clicked || input.menu.clicked) {
			game.setMenu(parent);  // If the user presses the "Attack" or "Menu" button, it will go back to the parent menu.
		}
	}

	/** Renders the text on the screen */
	public void render(Screen screen) {
		screen.clear(0); // clears the screen to be a black color.
		
		/* Font.draw Parameters: Font.draw(String text, Screen screen, int x, int y, int color) */

		//Redone Controls Menu By SpaceByte
		
		Font.draw("Controls", screen, (screen.w / 2) - 32, screen.h - 200, Color.get(0, 111, 111, 111)); // Draws Controls Title Text
		Font.draw("Walk: WASD / Arrow Keys", screen, (screen.w / 2) - 92, screen.h - 186, Color.get(0, 333, 333, 333));
		Font.draw("Attack / Break: Space / c", screen, (screen.w / 2) - 104, screen.h - 178, Color.get(0, 333, 333, 333));
		Font.draw("Inventory / Crafting: E", screen, (screen.w / 2) - 92, screen.h - 170, Color.get(0, 333, 333, 333));
		Font.draw("Place / Interact: Space", screen, (screen.w / 2) - 92, screen.h - 162, Color.get(0, 333, 333, 333));
		Font.draw("Equip Item In Inventory: Enter", screen, (screen.w / 2) - 120, screen.h - 154, Color.get(0, 333, 333, 333)); // draws text
		
		
	}
}
