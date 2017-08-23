package com.github.wmixvideo.bradescoboleto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface BBRLoggable {
    default Logger getLogger() {
        return LoggerFactory.getLogger(getClass());
    }

    static Logger getLogger(final Class<?> clazz) {
        return LoggerFactory.getLogger(clazz);
    }
}
