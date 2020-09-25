package streaming.downlodig.movies.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movies.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StreamingDownlodigMovies extends AppCompatActivity implements View.OnClickListener, MovieView { //   الاكتفتى ده مسؤلة عن ال ((interface)UI

    MoviePresenter presenter;
    @BindView(R.id.textViewMoves)
    TextView movieName;
    @BindView(R.id.button)
    Button getDatafrombatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ButterKnife.bind( this );


        getDatafrombatabase.setOnClickListener( this );

        presenter = new MoviePresenter( this );

    }

    @Override
    public void onClick(View view) {               // Controller handel userinput    MVP
        // if(view.getId() == R.id.bottom)    // second method     // Not Working
        {
            //  getDataMovies();
        }

        getDatafrombatabase.setOnClickListener( new View.OnClickListener() {    // MVP
            @Override
            public void onClick(View v) {           // second method
                presenter.getMoviewName();
            }
        } );
        switch (view.getId()) {

        }
    }


    @Override
    public void onGetMovieName(String name) {
        movieName.setText( name );
    }
}