package builditbigger;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.example.sammengistu.joketellerlib.JokeTellerActivity;
import com.udacity.gradle.builditbigger.*;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Pair;
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
//                tellJoke();
                new GetJokes().execute(new Pair<Context, String>(getActivity(), "Manfred"));
            }
        });

        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        return root;
    }

    public void tellJoke(){

        Intent intent = new Intent(getActivity(), JokeTellerActivity.class);
        //TODO: get jokes from Google Cloud endpoint
        intent.putExtra(JOKE,

            getActivity().getString(R.string.joke)
        );

//        MyJokesApi myJokesApi = new MyJokesApi()
        startActivity(intent);
    }
}
