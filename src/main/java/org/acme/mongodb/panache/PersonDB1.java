package org.acme.mongodb.panache;

import io.quarkus.mongodb.panache.MongoEntity;
import java.time.LocalDate;
import org.bson.types.ObjectId;

@MongoEntity(clientName = "db1", collection = "ThePerson")
public class PersonDB1 {
    public ObjectId id; // used by MongoDB for the _id field
    public String name;
    public LocalDate birth;
    public String status;
}
