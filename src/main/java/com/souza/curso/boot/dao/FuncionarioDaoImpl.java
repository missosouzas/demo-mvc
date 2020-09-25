package com.souza.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.souza.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
