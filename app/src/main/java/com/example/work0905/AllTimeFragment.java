package com.example.work0905;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class AllTimeFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_time, container, false);

        ListView listView = view.findViewById(R.id.all_time_listview);

        LoggedMonths jan = new LoggedMonths("January", 123, 123, 123);
        LoggedMonths jan1 = new LoggedMonths("January", 123, 234, 234);
        LoggedMonths jan2 = new LoggedMonths("January", 123, 543, 345);
        LoggedMonths jan3 = new LoggedMonths("January", 34, 232, 234);
        LoggedMonths jan4 = new LoggedMonths("January", 123, 123, 123);
        LoggedMonths jan5 = new LoggedMonths("January", 123, 234, 234);
        LoggedMonths jan6 = new LoggedMonths("January", 123, 543, 345);
        LoggedMonths jan7 = new LoggedMonths("January", 34, 232, 234);

        ArrayList<LoggedMonths> loggedMonthsList = new ArrayList<>();
        loggedMonthsList.add(jan);
        loggedMonthsList.add(jan1);
        loggedMonthsList.add(jan2);
        loggedMonthsList.add(jan3);
        loggedMonthsList.add(jan4);
        loggedMonthsList.add(jan5);
        loggedMonthsList.add(jan6);
        loggedMonthsList.add(jan7);

        LoggedMonthsAdapter adapter = new LoggedMonthsAdapter(getContext(), R.layout.custom_listview, loggedMonthsList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openDialog();
            }
        });

        return view;
    }

    public void openDialog(){
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getChildFragmentManager(), "Example Dialog");
    }
}
