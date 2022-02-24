package life.seeds.community.mapper;

import life.seeds.community.model.Comment;
import life.seeds.community.model.CommentExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}