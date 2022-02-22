package Sixth.Builder;

public class Director {
    Builder builder;
    public Director(Builder builder){
        this.builder = builder;
        createObject();
    }
    public void changeBuilder(Builder builder){
        this.builder = builder;
        createObject();
    }
    private void createObject(){
        builder.addSwimmingPool();
        builder.setDoorType();
        builder.setWallsColor();
    }
    public void printResult(){
        System.out.println(builder.getResult().toString());
    }
}
