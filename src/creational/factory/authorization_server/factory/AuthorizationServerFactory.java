package creational.factory.authorization_server.factory;

import creational.factory.authorization_server.domain.enumeration.AuthorizationServerEnum;
import creational.factory.authorization_server.domain.enumeration.Environment;
import creational.factory.authorization_server.domain.model.AuthorizationServer;

public class AuthorizationServerFactory {

    public AuthorizationServer createConnection(AuthorizationServerEnum authorizationServerEnum, Environment environment) {
        AuthorizationServer authorizationServer;

        switch (authorizationServerEnum) {
            case ZYON:
                authorizationServer = new ZyonFactory().build(environment);
                break;
            case NARNIA:
                authorizationServer = new NarniaFactory().build(environment);
                break;
            default:
                throw new RuntimeException();
        }
        return authorizationServer;
    }
}
