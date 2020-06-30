package net.alterapp.miniproject.service;

import net.alterapp.miniproject.domain.Library;
import net.alterapp.miniproject.repository.LibraryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    private final LibraryRepo libraryRepo;

    public LibraryService(LibraryRepo libraryRepo) {
        this.libraryRepo = libraryRepo;
    }



    public List<Library> findAll(){
        return libraryRepo.findAllByDeletedAtIsNotNull();
    }

}
