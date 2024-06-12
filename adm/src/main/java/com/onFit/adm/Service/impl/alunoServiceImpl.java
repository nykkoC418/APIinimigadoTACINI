package com.onFit.adm.Service.impl;

import org.springframework.stereotype.Service;

import com.onFit.adm.Service.alunoService;

import dto.alunoDto;
import lombok.AllArgsConstructor;
import repository.alunoRepository;

@Service
@AllArgsConstructor
public class alunoServiceImpl implements alunoService {
	
	private alunoRepository AlunoRepository;
	@Override
	public alunoDto createaluno(alunoDto AlunoDto) {
		return null;
	}
}
