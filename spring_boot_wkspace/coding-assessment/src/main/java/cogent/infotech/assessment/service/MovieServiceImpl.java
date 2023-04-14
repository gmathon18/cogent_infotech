package cogent.infotech.assessment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.assessment.entity.Movie;
import cogent.infotech.assessment.repository.MovieRepository;

@Service 
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	//save operation
	@Override
	public Movie saveMovie(Movie movie) {
		
			return movieRepository.save(movie);
	}

	//read list operation
	@Override
	public List<Movie> fetchMovieList() {
		
		return (List<Movie>)movieRepository.findAll();
	}

	//get movie by id operation
	public Optional<Movie> get(long movieId){
		  return movieRepository.findById(movieId);
	  }
	
	//delete movie operation
	public void delete(Movie movie) {
		
		movieRepository.delete(movie);
	}

	@Override
	public Movie get(String movieName) {
		
		List<Movie> l = (List<Movie>)movieRepository.findAll();
		for(Movie m : l)
		{
			if(((Movie) l).getMovieName() == movieName) {
				return m;
			}
		}
		return null;
		
	}
	

}
