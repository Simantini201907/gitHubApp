package com.example.gmgithubconnect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CommitListAdapter extends RecyclerView.Adapter<CommitListAdapter.CommitViewHolder> {
    private ArrayList<ModelCommit> commit_list;

    public CommitListAdapter(ArrayList<ModelCommit> commit_list){
        this.commit_list = commit_list;
    }

    public void updateCommitList(List<ModelCommit> update_list){
        commit_list.clear();
        commit_list.addAll(update_list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CommitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View curr_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_commit, parent, false);
        return new CommitViewHolder(curr_view);
    }

    @Override
    public void onBindViewHolder(@NonNull CommitViewHolder holder, int position) {
         
    }

    @Override
    public int getItemCount() {
        return commit_list.size();
    }

    class CommitViewHolder extends RecyclerView.ViewHolder {

        public View itemView;
        public CommitViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
        }
    }


}
