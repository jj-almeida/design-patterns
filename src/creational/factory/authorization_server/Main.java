package creational.factory.authorization_server;

import creational.factory.authorization_server.domain.enumeration.AuthorizationServerEnum;
import creational.factory.authorization_server.domain.enumeration.Environment;
import creational.factory.authorization_server.domain.model.AuthorizationServer;
import creational.factory.authorization_server.factory.AuthorizationServerFactory;

public class Main {
    public static void main(String[] args) {
        AuthorizationServerFactory authorizationServerFactory = new AuthorizationServerFactory();
        AuthorizationServer authorizationServer = authorizationServerFactory.createConnection(AuthorizationServerEnum.ZYON, Environment.PROD);

        authorizationServer.createCredential();
        authorizationServer.deleteCredential();
    }
}