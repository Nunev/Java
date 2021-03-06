package hangman;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		Scanner cons = new Scanner(System.in);
		System.out.println("Welcome to Hangman");
		System.out.println("Guess the word:");
		
		boolean more = true;
		int tries = 9;
		String word = "test";
		String init = word.substring(0,1) + repeat("*",word.length()-2) + word.substring(word.length()-1);
		
		while(more && tries>0) {
			System.out.println(init);
			char letter = cons.next().charAt(0);
			boolean match = false;
			for (int i = 0; i < init.length(); i++) {
				if (letter == word.charAt(i)) {
					init = init.substring(0,i)+letter+init.substring(i+1);
					match = true;
				};
			};
			if(!init.contains("*")) {
				more=false;
				System.out.println("Correct! The word was \""+word+"\"!");
			};
			if(!match) {
				tries--;
				if (tries==0) {
					System.out.println("No more tries! Game over!");
				} else {
					System.out.println( Integer.toString(tries)+" tries left!" );
				}
			}
		}
		cons.close();
	}

	public static String repeat(String s, int n) {
	    if(s == null) {
	        return null;
	    }
	    final StringBuilder sb = new StringBuilder(s.length() * n);
	    for(int i = 0; i < n; i++) {
	        sb.append(s);
	    }
	    return sb.toString();
	}

}
