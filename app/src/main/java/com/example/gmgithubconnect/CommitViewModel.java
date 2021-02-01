package com.example.gmgithubconnect;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class CommitViewModel extends AndroidViewModel {

    public MutableLiveData<List<CommitModel>> commit_list = new MutableLiveData<List<CommitModel>>();
    public MutableLiveData<Boolean>loading_error = new MutableLiveData<Boolean>();
    public MutableLiveData<Boolean>loading_data = new MutableLiveData<Boolean>();

    public CommitViewModel(@NonNull Application application) {
        super(application);
    }

    //Function to retrieve data
    public void refresh(){
        CommitModel data1 = new CommitModel("Simantini","0z21hdhjsgdyegfhfshsys","First commit message");
        CommitModel data2 = new CommitModel("Simantini","0z21hdhjsgdyegfhfsdsds","Second commit message");
        CommitModel data3 = new CommitModel("Simantini","0z2156hg45ddjhddhfshsys","Third commit message");
        CommitModel data4 = new CommitModel("Simantini","0z2138yhd543nbdfhfshsys","Fourth commit message");
        CommitModel data5 = new CommitModel("Simantini","0z25545fdfd4yegfhfshsys","Fifth commit message");
        CommitModel data6 = new CommitModel("Simantini","0z2232gfhfgdyegfhfshsys","Sixth commit message");
        CommitModel data7 = new CommitModel("Simantini","0z21hdhjsgd453dsw6ghsys","Seventh commit message");
        CommitModel data8 = new CommitModel("Simantini","0z267gdghy34567ssmshsys","Eighth commit message");
        CommitModel data9 = new CommitModel("Simantini","0z21hdhjsgdyegfhfshsys","Ninth commit message");
        CommitModel data10 = new CommitModel("Simantini","0z21hdhjsgdyegfhfshsys","Tenth commit message");
        CommitModel data11 = new CommitModel("Simantini","0z21hdhjsgdyegfhfshsys","Eleventh commit message");
        CommitModel data12 = new CommitModel("Simantini","0z21hdhjsgdyegfhfshsys","Twelveth commit message");
        CommitModel data13 = new CommitModel("Simantini","0z21hdhjsgdyegfhfshsys","Thirteenth commit message");
        ArrayList<CommitModel> cur_list = new ArrayList<>();
        cur_list.add(data1);
        cur_list.add(data2);
        cur_list.add(data3);
        cur_list.add(data4);
        cur_list.add(data5);
        cur_list.add(data6);
        cur_list.add(data7);
        cur_list.add(data8);
        cur_list.add(data9);
        cur_list.add(data10);
        cur_list.add(data11);
        cur_list.add(data12);
        cur_list.add(data13);

        commit_list.setValue(cur_list);
        loading_error.setValue(false);
        loading_data.setValue(false);
    }
}
