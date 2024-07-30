package com.Filmes.Filmes.Testes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {
    @Id
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;

    public Users(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }


}
