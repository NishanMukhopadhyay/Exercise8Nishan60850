public class Blowfish extends Fish implements AnimalName, AnimalBehavior, AnimalMove {
    private String TypeNishan60850;

    public Blowfish() {
        super();
        TypeNishan60850 = "Super Blow Fish ";
    }

    public Blowfish(String name, int age, int weight, String order, String Type) {
        super(name, age, weight, order);
        this.TypeNishan60850 = Type;
    }

    public Blowfish(int age, String order, String Type) {
        super(age, order);
        this.TypeNishan60850 = Type;
    }

    public void travel() {
        System.out.println("I'm going  _");
    }

    @Override
    public void Search_For_Food() {
        System.out.println("The Blowfish is looking for something to eat ");
    }

    @Override
    public void getVoiceNishan60850() {
        System.out.println("Blubuk Blubuk Blubuk");
    }

    @Override
    public void eatNishan60850(String meal) {
        System.out.println("I am Eating " + meal);
    }

    public String getType() {
        return this.TypeNishan60850;
    }

    ;

    public void setType(String w) {
        this.TypeNishan60850 = w;
    }

    ;

    public String ToString() {
        return "BlowFish :\n " + "Type : " + TypeNishan60850;
    }

    @Override
    public void SleepNishan60850() {

    }

    @Override
    public void Sleep(String Sound) {
        Sound = "Zzzzzz";
        System.out.println(Sound);
    }

    @Override
    public void move() {
        System.out.println("Blowfish swim");
        ;
    }
}
