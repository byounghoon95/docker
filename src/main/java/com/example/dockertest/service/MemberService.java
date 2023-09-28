package com.example.dockertest.service;

import com.example.dockertest.entity.Member;
import com.example.dockertest.repository.MemberRepository;
import com.example.dockertest.service.request.MemberCreateServiceRequest;
import com.example.dockertest.service.response.MemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponse createMember(MemberCreateServiceRequest request) {

        Member member = request.toMemberEntity();
        Member savedMember = memberRepository.save(member);

        return MemberResponse.of(savedMember);
    }


}
