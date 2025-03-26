import java.util.*;
class animal {
    private String name;


    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }


}
class dog extends animal {
    private String breed ;
    public void getBreed() {
        System.out.println(breed);
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
class mainly{
    public static void main(String[] args) {
        animal first= new animal();
        dog second  = new dog();
        first.setName("Naman");
        first.getName();
        second.setBreed("Kutta");
        second.getBreed();

    }
}