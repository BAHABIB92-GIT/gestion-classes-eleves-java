Application de Gestion Scolaire en Java (POO)

Projet académique développé dans le cadre de la Programmation Orientée Objet (POO) en deuxième année d'Informatique Appliquée à la Gestion des Entreprises (L2 IAGE).

Objectif du Projet
Ce programme en ligne de commande simule la gestion informatisée d'une structure scolaire. Il met en pratique les concepts fondamentaux de la conception logicielle et de l'encapsulation en Java.

Architecture et Concepts Clés
L'application repose sur une architecture orientée objet propre, séparant les entités, la logique métier et l'exécution :

Eleve.java : Représente l'entité étudiante (attributs privés : nom, prénom, sexe, notes d'informatique, de mathématiques et d'anglais). Intègre des règles de validation strictes via des setters sécurisés.

Classe.java : Représente la structure collective (nom de la classe, promotion, effectif et composition d'un tableau d'objets Eleve). Gère la saisie dynamique et interactive.

Test.java : Fichier pilote contenant la méthode main pour lancer l'exécution et afficher le tableau récapitulatif formaté.

Fonctionnalités Principales

Encapsulation stricte avec protection des données par des méthodes d'accès (getters et setters).

Validation des données saisies :

Vérification du sexe ('M' ou 'F').

Filtrage des notes académiques (comprises entre 0 et 20).

Validation de l'année de promotion.

Saisie interactive en console via la classe Scanner.

Manipulation dynamique de tableaux d'objets.
