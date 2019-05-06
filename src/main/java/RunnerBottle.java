public class RunnerBottle {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle(100);
        System.out.println(bottle.fullVolume());
        System.out.println(bottle.oneDrink());
        System.out.println(bottle.emptyBottle());
        System.out.println(bottle.fillBottle());

    }
}
