import java.util.Scanner;

    public class Songify {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Songify mySongify = new Songify();

        System.out.println(mySongify.printStars(10)+"Songify"+mySongify.printStars(10));
        System.out.println("You will be  to enter some details about your favourite song");
        System.out.println("Enter Song name");
        String songName = input.nextLine();

        System.out.println("Enter Artist Name: "); //code to ask user to enter Artists Name
        String artistName = input.nextLine();

        System.out.println("Enter the first line of the song: "); //code for first line of song
        String firstLine = input.nextLine();

        System.out.println("Enter Song length (in seconds): ");//code for entering song seconds
        int songSeconds = input.nextInt();

        System.out.println("Is this really your favourite song (y or n): ");//Code asking if it is favourite song
        String songFavourite = input.next();

        System.out.println("Thanks for entering your favourite song"); //Printing line thanking user for song details

        //----------------
        //Bottom Section - Calling Methods to print in main
        //----------------

        System.out.println(mySongify.printStars(40));
        if (songFavourite == mySongify.toBoolean('true')) //calling toBoolean method and if true
                System.out.println("Your favorite song is: " + songName.toUpperCase());//if true print - its is your favorite song
        else System.out.println("Your (almost) favorite song is: " + songName.toUpperCase()); //otherwise print its (almost) your favoorite song

        System.out.println("Its length is : " + mySongify.convertMinutes(songSeconds)); //printing secs to minutes and seconds

        System.out.println("The Artist reversed is: " + mySongify.reverseString(artistName)); //printing artists name backwards

       System.out.println("The first line has " + "/n" //  /n moves to next line
                    + mySongify.numWords(firstLine) + "/n"  //prints numbers of words + /n moves to next line
                 + mySongify.numVowels(firstLine) + "in it"); //numVowels method added with dot notation

        System.out.println(mySongify.printStars(40));
    }

    //----------------
    //Number of Vowels - method below
    //----------------
    private int numVowels(String str) {

        String[] numbers = new String[5]; //declaring an array
        numbers[0] = "a"; //setting up arrays with vowels as values, starting at 0
        numbers[1] = "e";
        numbers[2] = "i";
        numbers[3] = "o";
        numbers[4] = "u";
        int total = 0;

        for (int i = 0; i <= total; i++)
            total += (numbers.charAt(0) && numbers.charAt(1) && numbers.charAt(2) && numbers.charAt(3) && numbers.charAt(4));
        return total;
    }

    //----------------
    //Number of Words - method below
    //----------------
    private int numWords(String str) {

       int size = 1;
        String[] numWord = new String[size]; //Created String array

        for (int i = 0; i <= size; i++) { //used 1 for int size| i = 0 so only does 1 round of for loop
            System.out.println(numWord.length() + "in it"); // .length() will print number of words in array
            size[i] = numWord;
        }
    }

    //----------------
    //Artist Name reversed - method below
    //----------------
    private String reverseString(String result) {

        String reversed = artistName;
        //Although this does not work on my console the thinking behind was
        for (int i = 1; i > 0; i--) { //give int i high number, say i--, so words go backwords as they would with numbers
            return "artistName" + artistName; //Return just Artist name as that is all I need
            // when called in print in main
        }
    }


    //----------------
    //Convert seconds to minute & seconds method below
    //----------------
    private String convertMinutes(int numSec) {

        int minutes = numSec / 60; //60 seconds in a minute so dividing by 60
        int seconds = numSec % 60; //modulo also used for 60

        return minutes + "minutes" + seconds + "seconds"; //return gives the value of minutes and seconds from seconds given
    }

    //----------------
    //Print Stars method below
    //----------------
    public String printStars(int num){
        String theStars = "";
        for(int i = 0; i<num;i++)
            theStars += "*";
        return theStars;
    }

    //----------------
    //Favorite song - letter test method below
    //----------------
    public boolean toBoolean(char letterToBeTested){
        if(letterToBeTested == 'Y' || letterToBeTested == 'y')
            return true;
        return false;
    }

}