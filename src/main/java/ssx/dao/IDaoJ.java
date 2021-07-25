package ssx.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface IDaoJ {

    @Insert("INSERT INTO `demo`.`tenth`(`create_date`, `name`) VALUES (sysdate(), #{string})")
    boolean addName(String string);
}
