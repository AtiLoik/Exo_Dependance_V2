# Procédure d’installation/d’exécution

Prérequis
•	Une base de données MySQL Up-to-date.
•	Une configuration MySQL comme suivante :
o	Login : root
o	Pass : <vide>
o	Port : 3306
o	Engine : InnoDB
o	Accès RW en root


Installation

1.	Installez dans votre base de données SQL le fichier dump.sql présent à la racine de l’archive. Les données seront alors insérées et le logiciel pourra alors les manipuler.
2.	Ouvrez l’invite de commande Windows et exécutez la commande ci-dessous (en adaptant les paramètres à votre environnement actuel) :
java -jar "<chemin vers le répertoire du soft>\main.jar" 
3.	Insérez alors les informations relatives à l’utilisateur (étudiant). Une fois toutes les informations insérées, la liste finale des étudiants pour l’école 1 sera alors affichée.

Suite à cela vous pourrez alors consulter les données sur un logiciel tiers (PhpMyAdmin, Software, …) afin de constater des changements éventuels.

