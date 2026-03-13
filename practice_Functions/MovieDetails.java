package practice_Functions;

public class MovieDetails {
	static void getMovieDetail(String moviename,String moviedescription,int movieduration,String movielanguage,
			String moviereleasedate,String moviecountry,String moviegenre) {
			System.out.println("Movie Title : "+moviename);
			System.out.println("Movie Description : "+moviedescription);
			System.out.println("Movie Duration : "+movieduration);
			System.out.println("Movie Language : "+movielanguage);
			System.out.println("Movie Release Date : "+moviereleasedate);
			System.out.println("Movie Country : "+moviecountry);
			System.out.println("Movie Genre : "+moviegenre);
		}
	public static void main(String[] args) {
		String moviename = "AAA";
		String moviedescription = "Dramaof1945";
		int movieduration = 3;
		String movielanguage = "English";
		String moviereleasedate = "25/03/2022";
		String moviecountry = "XYZ";
		String moviegenre = "Thriller";
		System.out.println("Movie Detail");
		getMovieDetail(moviename, moviedescription, movieduration, movielanguage, moviereleasedate,
				moviecountry, moviegenre);
				System.out.println("---");
				} }
		
	
