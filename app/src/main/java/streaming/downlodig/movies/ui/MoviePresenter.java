package streaming.downlodig.movies.ui;

import streaming.downlodig.movies.modle.modulegetmovies;   // Presenter Give data from modle modulegetmovies

public  class MoviePresenter {   // MVP and ButterKnife for not to repeat code   - Convert from MVC to MVP beacous  MVP need class presenter
        MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }
    public modulegetmovies GetMoviesFromDatabase(){                     // Controller handel get data from database     MVP
        return new modulegetmovies( "dev Abdullah","7-9-1989","Good movie",1 );

    }
// Fuction Give me name from mainAcivity
    public void getMoviewName(){
        view.onGetMovieName(GetMoviesFromDatabase().getName());
    }


}
