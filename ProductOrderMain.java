package class01.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder product01=new ProductOrder();
        ProductOrder product02=new ProductOrder();
        ProductOrder product03=new ProductOrder();

        ProductOrder[] products=new ProductOrder[3];

        products[0]=product01;
        products[1]=product02;
        products[2]=product03;
        int totalPrice=0;
        product01.productName = "두부";
        product01.price=2000;
        product01.quantity=2;
        product02.productName = "김치";
        product02.price=5000;
        product02.quantity= 1;
        product03.productName = "콜라";
        product03.price=1500;
        product03.quantity=2 ;

        for (ProductOrder product : products) {
            System.out.println("상품명 : "+product.productName
            +" 가격 : "+product.price+" 수량 : "+product.quantity);
            totalPrice+=product.price*product.quantity;
        }
        System.out.println("총 결제 금액 : "+totalPrice );




    }

}
