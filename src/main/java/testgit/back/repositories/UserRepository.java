package testgit.back.repositories;

import testgit.back.model.User;

public interface UserRepository {
    User user(Long id);
}
