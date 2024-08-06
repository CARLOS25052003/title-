//package com.Filmes.Filmes.Testes;
//
//import lombok.Getter;
//import lombok.Setter;
//import org.apache.catalina.User;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.util.Objects;
//
//@Document(collection = "users")
//public class Users {
//    @Id
//    @Getter
//    @Setter
//    private String id;
//    @Getter
//    @Setter
//    private String email;
//    @Getter
//    @Setter
//    private String username;
//    @Getter
//    @Setter
//    private String password;
//
//    public Users(){
//
//    }
////
////    public Users (String id , String username, String password, String email) {
////        this(null, username, password, email);
////    }
//
//    public Users(String id,String username, String password, String email) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Users that = (Users) o;
//
//        if (!Objects.equals(id, that.id)) return false;
//        return Objects.equals(username, that.username);
//    }
//    @Override
//    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (username != null ? username.hashCode() : 0);
//        return result;
//    }
//}
//
