package main;

import java.io.File;

import reversej.controller.Controller;

public class MakeDocumentation {

	public static void main(String[] args) {
		Controller c = new Controller();
		c.start();
		
		new Story().tellStory();
		
		c.stop();
		File folder = new File("docs");
		folder.mkdirs();
		File f = new File("docs/reversej_diagram");
		c.save(f);
	}

}
