package models;

public class Person {

    //Estas son variables globales al poder se usadas en toda la clase
    private String name;
    private int age;

    //Constructor es crear/instanciar una clase
    //Si tenemos dos clases se crea solo con el que no recibe ningun argumentos
    public Person(){
        System.out.println("Clase persona creada");
    }

    /*Podemos tener dos constructores con el mismo nombre pero deben tener diferentes argumentos o también con diferentes metodos
    Pero se le suele llamar como sobrecarga de metodos*/
    public Person(String name, int age){
        System.out.println("Clase persona creada por args");
        //this refiere en dar el name de esta clase, inicializamos las variables en las variables globales
        this.name = name;
        this.age = age;
    }
    

    @Override
    public String toString(){
        return "Person [name: " + name + ", age: " + age + "]";
    }

    //Get (mandar una variable privada)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Setter (cambiar una variable)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
