package cogent.infotech.assessment.service;

import java.util.List;
import java.util.Optional;


import cogent.infotech.assessment.entity.Movie;

public interface MovieService {

	//save operation
	Movie saveMovie(Movie movie);
	
	//read operation
	List<Movie> fetchMovieList();
	
    //Delete Operation
    public void delete(Movie movie);
    
    //Get Operation
    public Optional<Movie> get(long movieId);
	
    //Get Operation by Movie Name
    public Movie get(String movieName);

}
