package class01.ex;

public class MovieReviewMain01 {
    public static void main(String[] args) {
        MovieReview movie01=new MovieReview();
        MovieReview movie02=new MovieReview();
        movie01.title = "인셉션";
        movie01.review = "인생은 무한 루프";
        movie02.title = "어바웃 타임";
        movie02.review = "인생 시간 영화!";

        System.out.println("영화 제목 : "+movie01.title+", 리뷰 : "+movie01.review);
        System.out.println("영화 제목 : "+movie02.title+", 리뷰 : "+movie02.review);
    }
}
