class Mammal extends Animal implements AnimalMove, AnimalBehavior, AnimalName {
    private String orderNishan60850;



    public Mammal() {
        super();
        orderNishan60850 = " ";
    }

    public Mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.orderNishan60850 = order;
    }

    public Mammal(int age, String order) {
        super(age);
        this.orderNishan60850 = order;
    }

    public void SleepNishan60850() {
        System.out.println("zzzZZZZzzz");
    }

    @Override
    public void getVoiceNishan60850() {
        System.out.println("I am Making Sound huahauahuah");
    }

    @Override
    public void eatNishan60850(String meal) {
        System.out.println("Mamal is eating a " + meal);
    }

    public String getOrderNishan60850() {
        return this.orderNishan60850;
    }

    ;

    public void setOrderNishan60850(String w) {
        this.orderNishan60850 = w;
    }

    ;

    public String ToStringBancha56351() {
        return "Mammal :\n " + "Order : " + orderNishan60850;
    }




    @Override
    public void Sleep(String Sound) {
        Sound = "Zzzzz";
    }

}
