package com.xarlsr.club;

import com.xarlsr.club.logiclayer.data.members.CreateMember;

public class App
{
    public static void main( String[] args ) {
        CreateMember.createMember();

//        Session session = PersistInit.getSessionFactory().openSession();
//        session.beginTransaction();
//        session.persist(miembro);
//        session.getTransaction().commit();
//        PersistInit.shutdown();
    }
}