package Sixth.Builder;

public class SecondHouseBuilder implements Builder{
    House house;
    public SecondHouseBuilder(){
        house = new House();
    }
    @Override
    public void setWallsColor() {
        house.setWallsColor("red");
    }

    @Override
    public void setDoorType() {
        house.setDoorType("birch");
    }

    @Override
    public void addSwimmingPool() {
        house.setPool("pool included");
    }

    public House getResult(){
        return house;
    }
}
