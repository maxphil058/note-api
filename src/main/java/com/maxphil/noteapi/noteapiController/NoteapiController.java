package com.maxphil.noteapi.noteapiController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxphil.noteapi.noteapiModel.NoteapiModel;
import com.maxphil.noteapi.noteapiService.NoteapiService;

@RestController
@RequestMapping("/api/notes")
public class NoteapiController {

	private final NoteapiService noteapiService;

	public NoteapiController(final NoteapiService noteapiService) {

		this.noteapiService = noteapiService;

	}

//	find by id
	@GetMapping("/{id}")
	public NoteapiModel getNote(@PathVariable Long id) {
		return noteapiService.getNote(id);
	}

//	get all notes
	@GetMapping()
	public List<NoteapiModel> getAllNotes() {
		return noteapiService.getAllNotes();
	}

//	post note
	@PostMapping
	public NoteapiModel saveNote(@RequestBody NoteapiModel noteapiModel) {

		return noteapiService.postNewNote(noteapiModel);
	}

//	delete note
	@DeleteMapping("/{id}")
	public NoteapiModel deleteNote(@PathVariable Long id) {
		return noteapiService.deleteNote(id);
	}

//	update note
	@PutMapping(("/{id}"))
	public NoteapiModel updateNote(@PathVariable Long id, @RequestBody NoteapiModel updatedNote) {

		return noteapiService.updateNote(id, updatedNote);
	}

}
