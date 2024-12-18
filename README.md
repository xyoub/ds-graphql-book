GraphQL Book Management - Spring Boot
Ce projet est un exercice de développement d'une API GraphQL avec Spring Boot pour la gestion d'une entité Book.

Fonctionnalités principales
API GraphQL permettant :

La récupération d'un livre par titre via Query.
L'ajout d'un livre dans la base de données via Mutation.
Technologies utilisées :

Spring Boot : Framework pour la création d'applications Java.
Spring Web : Pour la gestion des requêtes.
Spring Data JPA : Gestion de la persistance avec la base de données H2 en mémoire.
Spring for GraphQL : Implémentation de l'API GraphQL.
Lombok : Réduction du code boilerplate.
ModelMapper : Pour mapper les objets DTO.
Schéma GraphQL :

graphql
Copier le code
type Query {  
    getBookByTitle(title: String): [BookDTO]  
}  

type Mutation {  
    saveBook(book: BookDTO): BookDTO  
}  
Architecture du projet :

Entity : Book
DTO : BookDTO
Controller : BookGraphQLController
Service : BookService
Mapper : BookMapper
Configuration :

Fichier application.properties : Configuration du serveur et de la base de données en mémoire.
properties
Copier le code
server.port=8090  
spring.datasource.url=jdbc:h2:mem:book-db  
spring.h2.console.enabled=true  
spring.graphql.graphiql.enabled=true  

Comment tester l'application ?
Lancer l'application Spring Boot.
Accéder à l'interface graphiql : http://localhost:8090/graphiql.
Actions à tester :
Ajouter un nouveau livre (Mutation).
Récupérer un livre par titre existant dans la base de données (Query).
