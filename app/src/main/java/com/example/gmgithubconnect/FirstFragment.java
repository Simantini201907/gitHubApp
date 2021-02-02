package com.example.gmgithubconnect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {
    private CommitViewModel viewModel;
    private CommitListAdapter commitListAdapter = new CommitListAdapter(new ArrayList<>());
    RecyclerView commit_list_view;
    TextView error_message;
    ProgressBar loading_message;
    SwipeRefreshLayout swipe_layout;

    public FirstFragment() {

    }
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);
        commit_list_view = view.findViewById(R.id.recyclerView);
        error_message = view.findViewById(R.id.list_error);
        loading_message = view.findViewById(R.id.loading_message);
        swipe_layout = view.findViewById(R.id.swipe_id);
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(CommitViewModel.class);
        viewModel.refresh();
        commit_list_view.setLayoutManager(new LinearLayoutManager(getContext()));
        commit_list_view.setAdapter(commitListAdapter);
        observeModel();

       /* view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        }); */
    }

    private void observeModel() {
        viewModel.commit_list.observe(getViewLifecycleOwner(), new Observer<List<CommitModel>>() {
                    @Override
                    public void onChanged(List<CommitModel> commitModels) {
                        if(commitModels != null && commitModels instanceof  List){
                            commit_list_view.setVisibility(View.VISIBLE);
                            commitListAdapter.updateCommitList(commitModels);
                        }
                    }
                });

                viewModel.loading_error.observe(getViewLifecycleOwner(), new Observer<Boolean>() {
                    @Override
                    public void onChanged(Boolean aBoolean) {
                        if (aBoolean != null && aBoolean instanceof Boolean) {
                            error_message.setVisibility(aBoolean ? View.VISIBLE : View.GONE);
                        }
                    }
                });

                viewModel.loading_data.observe(getViewLifecycleOwner(), new Observer<Boolean>() {
                    @Override
                    public void onChanged(Boolean aBoolean) {
                        if(aBoolean != null && aBoolean instanceof Boolean){
                            loading_message.setVisibility(aBoolean ? View.VISIBLE : View.GONE);
                            if(aBoolean){
                                error_message.setVisibility(View.GONE);
                                commit_list_view.setVisibility(View.GONE);
                            }
                        }
                    }
                });


    }
}