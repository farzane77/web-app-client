package org.j2os.common;

public interface Request {
    String BASE="http://localhost/";
    String PERSON_SAVE=BASE+"person/save?name=%s&family=%s";
    String PERSON_UPDATE=BASE+"person/update?id=%s&name=%s&family=%s";
    String PERSON_REMOVE=BASE+"person/remove?id=%s";
    String PERSON_FIND_ALL=BASE+"person/findAll";
}
