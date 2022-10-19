package creational.factory.authorization_server.domain.model.narnia;

import creational.factory.authorization_server.domain.model.AuthorizationServerImpl;

public abstract class NarniaImpl extends AuthorizationServerImpl implements Narnia {

    protected NarniaImpl(String url, String user, String pass) {
        super(url, user, pass);
    }

    @Override
    public void specificNarniaMethod() {}
}
