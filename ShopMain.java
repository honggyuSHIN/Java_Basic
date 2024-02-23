package extends01.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000,"seo");
        Movie movie = new Movie("영화1", 18000,"감독1", "배우1");
        book.print();
        album.print();
        movie.print();
        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
    /*
    클래스에 final이 붙을 경우 상속을 안 하겠다는 뜻.
    Item 클래스에 final을 붙이면 자식 클래스들이 상속을 못 함.

    메서드에 final이 붙으면 오버라이딩을 못 한다는 뜻.(오버라이딩은 변경이기 때문에)
    print()에 final을 붙이면 자식 클래스에서 오버라이딩을 못 함.
     */
}
