package views;
import models.Person;

public class viewConsole {
    
    public void showMessage(String message){
        System.out.println(message);
    }

    public void printPeopleList(Person[] people){
        for (Person person : people){
            System.out.println(person);
        }
    }
}
