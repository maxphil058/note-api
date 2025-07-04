package com.maxphil.noteapi.noteapiService;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.maxphil.noteapi.noteapiModel.NoteapiModel;
import com.maxphil.noteapi.noteapiRepository.NoteapiRepository;

@Service
public class NoteapiService {

	private final NoteapiRepository noteapiRepository;

	public NoteapiService(final NoteapiRepository noteapiRepository) {

		this.noteapiRepository = noteapiRepository;

	}

//	 get id task
	public NoteapiModel getNote(Long id) {

		Optional<NoteapiModel> noteToFind = noteapiRepository.findById(id);
		if (noteToFind.isPresent()) {
			return noteToFind.get();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}

//	get all notes
	public List<NoteapiModel> getAllNotes() {

		return noteapiRepository.findAll();
	}

//	save note
	public NoteapiModel postNewNote(NoteapiModel noteapiModel) {

		return noteapiRepository.save(noteapiModel);
	}

//	delete note
	public NoteapiModel deleteNote(Long id) {

		Optional<NoteapiModel> potNoteToDelete = noteapiRepository.findById(id);

		if (potNoteToDelete.isPresent()) {
			NoteapiModel noteToDelete = potNoteToDelete.get();
			noteapiRepository.delete(noteToDelete);
			return noteToDelete;
		}
		return null;
	}
//update note

	public NoteapiModel updateNote(Long id, NoteapiModel updatedNote) {

		Optional<NoteapiModel> potNoteToUpdate = noteapiRepository.findById(id);
		if (potNoteToUpdate.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		NoteapiModel noteToUpdate = potNoteToUpdate.get();

		if (updatedNote.getTitle() != null && !updatedNote.getTitle().isBlank()) {
			noteToUpdate.setTitle(updatedNote.getTitle());
		}

		if (updatedNote.getContent() != null && !updatedNote.getContent().isBlank()) {
			noteToUpdate.setContent(updatedNote.getContent());
		}

		return noteapiRepository.save(noteToUpdate);

	}
}
