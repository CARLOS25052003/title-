//package com.Filmes.Filmes.Testes;
//
//import com.mongodb.ConnectionString;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//
//public class MongoDBExample {
//    public static void main(String[] args) {
//        // Conectar ao banco de dados
//        try (MongoClient mongoClient = MongoClients.create(new ConnectionString("mongodb://localhost:27017"))) {
//            // Selecionar o banco de dados
//            MongoDatabase database = mongoClient.getDatabase("meu_database");
//
//            // Aqui você pode inserir seus dados
//            Document document = new Document("nome", "valor"); // Substitua com seus dados
//
//            // Inserir documento na coleção
//            database.getCollection("minha_colecao").insertOne(document);
//        }
//    }
//}
