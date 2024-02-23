package ref.exMine;

public class ProductOrderMain02 {
    public static void main(String[] args) {
        ProductOrder[] products=new ProductOrder[3];
        products[0]=MakeWriteProduct("두부", 2000, 2);
        products[1]=MakeWriteProduct("김치", 5000, 1);
        products[2]=MakeWriteProduct("콜라", 1500, 2);

        int totalPrice = CalProduct(products);

        ShowProduct(products,totalPrice);
    }

    static ProductOrder MakeProduct() {
        ProductOrder product=new ProductOrder();

        return product;
    }

    static ProductOrder MakeWriteProduct(String a, int b, int c) {
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
