package ref.ex;
import java.util.Scanner;

public class ProductOrderMain03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 개수 : ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] products=new ProductOrder[amount];
        for (int i = 0; i < products.length; i++) {
            System.out.println((i+1)+"번째 주문 정보.");
            System.out.print("메뉴 입력 : ");
            String menu=scanner.nextLine();
            System.out.print("가격 : ");
            int price=scanner.nextInt();
            System.out.print("수량 : ");
            int quantity=scanner.nextInt();

            products[i] = MakeProduct(menu, price, quantity);
            scanner.nextLine();
        }

        int totalPrice = CalProduct(products);

        ShowProduct(products,totalPrice);
    }

    static ProductOrder MakeProduct() {
        ProductOrder product=new ProductOrder();

        return product;
    }

    static ProductOrder MakeProduct(String a, int b, int c) {
        ProductOrder p=new ProductOrder();
        p.productName=a;
        p.price=b;
        p.quantity=c;
        return p;
    }

    static int CalProduct(ProductOrder[] products) {
        int total=0;
        for (ProductOrder product : products) {
            total+=product.price*product.quantity;

        }
        return total;
    }

    static void ShowProduct(ProductOrder[] products, int total) {
        for (ProductOrder product : products) {
            System.out.println("이름 : "+product.productName
            +" 가격 : "+product.price+" 개수 : "+product.quantity);
        }
        System.out.println("total = " + total);
    }
}
