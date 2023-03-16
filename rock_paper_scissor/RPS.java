package rock_paper_scissor;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import rock_paper_scissor_application.GameLogic;

public class RPS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//checkDifLevel();
//		checkInput();
		
		GameLogic game = new GameLogic();
		game.init();
		
		 String ss=Paths.get("").toAbsolutePath().toString();
//		 System.out.println(ss);
		
		
//		System.out.println("exit"); 
//		Computer c=new Computer();
//		System.out.println(c.getChoice());
//		Person p=new Person();
//		System.out.println(p.getChoice());
	}

	
}
