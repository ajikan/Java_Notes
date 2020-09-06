public class Printer {
    private int tonerLevel = 50;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int fillTonerLevel(int addToner) {
        if (addToner > 0 && addToner <= 100) {
            if (this.tonerLevel + addToner <= 100) {
                this.tonerLevel += addToner; 
                return this.tonerLevel;
            }
            else {
                System.out.println("Too much tonerLevel, going over 100%.");
                return -1;
            }
        }
        else {
            System.out.println("Give a correct amount between 1 and 100 inclusive");
            return -1;
        }
    }

    public int print(int pages) {
        if (this.isDuplex) {
            pages = pages / 2 + pages % 2;
            System.out.println("Printing in duplex mode.");
        }
        this.pagesPrinted += pages;
        System.out.println(pages + " pages has been printed");
        return pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }


}
