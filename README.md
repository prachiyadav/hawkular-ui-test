# hawkular-ui-test

saucelabs + selenium webdriver test framework for hawkular gui testing

to build project: mvn clean install -DskipTests

to run tests: mvn test -DhawkularUrl="http://IP:Port" -DauthenticationKey="SAUCELABS_AUTH_KEY" -DsauceUsername="SAUCELABS_USERNAME" // -- the default value for HawkularUrl is localhost:8080, sauceUsername default value is hawkularqe
