package com.example.gmgithubconnect;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import static android.content.Context.MODE_PRIVATE;

public class SecondFragment extends Fragment {
    SharedPreferences pref;
    EditText enter_text;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_second, container, false);
        enter_text = view.findViewById(R.id.textview_second);
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Save the user_name first
                SharedPreferences.Editor editor = getContext().getSharedPreferences("github_username", MODE_PRIVATE).edit();
                editor.putString("github_username", enter_text.toString());
                editor.apply();

                // To load the data at a later time
                SharedPreferences prefs = getContext().getSharedPreferences("github_username", MODE_PRIVATE);
                String loadedString = prefs.getString("github_username", "sim0512");
                Log.d("GITHUBCODE","The loaded string value is " + loadedString);
                
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_firstScreen);
            }
        });
        //action_secondScreen
    }
}