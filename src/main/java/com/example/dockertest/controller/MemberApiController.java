
package com.example.dockertest.controller;

import com.example.dockertest.controller.request.MemberCreateRequest;
import com.example.dockertest.service.MemberService;
import com.example.dockertest.service.response.MemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/member")
@RequiredArgsConstructor
@RestController
public class MemberApiController {

    private final MemberService memberService;

    @GetMapping("/create")
    public MemberResponse createMember(MemberCreateRequest request) {
        return memberService.createMember(request.toServiceRequest());
    }

}
