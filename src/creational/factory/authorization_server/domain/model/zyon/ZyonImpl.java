package creational.factory.authorization_server.domain.model.zyon;

import creational.factory.authorization_server.domain.model.AuthorizationServerImpl;

public abstract class ZyonImpl  extends AuthorizationServerImpl implements Zyon {

    protected ZyonImpl(String url, String user, String pass) {
        super(url, user, pass);
    }

    @Override
    public void specificZyonMethod() {}
}
