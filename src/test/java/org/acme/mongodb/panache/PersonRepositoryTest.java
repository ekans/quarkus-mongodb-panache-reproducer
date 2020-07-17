package org.acme.mongodb.panache;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import io.quarkus.test.junit.QuarkusTest;
import java.time.LocalDate;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class PersonRepositoryTest {

    @Inject
    PersonDB1Repository personDB1Repository;

    @Test
    public void test() {
        personDB1Repository.deleteAll();

        PersonDB1 toto = new PersonDB1();
        toto.name = "toto";
        toto.birth = LocalDate.now();
        toto.status = "1";

        personDB1Repository.persist(toto);
        assertEquals("toto", personDB1Repository.findByName("toto").name);
    }
}
