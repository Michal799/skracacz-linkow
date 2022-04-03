package dev.greencashew.linkshortener.link;

public class LinkAlreadyExistsException extends RuntimeException {

    public LinkAlreadyExistsException(String id) {
        super("Link o id "+id+" już istnieje!");
    }
}
