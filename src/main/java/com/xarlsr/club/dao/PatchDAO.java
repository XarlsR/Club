package com.xarlsr.club.dao;

import com.xarlsr.club.domain.Patch;

import java.util.List;

public interface PatchDAO {

    Patch findOne(int id);

    List<Patch> findAll();

    Patch create(Patch miembro);

    Patch update(Patch miembro);

    void deleteById(int id);

    void delete(Patch miembro);
}
