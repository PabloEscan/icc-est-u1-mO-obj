import models.Person;
import controllers.ManagePeople;

public class App {
    public static void main(String[] args) throws Exception {
        
        ManagePeople mG = new ManagePeople();
        mG.sortPeopleByAge();
        mG.sortPeopleByName();
    }
}
