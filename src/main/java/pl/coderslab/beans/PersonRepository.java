package pl.coderslab.beans;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonRepository {

    private Map<Long, Person> personMap = new HashMap<>();
    {
        personMap.put(1l, new Person("arek"));
        personMap.put(2l, new Person("darek"));
        personMap.put(3l, new Person("marek"));
        personMap.put(4l, new Person("czarek"));
    }


    public Person getPersonById(long id){
        return personMap.get(id);
    }
}
