package rcc.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rcc.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

   
}
