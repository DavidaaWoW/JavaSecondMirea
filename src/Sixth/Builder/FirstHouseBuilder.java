package Sixth.Builder;

public class FirstHouseBuilder implements Builder{
    House house;
    public FirstHouseBuilder(){
        house = new House();
    }
    @Override
    public void setWallsColor() {
        house.setWallsColor("blue");
    }

    @Override
    public void setDoorType() {
        house.setDoorType("oak");
    }

    @Override
    public void addSwimmingPool() {
        house.setPool("");
    }

    public House getResult(){
        return house;
    }
}
