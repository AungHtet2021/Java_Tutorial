package rock_paper_scissor_application;

import java.awt.Desktop;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import rock_paper_scissor.Computer;
import rock_paper_scissor.Constant;
import rock_paper_scissor.Difficulty;
import rock_paper_scissor.Person;

public class GameLogic {
	Scanner sc=new Scanner(System.in);
	Person p=new Person();
	Computer c=new Computer();
	public void partation() {
		
		System.out.println("--------------------------------------");
	}
	//method propagation
	public void init() throws IOException {
		partation();
		System.out.println("Welcome from Rock Paper Scissor Game");  
		partation();
		getPlayerName();
		
//		checkDifLevel();
//		checkInput() ;
		int loop_count=checkDifLevel();

		List<Integer> c_choices=getComputerChoice(loop_count);
		for(int i=0;i<Constant.GAME_COUNT;i++) {
			checkInput(); 
			System.out.println("Computer Choose : " +Constant.RPS_MAP.get(c_choices.get(i)));
			c.setChoice(c_choices.get(i));
			
			checkWinner();
			
			partation();
		}
		printResult();
//		saveRecord();
//		getComputerChoice();

		
//	System.out.println("Computer choose"+Constant.RPS_MAP.get(c.generateChoice()));
	}
	
	public void getPlayerName() {
		
		System.out.print("Enter Player Name : ");
		String name=sc.nextLine();
		p.setName(name);
		
		partation();
	}
	
	public  int checkDifLevel() {
		
//		Person p=new Person("aye aye");
		Difficulty dif=null;
		do {
			System.out.print("Choose difficulty level =>( Easy:e Middle:m ) ");
			dif=p.acceptDifLevel(sc.nextLine().toLowerCase().charAt(0));
		}while(dif==null);      
//		System.out.println(dif);
		int loop_count=c.checkDifLevel(dif); // easy=1 , middle=3
		return loop_count;
		
	}
	
	public void checkInput() {
//		Scanner sc=new Scanner(System.in);
//		Person p=new Person("aye aye");
	
	do {
		System.out.print("Choose Rank =>( Rock:r  Paper:p  Scissor:s ) ");
	}while(!p.checkInput(sc.nextLine().toLowerCase().charAt(0)));
	
	System.out.println("You Choose : "+Constant.RPS_MAP.get(p.getChoice()));
	}

	public List<Integer>  getComputerChoice(int loop_count) {
		List<Integer> computer_choices=new ArrayList<>();
		for(int i=0;i<loop_count;i++)computer_choices.add(c.generateChoice()); // 3 loop
		 if(computer_choices.size()==1) {
			 computer_choices.add(computer_choices.get(0));
			 computer_choices.add(computer_choices.get(0));
	}
		 System.out.println(computer_choices);
		 return computer_choices;
//		System.out.println("Computer Choose: "+Constant.RPS_MAP.get(choice));
	}
	
	
	public void checkWinner() {
//		System.out.println(p.getChoice()+" : "+c.getChoice());
		if(p.getChoice()==c.getChoice()) {
			System.out.println("Game is tied...");
		}
		else {
			int ans=(p.getChoice())-(c.getChoice());
			if(ans==-1 | ans==2) {System.out.println("Winner is : " + c.getName());
			c.increaseScore(c.getScore());
			}
			else { System.out.println("Winner is : " + p.getName());
			p.increaseScore(p.getScore());
			}
		}
	}
	
	
	public void printResult() {
//		System.out.println(c.getName()+":"+p.getName());
//		System.out.println(c.getScore()+":"+p.getScore());
		
		
		System.out.printf("%20s:%s\n%20d:%d",c.getName(),p.getName(),c.getScore(),p.getScore());
	}
	
	public void saveRecord() throws IOException {
		Path dir_path=Paths.get(Constant.PATH+Constant.FOLDER);
//		Path file_path=Paths.get(Constant.FILE);
		Path full_path=Paths.get(Constant.FULL_PATH);
		String st="\n"+LocalDate.now()+","+p.getScore()+" , "+c.getScore();
		try {
			Files.createDirectory(dir_path);
			Files.createFile(full_path);
			String title="Date,Person,Computer";
			
			
			Files.write(full_path, (title+st).getBytes(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);    
			Desktop.getDesktop().open(full_path.toFile());
		}catch(FileAlreadyExistsException ex) {
            
//			String st=LocalDate.now()+","+p.getScore()+" , "+c.getScore();
			
			Files.write(full_path, (st).getBytes(), StandardOpenOption.APPEND);    
			Desktop.getDesktop().open(full_path.toFile());
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("File handling sth wrong");
		}
		
		
	}
	
}





