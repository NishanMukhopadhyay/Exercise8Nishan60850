class Fish extends Animal implements AnimalMove {
    private String GenNishan60850;



    public Fish(){
        super();
        GenNishan60850 =" ";
    }
    public Fish(String name,int age , int weight , String General_type){
        super(name,age,weight);
        this.GenNishan60850 =General_type;
    }
    public Fish(int age , String General_type){
        super(age);
        this.GenNishan60850 =General_type;
    }

    public void Search_For_Food(){System.out.println("im looking for food ");}

    @Override
    public void getVoiceNishan60850() {
        System.out.println("Blubuk Blubuk Blubuk");
    }
    @Override
    public void eatNishan60850(String meal) {
        System.out.println("Fish is eating a "+ meal);
    }
    public String getGTypeNishan60850(){return this.GenNishan60850;};
    public void setTypeNishan60850(String w){this.GenNishan60850 =w;};
    public String ToString(){
        return "Fish :\n "+"General Type of Fish : "+ GenNishan60850;
    }

    @Override
    public void move() {
        System.out.println("Fish move");
    }
}