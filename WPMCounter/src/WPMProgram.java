import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * You can calculate typing speed with the words per minute (WPM) formula. 
 * In this java program, we'll create a count down timer and random word generator, 
 * get user input and give back the typing speed! 
 * 
 * Video credit: Alex Lee  
 */

public class WPMProgram {
	
	static String[] words = {"envelope", "cantelope", "the", "hello", "microphone", 
			"elephant", "biscuit", "hammer", "went", "cap"};

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Begin in...");
			TimeUnit.SECONDS.sleep(1);
		
		System.out.println("3");
			TimeUnit.SECONDS.sleep(1); 
			
		System.out.println("2");
			TimeUnit.SECONDS.sleep(1); 
		
		System.out.println("1 ");
			TimeUnit.SECONDS.sleep(1); 
			
		Random rand = new Random(); 
			for(int i = 0; i < 10; i++) {
				System.out.print(words[rand.nextInt(9)] + " ");		
		}
		System.out.println();
		
		double start = LocalTime.now().toNanoOfDay(); 
			
		Scanner scan = new Scanner(System.in); 
		String typedWords = scan.nextLine(); 
		
		double end = LocalTime.now().toNanoOfDay();
		double elaspedTime = end - start;
		double seconds = elaspedTime / 1000000000.0; 
		int numChars = typedWords.length(); 
		// WPM formula via Google: (x characters / 5) / 1min = y WPM 
		int wpm = (int) ((((double) numChars / 5) / seconds) * 60); 
		
		System.out.println("Your WPM is " + wpm + "!");  
	}
}
