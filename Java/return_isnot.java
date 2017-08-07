/*Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
*/
public String notReplace(String str) {
 int p = str.indexOf("is");
	int check;
	while(p != -1)
	{
  	check = 0;
  	if(p > 0)
  	{
			if(!Character.isLetter(str.charAt(p-1)))
				check++;
		}
		else
			check++;
		if(p < str.length()-2)
  	{
			if(!Character.isLetter(str.charAt(p+2)))
				check++;
		}
		else
			check++;	
		if(check == 2)
			str = str.substring(0, p) + "is not" + str.substring(p+2);
		p = str.indexOf("is", p+2);
	}	
return str;  
}
