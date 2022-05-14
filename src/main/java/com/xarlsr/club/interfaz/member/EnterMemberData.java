package com.xarlsr.club.interfaz.member;

import com.xarlsr.club.domain.Contact;
import com.xarlsr.club.domain.Member;
import com.xarlsr.club.utils.Utils;
import com.xarlsr.utilidades.entradaTeclado;

import java.time.LocalDate;

public class EnterMemberData {


    public static Member typeMemberData(){
        Member miembro = new Member();
        entradaTeclado.borrarPantalla();
        System.out.print("Introduzca número de miembro: ");
        miembro.setMemNumber(entradaTeclado.leeEntero(4));
        System.out.print("Introduzca Nombre: ");
        miembro.setMemName(entradaTeclado.leeCadena().toUpperCase());
        System.out.print("Introduzca Apellidos: ");
        miembro.setSurname(entradaTeclado.leeCadena().toUpperCase());
        System.out.print("Introduzca Nick: ");
        miembro.setNickname(entradaTeclado.leeCadena().toUpperCase());
        System.out.print("Introduzca DNI: ");
        miembro.setDni(entradaTeclado.leeCadena().toUpperCase());
        System.out.print("Introduzca Fecha Alta: ");
        String fecha = entradaTeclado.leeCadena();
        fecha = Utils.dateFormatter(fecha);
        LocalDate fechAlta = LocalDate.parse(fecha);
        miembro.setJoinDate(fechAlta);
        return miembro;
    }

    public static Contact typeContactData(){
        Contact contacto = new Contact();
        return contacto;
    }
}
