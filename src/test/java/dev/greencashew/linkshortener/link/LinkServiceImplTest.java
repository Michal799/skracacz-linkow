package dev.greencashew.linkshortener.link;

import dev.greencashew.linkshortener.controller.LinkDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkServiceImplTest {

    @Test
    void shouldThrowExceptionWhenLinkIsDuplicated() throws LinkAlreadyExistsException {
        // given
        LinkDto firstDto = new LinkDto("test", "test@emil.com", "http://google.pl", null, 0);
        LinkDto secondDto = new LinkDto("test", "haker@emil.com", "http://google.pl", null, 0);
        LinkService service = new LinkServiceImpl();
        service.createLink(firstDto);
        // when
        LinkAlreadyExistsException thrown = assertThrows(
                LinkAlreadyExistsException.class,
                () -> service.createLink(secondDto),
                "Expected doThing() to throw, but it didn't"
        );
    }
}