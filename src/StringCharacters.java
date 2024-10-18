
public class StringCharacters {
	public static void main(String[] args)
	{
		String text = "To be or not to be, that is the question;"
				+"Whether `tis nobler in the mind to suffer" 
				+" the slings and arrows of outrageous fortune,"
				+" or to take arms against a sea of troubles,"
				+" and by opposing end them?"; 
		
		int spaces = 0, vowels = 0, letters = 0, marks = 0;
		
		letters = text.length();

		for (int i = 0 ; i < letters ; i++)
		{
			char temp = text.charAt(i);
			if (temp == ' ')
				spaces++;
			else if (temp == 'A' || temp == 'a' || temp == 'O' || temp == 'o' || temp == 'E' || temp == 'e' || temp == 'I' || temp == 'i' || temp == 'U' || temp == 'u')
				vowels++;
			else if (temp == ',' || temp == ';' || temp == ':' || temp == '?' || temp == '`' || temp == '!' || temp == '.')
				marks++;
		}
		
	System.out.println("The text contained vowels: " + vowels + "\n" + "consonants: " + (letters - (vowels + spaces + marks)) + "\n" + "spaces: " + spaces);
	}

}
