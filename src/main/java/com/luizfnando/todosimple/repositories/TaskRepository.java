package com.luizfnando.todosimple.repositories;

import com.luizfnando.todosimple.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    //Forma mais simples do spring:
    List<Task> findByUser_Id(Long id);

    // segunda forma misturando spring com sql: @Query(value = "SELECT t FROM Task t WHERE t.user.id = :id")
    //List<Task> findByUser_Id(@Param("id") Long id);

    //@Query(value = "SELECT * FROM task t WHERE t.user_id = :id",nativeQuery = true)
    //List<Task> findByUser_Id(@Param("id") Long id);

}
