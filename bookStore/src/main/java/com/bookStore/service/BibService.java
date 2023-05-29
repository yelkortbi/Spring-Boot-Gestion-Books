package com.bookStore.service;


import com.bookStore.entity.Bibliotheque;
import com.bookStore.entity.Book;
import com.bookStore.repository.BibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibService {


    @Autowired
    private BibRepository bibRepository;

//    public void save(Book b) {
//        bRepo.save(b);
//    }
//
//    public List<Book> getAllBook(){
//        return bRepo.findAll();
//    }
//
//    public Book getBookById(int id) {
//        return bRepo.findById(id).get();
//    }
//    public void deleteById(int id) {
//        bRepo.deleteById(id);
//    }
    public void saveBib(Bibliotheque bibliotheque){
        bibRepository.save(bibliotheque);
    }
    public List<Bibliotheque> getAllBib(){
        return bibRepository.findAll();
    }

    public Bibliotheque getBibById(Long id){
        return bibRepository.findById(id).get();
    }

    public void dleteBibByid(Long id){
        bibRepository.deleteById(id);
    }

}
