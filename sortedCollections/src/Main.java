public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 4.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("chair", 5.50, 7);
        stockList.addStock(temp);

        temp = new StockItem("refrigerator", 8.0, 7);
        stockList.addStock(temp);

        temp = new StockItem("television", 10.0,5);
        stockList.addStock(temp);

        temp = new StockItem("laptop", 9.0, 100);
        stockList.addStock(temp);

        temp = new StockItem("water bottle", 0.12, 10000);
        stockList.addStock(temp);

        temp = new StockItem("cold drink", 1.50, 5000);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket ayushsBasket=new Basket("Ayush");
        sellItem(ayushsBasket,"car",1);
        System.out.println(ayushsBasket);

        sellItem(ayushsBasket,"car",1);
        System.out.println(ayushsBasket);

        sellItem(ayushsBasket,"car",1);
        sellItem(ayushsBasket,"bag",5);
        System.out.println(ayushsBasket);

        sellItem(ayushsBasket,"cold drink",4);
        sellItem(ayushsBasket,"car",1);
        sellItem(ayushsBasket,"cake",4);
        sellItem(ayushsBasket,"refrigerator",2);
        System.out.println(ayushsBasket);
        System.out.println(stockList);
    }
    public static int sellItem(Basket basket,String item,int quantity){
        StockItem stockItem=stockList.get(item);
        if(stockItem==null){
            System.out.println("We don't sell "+item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) !=0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return 0;
    }
}
