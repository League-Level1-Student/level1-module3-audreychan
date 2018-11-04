
public class NetflixMovie {
public static void main(String[] args) {
	Movie infinityWar = new Movie("Avengers: Infinity War", 9);
	Movie aQR = new Movie("AQR", 1);
	Movie survivor = new Movie("Survivor", 7);
	Movie interstellar = new Movie("Interstellar", 10);
	Movie rogueNation = new Movie("Mission:Impossible - Rogue Nation", 8);
	NetflixQueue queue = new NetflixQueue();
	queue.addMovie(infinityWar);
	queue.addMovie(aQR);
	queue.addMovie(survivor);
	queue.addMovie(interstellar);
	queue.addMovie(rogueNation);
	queue.printMovies();
	queue.sortMoviesByRating();
	System.out.println(" ");
	System.out.println("The best movie is " + queue.getBestMovie());
	System.out.println("The second best movie is " + queue.getMovie(1));
}
}
