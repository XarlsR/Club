package com.xarlsr.club.dao;

import com.xarlsr.club.domain.Patch;
import com.xarlsr.club.domain.Status;

import java.util.List;

public interface StatusDAO {

    Status findOne(int id);

    List<Status> findAll();

    Status create(Status miembro);

    Status update(Status miembro);

    void deleteById(int id);

    void delete(Status miembro);
}
