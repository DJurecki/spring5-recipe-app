package com.jurecki.spring5recipeapp.services;

import com.jurecki.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
