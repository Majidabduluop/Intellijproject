package net.engineeringdigest.journalApp.Entity;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.ArrayList;
import java.util.List;

@Document(collation = "users")
@Data
public class User {

    @Id
    private ObjectId Id;
    @Indexed(unique = true)
    @NonNull
    private String Username;
    @NonNull
    private String Password;

    @DBRef
    private List<Journalentry> journalentries = new ArrayList<>();


}
