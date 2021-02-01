package com.example.gmgithubconnect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CommitListAdapter extends RecyclerView.Adapter<CommitListAdapter.CommitViewHolder> {
    private ArrayList<CommitModel> commit_list;

    public CommitListAdapter(ArrayList<CommitModel> commit_list){
        this.commit_list = commit_list;
    }

    public void updateCommitList(List<CommitModel> update_list){
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
        TextView name_tv = holder.itemView.findViewById(R.id.name);
        TextView message_tv = holder.itemView.findViewById(R.id.message);
        TextView commit_tv = holder.itemView.findViewById(R.id.commit);

        name_tv.setText(commit_list.get(position).commit_author);
        message_tv.setText(commit_list.get(position).commit_message);
        commit_tv.setText(commit_list.get(position).commit_id);
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
