package com.example.devcom;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;


public class myadapter extends FirebaseRecyclerAdapter {
    class myviewholder extends RecyclerView.ViewHolder {
        public myviewholder(@NonNull view itemview) {
            super(itemview);

        }
    }
}
