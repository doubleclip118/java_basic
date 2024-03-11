package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] review1 =new MovieReview[2];
        review1[0] = new MovieReview();
        review1[0].title = "인셉션";
        review1[0].review = "인생은 무한 루프";
        review1[1] = new MovieReview();
        review1[1].title = "어바웃 타임";
        review1[1].review = "인생 시간 영화!";

        for (MovieReview movieReview : review1) {
            System.out.println("영화 제목: " + movieReview.title+", 리뷰:"+movieReview.review);
        }
    }
}
