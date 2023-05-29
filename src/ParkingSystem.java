public class ParkingSystem {
    private final int big;
    private final int medium;
    private final int small;
    private int bigCount;
    private int medCount;
    private int smallCount;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
        this.bigCount = 0;
        this.medCount = 0;
        this.smallCount = 0;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (this.bigCount < this.big) {
                    this.bigCount++;
                    return true;
                } else {
                    return false;
                }

            case 2:
                if (this.medCount < this.medium) {
                    this.medCount++;
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (this.smallCount < this.small) {
                    this.smallCount++;
                    return true;
                } else {
                    return false;
                }
        }
        return false;
    }
}
