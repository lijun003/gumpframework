package org.gumpframework.service;

import java.util.List;
import java.util.Map;

public interface BackUserService {
    List<Map<String,Object>> login(String name, String password);
}
