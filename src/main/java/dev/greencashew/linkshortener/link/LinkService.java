package dev.greencashew.linkshortener.link;

import dev.greencashew.linkshortener.controller.LinkDto;

public interface LinkService {
    LinkDto createLink(LinkDto toDto);

    LinkDto getLink(String id);
}
