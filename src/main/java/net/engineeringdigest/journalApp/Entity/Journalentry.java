package net.engineeringdigest.journalApp.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collation = "journal_entries")
@Data
@NoArgsConstructor
public class Journalentry {

    @Id
    private ObjectId id;

    private String title;

    private String content;

    private LocalDateTime date;

}

