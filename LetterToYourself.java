
/**
* Print a letter format
*+---------------------------------------------------------+
*|                                                    #### |
*|                                                    #### |
*|                                                    #### |
*|                                                         |
*|                                                         |
*|                              Bill Gates                 |
*|                              1 Microsoft Way            |
*|                              Redmond, WA 98104          |
*|                                                         |
*+---------------------------------------------------------+
**/

public class LetterToYourself {

	public static void main(String[] args) {

		String[] texts = new String[] {
		"+---------------------------------------------------------+",
		"|                                                    #### |",
		"|                                                    #### |",
		"|                                                    #### |",
		"|                                                         |",
		"|                                                         |",
		"|                              Bill Gates                 |",
		"|                              1 Microsoft Way            |",
		"|                              Redmond, WA 98104          |",
		"|                                                         |",
		"+---------------------------------------------------------+" };

		for(int i= 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}


		/*int letterWidth = 40;
		int letterHeight = 11;


		for(int i = 0; i < letterHeight; i++) {

			for(int j = 0; j < letterWidth; j++) {

				if(i == 0 || i == letterHeight - 1) {

					if(j == 0 || j == letterWidth - 1) {
						
						System.out.print("+");
					} else {

						System.out.print("-");
					}
				} else if(i == 1 || i == 2 || i == 3) {

					if(j > (letterWidth - 7) && j < (letterWidth - 2)) {

						System.out.print("#");
					} else if(j == 0 || j == letterWidth - 1){

						System.out.print("|");
					} else {
						System.out.print(" ");
					}
				} else {

					if(j == 0 || j == letterWidth - 1) {
						
						System.out.print("|");
					} else {


						System.out.print(" ");
					}
				}
			}


			System.out.println();	
		}*/
		
	}
}