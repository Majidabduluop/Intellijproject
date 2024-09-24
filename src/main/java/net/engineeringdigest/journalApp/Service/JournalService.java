package net.engineeringdigest.journalApp.Service;

import net.engineeringdigest.journalApp.Entity.Journalentry;
import net.engineeringdigest.journalApp.Repository.JournalRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalService {

    @Autowired
    private JournalRepository journalRepository;

    public void saveentry(Journalentry journalentry)
    {
        journalRepository.save(journalentry);
    }

    public List<Journalentry> getallentry()
    {
        return journalRepository.findAll();

    }

    public Optional<Journalentry> getbyid(ObjectId id)
    {
        return journalRepository.findById(id);
    }

    public void deletebyid(ObjectId id){

        journalRepository.deleteById(id);


    }

}
