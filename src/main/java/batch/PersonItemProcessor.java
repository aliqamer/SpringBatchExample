package batch;

import bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


/**
 * Created by Ali on 12/7/2016.
 */
public class PersonItemProcessor implements ItemProcessor<Person, Person>{

    private static final Logger logger = LoggerFactory.getLogger(PersonItemProcessor.class);


    @Override
    public Person process(Person person) throws Exception {
        Person newPerson = new Person(person.getFirstName().toUpperCase(), person.getLastName().toUpperCase());
        logger.info("Converting (" + person + ") into (" + newPerson + ")");

        return newPerson;
    }
}
