package youngjae.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import youngjae.hellospring.repository.MemberRepository;
import youngjae.hellospring.repository.MemoryMemberRepository;
import youngjae.hellospring.service.MemberService;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
