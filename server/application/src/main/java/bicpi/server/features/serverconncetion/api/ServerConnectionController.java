package bicpi.server.features.serverconncetion.api;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import bicpi.models.features.serverconnection.ServerConnection;
import bicpi.server.features.serverconncetion.business.ServerConnectionBean;

@RestController
public class ServerConnectionController {

    private final ServerConnectionBean serverConnectionBean;

    // Better for testing
    @Autowired
    public ServerConnectionController(ServerConnectionBean serverConnectionBean) {
        this.serverConnectionBean = serverConnectionBean;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/serverconnection")
    public ServerConnection getIPv4Address() {
        return serverConnectionBean.getServerConnection();
    }
}