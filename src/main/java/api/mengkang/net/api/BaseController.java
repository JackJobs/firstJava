package api.mengkang.net.api;

import api.mengkang.net.Request;

public class BaseController {

    Request request;

    public BaseController(Request request) {
        this.request = request;
    }

}
