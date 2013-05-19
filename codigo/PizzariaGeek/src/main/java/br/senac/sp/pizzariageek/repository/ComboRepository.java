package br.senac.sp.pizzariageek.repository;

import br.senac.sp.pizzariageek.entities.Combo;
import java.util.List;

public interface ComboRepository {

    void save(final Combo combo);

    List<Combo> listAll();
}
