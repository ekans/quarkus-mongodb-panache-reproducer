package org.acme.mongodb.panache;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonDB1Repository implements PanacheMongoRepository<PersonDB1> {

    public PersonDB1 findByName(String name) {
        return find("name", name).firstResult();
    }

    public List<PersonDB1> findAlive() {
        return list("status", "1");
    }

    public void deleteLoics() {
        delete("name", "Loïc");
    }
}
