public class Printer {
    private int numberOfSheets;
    private int toner;


    public Printer(final int numberOfSheets, final int toner) {
        this.numberOfSheets = numberOfSheets;
        this.toner = toner;

    }

    public void print(final int numberOfSheetsToPrint, final int numberOfCopies) {
        final int totalNumberOfPrints = numberOfSheetsToPrint * numberOfCopies;
        if (totalNumberOfPrints <= this.numberOfSheets) {
            if (this.toner >= totalNumberOfPrints) {

                System.out.println("printing");
                this.toner -= totalNumberOfPrints;
            } else {
                System.out.println("not enough toner");
            }

        } else {
            System.out.println("not enough paper");
        }
    }

    public void addPaper(final int paperToAdd) {
        this.numberOfSheets += paperToAdd;
    }


}
