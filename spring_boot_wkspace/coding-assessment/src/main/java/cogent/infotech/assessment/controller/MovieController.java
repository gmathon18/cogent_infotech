package cogent.infotech.assessment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import cogent.infotech.assessment.entity.Movie;

import cogent.infotech.assessment.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	//Save Operation
	@PostMapping("/movies")
	public Movie saveMovie(@Validated @RequestBody Movie movie)
	{
		return movieService.saveMovie(movie);
	}
	
	//Read Operation
	@GetMapping("/movies")
	public List<Movie> fetchCinemaList()
	{
		return movieService.fetchMovieList();
	}
	
	//Put Operation
	@PutMapping("/movies")
	public Movie updateMovie(@Validated @RequestBody Movie movie) {
		
		return movieService.saveMovie(movie);
	}
	
    // Read operation by id
    @GetMapping("/movies/{id}")
    public Movie get(@PathVariable("id") Integer id)
    {	
    	Optional<Movie> i = movieService.get(id);
		return i.get();
        
    }
    
    /*
    // Read operation by name
    @GetMapping("/movies/{movieName}")
    public Movie get(@PathVariable("movieName") String name)
    {	
    	Movie i = movieService.get(name);
		return i;
        
    }
    */
	
	//Delete Operation
	@DeleteMapping("/movies")
	public String delete(@RequestParam(value="id") Integer id) {
		Optional<Movie> i = movieService.get(id);
		movieService.delete(i.get());
		return "Movie id " + id + " deleted successfully";
	}
	
}
