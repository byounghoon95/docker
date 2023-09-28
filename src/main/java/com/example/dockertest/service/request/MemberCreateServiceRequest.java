package com.example.dockertest.service.request;

import com.example.dockertest.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberCreateServiceRequest {
    private String name;
    private int age;

    @Builder
    public MemberCreateServiceRequest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Member toMemberEntity() {
        return Member.builder()
                .name(name)
                .age(age)
                .build();
    }
}
