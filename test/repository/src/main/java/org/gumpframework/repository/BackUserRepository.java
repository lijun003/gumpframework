package org.gumpframework.repository;

import org.gumpframework.domain.sys.BackUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

/**
 * 后台管理用户Dao
 */
public interface BackUserRepository extends JpaRepository<BackUser,String>,JpaSpecificationExecutor<BackUser>{
    Optional<BackUser> findOneById(String id);
}
