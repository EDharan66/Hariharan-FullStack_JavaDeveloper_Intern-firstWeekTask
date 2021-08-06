import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Class name should start with the uppercase letter. here "Time" is class
public class Time {

    // method should start with lowercase letter.
    public static void main(String[] args) {

        // here creating a object for showTimeInWord() class
        ShowTimeInWord object1 = new ShowTimeInWord();
        ShowTimeInWord object2 = new ShowTimeInWord();

        // here initializing the value to these objects by invoking the set() method
        object1.set(11,56);
        object2.set(1,20);

        //here displaying the state (data) of the objects by invoking the showTimeInWord() method
        object1.showTimeInWord();
        object2.showTimeInWord();
    }
}

class ShowTimeInWord {

    // Variables should start with a lowercase letter and
    // should not start with the special characters.
    // name contains multiple words, start it with the lowercase letter followed by an uppercase letter
    int hour;
    int minute;
    String timeInWord = "";

    List<String> stringList = new ArrayList<>(Arrays.asList(
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three",
            "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight",
            "twenty nine"));


    // method should start with lowercase letter.
    public void set(int hour,int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    // method should start with lowercase letter or If the name is combined with multiple words CamelCase
    // here converting given hour and minutes to TimeInWord
    public void showTimeInWord(){

        if(minute<=30){
            if(minute==0){
                timeInWord = stringList.get(hour)+" o\' clock";
            }else if(minute==30){
                timeInWord = "half past " + stringList.get(hour);
            }else if(minute==15){
                timeInWord = "quarter past " + stringList.get(hour) ;
            }else if(minute<10){
                timeInWord = stringList.get(minute)+" minute past "+stringList.get(hour);
            }else{
                timeInWord = stringList.get(minute)+" minutes past "+stringList.get(hour);
            }
        }else {
            if(minute==45){
                timeInWord = "quarter to " + stringList.get(hour+1);
            }else {
                timeInWord = stringList.get(30-minute%30)+" minutes to "+stringList.get(hour+1);
            }
        }

        //display the timeInWord
        System.out.println("timeInWord = " + timeInWord);
    }


}
