package youngjae.hellospring.controller;

import org.springframework.stereotype.Controller;
import youngjae.hellospring.service.MemberService;

@Controller
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
