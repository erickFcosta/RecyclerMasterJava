package com.developer.recyclermasterjava.model;

import java.util.Arrays;
import java.util.List;

public class Emails {
    public static List<Email> fakeEmails() {
        return Arrays.asList(
                Email.EmailBuilder.builder()
                    .setUser("Erick Costa")
                    .setSubject("Alteração de escala")
                    .setPreview("confira as alterações com urgencia")
                    .setDate("24 Ago")
                    .setUnread(true)
                    .build(),
                Email.EmailBuilder.builder()
                        .setUser("PIB")
                        .setSubject("Reunião dos jovens")
                        .setPreview("venha participar de nossa reunião de jovens que tera como tema o livro conspiração do genesis 6")
                        .setDate("24 Ago")
                        .setStared(true)
                        .build()
        );
    }
}
