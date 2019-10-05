- Faire > mvn clean package , le profil activé par défaut étant dev (cf pom.xml)
  Puis  regarder les db.properties du jar généré, les properties JDBC seront celles de dev

- Faire > mvn clean package -P production 
  Puis  regarder les db.properties du jar généré, les properties JDBC seront celles de production