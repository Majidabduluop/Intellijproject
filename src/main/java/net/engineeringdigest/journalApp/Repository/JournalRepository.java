package net.engineeringdigest.journalApp.Repository;

import net.engineeringdigest.journalApp.Entity.Journalentry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepository extends MongoRepository<Journalentry, ObjectId> {
}
