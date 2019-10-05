Ce projet JPA contient deux profiles de build.
- L'un, hibernate, inclut les librairies du provider Hibernate de la JPA
- Le second, eclipselink, inclut les libraries du provider EclipseLink de la JPA

Le profil activé par défaut est hibernate.

Pour packager, lancer en ligne de commande :
     > mvn clean package -Phibernate ou bien mvn clean package -Peclipselink
Pour exécuter, lancer le exec plugin en ligne de commande :
     > mvn exec:java -Phibernate ou bien mvn exec:java -Peclipselink