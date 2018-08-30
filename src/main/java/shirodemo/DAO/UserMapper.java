package shirodemo.DAO;

import org.apache.ibatis.annotations.Select;
import shirodemo.DTO.User;

public interface UserMapper {
    @Select("SELECT * FROM USER")
    User selectLastest();
}
