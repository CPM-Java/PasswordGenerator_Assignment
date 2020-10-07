Constructor:
public Password(String firstName,
                String lastName)
Parameters:
firstName - First name of user as a String 
lastName - Last name of user as a String


public void generatePassword()
Generates a new password and saves it as an instance identifier Starting with the first initial, 
an underscore and the first three letters of the last name. 
Next, a three digit random number from 100 to 999, or a four digit number 
between 0001 and 1000 including any leading zeros. 
Then a randomly generated 'word' consisting of a randomly chosen consonant, 
a randomly chosen vowel and then another randomly chosen consonant.


public String toString()
toString method
Returns:
the password as a String
