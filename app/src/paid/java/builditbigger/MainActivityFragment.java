package builditbigger;

import com.example.sammengistu.joketellerlib.JokeTellerActivity;
import com.udacity.gradle.builditbigger.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public static final String JOKE = "JOKE";

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        Button tellJokeButton = (Button)root.findViewById(R.id.tellJoke_button);
        tellJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tellJoke();
            }
        });
        Log.i("FragmentMain", "called FragMain");

        return root;
    }

    public void tellJoke(){

        Intent intent = new Intent(getActivity(), JokeTellerActivity.class);
        //TODO: get jokes from Google Cloud endpoint
        intent.putExtra(JOKE, getActivity().getString(R.string.joke));
        startActivity(intent);
    }
}
