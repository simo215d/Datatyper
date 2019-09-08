public class Person {
    private String name;
    private Dog pet;

    public Person(){
        this.name = "Simon";
    }

    public String getName(){
        return name;
    }

    public void getPetName(){
        System.out.print(pet.getName());
    }
}
