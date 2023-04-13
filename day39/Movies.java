//Write a Java class called Movie that has fields for the movie's title, director, and release year
import java.util.*;
class Movie implements Comparable<Movie>{
  private String movieDirector;
  private String movieTitle;
  private int releaseYear;
  Movie(String movieTitle,String movieDirector,int releaseYear){
    this.movieDirector=movieDirector;
    this.movieTitle=movieTitle;
    this.releaseYear=releaseYear;
  }

  public int compareTo(Movie m) {
  if(releaseYear<m.releaseYear){
    return 1;
  }
  else if(releaseYear>m.releaseYear){
    return -1;
  }
  else{
     return 0;
  }
 
}
public String getMovieDirector() {
	return movieDirector;
}
public void setMovieDirector(String movieDirector) {
	this.movieDirector = movieDirector;
}
public String getMovieTitle() {
	return movieTitle;
}
public void setMovieTitle(String movieTitle) {
	this.movieTitle = movieTitle;
}
public int getReleaseYear() {
	return releaseYear;
}
public void setReleaseYear(int releaseYear) {
	this.releaseYear = releaseYear;
}
  
}

class Movies{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    ArrayList<Movie> film=new ArrayList<Movie>();
    for(int i=0;i<3;i++){
      System.out.println("enter the title");
      String movieTitle=s.next();
      System.out.println("enter the movie director name");
      String movieDirector=s.next();
      System.out.println("enter release year");
      int releaseYear=s.nextInt();
      film.add(new Movie( movieTitle,movieDirector,releaseYear));
    }
   Collections.sort(film);
    for(Movie m:film){
      System.out.println(m.getMovieDirector()+"  "+m.getMovieTitle()+"  "+m.getReleaseYear());
    }
  }
}