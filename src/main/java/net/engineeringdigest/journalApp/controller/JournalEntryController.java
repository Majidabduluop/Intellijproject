package net.engineeringdigest.journalApp.controller;


import net.engineeringdigest.journalApp.Entity.Journalentry;
import net.engineeringdigest.journalApp.Service.JournalService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;


@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    private JournalService journalService;




 @GetMapping
 public ResponseEntity<?> getAll()
 {
     List<Journalentry> journalentries = journalService.getallentry();

     if(journalentries != null && !journalentries.isEmpty())
     {
         return new ResponseEntity<>(journalentries, HttpStatus.OK);
     }
     return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 }

 @PostMapping
 public ResponseEntity<Journalentry> createentry(@RequestBody Journalentry myEntry)
 {
     try {
         myEntry.setDate(LocalDateTime.now());
         journalService.saveentry(myEntry);
         return new ResponseEntity<>(myEntry, HttpStatus.CREATED);

     } catch (Exception e)
     {
         return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
     }

 }

 @GetMapping("id/{myId}")
 public ResponseEntity<?> getbyId(@PathVariable ObjectId myId)
 {
    Optional<Journalentry> journalentry =  journalService.getbyid(myId);

    if(journalentry.isPresent())
    {
        return new ResponseEntity<>(journalentry.get(), HttpStatus.OK);
    }

    return new ResponseEntity<>(HttpStatus.NOT_FOUND);

 }

 @DeleteMapping("id/{myId}")
 public ResponseEntity<?> deletebyId(@PathVariable ObjectId myId)
 {
      journalService.deletebyid(myId);

      return new ResponseEntity<>(HttpStatus.NO_CONTENT);


 }

 @PutMapping("/id/{id}")
 public ResponseEntity<?> updatebyid(@PathVariable ObjectId id, @RequestBody Journalentry newentry)
 {
     Journalentry old =  journalService.getbyid(id).orElse(null);
     if(old != null)
     {
         old.setTitle(newentry.getTitle() != null && !newentry.getTitle().equals("") ? newentry.getTitle() : old.getTitle());
         old.setContent(newentry.getContent() != null && !newentry.getContent().equals("") ? newentry.getContent() : old.getContent());
         journalService.saveentry(old);
         return new ResponseEntity<>(old, HttpStatus.OK);
     }
     return new ResponseEntity<>(HttpStatus.NOT_FOUND);


 }


}
