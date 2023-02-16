package ua.ypon.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.ypon.springcourse.models.Person;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);//custom method
    List<Person> findByNameOrderByAge(String name);//custom method
    List<Person> findByEmail(String name);//custom method
    List<Person> findByNameStartingWith(String startingWith);//custom method
    List<Person> findByNameOrEmail(String name, String email);//custom method
}
