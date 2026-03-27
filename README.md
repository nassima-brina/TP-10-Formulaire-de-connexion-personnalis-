#  TP 10 — Formulaire de connexion personnalisé avec Spring Security

## 📚 Cours
Développement JakartaEE : Spring

---

## 📌 Contexte
#### Ce TP s'inscrit dans la continuité de l'apprentissage de la sécurité avec Spring. Après avoir vu l'authentification basique, nous passons à la personnalisation complète du flux de connexion.

#### L'objectif est de remplacer l'interface par défaut de Spring par un formulaire HTML/Thymeleaf sur mesure, tout en gérant les redirections, les messages d'erreur et la déconnexion sécurisée.

---

## 🎯 Objectifs
- Remplacer la page de login par défaut par une vue personnalisée  
- Configurer le SecurityFilterChain pour gérer les endpoints /authenticate et /logout  
- Afficher des messages dynamiques en cas d'erreur ou de déconnexion  
- Sécuriser les accès aux ressources selon les rôles (**ADMIN** et **USER**)  
- Maîtriser les redirections après succès de l'authentification  

---

## 🛠️ Technologies utilisées
- Java 25  
- Spring Boot 3.5.13  
- Spring Security  
- Thymeleaf  
- Spring Web  
- Spring Boot DevTools  
- Maven  

---

## 📁 Structure du projet

<img width="1366" height="850" alt="image" src="https://github.com/user-attachments/assets/e8fde286-6df1-413f-b0c4-69a3b0740f45" />

---

## ⚙️ Installation et lancement

### 1. Cloner le projet

git clone [https://github.com/nassima-brina/TP-10-Formulaire-de-connexion-personnalis-/tree/main](https://github.com/nassima-brina/TP-10-Formulaire-de-connexion-personnalis-/tree/main)
### 2. Accéder au dossier
cd spring-security-demo
### 3. Lancer l'application
mvn spring-boot:run
### 4. Accéder à l'application

 http://localhost:8080

##  Composants créés
### -  SecurityConfig.java

Classe de configuration qui :

Définit les utilisateurs en mémoire (admin et user)
Configure les règles de sécurité
Spécifie /login comme page personnalisée
Gère les requêtes POST vers /authenticate
### -  AuthController.java

Contrôleur qui gère la navigation vers les pages :

/login
/home
/admin/dashboard
/user/dashboard
### - login.html

Template Thymeleaf contenant le formulaire de connexion :

Affiche une erreur avec :
th:if="${param.error}"
Affiche un message de déconnexion avec :
th:if="${param.logout}"
### -  home.html

Page d'accueil accessible après authentification réussie, permettant de naviguer vers les espaces protégés.

### - admin-dashboard.html & user-dashboard.html

Pages sécurisées :

Accès contrôlé selon les rôles (ADMIN / USER)
Protection via Spring Security
##  Aperçu de l'application
#### -  Page de connexion personnalisée

![WhatsApp Image 2026-03-27 at 21 38 53](https://github.com/user-attachments/assets/a8b49407-cccf-4ca4-b7db-d7d28395fc9f)


#### -  Gestion des erreurs
![WhatsApp Image 2026-03-27 at 21 40 12](https://github.com/user-attachments/assets/99f0d84c-cbab-4446-b941-8f59433c69f5)

#### - Page d'accueil

![WhatsApp Image 2026-03-27 at 21 41 51](https://github.com/user-attachments/assets/19b42e74-3c63-4a8b-ba96-a593bd6315e4)

#### - page utilisateurs 
![WhatsApp Image 2026-03-27 at 21 42 50](https://github.com/user-attachments/assets/c756aebf-35a1-4081-bef1-1d444aec22b8)

#### -  Accès ADMIN lorsque on est connecte comme etant user 

![WhatsApp Image 2026-03-27 at 21 43 32](https://github.com/user-attachments/assets/bc7832a9-707e-4709-9b92-0c980aff3c29)

#### -  Accès ADMIN lorsque on est connecte comme etant admin

![WhatsApp Image 2026-03-27 at 21 45 10](https://github.com/user-attachments/assets/4f1c7eb4-ad19-4961-b685-7fedbf861eb0)

#### - Déconnexion

##  Fonctionnalités
Formulaire de connexion personnalisé
Gestion des erreurs (identifiants incorrects)
Redirection après authentification réussie
Accès restreint selon les rôles
Déconnexion sécurisée avec message de confirmation
##  Conclusion

Ce TP a permis de personnaliser entièrement l'expérience utilisateur liée à la sécurité.

Nous avons appris à intégrer nos propres vues tout en laissant Spring Security gérer :

la session
la protection CSRF
la validation des identifiants


