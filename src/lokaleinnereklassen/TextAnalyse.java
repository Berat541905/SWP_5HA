package lokaleinnereklassen;

public class TextAnalyse {
	
	public static void analyseText(String text) {
		class TextStatistic {
			public int countWords () {
				if (text.isEmpty()) {
					return 0;
				}
				return text.split(" ").length;
			}
			public int countCharacters() {
                String ohneLeerzeichen = text.replace(" ", "");
                return ohneLeerzeichen.length();
            }
		}
        TextStatistic stats = new TextStatistic();

        int woerter = stats.countWords();
        int zeichen = stats.countCharacters();
        
        System.out.println("Wörter: " + woerter);
	    System.out.println("Zeichen: " + zeichen);
	}
	
	public static void main(String[] args) {
	 
	        analyseText("HTL-Schüler lernen Java");


	}

}
