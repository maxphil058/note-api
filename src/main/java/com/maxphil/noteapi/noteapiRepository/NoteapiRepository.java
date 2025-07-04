package com.maxphil.noteapi.noteapiRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxphil.noteapi.noteapiModel.NoteapiModel;

public interface NoteapiRepository extends JpaRepository<NoteapiModel, Long> {

}
