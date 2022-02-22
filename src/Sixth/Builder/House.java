package Sixth.Builder;

public class House {
    String wallsColor;
    String doorType;
    String pool;

    public String getWallsColor() {
        return wallsColor;
    }

    public void setWallsColor(String wallsColor) {
        this.wallsColor = wallsColor;
    }

    public String getDoorType() {
        return doorType;
    }

    public void setDoorType(String doorType) {
        this.doorType = doorType;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    @Override
    public String toString() {
        return "House{" +
                "wallsColor='" + wallsColor + '\'' +
                ", doorType='" + doorType + "\' " + pool +
                '}';
    }
}
