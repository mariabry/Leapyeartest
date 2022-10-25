Forklaring:


Laget repository "Leapyeartest" i Github.
push test til gitHub.

For at testene skulle blir kjørt måtte jeg:
oppdatere pom.xml til version 17

legge til i koden:

run: mvn -B package --file pom.xml
            - name: Test with Maven
              run: mvn -B test --file pom.xml
              
              
              
og denne:
              <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
            </plugin>
