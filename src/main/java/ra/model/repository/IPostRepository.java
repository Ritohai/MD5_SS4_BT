package ra.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ra.model.entity.Category;
import ra.model.entity.Post;

import java.util.List;

@Repository
public interface IPostRepository extends PagingAndSortingRepository<Post, Long> {

    Page<Post> findAllByTitleContaining(String title, Pageable pageable);
    List<Post> findPostByCategory (Category category);

}
