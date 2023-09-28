package com.example.dockertest.controller.request;

import com.example.dockertest.service.request.MemberCreateServiceRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberCreateRequest {

    private String name;
    private int age;

    public MemberCreateServiceRequest toServiceRequest() {
        return MemberCreateServiceRequest.builder()
                .name(name)
                .age(age)
                .build();
    }
}
