package com.github.pnowy.nc.core.mappers;

import com.github.pnowy.nc.core.CriteriaResult;

/**
 * Interface to map object from criteria result.
 */
@FunctionalInterface
public interface NativeObjectMapper<T> {
    T mapObject(CriteriaResult cr);
}
