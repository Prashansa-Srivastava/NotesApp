package com.prashansasrivastava.notesapp;

import androidx.cardview.widget.CardView;

import com.prashansasrivastava.notesapp.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
