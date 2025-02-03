<h1>Développement d'un Microservice</h1>

<p>Cette activité consiste à développer un microservice Spring Boot avec des APIs RESTful pour gérer des comptes en utilisant Spring Data JPA et une base de données H2 en mémoire.</p>

<h2>Énoncé</h2>
<ol>
    <li>Créer un projet Spring Boot avec les dépendances suivantes :
        <ul>
            <li>Spring Web</li>
            <li>Spring Data JPA</li>
            <li>H2</li>
            <li>Lombok</li>
        </ul>
    </li>
    <li>Créer l'entité JPA <strong>Compte</strong>.</li>
    <li>Créer l'interface <strong>CompteRepository</strong> basée sur Spring Data JPA.</li>
    <li>Tester la couche DAO.</li>
    <li>Créer un service web RESTful pour gérer les comptes.</li>
    <li>Tester le microservice à l'aide d'un client REST comme Postman.</li>
    <li>Générer et tester la documentation Swagger des APIs REST.</li>
    <li>Exposer une API RESTful en utilisant Spring Data REST et tirer parti des projections.</li>
    <li>Créer des DTOs (Data Transfer Objects) et des Mappers pour transformer entre entités et DTOs.</li>
    <li>Créer la couche de service (logique métier) et le microservice.</li>
</ol>

<h2>Architecture</h2>

<p>L'architecture de ce microservice comprend :</p>
<img src="pictures/img.png" alt="Architecture du Microservice" />
<ul>
    <li>Une API RESTful pour gérer les comptes.</li>
    <li>Spring Data JPA pour les opérations de base de données.</li>
    <li>Des DTOs et des Mappers pour la transformation des données.</li>
    <li>Une base de données H2 en mémoire pour les tests.</li>
</ul>

<p>1- Création d'un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok :  
<img src="pictures/img_1.png" alt="creation">
<img src="pictures/img_2.png" alt="dependecies">
</p>

<p>2- Entité JPA Compte : 
<img src="pictures/img_3.png" alt="BankAccount">
</p>

<p>3- CompteRepository basée sur Spring Data : 
<img src="pictures/img_4.png" alt="repo"></p>

<p>4- Tester la couche DAO :
http://localhost:8081/api/bankAccounts
<img src="pictures/img_5.png" alt="testDAO">
</p>

<p>5- Création de le Web Service Restfull qui permet de gérer les comptes : 
<img src="pictures/img_6.png" alt="1">
<br> 
<img src="pictures/img_7.png" alt="2">
</p>

<p>6- Tester le web micro-service en utilisant un client Rest (Postman) :
<img src="pictures/img_8.png" alt="modif">
</p>

<p>7- Générer et tester le documentation Swagger de des API Rest du Web service :
<br>http://localhost:8081/swagger-ui/index.html#/account-rest-controller/bankAccounts
<img src="pictures/img_9.png" alt="t1"> 
<br>
<img src="pictures/img_10.png" alt="t2">
</p>

<p>8- Exposer une API Restful en utilisant Spring Data Rest en exploitant des projections :
<img src="pictures/img_11.png" alt="projection">
http://localhost:8081/bankAccounts?prjection=p1
<img src="pictures/img_12.png" alt="testPro">
</p>

<p>9- Création des DTOs et Mappers :
<li>DTOs : </li>
<img src="pictures/img_13.png" alt="DTO1">
<br>
<img src="pictures/img_14.png" alt="DTO2">

<li>Mappers : </li>
<img src="pictures/img_15.png" alt="mapper">
</p>

<p>10- Création de la couche métier et de micro service :
<img src="pictures/img_16.png" alt="1">
<br>
<img src="pictures/img_17.png" alt="2">
<br>
<img src="pictures/img_18.png" alt="3">
</p>

<p>11- Création d'un Web Service GraphQL pour ce Micro-Service : 
<img src="pictures/img_19.png" alt="grap1">
<br>
<img src="pictures/img_20.png" alt="grap2">
<br>
http://localhost:8081/graphiql?path=/graphql
<li>Afficher la liste des comptes :
</li>
<img src="pictures/img_21.png" alt="g1">
<br>
<li>Chercher un compte par ID :
</li>
<img src="pictures/img_22.png" alt="g2">
<br>
<li>Ajouter un compte : </li>

<img src="pictures/img_23.png" alt="g3">
Le compte est bien ajouté 
<img src="pictures/img_24.png" alt="g33">
<br>
<li>Modifier un compte par ID :</li>
<img src="pictures/img_25.png" alt="g4">
<br>
<li>Supprimer un compte par ID :</li>
<img src="pictures/img_26.png" alt="g5">

<br>
<li>Afficher la liste des comptes pour chaque client :</li>
<img src="pictures/img_27.png" alt="g6">

<br>
<li>Afficher la liste des clients avec leurs comptes :</li>
<img src="pictures/img_28.png" alt="g6">


</p>


