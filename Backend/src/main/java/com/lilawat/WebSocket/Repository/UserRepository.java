package com.lilawat.WebSocket.Repository;

import com.lilawat.WebSocket.user.Status;
import com.lilawat.WebSocket.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

     List<User> findAllByStatus(Status status);
}
