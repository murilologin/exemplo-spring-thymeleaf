package com.sistema.gerenciadorfuncionarios.model.repository;

import java.util.List;

import com.sistema.gerenciadorfuncionarios.model.Funcionario;
import com.sistema.gerenciadorfuncionarios.model.FuncionarioSetor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    List<Funcionario> findBySetor(FuncionarioSetor funcionarioSetor);
}
