public abstract class Animal implements AnimalMove {
    String NameNishan60850;
    int ageNishan60850, weighNishan60850;

    public Animal(int age) {
        this.ageNishan60850 =age;
    }

    public void eatNishan60850(String meal){};
    protected abstract void getVoiceNishan60850();
    public Animal(){
        ageNishan60850 = weighNishan60850 =0;
        NameNishan60850 ="None";
    }
    public Animal(String name,int age , int weight){
        this.NameNishan60850 =name;
        this.ageNishan60850 =age;
        this.weighNishan60850 =weight;
    }
    public String getNameNishan60850(){return NameNishan60850;};
    public void setNameNishan60850(String name){this.NameNishan60850 =name;};
    public int getAgeNishan60850(){return this.ageNishan60850;};
    public void setAgeNishan60850(int w){this.ageNishan60850 =w;};
    public int getWeighNishan60850(){return this.weighNishan60850;};
    public void setWeighNishan60850(int w){this.weighNishan60850 =w;};


}