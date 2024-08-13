package br.com.rodrigoarcanjo.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodrigoarcanjo.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
}