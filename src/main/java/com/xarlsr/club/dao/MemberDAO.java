package com.xarlsr.club.dao;

import com.xarlsr.club.domain.Member;

import java.util.List;

public interface MemberDAO {

    Member findOne(int id);

    List<Member> findAll();

    Member create(Member miembro);

    Member update(Member miembro);

    void deleteById(int id);

    void delete(Member miembro);
}
