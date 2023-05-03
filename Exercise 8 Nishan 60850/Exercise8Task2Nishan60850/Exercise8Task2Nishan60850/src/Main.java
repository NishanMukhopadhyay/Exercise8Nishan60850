import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException
    {
        Animal animal[]= new Animal[6];
        animal[0]= new Mammal("Revas",7,15,"Killer");
        animal[1]= new Dog("Marley",12,10,"Netherlanmds","white");
        animal[2]= new Bird("Sapta",6,3,"Cubis");
        animal[3]= new Fish("Snakzoi",3,2,"Jawless");
        animal[4]= new Blowfish("Susan",7,11,"France","Blow");
        animal[5]= new Pigeon("Pardom",60,30,"Atlantic",351);

        AnimalBehavior animalBehavior[]= new AnimalBehavior[3];
        animalBehavior[0]= new Dog("Son",3,10,"Moz","Yellow");
        animalBehavior[1]= (AnimalBehavior) new Pigeon("Willy",2,4,"Brazil",351);
        animalBehavior[2]= new Blowfish("Ben",1,2,"England","Yellow");


        for(Animal a:animal){
            a.move();
        }

        for (Animal a: animal){
            AnimalName.name(a.getNameNishan60850());

        }



    }
}
