package com.Tugas_UTS_Genap_2023_AKB_IF5_10120194;

import android.database.Cursor;

import com.Tugas_UTS_Genap_2023_AKB_IF5_10120194.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

// OmanSubadri_1012094_IF5