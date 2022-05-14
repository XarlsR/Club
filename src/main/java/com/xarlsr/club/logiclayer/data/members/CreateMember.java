package com.xarlsr.club.logiclayer.data.members;

import com.xarlsr.club.domain.Member;
import com.xarlsr.club.interfaz.member.DisplayMemberData;
import com.xarlsr.club.interfaz.member.EnterMemberData;

public class CreateMember {

    public static void createMember() {

        Member miembro = EnterMemberData.typeMemberData();
        DisplayMemberData.dispMemberData(miembro);

    }
}
