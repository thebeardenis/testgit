package testgit.back.repositories;

import testgit.back.model.Page;
import testgit.back.model.User;

import java.util.List;

public interface PageRepository {
    List<Page> page(User user);
}
