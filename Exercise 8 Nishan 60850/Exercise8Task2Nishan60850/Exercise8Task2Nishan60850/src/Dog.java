public class Dog extends Mammal implements AnimalBehavior,AnimalMove {
    private String FavColorNishan60850;

    Dog() {
        super();
        FavColorNishan60850 = "Black";
    }

    public Dog(String name, int age, int weight, String order, String favColor) {
        super(name, age, weight, order);
        this.FavColorNishan60850 = favColor;
    }

    public Dog(int age, String order, String favColor) {
        super(age, order);
        this.FavColorNishan60850 = favColor;
    }

    public void WakeUp() {
        System.out.println("I Just Woke Up _");
    }

    @Override
    public void SleepNishan60850() {
        System.out.println("The Dog Is Slepping");
    }

    @Override
    public void getVoiceNishan60850() {
        System.out.println("gukguk");
    }

    @Override
    public void eatNishan60850(String meal) {
        System.out.println("I am Eating my Fish Tuna");
    }

    public String getFavColorNishan60850() {
        return this.FavColorNishan60850;
    }

    ;

    public void setFavColorNishan60850(String w) {
        this.FavColorNishan60850 = w;
    }

    ;

    public String ToString() {
        return "Dog :\n " + "Favorite Color : " + FavColorNishan60850;
    }


    @Override
    public void Sleep(String Sound) {
        Sound = "Zzzzz";
        System.out.println(Sound);
    }

    @Override
    public void move() {
        System.out.println("the dog runs");
    }
}