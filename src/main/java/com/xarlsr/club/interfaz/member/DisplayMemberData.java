package com.xarlsr.club.interfaz.member;

import com.xarlsr.club.domain.Member;
import com.xarlsr.utilidades.entradaTeclado;

public class DisplayMemberData {


    public static void dispMemberData(Member miembro){
        entradaTeclado.borrarPantalla();
        System.out.println("Id: "+miembro.getMemberId());
        System.out.println("Número: "+miembro.getMemNumber());
        System.out.println("Nombre: "+miembro.getMemName());
        System.out.println("Apellidos: "+miembro.getSurname());
        System.out.println("Apodo: "+miembro.getNickname());
        System.out.println("DNI: "+miembro.getDni());
        System.out.println("Fecha de Alta: "+miembro.getJoinDate());
        System.out.println("");
        entradaTeclado.pulseIntro();
    }
}
