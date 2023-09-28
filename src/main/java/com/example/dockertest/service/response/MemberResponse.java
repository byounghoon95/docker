package com.example.dockertest.service.response;

import com.example.dockertest.entity.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberResponse {

    private Long id;
    private String name;
    private int age;

    @Builder
    public MemberResponse(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static MemberResponse of(Member member) {
        return MemberResponse.builder()
                .id(member.getId())
                .name(member.getName())
                .age(member.getAge())
                .build();
    }
}
