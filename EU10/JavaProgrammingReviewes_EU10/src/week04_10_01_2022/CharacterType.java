package week04_10_01_2022;

public class CharacterType {

    /* Given a character,the task is to check whther the given character is in upper case,lower case or


     */
    public static void main(String[] args) {

        // get the character










        char ch = 'A';
        boolean isUpperCase = ch>= 'A' && ch<='Z';
        boolean isLowerCase = ch>= 'a' && ch<='z';
        boolean isNotAlphabetic =!( isUpperCase || isLowerCase );
                                  //isUpperCase&&!isLowerCase

        if (isUpperCase) {
            System.out.println(ch + " is an Upper Case character");
        } else if (isLowerCase) {
            System.out.println(ch + " is a Lower Case character");
        }else {
            System.out.println(ch + " is not an alphabetic character");

        }
    }

    }

