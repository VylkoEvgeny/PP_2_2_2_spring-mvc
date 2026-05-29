package web.service;

import java.util.List;

public interface TransportService<T> {
    public List<T> getTransports(Integer count);
}
