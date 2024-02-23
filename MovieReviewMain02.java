package class01.ex;

public class MovieReviewMain02 {
    public static void main(String[] args) {
        MovieReview movie01=new MovieReview();
        MovieReview movie02=new MovieReview();

        movie01.title = "인셉션";
        movie01.review = "인생은 무한 루프";
        movie02.title = "어바웃 타임";
        movie02.review = "인생 시간 영화";

        MovieReview[] movies=new MovieReview[2];
        movies[0]=movie01;
        movies[1]=movie02;

        for (MovieReview movie : movies) {
            System.out.println(movie.title);
            System.out.println(movie.review);

        }




    }
}
