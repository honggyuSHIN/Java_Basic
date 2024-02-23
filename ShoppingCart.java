package access.ex;

public class ShoppingCart {
    Item[] items=new Item[10];
    int count=0;

    public void addItem(Item item) {
        if (count >= items.length) {
            return;
        }
        items[count]=item;
        count++;
    }

    public void displayItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i].showItem());
            System.out.println(items[i].calItem());
        }
//        for (Item item : items) {
//            if (item != null) {
//                System.out.println("item.name = " + item.showItem());
//                System.out.println("item. = " + item.calItem());
//            }
//
//        }
        System.out.println("총 가격 : "+calTotalPrice());
    }

    private int calTotalPrice() {
        int totalPrice=0;
        for (int i = 0; i < count; i++) {
            totalPrice+=items[i].calItem();
        }
        return totalPrice;
    }
}
