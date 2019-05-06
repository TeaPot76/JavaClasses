public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int fullVolume(){
        return this.volume = 100;
    }

    public int oneDrink(){
        return this.volume - 10;
    }

    public int emptyBottle(){
        return this.volume = 0;
    }

    public int fillBottle(){
        return fullVolume();
    }

}
